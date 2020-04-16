import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class Healpers {
    private static final Pattern COMMA = Pattern.compile(",");

    public static String getPath() throws URISyntaxException {
        URL res = Healpers.class.getClassLoader().getResource("items.txt");
        File file = Paths.get(res.toURI()).toFile();
        String absolutePath = file.getAbsolutePath();
        return  absolutePath;
//        return Paths.get(ClassLoader.getSystemResource("items.txt").toURI());
    }
}
