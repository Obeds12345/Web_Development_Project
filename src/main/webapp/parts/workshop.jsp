<script src="./javascript/index.js"></script>
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/workshop.css">

  <main>
        <div class="text-white d-flex align-middle"
            style="align-items:center;background-image: url(images/image5.jpg);height: 200px;">
            <div class="p-5">
                <h6>
                     <ol class="breadcrumb mb-0">
                       <li class="breadcrumb-item"><a href="index" id="link">Home</a></li>
                       <li class="breadcrumb-item active" aria-current="page">WorkShop</li>
                     </ol>

                </h6>
                <h1> WORKSHOP </h1>
            </div>
        </div>
        <div class="container-fluid px-4 bg-light py-4">
            <div class="row py-4">
               <div class="col-6">
                  <h2> WHAT WE DO </h2>
                  <div class="py-3 what_we_do">
                      <ul>
                          <li>This worshop expands on Beaver basic behaviors and introduces the concept of establishing</li>
                          <li>This worshop focuses on socialization and designed to familiarize your Beaver with basic behaviors.</li>
                          <li>Maluisset id persius appetere pro mea harum</li>
                      </ul>
                  </div>
                    <div class="embed-responsive embed-responsive-16by9">
                      <iframe width="853" height="480" src="https://www.youtube.com/embed/eBgr32jL0Do" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    </div>
              </div>
                <div class="col-6 px-4">
                    <div class="card workshopcard">
                        <div class="card-header workshopcard_header h4">
                            <span><i class="fas fa-calendar-alt pr-4"></i></span>
                            UP Coming Events
                        </div>
                        <div class="card-body">
                            <div class="row mb-4">
                                <div class="col-2">
                                    <div class="card workshopcard d-flex">
                                        <div class="panel text-center workshopColor date">
                                            <div class="month workshopcard_header">
                                                Apr
                                            </div>
                                            <div class="day ">
                                                23
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-8">
                                    <div class="h5 mb-0"><strong>Beaver Level 2: 4 to 6 months old. <small>$129 </small></strong> </div>
                                    <span>This worshop focuses on socialization and designed to familiarize your Beaver with basic behaviors.
                                    </span>
                                </div>

                                <div class="col-2 ">
                                    <button type="button" class="btn btn-info" data-toggle="modal" data-target="#Register">Register</button>
                                </div>

                            </div>
                            <div class="row mb-4">
                                <div class="col-2">
                                    <div class="card workshopcard d-flex">
                                        <div class="panel text-center workshopColor date">
                                            <div class="month workshopcard_header">
                                                June
                                            </div>
                                            <div class="day ">
                                                03
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-8">
                                    <div class="h5 mb-0"><strong>Beaver Level 2: 2 to 4 months old.</strong> </div>
                                    <span>This worshop expands on Beaver basic behaviors and introduces the concept of establishing behaviors routine
                                    </span>
                                </div>
                                <div class="col-2 ">
                                    <button type="button" class="btn btn-info" data-toggle="modal" data-target="#Register">Register</button>
                                </div>
                            </div>
                            <div class="row mb-4">
                                <div class="col-2">
                                    <div class="card workshopcard d-flex">
                                        <div class="panel text-center workshopColor date">
                                            <div class="month workshopcard_header">
                                                June
                                            </div>
                                            <div class="day ">
                                                30
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-8">
                                    <div class="h5 mb-0"><strong>Adult Beaver Level 1<small> starting at $129</small></strong> </div>
                                    <span>This training is designed to help you better communicate with and train your mature dog. Dog will learn behavior and cues such as "leave it" and "wait," along with walking on loose leash.
                                    </span>
                                </div>
                                <div class="col-2 ">
                                    <button type="button" class="btn btn-info" data-toggle="modal" data-target="#Register">Register</button>
                                </div>
                            </div>
                            <div class="row mb-4">
                                <div class="col-2">
                                    <div class="card workshopcard d-flex">
                                        <div class="panel text-center workshopColor date">
                                            <div class="month workshopcard_header">
                                                Dec
                                            </div>
                                            <div class="day ">
                                                14
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-8">
                                    <div class="h5 mb-0"><strong>Complete Package: <small> starting at $349</small> </strong> </div>
                                    <span>This 6 weeks packagegives your older Beaver or mature dog the very best in training. It includes: Adult Dog level 1, Adult Dog Level 2, and 1 private lesson.
                                    </span>
                                </div>
                                <div class="col-2 ">
                                    <button type="button" class="btn btn-info" data-toggle="modal" data-target="#Register">Register</button>
                                </div>
                            </div>
                            <a href="#" class="btn btn-default btn-block">More Events »</a>
                        </div>
                    </div>
                </div>
            </div>
    </main>

    <!-- Modal -->
    <div class="modal fade" id="Register" tabindex="-1" role="dialog" aria-labelledby="booknowTitle" aria-hidden="true">
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
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label" for="email">Email</label>
                                            <input id="email" name="email" type="text" placeholder="E-Mail"
                                                class="form-control input-md">
                                        </div>
                                    </div>
                                    <!-- Select Basic -->
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label" for="time">Preferred Time</label>
                                            <select id="time" name="time" class="form-control">
                                                <option value="8:00 to 9:00">8:00 to 9:00</option>
                                                <option value="9:00 to 10:00">9:00 to 10:00</option>
                                                <option value="10:00 to 1:00">10:00 to 1:00</option>
                                            </select>
                                        </div>
                                    </div>
                                    <!-- Button -->
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <button id="Register" type="submit" name="makeAppointment" class="btn btn-default">Register</button>
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
