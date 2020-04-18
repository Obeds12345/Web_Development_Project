
<div class="container center_xy login-signup">
    <div class="card" style="width: 500px;">
        <div class="card-body">
            <ul class="nav nav-tabs row mb-4 border-0" id="myTab" role="tablist">
                <li class="nav-item col-sm-6 pr-0">
                    <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab"
                        aria-controls="home" aria-selected="true">Login</a>
                </li>
                <li class="nav-item col-sm-6 pl-0">
                    <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab"
                        aria-controls="profile" aria-selected="false">Sign Up</a>
                </li>
            </ul>

            <!-- Tab panes -->
            <div class="tab-content">
                <div class="tab-pane active" id="home" role="tabpanel" aria-labelledby="home-tab">
                    <h3 class="text-center text-info"><i class="fa fa-lock mr-2"></i>USER</h3>
                    <form class="signup" action="login" method="post">
                        <div class="form-group">
                            <input type="text" name="username" class="form-control" placeholder="UserName">
                        </div>
                        <div class="form-group">
                            <input type="password" name="password" class="form-control" placeholder="Password">
                        </div>
                        <div style="color:red">${errorMessage}</div>
                            <div style="color:green">${SuccessMessage}</div>
                             <div style="color:red">${errorMessage2}</div>
                        <div class="form-group">
                            <div class="checkbox">
                                <label><input type="checkbox"> remember me </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="submit" name="login" class="btn btn-success btn-block" value="SUBMIT">
                        </div>
                    </form>
                </div>
                <div class="tab-pane" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                    <h3 class="text-center text-info"><i class="fa fa-lock mr-2"></i>BECOME A MEMBER </h3>
                    <form class="signup" action="login" method="post">
                        <div class="form-group">
                            <input type="text" name="username" class="form-control" placeholder="UserName">
                        </div>
                        <div class="form-group">
                            <input type="email"name="email" class="form-control" placeholder="Email Address">
                        </div>
                        <div class="form-group">
                            <input type="number" name="phone"class="form-control" placeholder="Phone Number">
                        </div>
                        <div class="form-group">
                            <input type="password" name="password" class="form-control" placeholder="Password">
                        </div>
                        <div class="form-group">
                            <input type="password" name="confirmed" class="form-control" placeholder="Confirm Password">
                        </div>
                          <div style="color:green">${SuccessMessage}</div>
                          <div style="color:red">${errorMessage2}</div>
                        <div class="form-group">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox"> Please accept the <a href=""> terms and conditions</a> to
                                    proceed

                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-success btn-block" name="signup" value="SUBMIT">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <style><%@ include file="../css/style.css"%></style>
    <style><%@ include file="../css/login.css"%></style>