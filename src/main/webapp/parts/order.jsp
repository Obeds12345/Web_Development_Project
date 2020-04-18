<div>
        <div class="container center_xy py-4">
            <div class="card shdow" style="width: 700px;">
                <div class="card-header h2 bg-white">Order Received</div>
                <div class="card-body">
                    <div>Thank you you order is on the way</div>
                    <div class="bg-light p-3 border-bottom">
                        <small>ORDER NUMBER</small><br>
                        <strong>${order_number}</strong>
                    </div>
                    <div class="bg-light p-3 border-bottom">
                        <small>Date</small><br>
                        <strong>${date}</strong>
                    </div>
                    <div class="bg-light p-3 border-bottom">
                        <small>TOTAL</small><br>

                        <strong class""><span class="order-save-total"></span></strong>
                    </div>
                    <div class="bg-light p-3 border-bottom">
                        <small>PAYMENT METHOD</small><br>
                        <strong class="text-uppercase">VISA CARD ENDING IN ${card} </strong>
                    </div>
                </div>
                <div class="card-header h2 bg-white">Shipment Details</div>
                <div class="card-body">
                    <div class="bg-light p-3 border-bottom">
                        <small>NAME</small><br>
                        <strong class="text-uppercase">${name}</strong>
                    </div>
                    <div class="bg-light p-3 border-bottom">
                        <small>ADDRESS</small><br>
                        <strong class="text-uppercase">${address}</strong>
                    </div>
                    <div class="bg-light p-3 border-bottom">
                        <small>PHONE</small><br>
                        <strong>${phone}</strong>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="./javascript/index.js"></script>
    <style><%@ include file="../css/style.css"%></style>
