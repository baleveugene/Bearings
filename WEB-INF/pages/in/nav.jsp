
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


    


<nav class="top-bar animate-dropdown">
    <div class="container">
        <div class="col-xs-12 col-sm-6 no-margin">
            <ul>
                <!--<li>${nombersofenters}</li>-->
                
            <c:if test="${nombersofquerys>0}">
                <li>${nombersofquerys}</li>
            </c:if>
             
                <!--<li><a href="index">Home</a></li>-->
                <li><a href="/index"><spring:message code="footer.home" text="Home" /></a></li>

<!--                <li class="dropdown">
                    <a class="dropdown-toggle"  data-toggle="dropdown" href="#change-colors">Change Colors</a>

                    <ul class="dropdown-menu" role="menu" >
                        <li role="presentation"><a role="menuitem" class="changecolor green-text" tabindex="-1" href="#" title="Green color">Green</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor blue-text" tabindex="-1" href="#" title="Blue color">Blue</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor red-text" tabindex="-1" href="#" title="Red color">Red</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor orange-text" tabindex="-1" href="#" title="Orange color">Orange</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor navy-text" tabindex="-1" href="#" title="Navy color">Navy</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor dark-green-text" tabindex="-1" href="#" title="Darkgreen color">Dark Green</a></li>
                    </ul>
                </li>-->
                <!--<li><a href="#">Blog</a></li>-->
                <!--<li><a href="video">Video</a></li>-->
                <!--<li><a href="#">FAQ</a></li>-->
                <!--<li><a href="contact">Contact</a></li>-->
                
            <li><a href="/video"><spring:message code="footer.video" text="Video" /></a></li>
            <li><a href="/wesold"><spring:message code="footer.wesold" text="We sold" /></a></li>
            <!--<li><a href="/site_map"><spring:message code="footer.sitemap" text="Sitemap" /></a></li>-->
            <li><a href="/contact"><spring:message code="footer.contactus" text="Contact Us" /></a></li>
                
<!--                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#pages"><spring:message code="footer.contactus" text="Contact Us" /></a>
                    <ul class="dropdown-menu" role="menu">
                                                <li><a href="contact-USA">USA</a></li>
                                                <li><a href="contact-Turkey">Turkey</a></li>
                                                <li><a href="contact-Russia">Russia</a></li>
                                                <li><a href="contact-Belarus">Belarus</a></li>
                                                <li><a href="contact-Ukraine">Ukraine</a></li>
                                            </ul>
                </li>-->
           
<!--                <a href="contact-USA">USA</a> /
<a href="contact-Russia">Russia</a> /
<a href="contact-Ukraine">Ukraine</a> /
<a href="contact-Belarus">Belarus</a> /-->
            
            </ul>
        </div><!-- /.col -->

        <div class="col-xs-12 col-sm-6 no-margin">
            <ul class="right">
              
                <li class="dropdown">
                  
                    
<!--                          <a class="dropdown-toggle"  data-toggle="dropdown" href="#change-language">???</a>
                    <ul class="dropdown-menu" role="menu" >
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Russia</a></li>-->
     <c:set var="localeCode" value="${pageContext.response.locale}" />
                    
                    <a class="dropdown-toggle"  data-toggle="dropdown" href="/index">
                   
                        <c:choose>
                            <c:when test="${localeCode=='usa'}">
                               USA
                            </c:when>
                            <c:when test="${localeCode=='en'}">
                               GLOBAL
                            </c:when>

 
                            <c:otherwise>
                                ${pageContext.response.locale} 
                            </c:otherwise>
                               
                        </c:choose>
                    </a>

                    <ul class="dropdown-menu" role="menu" >
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="?lang=en">Global | English</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="?lang=usa">USA | English</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="?lang=russia">Russia | Russian  </a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="?lang=ukraine">Ukraine | Ukrainian </a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="?lang=belarus">Belarus | Belarusian </a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="?lang=turkish">Turkish | Tr</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="?lang=france">France | France</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="?lang=china">China | Chinese</a></li>
                    </ul>
                </li>


                
            </ul>
                
                
            
                    
        </div>
        
        
 
        
    </div><!-- /.container -->
    
    
<!-- 


<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-75911811-1', 'auto');
  ga('send', 'pageview');

</script>
-->
    
</nav>
                <!-- /.top-bar -->
                
     