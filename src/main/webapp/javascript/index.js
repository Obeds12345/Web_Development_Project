// ************************************************
// Shopping Cart API
// ************************************************

var shoppingCart = (function () {
  // =============================
  // Private methods and propeties
  // =============================
  cart = [];

  // Constructor
  function Item(id, name, price, count) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.count = count;
  }

  // Save cart
  function saveCart() {
    sessionStorage.setItem('shoppingCart', JSON.stringify(cart));
  }

  // Load cart
  function loadCart() {
    cart = JSON.parse(sessionStorage.getItem('shoppingCart'));
  }
  if (sessionStorage.getItem("shoppingCart") != null) {
    loadCart();
  }


  // =============================
  // Public methods and propeties
  // =============================
  var obj = {};

  // Add to cart
  obj.addItemToCart = function (id, name, price, count) {
    for (var item in cart) {
      if (cart[item].id === id) {
        cart[item].count++;
        saveCart();
        return;
      }
    }
    var item = new Item(id, name, price, count);
    cart.push(item);
    saveCart();
  }
  // Set count from item
  obj.setCountForItem = function (id, count) {
    for (var i in cart) {
      if (cart[i].id === id) {
        cart[i].count = count;
        break;
      }
    }
  };
  // Remove item from cart
  obj.removeItemFromCart = function (id) {
    for (var item in cart) {
      if (cart[item].id === id) {
        cart[item].count--;
        if (cart[item].count === 0) {
          cart.splice(item, 1);
        }
        break;
      }
    }
    saveCart();
  }

  // Remove all items from cart
  obj.removeItemFromCartAll = function (id) {
    for (var item in cart) {
      if (cart[item].id === id) {
        cart.splice(item, 1);
        break;
      }
    }
    saveCart();
  }

  // Clear cart
  obj.clearCart = function () {
    cart = [];
    saveCart();
  }

  // Count cart
  obj.totalCount = function () {
    var totalCount = 0;
    for (var item in cart) {
      totalCount += cart[item].count;
    }
    return totalCount;
  }

  // Total cart
  obj.totalCart = function () {
    var totalCart = 0;
    for (var item in cart) {
      totalCart += cart[item].price * cart[item].count;
    }
    return Number(totalCart.toFixed(2));
  }

  // List cart
  obj.listCart = function () {
    var cartCopy = [];
    for (i in cart) {
      item = cart[i];
      itemCopy = {};
      for (p in item) {
        itemCopy[p] = item[p];

      }
      itemCopy.total = Number(item.price * item.count).toFixed(2);
      cartCopy.push(itemCopy)
    }
    return cartCopy;
  }

  return obj;
})();


// *****************************************
// Triggers / Events
// *****************************************
// Add item
$('.add-to-cart').click(function (event) {
  event.preventDefault();
  var id = $(this).data('id');
  var name = $(this).data('name');
  var price = Number($(this).data('price'));
  console.log(id);
  shoppingCart.addItemToCart(id, name, price, 1);
  displayCart();
});

// Clear items
$('.clear-cart').click(function () {
  shoppingCart.clearCart();
  displayCart();
});


function displayCart() {
  var cartArray = shoppingCart.listCart();
  var output = "";


  var showCheckOut = cartArray.length === 0 ? 'd-none' : 'show'
  if(cartArray.length === 0){

  var element = document.getElementById("showCheckOut");
  var name = "d-none";
  var arr = element.className.split(" ");
  element.className += " " + name;


  output = `<div class="py-3 my-3">`
          +`<div class="center_xy">`
          +`<img src="images/nodata.jpg" class="img-fluid" alt="No data in cart">`
          +`</div>`
          +`<div class="center_xy">`
          +`<button onClick="location.href = 'shop'" type="button" class="btn btn-continue">Continue Shopping</button>`
          +`</div>`
          +`</div>`;
  }
  for (var i in cartArray) {
  var image = "images/"+cartArray[i].id+".jpg"
    output += `<tr>`
      + `<td scope="row"  class="border-0">`
      + `<div class="p-2">`
      + `<img src=${image} alt=${cartArray[i].name} width="70" class="img-fluid rounded shadow-sm">`
      + `<div class="ml-3 d-inline-block align-middle">`
      + `<h5 class="mb-0"> <a href="#" class="text-dark d-inline-block align-middle">${cartArray[i].name}</a></h5>`
      + `<span class="text-muted font-weight-normal font-italic d-block">Category: Watches</span`
      + `</div>`
      + `</div>`
      + `</td >`
      + `<td class="border-0 align-middle"><strong>$${cartArray[i].price}</strong></td>`
      + "<td class='border-0 align-middle'><div class='input-group'><button class='minus-item input-group-addon btn btn-secondary' data-id=" + cartArray[i].id + ">-</button>"
      + "<input type='number' class='item-count form-control' data-id='" + cartArray[i].id + "' value='" + cartArray[i].count + "'>"
      + "<button class='plus-item btn btn-secondary input-group-addon' data-id=" + cartArray[i].id + ">+</button></div></td>"
      + "<td class='border-0 align-middle'><button class='delete-item btn btn-danger' data-id=" + cartArray[i].id + "><i class='fa fa-trash'></i></button></td>"
      + "<td class='border-0 align-middle'>" + cartArray[i].total + "</td>"
      + "</tr>";
  }
  var tax = (shoppingCart.totalCart()*10)/100
  var shipping = 19.99
  var order_total =  shoppingCart.totalCart() + tax + shipping
  tax = Number(tax.toFixed(2));
  shipping = Number(shipping.toFixed(2));
  order_total = Number(order_total.toFixed(2));

  $('.show-cart').html(output);
  $('.total-cart').html(shoppingCart.totalCart());
  $('.tax').html(tax);
  $('.total-count').html(shoppingCart.totalCount());
  $('.shipping').html("$" + shipping);
  $('.order-total').html("$" + order_total);

}

// Delete item button

$('.show-cart').on("click", ".delete-item", function (event) {
  var name = $(this).data('id')
  shoppingCart.removeItemFromCartAll(name);
  displayCart();
})


// -1
$('.show-cart').on("click", ".minus-item", function (event) {
  var name = $(this).data('id')
  shoppingCart.removeItemFromCart(name);
  displayCart();
})
// +1
$('.show-cart').on("click", ".plus-item", function (event) {
  var name = $(this).data('id')
  shoppingCart.addItemToCart(name);
  displayCart();
})

// Item count input
$('.show-cart').on("change", ".item-count", function (event) {
  var id = $(this).data('id');
  var count = Number($(this).val());
  shoppingCart.setCountForItem(id, count);
  displayCart();
});

displayCart();
