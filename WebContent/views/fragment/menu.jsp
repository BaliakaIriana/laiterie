<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="top1 navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
	<div class="navbar-header">
	    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	    </button>
	    <a class="navbar-brand" href=<c:url value="/" />>Modern</a>
	</div>
            <!-- /.navbar-header -->
            
	<form class="navbar-form navbar-right">
		<input type="text" class="form-control" value="Search..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search...';}">
	</form>
	<div class="navbar-default sidebar" role="navigation">
	    <div class="sidebar-nav navbar-collapse">
	        <ul class="nav" id="side-menu">
	            <li>
	                <a href=<c:url value="/" />><i class="fa fa-dashboard fa-fw nav_icon"></i>Dashboard</a>
	            </li>
	            <li>
	                <a href="#"><i class="fa fa-laptop nav_icon"></i>Layouts<span class="fa arrow"></span></a>
	                <ul class="nav nav-second-level">
	                    <li>
	                        <a href="grids.html">Grid System</a>
	                    </li>
	                </ul>
	                <!-- /.nav-second-level -->
	            </li>
	            <li>
	                <a href="#"><i class="fa fa-laptop nav_icon"></i>Comptes utilisateurs<span class="fa arrow"></span></a>
	                <ul class="nav nav-second-level">
	                    <li>
	                        <a href=<c:url value="/inscriptions" />>Inscriptions</a>
	                    </li>
	                </ul>
	                <!-- /.nav-second-level -->
	            </li>
	            <li>
	                <a href=<c:url value="/disconnect"/>><i class="fa fa-dashboard fa-fw nav_icon"></i>Se déconnecter</a>
	            </li>
	            
	        </ul>
	    </div>
	    <!-- /.sidebar-collapse -->
	</div>
            <!-- /.navbar-static-side -->
</nav>