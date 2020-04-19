<div class="container">
 <div class="row d-flex justify-content-end py-2">
        <button class="clear-cart btn btn-sm btn-danger">Clear Cart</button>
</div>
    <div class="row">
        <div class="col-lg-12 bg-white rounded shadow-sm border px-0 mb-4">
            <!-- Shopping cart table -->
            <div class="table-responsive">
                <table class="table">
                    <thead>
               <tr>
                 <th class="border-0 bg-light" style="width: 450px">
                    <div class="p-2 px-3 text-uppercase">Item</div>
                 </th>
                 <th class="border-0 bg-light" style="width: 100px">
                    <div class="p-2 px-3 text-uppercase">PRICE</div>
                  </th>
                  <th class="border-0 bg-light" style="width: 400px"><div class="p-2 px-3 text-uppercase center_xy">QUANTITY</div></th>
                 <th class="border-0 bg-light" style="width: 100px"><div class="p-2 px-3 text-uppercase">REMOVE</div></th>
                 <th class="border-0 bg-light"><div class="p-2 px-3 text-uppercase">Total</div></th>
               </tr>
                    </thead>
                    <table class="show-cart table">
                    </table>
                    <!--  <div class="d-flex justify-content-end">Total price: $<span class="total-cart"></span></div>  -->
                </table>
            </div>
            <!-- End -->
        </div>
    </div>

    <div class="row bg-white border rounded shadow-sm" id="showCheckOut">
        <div class="col-lg-6 pl-0">
            <div class="bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold">Coupon code</div>
            <div class="p-4">
                <p class="font-italic mb-4">If you have a coupon code, please enter it in the box below</p>
                <div class="input-group mb-4 border rounded-pill p-2">
                    <input type="text" placeholder="Apply coupon" aria-describedby="button-addon3"
                        class="form-control border-0">
                    <div class="input-group-append border-0">
                        <button id="button-addon3" type="button" class="btn btn-dark px-4 rounded-pill"><i
                                class="fa fa-gift mr-2"></i>Apply coupon</button>
                    </div>
                </div>
            </div>
            <div class="bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold">Instructions for seller
            </div>
            <div class="p-4">
                <p class="font-italic mb-4">If you have some information for the seller you can leave them in
                    the box below</p>
                <textarea name="" cols="30" rows="2" class="form-control"></textarea>
            </div>
        </div>
        <div class="col-lg-6 pr-0">
            <div class="bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold">Order summary </div>
            <div class="p-4">
                <p class="font-italic mb-4">Shipping and additional costs are calculated based on values you
                    have entered.</p>
                <ul class="list-unstyled mb-4">
                    <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Order
                            Subtotal </strong>
                        <strong>
                            <span class="total-cart"></span>
                        </strong>
                    </li>
                    <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Shipping
                            and handling</strong><strong  class="shipping"></strong></li>
                    <li class="d-flex justify-content-between py-3 border-bottom"><strong
                            class="text-muted">Tax</strong>
                        <strong>
                            <span class="tax"></span>
                        </strong>
                    </li>
                    <li class="d-flex justify-content-between py-3 border-bottom"><strong
                            class="text-muted">Total</strong>
                        <h5 class="font-weight-bold">
                        <span class="order-total"></span>
                        </h5>
                    </li>
                </ul><a href="#" class="btn btn-dark rounded-pill py-2 btn-block" data-toggle="modal"
                    data-target="#checkout">Procceed to checkout</a>
            </div>
        </div>
    </div>
</div>




<!-- Modal -->
<div class="modal fade" id="checkout" tabindex="-1" role="dialog" aria-labelledby="checkoutTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Payment Details</h5>
            </div>
            <div class="modal-body container">
                <form action="order" method="post">
                    <div class="form-group">
                        <label class="control-label" for="name">Name <span style="color:red">*</span></label>
                        <input id="name" name="name" maxlength="30"type="text" placeholder="Name" class="form-control input-md"
                          oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);">
                    </div>

                    <div class="row">
                        <div class="col-7">
                            <div class="form-group">
                                <label class="control-label" for="name">Email<span style="color:red">*</span></label>
                                <input id="email" name="email" type="text" maxlength="50" placeholder="Email" class="form-control "
                                  oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);">
                            </div>
                        </div>
                        <div class="col-5">
                            <div class="form-group">
                                <label class="control-label" for="name">Phone</label>
                                <input id="phone" name="phone" maxlength="13" type="number" placeholder="Phone" class="form-control"
                                  oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);">
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                       <label class="control-label" for="name">Address<span style="color:red">*</span></label>
                       <input id="address" name="address" maxlength="50" type="text" placeholder="Name" class="form-control input-md"
                         oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);">
                   </div>
                    <div class="form-group">
                        <label for="cardNumber"> CARD NUMBER<span style="color:red">*</span></label>
                            <input class="form-control" id="cardNumber" placeholder="Valid Card Number" name="card"
                              oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);"
                              minlength="16" maxlength="16" type="number"  required autofocus />
                    </div>
                  <div class="row">
                         <div class="col-6">
                           <div class="form-group">
                               <label for="expityMonth"> EXPIRY DATE<span style="color:red">*</span></label>
                                   <input type="month" class="form-control" id="expityMonth" name="date" placeholder="MMYY" required />
                           </div>
                           </div>
                          <div class="col-6">
                               <div class="form-group">
                                    <label for="cvCode"> CV CODE<span style="color:red">*</span></label>
                                        <input type="password" class="form-control" id="cvCode" name="cvCode" placeholder="CV"
                                         minlength="3" maxlength="3"required />
                                </div>
                            </div>
                   </div>

            </div>
            <div class="modal-footer">
                <button class="btn btn-success clear-session btn-block" role="button" type="submit">Pay</button>
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div
              </form>
        </div>
    </div>
</div>

<script src="./javascript/index.js"></script>
<style><%@ include file="../css/style.css"%></style>
<style><%@ include file="../css/contact.css"%></style>