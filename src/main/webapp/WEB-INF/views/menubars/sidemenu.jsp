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

        <li class="sub-menu">
            <a href="javascript:;" >
                <i class="fa fa-desktop"></i>
                <span>Customer</span>
            </a>
            <ul class="sub">
                <li><a  href="${pageContext.request.contextPath}/customer/create">Register</a></li>
                <li><a  href="${pageContext.request.contextPath}/customer/1">list</a></li>
                <li><a  href="${pageContext.request.contextPath}####">Edit</a></li>
            </ul>
        </li>

        <li class="sub-menu">
            <a href="javascript:;" >
                <i class="fa fa-cogs"></i>
                <span>Resident Area</span><i class="fa arrow"></i>
            </a>
            <ul class="sub">
                <li><a  href="${pageContext.request.contextPath}/resident/create">Add</a></li>
                <li><a  href="${pageContext.request.contextPath}/resident/list">avaliable</a></li>
                <li><a  href="todo_list.html">Todo List</a></li>
            </ul>
        </li>
        <li class="sub-menu">
            <a href="javascript:;" >
                <i class="fa fa-book"></i>
                <span class="fa fa-arrow-down">Land</span>
            </a>
            <ul class="sub">
                <li><a  href="${pageContext.request.contextPath}/land/create">add</a></li>
                <li><a  href="${pageContext.request.contextPath}/land/list">view list</a></li>
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
        <li class="sub-menu">
            <a href="javascript:;" >
                <i class="fa fa-th"></i>
                <span class="fa fa-arrow-down">Data Tables</span>
            </a>
            <ul class="sub">
                <li><a  href="basic_table.html">Basic Table</a></li>
                <li><a  href="responsive_table.html">Responsive Table</a></li>
            </ul>
        </li>
    </ul>
    <!-- sidebar menu end-->
</div>