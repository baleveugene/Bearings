<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="cs" lang="cs">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name='robots' content='all, follow' />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>Great admin</title>
<link
	href="${pageContext.request.contextPath}/resources/public/css/default.css"
	rel="stylesheet" type="text/css" media="screen" />
<link
	href="${pageContext.request.contextPath}/resources/public/css/blue.css"
	rel="stylesheet" type="text/css" media="screen" />
<!-- color skin: blue / red / green / dark -->
<link
	href="${pageContext.request.contextPath}/resources/public/css/datePicker.css"
	rel="stylesheet" type="text/css" media="screen" />
<link
	href="${pageContext.request.contextPath}/resources/public/css/wysiwyg.css"
	rel="stylesheet" type="text/css" media="screen" />
<link
	href="${pageContext.request.contextPath}/resources/public/css/fancybox-1.3.1.css"
	rel="stylesheet" type="text/css" media="screen" />
<link
	href="${pageContext.request.contextPath}/resources/public/css/visualize.css"
	rel="stylesheet" type="text/css" media="screen" />

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/jquery.dimensions.min.js"></script>

<!-- // Tabs // -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/ui.core.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/jquery.ui.tabs.min.js"></script>

<!-- // Table drag and drop rows // -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/tablednd.js"></script>

<!-- // Date Picker // -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/date.js"></script>
<!--[if IE]><script type="text/javascript" src="public/js/jquery.bgiframe.js"></script><![endif]-->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/jquery.datePicker.js"></script>

<!-- // Wysiwyg // -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/jquery.wysiwyg.js"></script>

<!-- // Graphs // -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/excanvas.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/jquery.visualize.js"></script>

<!-- // Fancybox // -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/jquery.fancybox-1.3.1.js"></script>

<!-- // File upload // -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/jquery.filestyle.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/public/js/init.js"></script>
</head>
<body>
	<div id="main">
		<!-- #header -->
		<div id="header">
			<!-- #logo -->
			<div id="logo">
				<a href="home.html" title="Go to Homepage"><span>Great
						Admin</span></a>
			</div>
			<!-- /#logo -->
			<!-- #user -->
			<div id="user">
				<h2><sec:authentication property="principal.username" /><span>(${currentUser.role})</span>
				</h2>
				<a href="${pageContext.request.contextPath}/j_spring_security_logout">logout</a>
			</div>
			<!-- /#user -->
		</div>
		<!-- /header -->
		<!-- #content -->
		<div id="content">

			<!-- breadcrumbs -->
			<div class="breadcrumbs">
				<ul>
					<li class="home"><a href="">Homepage</a></li>
					<li>Admin Page</li>
				</ul>
			</div>
			<!-- /breadcrumbs -->

			
                        
                        
                        
                <!-- box -->
        <div id="tabs" class="box">
            <ul class="bookmarks">
              <li><a href="#tabs-1">Manufacturer</a></li>
              <li><a href="#tabs-2">Загрузка Manufacturer</a></li>
              <li><a href="#tabs-3">Tab three ??</a></li>
            </ul>
          <div class="box-content">    
          
            <div id="tabs-1">  

                                 <table class="tab tab-drag">
						<tr class="top nodrop nodrag">
							<td class="dragHandle">&nbsp;</td>
							<!--<th>&nbsp;</th>-->
							<th>id</th>
							<th>Section</th>
							<th>Data</th>
							<th>Topic</th>
							<!--<th>Url</th>-->	
                                                        
							<!--<th>Цена</th>-->
							<th class="action">Action</th>
						</tr>
						<c:forEach items="${listVideo}" var="video">
							<tr>
								<td class="dragHandle">&nbsp;</td>
                                                                <!--<td><img src="${pageContext.request.contextPath}/resources/assets/images/products/${mc.photo1}" alt="${mc.manufacturer} ${mc.model}" width="75"></img></td>-->
                                                                <!--<td><img src="resources/assets/images/products/${mc.photo1}" alt="${mc.manufacturer} ${mc.model}" width="75"></img></td>-->
								<td>${video.id}</td>
								<td>${video.section}</td>
								
								<td>${video.data}</td>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
								<td>${video.headline}</td>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
								<!--<td>${video.link_embed}</td>-->                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	

								<td class="action"><a
									href="deleteMC.htm?id=${mc.id}"
									class="ico ico-delete">Delete</a> <a
									href="editAccumulator.htm?${mc.id}"
									class="ico ico-edit">Edit</a></td>
							</tr>
						</c:forEach>
					</table>               
                
            </div>

              
              
            <div id="tabs-2">
                
                <h2>Загрузить Manufacturer из Exel</h2>
					<form class="formBox" method="post" action="${pageContext.request.contextPath}/admin/manufacturer/add"
						enctype="multipart/form-data">
						<fieldset>

							<div class="form">
								<div class="col1">
									<div class="clearfix file">
										<div class="lab">
											<label for="inputFile">Файл с данными:</label>
										</div>
										<div class="con">
											<input type="file" class="upload-file" id="inputFile"
												name="file" multiple="true" />
										</div>
									</div>
								</div>
							</div>
							<div class="tab-action">
								<input type="submit" value="Загрузить" class="button"
									id="upload" />
							</div>
						</fieldset>
					</form>
                
                ${resultVideo}
            </div>
            
            <div id="tabs-3">
              <div class="cols cols4">
                <div class="col1">
                  <h3>List disc</h3>
                  <ul class="list list-disc">
                    <li>classic list item</li>
                    <li>classic list item</li>
                    <li>classic list item</li>
                  </ul>
                </div>
                <div class="col2">
                  <h3>List square</h3>
                  <ul class="list list-square">
                    <li>classic list item</li>
                    <li>classic list item</li>
                    <li>classic list item</li>
                  </ul>
                </div>
                <div class="col3">
                  <h3>List dash</h3>
                  <ul class="list list-dash">
                    <li>classic list item</li>
                    <li>classic list item</li>
                    <li>classic list item</li>
                  </ul>
                </div>
                <div class="col4">
                  <h3>List number</h3>
                  <ol class="list list-number">
                    <li>classic list item</li>
                    <li>classic list item</li>
                    <li>classic list item</li>
                  </ol>
                </div>
              </div>
            </div>
        
          </div><!-- /box-content -->  
        </div>
        <!-- /box -->           
                        
                        
                        
                        
                        
                        
		</div>
		<!-- /#content -->
		<!-- #sidebar -->
		<div id="sidebar">

			<!-- mainmenu -->
			<ul id="floatMenu" class="mainmenu">
				<li><a href="vmc" title="vertical-machining-centres"
					class="link">vertical-machining-centres</a></li>

			</ul>
			<!-- /.mainmenu -->

		</div>
		<!-- /#sidebar -->
		<!-- #footer -->
		<div id="footer">
			<p>
				© 2010 Great Admin | <a href="index.htm">Top</a>
			</p>
		</div>
		<!-- /#footer -->

	</div>
	<!-- /#main -->
</body>
</html>