// function option() {
//     var element = document.getElementById("option");
//     if (element.classList.contains("content")) {
//         element.classList.remove("content");
//         element.classList.add("mystyle");
//     } else {
//         element.classList.remove("mystyle");
//         element.classList.add("content");
//     }
// }

// var today = new Date();
// var dd = today.getDate();
// var mm = today.getMonth() + 1; //January is 0!

// var yyyy = today.getFullYear();
// if (dd < 10) {
//     dd = '0' + dd;
// }
// if (mm < 10) {
//     mm = '0' + mm;
// }
// var today = dd + '/' + mm + '/' + yyyy;
// document.getElementById('date').value = today;

window.onscroll = function() {myFunction()};

var header = document.getElementById("myHeader");
var sticky = header.offsetTop;

function myFunction() {
    console.log('works')
  if (window.pageYOffset > sticky) {
    header.classList.add("sticky");
  } else {
    header.classList.remove("sticky");
  }
}