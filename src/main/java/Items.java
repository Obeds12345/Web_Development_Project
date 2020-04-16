import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Items {

    public static List<HashMap> getItems() throws URISyntaxException, IOException {
//        HashMap<String, List<String>> MainItems = new HashMap<String, List<String>>();
        List<HashMap> MainItems = new ArrayList<HashMap>();

        Stream<String> stream = Files.lines(Paths.get(Healpers.getPath()), StandardCharsets.UTF_8);
        stream.forEach((item) -> {
            List s = Arrays.asList(item.split(", "));
//            List a = Arrays.asList(item.split(","));
            HashMap<String, String> map = new HashMap<>();
            map.put("id", (String) s.get(0));
            map.put("stars", (String) s.get(1));
            map.put("not_stars", (String) s.get(2));
            map.put("description", (String) s.get(3));
            map.put("price", (String) s.get(4));
            map.put("price_old", (String) s.get(5));
            MainItems.add(map);
        });

        System.out.println(MainItems.size());
        return MainItems;
    }
}
