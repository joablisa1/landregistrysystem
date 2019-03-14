<%--
  Created by IntelliJ IDEA.
  User: LISA
  Date: 10/25/2018
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/views/includes/includes.jsp"%>
<div id="sidebar"  class="nav-collapse ">
    <!-- sidebar menu start-->
    <ul class="sidebar-menu" id="nav-accordion">

        <p class="centered"><a href="profile.html"><img src="${pageContext.request.contextPath}/static/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
        <h5 class="centered">ADMIN</h5>

        <li class="mt">
            <a class="active" href="${pageContext.request.contextPath}/"/>
            <i class="fa fa-dashboard"></i>
            <span>Dashboard</span>
            </a>
        </li>

        <li class="sub-menu">
            <a href="javascript:;" >
                <i class="fa fa-desktop"></i>
                <span>Add Cars</span>
            </a>
            <ul class="sub">
                <li><a  href="${pageContext.request.contextPath}/customer/create">Register</a></li>
                <li><a  href="${pageContext.request.contextPath}/customer/base">list</a></li>
            </ul>
        </li>

        <li class="sub-menu">
            <a href="javascript:;" >
                <i class="fa fa-cogs"></i>
                <span>Rooms</span><i class="fa arrow"></i>
            </a>
            <ul class="sub">
                <li><a  href="${pageContext.request.contextPath}/room/create">Add</a></li>
                <li><a  href="${pageContext.request.contextPath}/room/list">list</a></li>
                <li><a  href="todo_list.html">Todo List</a></li>
            </ul>
        </li>
        <li class="sub-menu">
            <a href="javascript:;" >
                <i class="fa fa-book"></i>
                <span class="fa fa-arrow-down">Booking</span>
            </a>
            <ul class="sub">
                <li><a  href="${pageContext.request.contextPath}/newUser">Blank Page</a></li>
                <li><a  href="login.html">Login</a></li>
                <li><a  href="lock_screen.html">Lock Screen</a></li>
            </ul>
        </li>
        <li class="sub-menu">
            <a href="javascript:;" >
                <i class="fa fa-tasks"></i>
                <span class="fa fa-arrow-down">Forms</span>
            </a>
            <ul class="sub">
                <li><a  href="form_component.html">Form Components</a></li>
            </ul>
        </li>



    </ul>
    <!-- sidebar menu end-->
</div>