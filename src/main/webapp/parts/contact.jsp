  <main>
        <div class="text-white d-flex align-middle"
            style="align-items:center;background-image: url(images/image5.jpg);height: 200px;">
            <div class="p-5">
                <h6>
                 <ol class="breadcrumb mb-0">
                   <li class="breadcrumb-item"><a href="index" id="link">Home</a></li>
                   <li class="breadcrumb-item active" aria-current="page">Contact us</li>
                 </ol>
                </h6>
                <h1> CONTACT US </h1>
            </div>
        </div>
        <div class="container">
            <div class="row py-4">
                <div class="col-6">
                    <h2> HOW TO FIND US </h2>
                    <span class="text-muted">
                        Our goal is to provide the best customer service and to answer all of your questions in a timely
                        manner. If you have any concern regarding your terms,
                        please contact Barbs Beaver lodge using the contact information on this page.
                    </span>

                </div>
                <div class="col-6">
                    <h2>LEAVE US A MESSAGE </h2>
                    <span class="text-muted">Got a question, need to adopt, we do love to hear from you.
                        please leave me a message that includes your name email, and telephone number,
                          I will return your call as soon as possible. Thank you.
                    </span>
                </div>
            </div>

            <div class="row py-4">
                <div class="col-6">
                    <div class="row py-2">
                        <div class="col-sm-3 col-lg-6 hidden-md-down">
                            <a class="bg-circle bg-info" href="# ">
                                <i class="fas fa-phone fa-2x fa-fw"></i>
                            </a>
                            <span>(312)-394-9286</span>
                        </div>
                        <div class="col-sm-3 col-lg-6 hidden-md-down">
                            <a class="bg-circle bg-info" href="# ">
                                <i class="fas fa-fax fa-2x fa-fw"></i>
                            </a>
                            <span>(312)-394-3030</span>
                        </div>
                    </div>
                    <div class="row py-2">
                        <div class="col-sm-3 col-lg-6 hidden-md-down">
                            <a class="bg-circle bg-info" href="# ">
                                <i class="fab fa-skype fa-2x fa-fw"></i>
                            </a>
                            <span>BeaverSkype</span>
                        </div>
                        <div class="col-sm-3 col-lg-6 hidden-md-down">
                            <a class="bg-circle bg-info" href="# ">
                                <i class="fab fa-instagram fa-2x fa-fw "></i>
                            </a>
                            <span>#BeaverCare</span>
                        </div>
                    </div>
                    <div class="row py-2">
                        <div class="col-sm-3 col-lg-12 hidden-md-down">
                            <a class="bg-circle bg-info" href="# ">
                                <i class="fas fa-envelope-open-text fa-2x fa-fw"></i>
                            </a>
                            <span>beaver_care@gmail.com</span>
                        </div>
                    </div>
                    <div class="row py-2">
                        <div class="col-sm-3 col-lg-12 hidden-md-down">
                            <a class="bg-circle bg-info" href="# ">
                                <i class="fas fa-map-marker-alt fa-2x fa-fw"></i>
                            </a>
                            <span>2031 South Clark, Chicago-IL</span>
                        </div>
                    </div>

                </div>
                <div class="col-6">
                    <form action="contact" method="post">
                    <div style="color:green">${contactMessage}</div>
                        <div class="form-group">
                            <textarea class="form-control" name="message" placeholder="Your message" id="contactMessage"
                                rows="3"></textarea>
                        </div>
                        <div class="form-group">
                            <input class="form-control form-control-lg" name="name" placeholder="Your name" type="text"
                                id="contactName">
                        </div>
                        <div class="form-group">
                            <input class="form-control form-control-lg" name="email" placeholder="Your email" type="email"
                                id="contactEmail">
                        </div>
                        <div class="form-group">
                            <select class="form-control form-control-lg" name="reason" id="contactReason">
                                <option>Reason of contact</option>
                                <option>I did not receive my order</option>
                                <option>Return my item</option>
                                <option>Cancel my appointment</option>
                                <option>Other</option>
                            </select>
                        </div>

                        <div class="form-group d-flex justify-content-end">
                            <button class="btn btn-info" type="submit" name="contact" >Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <!-- <div class="container center_xy">
            <img src="images/location.JPG">
        </div> -->

    </main>
    <style><%@ include file="../css/style.css"%></style>
    <style><%@ include file="../css/contact.css"%></style>