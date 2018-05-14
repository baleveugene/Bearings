<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Meta -->
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <meta name="keywords" content="MediaCenter, Template, eCommerce">
        <meta name="robots" content="all">

        <title>MediaCenter - Responsive eCommerce Template</title>

        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href="resources/assets/css/bootstrap.min.css">
        
        <!-- Customizable CSS -->
        <link rel="stylesheet" href="resources/assets/css/main.css">
        <link rel="stylesheet" href="resources/assets/css/green.css">
        <link rel="stylesheet" href="resources/assets/css/owl.carousel.css">
        <link rel="stylesheet" href="resources/assets/css/owl.transitions.css">
        <link rel="stylesheet" href="resources/assets/css/animate.min.css">

        <!-- Demo Purpose Only. Should be removed in production -->
        <link rel="stylesheet" href="resources/assets/css/config.css">

        <link href="resources/assets/css/green.css" rel="alternate stylesheet" title="Green color">
        <link href="resources/assets/css/blue.css" rel="alternate stylesheet" title="Blue color">
        <link href="resources/assets/css/red.css" rel="alternate stylesheet" title="Red color">
        <link href="resources/assets/css/orange.css" rel="alternate stylesheet" title="Orange color">
        <link href="resources/assets/css/navy.css" rel="alternate stylesheet" title="Navy color">
        <link href="resources/assets/css/dark-green.css" rel="alternate stylesheet" title="Darkgreen color">
        <!-- Demo Purpose Only. Should be removed in production : END -->

        <!-- Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
        
        <!-- Icons/Glyphs -->
        <link rel="stylesheet" href="resources/assets/css/font-awesome.min.css">
        
        <!-- Favicon -->
        <link rel="shortcut icon" href="resources/assets/images/favicon.ico">

        <!-- HTML5 elements and media queries Support for IE8 : HTML5 shim and Respond.js -->
        <!--[if lt IE 9]>
            <script src="resources/assets/js/html5shiv.js"></script>
            <script src="resources/assets/js/respond.min.js"></script>
        <![endif]-->

        
    </head>
<body>
    
    <div class="wrapper">
        <!-- ============================================================= TOP NAVIGATION ============================================================= -->

                
<!-- ============================================================= TOP NAVIGATION ============================================================= -->
<%@include file="/WEB-INF/pages/in/nav.jsp" %>        
<!-- ============================================================= TOP NAVIGATION : END ============================================================= -->       <!-- ============================================================= HEADER ============================================================= -->
<%@include file="/WEB-INF/pages/in/header.jsp" %>
<!-- ============================================================= HEADER : END ============================================================= --><div class="animate-dropdown"><!-- ========================================= BREADCRUMB ========================================= -->

        
        
<!-- ============================================================= HEADER : END ============================================================= --><div class="animate-dropdown"><!-- ========================================= BREADCRUMB ========================================= -->
<div id="top-mega-nav">
    <div class="container">
        <nav>
            <ul class="inline">

<%@include file="/WEB-INF/pages/in/dropdown_le_dropdown.jsp" %>

                <li class="breadcrumb-nav-holder"> 
                    <ul>
                        <li class="breadcrumb-item current gray">
                            <a href="#">Checkout Process</a>
                        </li>
                    </ul>
                </li><!-- /.breadcrumb-nav-holder -->
            </ul>
        </nav>
    </div><!-- /.container -->
</div><!-- /#top-mega-nav -->
<!-- ========================================= BREADCRUMB : END ========================================= --></div>     <!-- ========================================= CONTENT ========================================= -->

<section id="checkout-page">
    <div class="container">
        <div class="col-xs-12 no-margin">
            
                <!--<form action="checkout.htm" method="POST">-->
<form:form action="${pageContext.request.contextPath}/checkout" method="POST" commandName="order">
            <div class="billing-address">
                <h2 class="border h1">billing address</h2>
                    <div class="row field-row">
                        <div class="col-xs-12 col-sm-6">
                            <label>first name*</label>
                            <!--<input class="le-input" >-->
                            <form:input  class="le-input"  path="firstname" name="firstname" type="text"/> <br/> <form:errors style="color:red;" path="firstname" cssClass="error" ></form:errors>
                        </div>
                        <div class="col-xs-12 col-sm-6">
                            <label>last name*</label>
                            <!--<input class="le-input" >-->
                            <form:input  class="le-input"  path="lastname" name="lastname" type="text"/> <br/> <form:errors style="color:red;" path="lastname" cssClass="error" ></form:errors>
                        </div>
                    </div><!-- /.field-row -->

                    <div class="row field-row">
                        <div class="col-xs-12">
                            <label>company name*</label>
                            <!--<input class="le-input" >-->
                             <form:input  class="le-input"  path="company" name="company" type="text"/> <br/> <form:errors style="color:red;" path="company" cssClass="error" ></form:errors>
                        </div>
                    </div><!-- /.field-row -->

                    <div class="row field-row">
                        <div class="col-xs-12 col-sm-6">
                            <label>street address*</label>
                            <!--<input class="le-input" data-placeholder="street address" >-->
                        <form:input  class="le-input"  path="address" name="address" type="text"/> <br/> <form:errors style="color:red;" path="address" cssClass="error" ></form:errors>
                        </div>
                        <div class="col-xs-12 col-sm-6">
                            <!--<label>&nbsp;</label>-->
                            <label>town*</label>
                            <!--<input class="le-input" data-placeholder="town" >-->
                            <form:input  class="le-input" path="city" name="city" type="text"/> <br/> <form:errors style="color:red;" path="city" cssClass="error" ></form:errors>
                        </div>
                    </div><!-- /.field-row -->

                    <div class="row field-row">
                        <div class="col-xs-12 col-sm-4">
                            <label>country*</label>
                            <!--<input class="le-input"  >-->
                            <form:input  class="le-input"  path="country" name="country" type="text"/> <br/> <form:errors style="color:red;" path="country" cssClass="error" ></form:errors>
                        </div>
                        <div class="col-xs-12 col-sm-4">
                            <label>email address*</label>
                            <!--<input class="le-input" >-->
                             <form:input  class="le-input"  path="email" name="email" type="text"/> <br/> <form:errors style="color:red;" path="email" cssClass="error" ></form:errors>
                        </div>

                        <div class="col-xs-12 col-sm-4">
                            <label>phone number*</label>
                            <!--<input class="le-input" >-->
                             <form:input  class="le-input"  path="phone" name="phone" type="text"/> <br/> <form:errors style="color:red;" path="phone" cssClass="error" ></form:errors>
                        </div>
                    </div><!-- /.field-row -->

<!--                    <div class="row field-row">
                        <div id="create-account" class="col-xs-12">
                            <input  class="le-checkbox big" type="checkbox"  />
                            <a class="simple-link bold" href="#">Create Account?</a> - you will receive email with temporary generated password after login you need to change it.
                        </div>
                    </div>-->
                    <!-- /.field-row -->

            
            </div><!-- /.billing-address -->


<!--            <section id="shipping-address">
                <h2 class="border h1">shipping address</h2>
                <form>
                    <div class="row field-row">
                        <div class="col-xs-12">
                            <input  class="le-checkbox big" type="checkbox"  />
                            <a class="simple-link bold" href="#">ship to different address?</a>
                        </div>
                    </div> /.field-row 
                </form>
            </section>-->
            <!-- /#shipping-address -->


            <section id="your-order">
                <h2 class="border h1">your order</h2>
                
                    <c:forEach var="item" items="${cart.items}">
                        <div class="row no-margin order-item">
                            <div class="col-xs-12 col-sm-1 no-margin">
                                <!--<a href="#" class="qty">1 x</a>-->
                                <a href="#" class="qty">${item.quantity} x</a>
                            </div>

                            <div class="col-xs-12 col-sm-9 ">
                                <div class="title"><a href="#">${item.product.model} </a></div>
                                <div class="brand">${item.product.manufacturer} / id: ${item.product.productid} / ${item.product.year}</div>
                            </div>

                            <div class="col-xs-12 col-sm-2 no-margin">
                                <sec:authorize access="hasRole('ROLE_USER')">
                                <div class="price">${item.total} </div>
                                </sec:authorize>
                            </div>
                        </div><!-- /.order-item -->
                    </c:forEach>

<!--                  <div class="row no-margin order-item">
                        <div class="col-xs-12 col-sm-1 no-margin">
                            <a href="#" class="qty">1 x</a>
                        </div>

                        <div class="col-xs-12 col-sm-9 ">
                            <div class="title"><a href="#">white lumia 9001 </a></div>
                            <div class="brand">sony</div>
                        </div>

                        <div class="col-xs-12 col-sm-2 no-margin">
                            <div class="price">$2000.00</div>
                        </div>
                    </div> -->
                    <!--/.order-item--> 
<!--  
                    <div class="row no-margin order-item">
                        <div class="col-xs-12 col-sm-1 no-margin">
                            <a href="#" class="qty">1 x</a>
                        </div>

                        <div class="col-xs-12 col-sm-9 ">
                            <div class="title"><a href="#">white lumia 9001 </a></div>
                            <div class="brand">sony</div>
                        </div>

                        <div class="col-xs-12 col-sm-2 no-margin">
                            <div class="price">$2000.00</div>
                        </div>
                    </div>-->
                    <!-- /.order-item -->
              
            </section><!-- /#your-order -->

            <div id="total-area" class="row no-margin">
                <div class="col-xs-12 col-lg-4 col-lg-offset-8 no-margin-right">
                    <div id="subtotal-holder">
                        <ul class="tabled-data inverse-bold no-border">
                            <li>
                                <label>cart subtotal</label>
                            <sec:authorize access="hasRole('ROLE_USER')">
                                <div class="value ">${cart.subtotal}</div>
                                </sec:authorize>
                            </li>
                            <li>
                                <label>VAT</label>
                                <div class="value">
                                    <div class="radio-group">
                                        <p>not include</p>
<!--                                        <input class="le-radio" type="radio" name="group1" value="free"> <div class="radio-label bold">free shipping</div><br>
                                        <input class="le-radio" type="radio" name="group1" value="local" checked>  <div class="radio-label">local delivery<br><span class="bold">$15</span></div>-->
                                    </div>
                                </div>
                                    <label>shipping</label>
                                    <div class="value">
                                        <div class="radio-group">
                                            <p>not include</p>
<!--                                            <input class="le-radio" type="radio" name="group1" value="free"> <div class="radio-label bold">free shipping</div><br>
                                            <input class="le-radio" type="radio" name="group1" value="local" checked>  <div class="radio-label">local delivery<br><span class="bold">$15</span></div>-->
                                        </div>
                                    </div>
                            </li>
                        </ul><!-- /.tabled-data -->

                        <ul id="total-field" class="tabled-data inverse-bold ">
                            <li>
                                <label>order total</label>                                
                                <sec:authorize access="hasRole('ROLE_USER')">
                                <div class="value">${cart.total}</div>
                                </sec:authorize>
                            </li>
                        </ul><!-- /.tabled-data -->

                    </div><!-- /#subtotal-holder -->
                </div><!-- /.col -->
            </div><!-- /#total-area -->

<!--            <div id="payment-method-options">
                <form>
                    <div class="payment-method-option">
                        <input class="le-radio" type="radio" name="group2" value="Direct">
                        <div class="radio-label bold ">Direct Bank Transfer<br>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce rutrum tempus elit, vestibulum vestibulum erat ornare id.</p>
                        </div>
                    </div> /.payment-method-option 
                    
                    <div class="payment-method-option">
                        <input class="le-radio" type="radio" name="group2" value="cheque">
                        <div class="radio-label bold ">cheque payment</div>
                    </div> /.payment-method-option 
                    
                    <div class="payment-method-option">
                        <input class="le-radio" type="radio" name="group2" value="paypal">
                        <div class="radio-label bold ">paypal system</div>
                    </div> /.payment-method-option 
                </form>
            </div> /#payment-method-options -->
            
            <div class="place-order-button">
<!--                <button class="le-button big">
                    Send request **
                </button>-->
                <form:input class="le-button big" path="" type="submit" name="action" value="Send"/>
                 <!--<input  type="submit" name="register" value="Select"/>-->
            </div><!-- /.place-order-button -->
 
             <!--<div class="radio-label bold ">Direct Bank Transfer<br>-->
                            
                        <!--</div>-->
             </form:form>
        </div><!-- /.col -->
    </div><!-- /.container -->    
</section><!-- /#checkout-page -->
<!-- ========================================= CONTENT : END ========================================= -->      <!-- ============================================================= FOOTER ============================================================= -->

<%@include file="/WEB-INF/pages/in/footer.jsp" %>

<!-- ============================================================= FOOTER : END ============================================================= -->   </div><!-- /.wrapper -->

    <!-- For demo purposes â can be removed on production -->
    
<!--    <div class="config open">
        <div class="config-options">
            <h4>Pages</h4>
            <ul class="list-unstyled animate-dropdown">
                <li class="dropdown">
                    <button class="dropdown-toggle btn le-button btn-block" data-toggle="dropdown">View Pages</button>
                    <ul class="dropdown-menu">
                                                <li><a href="index.html">Home</a></li>
                                                <li><a href="index-2.html">Home Alt</a></li>
                                                <li><a href="category-grid.html">Category - Grid/List</a></li>
                                                <li><a href="category-grid-2.html">Category 2 - Grid/List</a></li>
                                                <li><a href="single-product.html">Single Product</a></li>
                                                <li><a href="single-product-sidebar.html">Single Product with Sidebar</a></li>
                                                <li><a href="cart.html">Shopping Cart</a></li>
                                                <li><a href="checkout.html">Checkout</a></li>
                                                <li><a href="about.html">About Us</a></li>
                                                <li><a href="contact.html">Contact Us</a></li>
                                                <li><a href="blog.html">Blog</a></li>
                                                <li><a href="blog-fullwidth.html">Blog Full Width</a></li>
                                                <li><a href="blog-post.html">Blog Post</a></li>
                                                <li><a href="faq.html">FAQ</a></li>
                                                <li><a href="terms.html">Terms & Conditions</a></li>
                                                <li><a href="authentication.html">Login/Register</a></li>
                                                <li><a href="404.html">404</a></li>
                                                <li><a href="wishlist.html">Wishlist</a></li>
                                                <li><a href="compare">Product Comparison</a></li>
                                                <li><a href="track-your-order.html">Track your Order</a></li>
                                            </ul>   
                </li>
            </ul>
            <h4>Header Styles</h4>
            <ul class="list-unstyled">
                <li><a href="checkout.html&amp;style=alt1">Header 1</a></li>
                <li><a href="checkout.html&amp;style=alt">Header 2</a></li>
            </ul>
            <h4>Colors</h4>
            <ul class="list-unstyled">
                <li><a class="changecolor green-text" href="#" title="Green color">Green</a></li>
                <li><a class="changecolor blue-text" href="#" title="Blue color">Blue</a></li>
                <li><a class="changecolor red-text" href="#" title="Red color">Red</a></li>
                <li><a class="changecolor orange-text" href="#" title="Orange color">Orange</a></li>
                <li><a class="changecolor navy-text" href="#" title="Navy color">Navy</a></li>
                <li><a class="changecolor dark-green-text" href="#" title="Darkgreen color">Dark Green</a></li>
            </ul>
        </div>
        <a class="show-theme-options" href="#"><i class="fa fa-wrench"></i></a>
    </div>-->
    <!-- For demo purposes â can be removed on production : End -->

    <!-- JavaScripts placed at the end of the document so the pages load faster -->
    <script src="resources/assets/js/jquery-1.10.2.min.js"></script>
    <script src="resources/assets/js/jquery-migrate-1.2.1.js"></script>
    <script src="resources/assets/js/bootstrap.min.js"></script>
    <script src="http://maps.google.com/maps/api/js?sensor=false&amp;language=en"></script>
    <script src="resources/assets/js/gmap3.min.js"></script>
    <script src="resources/assets/js/bootstrap-hover-dropdown.min.js"></script>
    <script src="resources/assets/js/owl.carousel.min.js"></script>
    <script src="resources/assets/js/css_browser_selector.min.js"></script>
    <script src="resources/assets/js/echo.min.js"></script>
    <script src="resources/assets/js/jquery.easing-1.3.min.js"></script>
    <script src="resources/assets/js/bootstrap-slider.min.js"></script>
    <script src="resources/assets/js/jquery.raty.min.js"></script>
    <script src="resources/assets/js/jquery.prettyPhoto.min.js"></script>
    <script src="resources/assets/js/jquery.customSelect.min.js"></script>
    <script src="resources/assets/js/wow.min.js"></script>
    <script src="resources/assets/js/scripts.js"></script>

    <!-- For demo purposes â can be removed on production -->
    
    <!--<script src="resources/assets/switchstylesheet/switchstylesheet.js"></script>-->
    
    <script>
        $(document).ready(function(){ 
            $(".changecolor").switchstylesheet( { seperator:"color"} );
            $('.show-theme-options').click(function(){
                $(this).parent().toggleClass('open');
                return false;
            });
        });

        $(window).bind("load", function() {
           $('.show-theme-options').delay(2000).trigger('click');
        });
    </script>
    <!-- For demo purposes â can be removed on production : End -->

    <script src="http://w.sharethis.com/button/buttons.js"></script>

</body>
</html>