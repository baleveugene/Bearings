<%@ page language="java" contentType="text/html;charset=utf-8"
         pageEncoding="utf-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="cs" lang="cs">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name='robots' content='all, follow'/>
    <meta name="description" content=""/>
    <meta name="keywords" content=""/>
    <title>Admin. Bearings catalog</title>
    <link href="../resources/public/css/default.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="../resources/public/css/gray.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- color skin: blue / red / green / dark -->
    <link href="../resources/public/css/datePicker.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="../resources/public/css/wysiwyg.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="../resources/public/css/fancybox-1.3.1.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="../resources/public/css/visualize.css" rel="stylesheet" type="text/css" media="screen"/>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="../resources/assets/css/bootstrap.min.css"></link>
    <!-- Icons/Glyphs -->
    <link rel="stylesheet" href="../resources/assets/css/font-awesome.min.css"></link>

    <script type="text/javascript" src="../resources/public/js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="../resources/public/js/jquery.dimensions.min.js"></script>

    <!-- // Tabs // -->
    <script type="text/javascript" src="../resources/public/js/ui.core.js"></script>
    <script type="text/javascript" src="../resources/public/js/jquery.ui.tabs.min.js"></script>

    <!-- // Table drag and drop rows // -->
    <script type="text/javascript" src="../resources/public/js/tablednd.js"></script>

    <!-- // Date Picker // -->
    <script type="text/javascript" src="../resources/public/js/date.js"></script>
    <!--[if IE]><script type="text/javascript" src="public/js/jquery.bgiframe.js"></script><[endif]-->
    <script type="text/javascript" src="../resources/public/js/jquery.datePicker.js"></script>

    <!-- // Wysiwyg // -->
    <script type="text/javascript" src="../resources/public/js/jquery.wysiwyg.js"></script>

    <!-- // Graphs // -->
    <script type="text/javascript" src="../resources/public/js/excanvas.js"></script>
    <script type="text/javascript" src="../resources/public/js/jquery.visualize.js"></script>

    <!-- // File upload // -->
    <script type="text/javascript" src="../resources/public/js/jquery.filestyle.js"></script>

    <script type="text/javascript" src="../resources/public/js/init.js"></script>

</head>
<body>
<div id="main">
<%@include file="/WEB-INF/pages/in_admin/in_header.jsp" %>

<!-- #content -->
<div id="content">

    
    
<!-- breadcrumbs -->
      <div class="breadcrumbs">
            <ul>
                <li class="home">Admin</li>
                <li class="home">&nbsp; > &nbsp;</li>
                <li class="home"><a href="#">Bearings for manufacturer</a></li>
                <li class="home">&nbsp; > &nbsp;</li>
                <li class="home"><a href="#">Bearings</a></li>
            </ul>
        </div>
<!--<div class="breadcrumbs">

    <ul>
        <li class="home"><a href="/admin/hmc">HMC</a></li>
        <li class="home">&nbsp;|&nbsp;</li>
        <li class="home"><a href="/admin/lathe" style="font-weight: bold; color: #008B00">Lathe</a></li>
        <li class="home">&nbsp;|&nbsp;</li>
        <li class="home"><a href="/admin/gallery">Gallery</a></li>
        <li class="home">&nbsp;|&nbsp;</li>
        <li class="home"><a href="/admin/orders">Orders</a></li>
        <li class="home">&nbsp;|&nbsp;</li>
        <li class="home"><a href="/admin/users">Users</a></li>
    </ul>
</div>-->
<!-- /breadcrumbs -->





<div id="top"></div>
<!-- box -->
<div class="tabs box">
<ul class="bookmarks">
    <li><a href="#show_lathes">bearings for manufacturer</a></li>
    <li><a href="#upload">Upload bearings from file</a></li>
    <li><a href="#filters">Delete all bearings for Manufacturer</a></li>
</ul>
<div class="box-content">
    
<div id="show_lathes">

    <table class="tab tab-drag">
            <tr class="top nodrop nodrag">
              <th class="dragHandle">&nbsp;</th>
              <th class="checkbox"><input type="checkbox" name="" value="" class="check-all" /></th>
         
              <th>Model</th>                           
              <th>Producer</th>           
              <th>Country</th>
              <th>dxDxB</th>
<!--              <th>Photo1</th>
              <th>Photo2</th>
              <th>Photo3</th>-->
      
              <th class="action">Action</th>
            </tr>
              
              <c:forEach items="${listBearingsIndustrial}" var="bearings" >
            <tr>
              <td class="dragHandle">&nbsp;</td>
              <td class="checkbox"><input type="checkbox" name="" value="" /></td>
            
              <td><a href="/bearings-${bearings.url}">${bearings.model}</a></td>            
              <td>${bearings.manufacturerEn}</td>                             
              <td>${bearings.countryEn} </td>
              <td>${bearings.innerDiameter}x${bearings.outerDiameter}x${bearings.width} </td>
        
              <td class="action">
                <a href="bearings_for_manufacturer/${bearings.manufacturerEn}/${bearings.url}/delete" class="ico ico-delete">Delete</a>
                <a href="" class="ico ico-edit">Edit</a>
              </td>
            </tr>
              </c:forEach>
            

          </table>
    
</div>

    
    
<div id="upload">
    <form:form class="formBox" method="post"  action="bearings/add"
               enctype="multipart/form-data">

        <fieldset>
            <div class="clearfix file">
                <div class="lab"><label for="textFile">Upload file with bearings</label></div>
                <div class="con">
                    <input type="file" accept=".xls,.xlsx" name="textFile" class="upload-file"
                           id="textFile" multiple=required/>
                </div>
            </div>
            - N files<br>
            - .xlsx or .xls format<br>
            - <a href="../resources/example.xlsx" target="_blank">example</a> (download)
            <br><br>

            <div class="btn-submit">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                <input type="submit" value="Add / update" class="button"/>
            </div>
        </fieldset>

    </form:form>
</div>

<div id="filters">
    <form:form class="formBox" method="GET" action="bearings_for_manufacturer/deleteall">

        <fieldset>
            <!--Renewing filters means forming new filter parameters according to existing DB with Machines.-->
            <h3 style="color: red; margin-top:10px">It will have deleted all Bearings for manufacturers.</h3>
            <!--As a result, you would see <u>relevant</u> filter parameters.<br><br>-->

            <div class="btn-submit">
                <input type="submit" value="Delete all Bearings for Manufacturer" class="button"/>
            </div>
        </fieldset>

    </form:form>
</div>
       <a href="/admin/bearings/renewFiltersBearingsIndustrial"> renew Filters Bearings </a>   
</div>
</div>
</div>
<!-- /#content -->
 <%@include file="/WEB-INF/pages/in_admin/in_sidebar_bearings.jsp" %>
<%@include file="/WEB-INF/pages/in_admin/in_footer.jsp" %>

</div>
<!-- /#main -->

<script type="text/javascript">
    var currentPage = 1;
    var itemsPerPage = '${itemsPerPage}';
    var itemsNum = '${itemsNum}';

    $(document).ready(function () {
        $("#textFile").change(function () {
            changeNames($(this));
        });
        toggleItems(currentPage);
        toggleCurrentClassPage(currentPage);
    });
</script>

</body>
</html>