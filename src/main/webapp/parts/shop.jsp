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
                                    <span><c:out value="${item['price']}" /></span>
                                    <strike class="text-muted"><c:out value="${item['price_old']}" /></strike>
                                </div>
                                <div href="#" data-id="${item['id']}" data-name="${item['description']}" data-price="${item['price']}" class="add-to-cart center_xy u pointer text-primary">+ Add to cart</div>
                                <small>FREE 1-2 day shipping over $29</small>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<script src="./javascript/index.js"></script>
<style><%@ include file="../css/style.css"%></style>
<style><%@ include file="../css/shop.css"%></style>