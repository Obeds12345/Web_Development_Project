<nav class="navbar navbar-light bg-info py-2">
    <div class="container-fluid text-white d-flex justify-content-between">
        <div class="">
            <span class="mr-2">
                <i class="fas fa-map-marker-alt"></i>&nbsp;
                <small>2031 South Clark, Chicago-IL</small>
            </span>
            <span class="mr-2">
                <i class="fas fa-phone-volume"></i>&nbsp;
                <small>312 394 9286</small>
            </span>
            <span>
                <i class="fas fa-envelope"></i>&nbsp;
                <small>beaver_care@gmail.com</small>
            </span>
        </div>
        <div>
            <ul class="list-inline my-0">
                <li class="list-inline-item border-left border-right mx-0 px-4">
                  <a href="https://www.facebook.com/" class="text-white"><i class="fab fa-facebook-f"></i> </a>
               </li>
                <li class="list-inline-item border-right mx-0 px-3">
                   <a href="https://www.twitter.com/" class="text-white"><i class="fab fa-twitter"></i> </a>
                </li>
                <li class="list-inline-item border-right mx-0 px-3">
                   <a href="https://www.youtube.com/" class="text-white"><i class="fab fa-youtube"></i></a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<nav class="navbar navbar-expand-md navbar-white bg-white sticky-top py-0 border-bottom">
    <div class="container">
        <a class="navbar-brand" href="index"><img src="images/logo.jpg" alt="" style="height: 60px;"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto px-2 py-3">
                <li class="nav-item active">
                    <a class="nav-link" href="index">Home <span class="sr-only">(current)</span></a>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Service
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="workshop">Training/Workshop</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="shop">Shop</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="contact">Contact</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="about">About Us</a>
                </li>
            </ul>
                <button class="btn btn-outline-info my-2 my-sm-0 mr-2" data-toggle="modal" data-target="#booknow">
                    Book Now
                </button>

                 <button class="btn btn-warning my-2 my-sm-0 text-white"  onClick="javascript:window.location='<%="cart"%>';">
                     <i class="fa fa-shopping-cart"></i> (<span class="badge total-count"></span>)
                 </button>
        </div>
    </div>
</nav>


<!-- Modal -->
<div class="modal fade" id="booknow" tabindex="-1" role="dialog" aria-labelledby="booknowTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLongTitle">Register For Workshop</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="col-md-12">
                    <div class="well-block">
                        <form action="workshop" method="post">
                            <!-- Form start -->
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="control-label" for="name">Name</label>
                                        <input id="name" name="name" type="text" placeholder="Name"
                                            class="form-control input-md">
                                    </div>
                                </div>
                                <!-- Text input-->
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="control-label" for="email">Email</label>
                                        <input id="email" name="email" type="text" placeholder="E-Mail"
                                            class="form-control input-md">
                                    </div>
                                </div>
                                <!-- Text input-->
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="control-label" for="date">Preferred Date</label>
                                        <input id="date" name="date" type="text" placeholder="Preferred Date"
                                            class="form-control input-md">
                                    </div>
                                </div>
                                <!-- Select Basic -->
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="control-label" for="time">Preferred Time</label>
                                        <select id="time" name="time" class="form-control">
                                            <option value="8:00 to 9:00">8:00 to 9:00</option>
                                            <option value="9:00 to 10:00">9:00 to 10:00</option>
                                            <option value="10:00 to 1:00">10:00 to 1:00</option>
                                        </select>
                                    </div>
                                </div>
                                <!-- Select Basic -->
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label class="control-label" for="appointmentfor">Appointment For</label>
                                        <select id="appointmentfor" name="appointmentfor" class="form-control">
                                            <option value="Service#1">Grooming Beaver Level 2: 4 to 6 months old</option>
                                            <option value="Service#2">Beaver Yoga Beaver Level 2: 2 to 4 months old</option>
                                            <option value="Service#3">Adoption Service Adult Beaver Level 1</option>
                                            <option value="Service#4">Exercise Complete Package</option>
                                        </select>
                                    </div>
                                </div>
                                <!-- Button -->
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <button id="singlebutton" type="submit" name="makeAppointment" class="btn btn-default">Make An
                                            Appointment</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                        <!-- form end -->
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>


<script src="./javascript/index.js"></script>
<style><%@ include file="../css/style.css"%></style>
<style><%@ include file="../css/nav.css"%></style>