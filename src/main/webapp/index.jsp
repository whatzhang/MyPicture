<%@page import="com.sust.entity.PicUsers"%>
<%@ page language="java" import="java.util.*,com.sust.*,java.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String login = (String) session.getAttribute("login");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>index</title>

<meta name="keywords"
	content="concept, responsive bootstrap, green, white, free html5 template, templatemo" />
<meta name="description"
	content="Concept is free responsive template using bootstrap framework. Gallery is integrated with responsive lightbox." />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,700italic,400,600,700,800'
	rel='stylesheet' type='text/css'>

<!-- CSS Bootstrap & Custom -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/templatemo_misc.css">

<link rel="stylesheet" href="css/templatemo_style.css">

<link rel="shortcut icon" href="images/ico/favicon.ico">

<script src="js/jquery-1.10.2.min.js"></script>
<script src="js/jquery-migrate-1.2.1.min.js"></script>
<script src="js/modernizr.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/tabs.js"></script>
<script src="js/jquery.lightbox.js"></script>
<script src="js/templatemo_custom.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>

</head>
<body>


	<div class="site-header">
		<div class="main-navigation">
			<div class="container">
				<label
					style="position:absolute;left: 2em;font-size: 1.3em;color: #fff; top: 1.2em;"
					onclick="exit();">${login}</label>
				<div class="row">
					<div class="col-md-12 main_menu">
						<ul>
							<li><a class="show-1 templatemo_home" href="#">照片墙</a></li>
							<li><a class="show-2 templatemo_page2" href="#">视屏</a></li>
							<li><a class="show-3 templatemo_page3" href="#">留言</a></li>
							<li><a class="show-4 templatemo_page4" href="#">我的</a></li>
							<li><a class="show-5 templatemo_page5" href="#">上传</a></li>
						</ul>
					</div>
				</div>
			</div>
			<a class="navigation-bg" href="#" title="" target="_blank"><img
				src="images/header.png" alt="" /></a>
		</div>
	</div>

	<div id="menu-container">
		<div class="content homepage" id="menu-1">
			<div class="container-fluid">
				<div class="row" style=" position: relative;">
					<c:forEach items="${requestScope.allPic}" var="pic">
						<div class="col-md-2 col-sm-6 ">
							<div class="gallery-item" style="margin-bottom: 1px;">
								<img src="images/pic/${pic.piStr1}" alt="image 1">
								<div class="overlay">
									<a href="images/pic/${pic.piStr1}" data-rel="lightbox"
										class="fa fa-expand"></a>
								</div>
							</div>
							<div class="content-gallery" style="margin-top: 1px; ">
								<h3 style="width: auto; float: left;">${pic.piTitle}</h3>
								<a href="#" style="float: right;">
									<h3 style="width: auto; ">赞&nbsp; 6${pic.piStr2}</h3>
								</a> <a href="#" style="float: right;">
									<h3 style="width: auto;margin-right: 1em; ">下载</h3>
								</a>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>

		<div class="content products" id="menu-2">
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-sm-6">
						<div class="product-item">
							<img src="images/products/product1.jpg" alt="product 1"> <a
								href="#" class="product-title">Vestibulum ante ipsum primis</a>
							<p>Nam pharetra, est non convallis congue, sem sem elementum
								nisl, eget vulputate nisl erat.</p>
						</div>
						<!-- /.product-item -->
					</div>
					<!-- /.col-md-4 -->
					<div class="col-md-4 col-sm-6">
						<div class="product-item">
							<img src="images/products/product2.jpg" alt="product 2"> <a
								href="#" class="product-title">Nunc pulvinar leo nec</a>
							<p>Morbi nec mauris quis massa luctus consequat sit amet
								luctus metus. Etiam sollicitudin leo.</p>
						</div>
						<!-- /.product-item -->
					</div>
					<!-- /.col-md-4 -->

					<div class="col-md-4 col-sm-6">
						<div class="product-item">
							<img src="images/products/product3.jpg" alt="product 3"> <a
								href="#" class="product-title">Curabitur mollis dignissim</a>
							<p>Cras convallis erat vitae odio. Pellentesque rutrum nisl
								dui, dignissim accumsan nisl.</p>
						</div>
						<!-- /.product-item -->
					</div>
					<!-- /.col-md-4 -->
					<div class="col-md-4 col-sm-6">
						<div class="product-item">
							<img src="images/products/product4.jpg" alt="product 4"> <a
								href="http://sc.chinaz.com/" class="product-title">Morbi
								venenatis nunc</a>
							<p>Nulla vel est in sapien dictum vestibulum eu ac enim.
								Proin pharetra mi eget sem bibendum.</p>
						</div>
						<!-- /.product-item -->
					</div>
					<!-- /.col-md-4 -->

					<div class="col-md-4 col-sm-6">
						<div class="product-item">
							<img src="images/products/product5.jpg" alt="product 5"> <a
								href="#" class="product-title">Phasellus id elementum</a>
							<p>Etiam sed felis id eros imperdiet tempus. Mauris sit amet
								metus risus. Vestibulum mi velit.</p>
						</div>
						<!-- /.product-item -->
					</div>
					<!-- /.col-md-4 -->
					<div class="col-md-4 col-sm-6">
						<div class="product-item">
							<img src="images/products/product6.jpg" alt="product 6"> <a
								href="http://sc.chinaz.com/page/6" class="product-title">Donec
								ullamcorper</a>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
								Nostrum, animi quia voluptatem.</p>
						</div>
						<!-- /.product-item -->
					</div>
					<!-- /.col-md-4 -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.slide-item -->
		</div>
		<!-- /.products -->

		<div class="content services" id="menu-3">
			<div class="container">
				<div class="row">
					<div class="col-md-9 col-sm-10">
						<div class="inner-content">
							<div class="toggle-content" id="tab1">
								<h2 class="page-title">Our Services</h2>
								<p>
									Proin accumsan, velit at pretium eleifend, lectus neque
									volutpat tortor, at placerat arcu odio vitae nisl. Curabitur
									dui ipsum, varius lobortis eros eget, faucibus faucibus nisl. <a
										href="#">Donec tincidunt</a> est a scelerisque suscipit.
									Vivamus sit amet purus at ante mollis mattis a at ante.
									Praesent purus metus, aliquet non porta sit amet, ultrices sit
									amet purus. Phasellus vitae orci diam. Cras sit amet gravida
									neque, auctor lobortis nibh.
								</p>
								<ul>
									<li>Lorem ipsum dolor sit amet, consectetur adipisicing
										elit.</li>
									<li>Aliquid, beatae, ea delectus asperiores nostrum
										tempora nihil facere.</li>
									<li>Consequatur nesciunt dolorem deserunt necessitatibus.</li>
									<li>Iste laboriosam qui pariatur cum sint modi.</li>
								</ul>
								<p>
									Concept is <a href="http://sc.chinaz.com">free responsive
										template</a> based on <a href="http://sc.chinaz.com">Bootstrap</a>
									framework. Gallery page is integrated with <a
										href="http://sc.chinaz.com">responsive lightbox</a>. Credit
									goes to <a href="http://sc.chinaz.com">Unsplash</a> for all
									images featured in this template. This template can be viewed
									in mobile phones or tablets. Feel free to use this layout for
									your websites.
								</p>
							</div>
							<!-- /.toggle-content -->
							<div class="toggle-content" id="tab2">
								<h2 class="page-title">Our Support</h2>
								<p>
									Quisque vestibulum sed mauris vel aliquet. Etiam in purus a
									massa mattis bibendum. Donec dolor odio, porttitor molestie
									euismod dictum, ultrices vel ipsum. Phasellus id sollicitudin
									erat. Nullam imperdiet sed metus iaculis dapibus. <a href="#">Duis
										pharetra</a> feugiat metus in sollicitudin.
								</p>
								<p>
									Proin cursus dapibus ipsum, vel congue tellus malesuada
									aliquam. Nullam id arcu urna. Donec at velit vel velit
									ultricies accumsan. Integer commodo dui libero, vitae rhoncus
									ante porttitor ac. Pellentesque sit amet lectus eros. <a
										href="h#">Aliquam placerat</a> varius quam sed aliquam.
									Curabitur turpis diam, iaculis sit amet auctor ut, cursus quis
									velit. Mauris non risus vitae purus sodales rhoncus.
								</p>
								<p>Sed feugiat a turpis vitae porttitor. Proin placerat
									vitae enim ac scelerisque. Cras ac lectus hendrerit,
									pellentesque metus ut, molestie diam. Nam vitae bibendum velit,
									eu fermentum dui. In sodales dolor interdum egestas consequat.
									Integer id dolor nulla. Donec nec ante mauris.</p>
							</div>
							<!-- /.toggle-content -->
							<div class="toggle-content" id="tab3">
								<h2 class="page-title">Testimonials</h2>
								<p>Duis interdum eros elit, ut semper massa imperdiet vitae.
									Pellentesque habitant morbi tristique senectus et netus et
									malesuada fames ac turpis egestas. Ut pretium vehicula est
									tristique volutpat. Duis ac felis quis augue dapibus hendrerit.
									Vivamus pretium, felis sed dignissim commodo, quam turpis
									commodo ipsum, at varius nisi risus ut dolor. Mauris quam
									purus, molestie ac urna eu, sagittis sagittis dui.</p>
								<p>
									<a href="h#">Integer risus mauris</a>, fermentum ac risus eu,
									vehicula tempus augue. Morbi egestas nulla turpis, non
									sollicitudin justo interdum ac. Pellentesque elementum, urna
									bibendum semper ullamcorper, lorem justo gravida arcu, ut
									pellentesque nulla orci in neque. Curabitur in commodo sem,
									rhoncus lobortis mi. Maecenas sit amet arcu sapien.
								</p>
								<p>Phasellus molestie molestie metus quis elementum. Cras
									dictum rutrum arcu id interdum. Vivamus suscipit suscipit
									mauris eget feugiat. Sed sagittis enim id tempus vulputate.
									Aliquam erat volutpat. In quis neque sodales, pulvinar turpis
									sed, lacinia sem.</p>
							</div>
							<!-- /.toggle-content -->
						</div>
						<!-- /.inner-content -->
					</div>
					<!-- /.col-md-9 -->
					<div class="col-md-3 col-sm-2">
						<div id="icons">
							<ul class="tabs">
								<li><a href="#tab1" class="icon-item"> <i
										class="fa fa-cogs"></i> <span>Services</span>
								</a> <!-- /.icon-item --></li>
								<li><a href="#tab2" class="icon-item"> <i
										class="fa fa-leaf"></i> <span>Our Support</span>
								</a> <!-- /.icon-item --></li>
								<li><a href="#tab3" class="icon-item"> <i
										class="fa fa-users"></i> <span>Testimonials</span>
								</a> <!-- /.icon-item --></li>
							</ul>
						</div>
						<!-- /.icons -->
					</div>
					<!-- /.col-md-3 -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.container -->
		</div>

		<div class="content homepage" id="menu-4">
			<div class="container-fluid">
				<div class="row" style=" position: relative;">
					<c:forEach items="${requestScope.userPic}" var="picc">
						<div class="col-md-2 col-sm-6 ">
							<div class="gallery-item" style="margin-bottom: 1px;">
								<img src="images/pic/${picc.piStr1}" alt="image 1">
								<div class="overlay">
									<a href="images/pic/${picc.piStr1}" data-rel="lightbox"
										class="fa fa-expand"></a>
								</div>
							</div>
							<div class="content-gallery" style="margin-top: 1px; ">
								<h3 style="width: auto; float: left;">${picc.piTitle}</h3>
								<a href="#" style="float: right;">
									<h3 style="width: auto; ">赞&nbsp; 6${picc.piStr2}</h3>
								</a> <a href="#" style="float: right;">
									<h3 style="width: auto;margin-right: 1em; ">下载</h3>
								</a>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>

		<div class="content contact" id="menu-5">
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						<div class="widget-content">
							<div class="page-title">上传</div>

						</div>
					</div>
					<div class="col-md-6">
						<div class="widget-content">
							<div class="page-title">照片上传</div>

							<div id="templatemo_map">
								<form class="form-horizontal" id="upFile" name="upFile"
									enctype="multipart/form-data">
									<div class="form-group mb-n "
										style="text-align: left; margin-left: 0.08em;">
										<div style="float: left;">
											<div class="btn btn-default btn-file" title="上传电子文件">
												<input type="file" name="upfile" id="upfile" size="1">
											</div>
											<p class="help-block">(格式为：jpg/png/jpeg/gif)Max.20MB</p>
										</div>
										<div style="text-align: left; margin-left: 0.08em;">
											<button style="margin-left: 2em;" type="button"
												class="btn btn-success" onclick="checkFile();">上&nbsp;传</button>
										</div>
									</div>
								</form>
							</div>

							<div class="contact-information">
								<div class="row">
									<div class="col-md-6 col-sm-6">
										<p>上传文件</p>
									</div>
									<!-- /.col-md-6 -->
									<div class="col-md-6 col-sm-6 text-right">
										<ul>
											<li>上传文件</li>
											<li>上传文件</li>
										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div id="templatemo_footer" style="height: 4em; width: 100%;">
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center">
					<p>
						Copyright &copy; 2014.Company name All rights reserved.<a
							target="_blank" href="#">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
					</p>
				</div>
				<!-- /.col-md-12 -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container -->
	</div>
	<!-- /.templatemo_footer -->

	<div class="modal fade" id="login">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">输入你的姓名</div>
				<form class="form-horizontal"
					action="${pageContext.request.contextPath}/login/login"
					method="post">
					<div class="modal-body">
						<div class="form-group" style="margin: 0 auto;">
							<label for="inputEmail" class="col-sm-2 control-label">姓名</label>
							<div class="col-sm-10">
								<input id="inputEmail" type="text" name="user_name" id="user_name"
									class="form-control list-inline" placeholder="" />
							</div>
						</div>
						<div class="modal-footer">
							<button class="btn btn-success" type="submit"
								onclick="return check();">提交</button>
							<button class="btn btn-warning" type="button" onclick="reg();">注册</button>
							<button class="btn btn-danger" data-dismiss="modal"
								onclick="miss();">取消</button>
						</div>
				</form>
			</div>
		</div>
	</div>

	<!-- Scripts -->
	<script>
	$(document).ready(function() {
        <%if (login == "" || login == null) {%>
		$("#login").modal("show");
        <%}%>
	})
	function check(){
	    var name = document.getElementsById("user_name").value;
	    alert(name);
	    if(name == "" || name == null){
	      location.href="${pageContext.request.contextPath}/index.jsp";
	      return false;
	    }else{
	      return true;
	    }
	}
	function miss(){
	   $("#login").modal("show");
	}
	function exit(){
	   if(confirm("确定退出?")){
		   $.ajax({
				type : "POST",
				url : "${pageContext.request.contextPath}/login/layout",
				cache : false,
				async : true,
				success : function() {
					alert("注销成功！");
				    location.href="${pageContext.request.contextPath}/index.jsp";
				}, 
				error : function() {
					alert("error!");
				}
			});
	   }
	}
	function reg(){
		$.ajax({
			type : "POST",
			url : "${pageContext.request.contextPath}/login/reg",
			data : {
				user_name : $("#user_name").val()
			},
			dataType : 'json',
			cache : false,
			async : true,
			success : function(data) {
				 alert(data.string1);
				 location.href="${pageContext.request.contextPath}/index.jsp";
			}, 
			error : function(data) {
				alert("error!");
			}
		});
	}
	 function upFile(){
    	$("#upFile").ajaxSubmit({
            type : 'POST',
            url : "${pageContext.request.contextPath}/picture/uploadFileAjax",
            contentType : "application/x-www-form-urlencoded; charset=utf-8",
            data : {
            },
            success: function(data) {
	            alert(data.string1);
            },
            error: function (data){
                alert("出错");
            }  
         });
    }
    function checkFile(){
        var allowtype =  ["jpg","png","jpeg","gif"];
		var filename = $("#upfile").val();  
		if ($.inArray(filename.substring(filename.lastIndexOf(".")+1,filename.length).toLowerCase(),allowtype) == -1){
		    alert("请输入正确的格式(doc,docx,pdf,rar,zip)");
		}else{
			upFile();
		}
		
	}
</script>
</body>
</html>