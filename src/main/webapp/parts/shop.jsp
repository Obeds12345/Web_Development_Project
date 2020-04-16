<script src="./javascript/index.js"></script>
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/shop.css">

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="com.jsptutorial.*"%>

<div class="container py-4">
    <div class="row">
        <c:forEach items="${items}" var="item">
            <div class="col-3 py-4">
                <div class="card">
                    <div class="card-body">
                        <c:url var="myurl" value="/${item['id']}.jpg" context="/images" />
                        <img src="${myurl}" style="width: 200px;" alt="">
                        <div class="center_xy">
                            <div>
                                <div class="center_xy">
                                    <small>
                                        <c:forEach var="va" begin="1" end="${item['stars']}">
                                            <i class="fas fa-star text-warning"></i>
                                        </c:forEach>
                                        <c:forEach var="va" begin="1" end="${item['not_stars']}">
                                            <i class="fas fa-star text-muted"></i>
                                        </c:forEach>
                                    </small>
                                </div>
                                <div class="center_xy text-muted">
                                    <c:out value="${item['description']}" />
                                </div>
                                <div class="py-2 d-flex justify-content-between">
                                    <span>
                                        <c:out value="${item['price']}" /></span>
                                    <strike class="text-muted">
                                        <c:out value="${item['price_old']}" /></strike>
                                </div>
                                <div class="center_xy">+ Add to cart</div>
                                <small>FREE 1-2 day shipping over $29</small>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>


    <!--  <div class="row">
       <div class="col-3">
           <div class="card">
               <div class="card-body">
                   <img src="images/item1.jpg" style="width: 200px;" alt="">
                   <div class="center_xy">
                       <div>
                           <div class="center_xy">
                               <small>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-muted"></i>
                               </small>
                           </div>
                           <div class="center_xy text-muted">Item description</div>
                           <div class="py-2 d-flex justify-content-between">
                               <span>$5.99</span>
                               <strike class="text-muted">$10.99</strike>
                           </div>
                           <div class="center_xy">+ Add to cart</div>
                       </div>
                   </div>
               </div>
           </div>
       </div>
       <div class="col-3">
           <div class="card">
               <div class="card-body">
                   <img src="images/item2.jpg" style="width: 200px;" alt="">
                   <div class="center_xy">
                       <div>
                           <div class="center_xy">
                               <small>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-muted"></i>
                               </small>
                           </div>
                           <div class="center_xy text-muted">Item description</div>
                           <div class="py-2 d-flex justify-content-between">
                               <span>$5.99</span>
                               <strike class="text-muted">$10.99</strike>
                           </div>
                           <div class="center_xy">+ Add to cart</div>
                       </div>
                   </div>
               </div>
           </div>
       </div>
       <div class="col-3">
           <div class="card">
               <div class="card-body">
                   <img src="images/item3.jpg" style="width: 200px;" alt="">
                   <div class="center_xy">
                       <div>
                           <div class="center_xy">
                               <small>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-muted"></i>
                               </small>
                           </div>
                           <div class="center_xy text-muted">Item description</div>
                           <div class="py-2 d-flex justify-content-between">
                               <span>$5.99</span>
                               <strike class="text-muted">$10.99</strike>
                           </div>
                           <div class="center_xy">+ Add to cart</div>
                       </div>
                   </div>
               </div>
           </div>
       </div>
       <div class="col-3">
           <div class="card">
               <div class="card-body">
                   <img src="images/item4.jpg" style="width: 200px;" alt="">
                   <div class="center_xy">
                       <div>
                           <div class="center_xy">
                               <small>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-warning"></i>
                                   <i class="fas fa-star text-muted"></i>
                               </small>
                           </div>
                           <div class="center_xy text-muted">Item description</div>
                           <div class="py-2 d-flex justify-content-between">
                               <span>$5.99</span>
                               <strike class="text-muted">$10.99</strike>
                           </div>
                           <div class="center_xy">+ Add to cart</div>
                       </div>
                   </div>
               </div>
           </div>
       </div>
   </div>-->
</div>