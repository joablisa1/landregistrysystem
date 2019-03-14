<%--
  Created by IntelliJ IDEA.
  User: LISA
  Date: 12/27/2018
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <%@ include file="../includes/includes.jsp"%>
    <script src="${pageContext.request.contextPath}/static/js/validation.js"></script>
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <!--external css-->
    <link href="${pageContext.request.contextPath}/static/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/lineicons/style.css">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/style-responsive.css" rel="stylesheet">

    <script src="${pageContext.request.contextPath}/static/js/chart-master/Chart.js"></script>
</head>
<body>
<div id="login-page">
    <div class="container">

        <form class="form-login" action="${pageContext.request.contextPath}/user/home" method="post" autocomplete="off">
            <h2 class="form-login-heading">sign in now</h2>
            <p class="align-self-center "><span class="alert al"></span>  ${message}</p>
            <div class="login-wrap">
                <input type="text" name="email"  id="email" required="required" class="form-control" placeholder="Email" autofocus>
                <br>
                <input type="password" name="userpass" required="required" class="form-control" placeholder="Password">
                <label class="checkbox">
		                <span class="pull-right">
		                    <a data-toggle="modal" href="login.html#myModal"> Forgot Password?</a>

		                </span>
                </label>
                <button class="btn btn-theme btn-block" href="index.html" type="submit"><i class="fa fa-lock"></i> SIGN IN</button>
                <hr>

                <div class="login-social-link centered">
                    <p>or you can sign in via your social network</p>
                    <button class="btn btn-facebook" type="submit"><i class="fa fa-facebook"></i> Facebook</button>
                    <button class="btn btn-twitter" type="submit"><i class="fa fa-twitter"></i> Twitter</button>
                </div>
                <div class="registration">
                    Don't have an account yet?<br/>
                    <a class="" href="${pageContext.request.contextPath}/user/create">
                        Create an account
                    </a>
                </div>

            </div>
            <!-- Modal -->
            <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title">Forgot Password ?</h4>
                        </div>
                        <div class="modal-body">
                            <p>Enter your e-mail address below to reset your password.</p>
                            <input type="text" name="email" placeholder="Email" autocomplete="off" class="form-control placeholder-no-fix">

                        </div>
                        <div class="modal-footer">
                            <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                            <button class="btn btn-theme" type="button">Submit</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- modal -->

        </form>

    </div>
</div>
<%@include file="../menubars/footer.jsp"%>
<script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>

<script src="${pageContext.request.contextPath}/static/js/jquery-1.8.3.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
<script class="include" type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.scrollTo.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.nicescroll.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.sparkline.js"></script>


<!--common script for all pages-->
<script src="${pageContext.request.contextPath}/static/js/common-scripts.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/gritter/js/jquery.gritter.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/gritter-conf.js"></script>

<!--script for this page-->
<script src="${pageContext.request.contextPath}/static/js/sparkline-chart.js"></script>
<script src="${pageContext.request.contextPath}/static/js/zabuto_calendar.js"></script>


</body>
</html>
