<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<h2>${currentUser.login}<span>(${currentUser.role})</span>
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

			<div class="box">
				<div class="headlines">
					<h2>
						<span>VMC or HMC</span>
					</h2>
					<a href="#help" class="help"></a>
				</div>
				<div class="box-content">
					<!-- table -->
					<table class="tab tab-drag">
						<tr class="top nodrop nodrag">
							<td class="dragHandle">&nbsp;</td>
							<th>&nbsp;</th>
							<th>id</th>
							<th>datatime</th>
							<th>Model</th>
							<th>request</th>	
							<th>request</th>	
							<th>request</th>	
                                                        
							<th>status</th>
							<th class="action">Action</th>
						</tr>
						<c:forEach items="${listOrder}" var="order">
							<tr>
								<td class="dragHandle">&nbsp;</td>
                                                                <!--<td><img src="${pageContext.request.contextPath}/resources/assets/images/products/${mc.photo1}" alt="${mc.manufacturer} ${mc.model}" width="75"></img></td>-->
                                                                <!--<td><img src="resources/assets/images/products/${mc.photo1}" alt="${mc.manufacturer} ${mc.model}" width="75"></img></td>-->
								<td>${order.id}</td>
								<td>${order.datatime}</td>
								<td>${order.firstname} ${order.lastname}</td>
								<td>${order.company}</td>
								
								<td>${order.address} ${order.city}</td>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
								<td>${order.request}</td>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
								<td>${order.status}</td>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	

								<td class="action"><a
									href="${pageContext.request.contextPath}/admin/req-${order.id}"
									class="ico ico-delete">ok</a> <a
									href="#"
									class="ico ico-edit">Edit??</a></td>
							</tr>
						</c:forEach>
					</table>
					<!-- /table -->

					<!-- box-action -->
<!--					<div class="tab-action">
						<a href="add.htm" class="btn-default"><span>Добавить
								</span></a>
					</div>-->

					<!-- /box-action -->
				</div>
				<!-- /box-content -->
			</div>
			<!-- /box -->

			

<!--			<div class="box">
				<div class="headlines">
					<h2>
						<span>Загрузка данных</span>
					</h2>
					<a href="#help" class="help"></a>
				</div>
				<div class="box-content">
					
					<h2>Загрузить данные VMC из Exel</h2>
					<form class="formBox" method="post" action="addHmcList.htm"
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
                                        <p>${result}</p>

					<h2>Загрузка цен с файла</h2>
					<form class="formBox" method="post" action="addPrices.htm"
						enctype="multipart/form-data">
						<fieldset>

							<div class="form">
								<div class="col1">
									<div class="clearfix file">
										<div class="lab">
											<label for="inputFile">Файл с ценами:</label>
										</div>
										<div class="con">
											<input type="file" class="upload-file" id="inputFile"
												name="file" />
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

					<h2>Загрузка изображений HMC</h2>
					<form class="formBox" method="post" action="addHmcPhoto.htm"
						enctype="multipart/form-data">
						<fieldset>

							<div class="form">
								<div class="col1">
									<div class="clearfix file">
										<div class="lab">
											<label for="inputFile">Изображения:</label>
										</div>
										<div class="con">
											<input type="file" class="upload-file" name="image"
												id="image" multiple="true" /> <br />
										</div>
									</div>
								</div>
							</div>
							<div class="tab-action">
								<input type="submit" value="Загрузить" class="button"
									id="upload" />
							</div>
							${result}
						</fieldset>
					</form>

				</div>
				 /box-content 
			</div>-->
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