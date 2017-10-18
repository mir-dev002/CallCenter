<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html class="destinos">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
	<title><tiles:getAsString name="title" /></title>
<%-- 	<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link> --%>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<link href="<c:url value='/static/css/style.css' />" rel="stylesheet"></link>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://npmcdn.com/tether@1.2.4/dist/js/tether.min.js"></script>
  	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"></script>
  	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.6.0/slick.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.4.2/js/swiper.min.js"></script>
	<script src="<c:url value='/static/js/main.js' />"></script>
</head>
 
<body class="content-home">

		<tiles:insertAttribute name="menuToggle" />
		
		<div class="container-main">
			<div>
				<tiles:insertAttribute name="header" />
				<tiles:insertAttribute name="body" />				
				<tiles:insertAttribute name="footer" />
				
			</div>	
		</div>
		<tiles:insertAttribute name="footer" />
		<tiles:insertAttribute name="modalBusqueda" />
		<tiles:insertAttribute name="modalPuntos" />
</body>
</html>