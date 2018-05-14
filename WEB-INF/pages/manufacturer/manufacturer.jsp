<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Meta -->
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <meta name="keywords" content="Video machines CNC">
        <meta name="robots" content="all">

        <title>Video machines CNC</title>

        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href="../resources/assets/css/bootstrap.min.css">
        
        <!-- Customizable CSS -->
        <link rel="stylesheet" href="../resources/assets/css/main.css">
        <link rel="stylesheet" href="../resources/assets/css/green.css">
        <link rel="stylesheet" href="../resources/assets/css/owl.carousel.css">
        <link rel="stylesheet" href="../resources/assets/css/owl.transitions.css">
        <link rel="stylesheet" href="../resources/assets/css/animate.min.css">

        <!-- Demo Purpose Only. Should be removed in production -->
        <link rel="stylesheet" href="../resources/assets/css/config.css">

        <link href="../resources/assets/css/green.css" rel="alternate stylesheet" title="Green color">
        <link href="../resources/assets/css/blue.css" rel="alternate stylesheet" title="Blue color">
        <link href="../resources/assets/css/red.css" rel="alternate stylesheet" title="Red color">
        <link href="../resources/assets/css/orange.css" rel="alternate stylesheet" title="Orange color">
        <link href="../resources/assets/css/navy.css" rel="alternate stylesheet" title="Navy color">
        <link href="../resources/assets/css/dark-green.css" rel="alternate stylesheet" title="Darkgreen color">
        <!-- Demo Purpose Only. Should be removed in production : END -->

        <!-- Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
        
        <!-- Icons/Glyphs -->
        <link rel="stylesheet" href="../resources/assets/css/font-awesome.min.css">
        
        <!-- Favicon -->
        <link rel="shortcut icon" href="../resources/assets/images/favicon.ico">

        <!-- HTML5 elements and media queries Support for IE8 : HTML5 shim and Respond.js -->
        <!--[if lt IE 9]>
            <script src="../resources/assets/js/html5shiv.js"></script>
            <script src="../resources/assets/js/respond.min.js"></script>
        <![endif]-->

        
    </head>
<body>
    
    <div class="wrapper">
        <!-- ============================================================= TOP NAVIGATION ============================================================= -->

<!-- ============================================================= TOP NAVIGATION : END ============================================================= -->       <!-- ============================================================= HEADER ============================================================= -->


         
        
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
<!--                <li class="dropdown le-dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-list"></i> shop by department
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Computer Cases & Accessories</a></li>
                        <li><a href="#">CPUs, Processors</a></li>
                        <li><a href="#">Fans, Heatsinks &amp; Cooling</a></li>
                        <li><a href="#">Graphics, Video Cards</a></li>
                        <li><a href="#">Interface, Add-On Cards</a></li>
                        <li><a href="#">Laptop Replacement Parts</a></li>
                        <li><a href="#">Memory (RAM)</a></li>
                        <li><a href="#">Motherboards</a></li>
                        <li><a href="#">Motherboard &amp; CPU Combos</a></li>
                        <li><a href="#">Motherboard Components</a></li>
                    </ul>
                </li>-->
<%@include file="/WEB-INF/pages/in/dropdown_le_dropdown.jsp" %>

                <li class="breadcrumb-nav-holder"> 
                    <ul>
                        <li class="breadcrumb-item">
                            <a href="/index">Home</a>
                        </li>
                        <li class="breadcrumb-item current gray">
                            <a href="#">Manufacturer - ${manufacturer.brand}</a>
                        </li>
                    </ul>
                </li><!-- /.breadcrumb-nav-holder -->
            </ul>
        </nav>
    </div><!-- /.container -->
</div><!-- /#top-mega-nav -->
<!-- ========================================= BREADCRUMB : END ========================================= --></div>     <!-- ========================================= MAIN ========================================= -->
<main id="blog" class="inner-bottom-xs">
    <div class="container">
        
        <div class="row">
            <div class="col-md-9">
                
                <div class="posts sidemeta">
                    
        <div class="carousel-item">
                  
                        <img alt="${manufacturer.brand}" src="../resources/assets/images/brands/${manufacturer.logo}" />
               
                </div> 
                        <br>
 
        <%--<c:forEach items="${listVideo}" var="video">--%>
    
    <div class="post format-video">
        <div class="date-wrapper">
            <div class="date">
                <!--<span class="month">Jul</span>-->
                <span class="day">${video.data}</span>
            </div>
        </div><!-- /.date-wrapper -->
        <div class="format-wrapper">
            <a href="#"><i class="fa fa-film"></i></a>
        </div><!-- /.format-wrapper -->
        <div class="post-content">
            <div class="post-media">
               <!--<iframe height="467"  src="https://www.youtube.com/embed/5NUA6wN9E5I" frameborder="0" allowfullscreen></iframe>-->
           <p style="position: relative; padding-bottom: 56.25%; padding-top: 25px; height: 0;"><iframe
style="position: absolute; top: 0; left: 0; width: 100%; height: 100%;" width="100%"
src="${manufacturer.video1}" frameborder="0" allowfullscreen></iframe></p>
            </div>
                <div class="post-media">
                   <!--<iframe height="467"  src="https://www.youtube.com/embed/5NUA6wN9E5I" frameborder="0" allowfullscreen></iframe>-->
               <p style="position: relative; padding-bottom: 56.25%; padding-top: 25px; height: 0;"><iframe
    style="position: absolute; top: 0; left: 0; width: 100%; height: 100%;" width="100%"
    src="${manufacturer.video2}" frameborder="0" allowfullscreen></iframe></p>
                </div>
                    <div class="post-media">
                       <!--<iframe height="467"  src="https://www.youtube.com/embed/5NUA6wN9E5I" frameborder="0" allowfullscreen></iframe>-->
                   <p style="position: relative; padding-bottom: 56.25%; padding-top: 25px; height: 0;"><iframe
        style="position: absolute; top: 0; left: 0; width: 100%; height: 100%;" width="100%"
        src="${manufacturer.video3}" frameborder="0" allowfullscreen></iframe></p>
                    </div>
            <h2 class="post-title">${video.headline}</h2>
        </div><!-- /.post-content -->
    </div><!-- /.post -->
 
    <%--</c:forEach>--%>  

  <c:if test="${not empty video}">

      <div class="post format-video">
        <div class="date-wrapper">
            <div class="date">
                <!--<span class="month">Jul</span>-->
                <span class="day">${video.data}</span>
            </div>
        </div><!-- /.date-wrapper -->
        <div class="format-wrapper">
            <a href="#"><i class="fa fa-film"></i></a>
        </div><!-- /.format-wrapper -->
        <div class="post-content">
            <div class="post-media">
                
                <p style="position: relative; padding-bottom: 56.25%; padding-top: 25px; height: 0;"><iframe
                style="position: absolute; top: 0; left: 0; width: 100%; height: 100%;" width="100%"
                src="${video.link_embed}" frameborder="0" allowfullscreen></iframe></p>
            
            </div>
            <h2 class="post-title">${video.headline}</h2>
        </div><!-- /.post-content -->
    </div><!-- /.post -->
    
  </c:if>
    
    
</div><!-- /.posts -->

<hr/>

<ul class="pagination blog-pagination">
    
    
            <c:forEach var="i" begin="1" end="${kol_vo_page_itogo}">
                    <c:choose>
                        <c:when test="${i == page}">
                            <li class="current" ><a href="video?page=${i}&section=${section}"><c:out value="${i}"/></a></li>
                        </c:when>                                                  
                        <c:otherwise>
                            <li><a href="video?page=${i}&section=${section}"><c:out value="${i}"/></a></li>
                        </c:otherwise>
                    </c:choose>
            </c:forEach>   

    
<!--    <li><a href="video?page=1">1</a></li>
    <li><a href="video?page=2">2</a></li>
    <li><a href="video?page=3">3</a></li>-->
    <!--<li><a href="#">Next</a></li>-->
</ul>
<!-- /.pagination -->
            </div><!-- /.col -->

            <div class="col-md-3">
                
                <aside class="sidebar blog-sidebar">
    
<!--    <div class="widget clearfix">
    <div class="body">
        <form role="search" class="search-form" action="videosearch" method="GET" >
            <div class="form-group">
                <label class="sr-only" for="page-search">Type your search here</label>
                <input id="page-search" class="search-input form-control" type="search" name = 'word' placeholder="Search in video...">
            </div>
            <button class="page-search-button">
                <span class="fa fa-search">
                    <span class="sr-only">Search</span>
                </span>
            </button> 
            /.page-search-button
        </form> 
        /.search-form 
    </div>
</div>-->
                    <!-- /.widget -->
<!--    <div class="widget">
    <h4>About Blog</h4>
    <div class="body">
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tincidunt, erat in malesuada aliquam, est erat faucibus purus, eget viverra nulla sem vitae neque. Quisque id sodales libero. </p>
    </div>
</div>-->
<!-- /.widget -->
    <div class="widget">
    <h4>Brands</h4>
    <div class="body">
        <ul class="le-links">
           
                 <c:forEach items="${listManufacturer}" var="manufacturer">
                    
            <li><a href="/manufacturer/${manufacturer.brand}"> ${manufacturer.brand}</a></li>

                </c:forEach>

        </ul><!-- /.le-links -->
    </div>
    
<c:if test="${not empty listLathe}">
  <h4>Lathes </h4>
    <div class="body">
        <div class="tagcloud">
<!--            <a style="font-size: 12pt;" href="#">Beautiful</a> 
            <a style="font-size: 20pt;" href="#">Media Center</a> 
            <a style="font-size: 10pt;" href="#">Quality</a> 
            <a style="font-size: 14pt;" href="#">Website</a> -->
           
           <c:forEach items="${listLathe}" var="lathe">
                    
          - mod. <a style="font-size: 12pt;" href="/manufacturer/${lathe.manufacturer}/lathe/${lathe.url}"> ${lathe.model} (${lathe.manufacturer})</a> <br/>

           </c:forEach>
</div>
        </ul><!-- /.le-links -->
    </div>
 </c:if>
    
</div><!-- /.widget -->


<!--    <div class="widget">
    <div class="simple-banner">
        <a href="#"><img alt="" class="img-responsive" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/banners/banner-simple.jpg" /></a>
    </div>
</div>-->
    <!-- ========================================= RECENT POST ========================================= -->
<!--<div class="widget">
    <h4>Recent Posts</h4>
    <div class="body">
        <ul class="recent-post-list">
            <li class="sidebar-recent-post-item">
                <div class="media">
                    <a href="#" class="thumb-holder pull-left">
                        <img alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/recent-posts/1.jpg" />
                    </a>
                    <div class="media-body">
                        <h5><a href="#">Coffee Time in Office </a></h5>
                        <div class="posted-date">July 12 2014</div>
                    </div>
                </div>
            </li> /.sidebar-recent-post-item 

            <li class="sidebar-recent-post-item">
                <div class="media">
                    <a href="#" class="thumb-holder pull-left">
                        <img alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/recent-posts/2.jpg" />
                    </a>
                    <div class="media-body">
                        <h5><a href="#">Lets Meet The Whole Team of MediaCenter </a></h5>
                        <div class="posted-date">July 10 2014</div>
                    </div>
                </div>
            </li> /.sidebar-recent-post-item 

            <li class="sidebar-recent-post-item">
                <div class="media">
                    <a href="#" class="thumb-holder pull-left">
                        <img alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/recent-posts/3.jpg" />
                    </a>
                    <div class="media-body">
                        <h5><a href="#">The Best Wordpress Support 24/7 </a></h5>
                        <div class="posted-date">July 06 2014</div>
                    </div>
                </div>
            </li> /.sidebar-recent-post-item 

            <li class="sidebar-recent-post-item">
                <div class="media">
                    <a href="#" class="thumb-holder pull-left">
                        <img alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/recent-posts/4.jpg" />
                    </a>
                    <div class="media-body">
                        <h5><a href="#">Gallery Post with Supported Animation</a></h5>
                        <div class="posted-date">July 04 2014</div>
                    </div>
                </div>
            </li> /.sidebar-recent-post-item 

            <li class="sidebar-recent-post-item">
                <div class="media">
                    <a href="#" class="thumb-holder pull-left">
                        <img alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/recent-posts/5.jpg" />
                    </a>
                    <div class="media-body">
                        <h5><a href="#">Sweet memories in our Store </a></h5>
                        <div class="posted-date">July 01 2014</div>
                    </div>
                </div>
            </li> /.sidebar-recent-post-item 

        </ul> /.recent-post-list 
    </div> /.body 
</div> /.widget -->
<!-- ========================================= RECENT POST : END ========================================= -->
<!--    <div class="widget">
    <h4>Popular Tags</h4>
    <div class="body">
        <div class="tagcloud">
            <a style="font-size: 12pt;" href="#">Beautiful</a> 
            <a style="font-size: 20pt;" href="#">Media Center</a> 
            <a style="font-size: 10pt;" href="#">Quality</a> 
            <a style="font-size: 14pt;" href="#">Website</a> 
            <a style="font-size: 16pt;" href="#">Template</a> 
            <a style="font-size: 12pt;" href="#">Professional</a> 
            <a style="font-size: 20pt;" href="#">Design</a> 
            <a style="font-size: 10pt;" href="#">Multipurpose</a> 
            <a style="font-size: 16pt;" href="#">Portfolio</a> 
            <a style="font-size: 10pt;" href="#">Customization</a> 
            <a style="font-size: 19pt;" href="#">Bootstrap</a> 
            <a style="font-size: 9pt;" href="#">Mobile</a> 
            <a style="font-size: 14pt;" href="#">Features</a> 
            <a style="font-size: 9pt;" href="#">Styles</a> 
            <a style="font-size: 13pt;" href="#">Responsive</a> 
            <a style="font-size: 9pt;" href="#">Font Icons</a> 
            <a style="font-size: 22pt;" href="#">Love</a> 
            <a style="font-size: 10pt;" href="#">Digital</a> 
            <a style="font-size: 18pt;" href="#">Awesome</a> 
            <a style="font-size: 12pt;" href="#">Passion</a> 
            <a style="font-size: 13pt;" href="#">Typography</a> 
            <a style="font-size: 13pt;" href="#">Clean</a> 
            <a style="font-size: 9pt;" href="#">Easy to use</a> 
            <a style="font-size: 20pt;" href="#">Buy it</a> 
            <a style="font-size: 12pt;" href="#">Success</a>
        </div> /.tagcloud 
    </div> /.body 
</div> /.widget -->
</aside><!-- /.sidebar .blog-sidebar -->
            </div>
        </div><!-- /.row -->

    </div><!-- /.container -->
</main><!-- /.inner-bottom-xs -->
<!-- ========================================= MAIN : MAIN ========================================= -->        <!-- ============================================================= FOOTER ============================================================= -->

<%@include file="/WEB-INF/pages/in/footer.jsp" %>

<!-- ============================================================= FOOTER : END ============================================================= -->   </div><!-- /.wrapper -->

    <!-- For demo purposes вЂ“ can be removed on production -->
    
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
                <li><a href="blog.html&amp;style=alt1">Header 1</a></li>
                <li><a href="blog.html&amp;style=alt">Header 2</a></li>
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
    <!-- For demo purposes вЂ“ can be removed on production : End -->

    <!-- JavaScripts placed at the end of the document so the pages load faster -->
    <script src="../resources/assets/js/jquery-1.10.2.min.js"></script>
    <script src="../resources/assets/js/jquery-migrate-1.2.1.js"></script>
    <script src="../resources/assets/js/bootstrap.min.js"></script>
    <script src="http://maps.google.com/maps/api/js?sensor=false&amp;language=en"></script>
    <script src="../resources/assets/js/gmap3.min.js"></script>
    <script src="../resources/assets/js/bootstrap-hover-dropdown.min.js"></script>
    <script src="../resources/assets/js/owl.carousel.min.js"></script>
    <script src="../resources/assets/js/css_browser_selector.min.js"></script>
    <script src="../resources/assets/js/echo.min.js"></script>
    <script src="../resources/assets/js/jquery.easing-1.3.min.js"></script>
    <script src="../resources/assets/js/bootstrap-slider.min.js"></script>
    <script src="../resources/assets/js/jquery.raty.min.js"></script>
    <script src="../resources/assets/js/jquery.prettyPhoto.min.js"></script>
    <script src="../resources/assets/js/jquery.customSelect.min.js"></script>
    <script src="../resources/assets/js/wow.min.js"></script>
    <script src="../resources/assets/js/scripts.js"></script>

    <!-- For demo purposes вЂ“ can be removed on production -->
    
    <script src="switchstylesheet/switchstylesheet.js"></script>
    
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
    <!-- For demo purposes вЂ“ can be removed on production : End -->

    <script src="http://w.sharethis.com/button/buttons.js"></script>

</body>
</html>