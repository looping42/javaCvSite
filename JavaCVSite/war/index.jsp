<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.google.appengine.api.users.*" %>
<%@ page import="java.util.List" %>
<%@ page import="javaCVSite.Message" %>
<%-- <%@ page import="java.util.List" %>
<%@ page import="javaCVSite.Message" %> --%>
<% UserService userService = UserServiceFactory.getUserService(); %>
<!-- The HTML 4.01 Transitional DOCTYPE declaration-->
<!-- above set at the top of the file will set     -->
<!-- the browser's rendering engine into           -->
<!-- "Quirks Mode". Replacing this declaration     -->
<!-- with a "Standards Mode" doctype is supported, -->
<!-- but may lead to some differences in layout.   -->

<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
      <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet" />
  </head>
  <body>	
    <%@include file="navbar.jsp" %>	
    <hr>
     <div class="container">
 		<%
			List<Message> messages = (List<Message>) request.getAttribute("messages");
			for (Message message : messages) {
		%>
<%-- 		<p>
			<strong><%= message.getName() %></strong> a écrit :<br />
			<%= message.getMessage()  %>
			<% message.AfficheMessage(); %>
		</p> --%>
	<div class="row">
        <div class="col-sm-4"><a href="#" class=""><img src="http://placehold.it/1280X720" class="img-responsive"></a>
        </div>
        <div class="col-sm-8">
          <h3 class="title">test article titre</h3>
          <p class="text-muted"><span class="glyphicon glyphicon-calendar"></span>July 23, 2014 @ 1:30 PM</p>
          <p>Could artificial intelligence have been used to prevent the high-profile Target breach? The concept is not so far-fetched. Organizations such as Mastercard and RBS WorldPay have long relied on artificial intelligence to detect fraudulent transaction patterns and prevent card.</p>
          
          <p class="text-muted">Presented by <a href="#">En savoir plus...</a></p>         
        </div>
      </div>
      <hr>
		<%
		}			
		%>  

      <div class="row">
        <div class="col-sm-4"><a href="#" class=""><img src="http://placehold.it/1280X720" class="img-responsive"></a>
        </div>
        <div class="col-sm-8">
          <h3 class="title">Big Payment Data: Leveraging Transactional Data to Ensure an Enterprise Approach to Risk Management</h3>
          <p class="text-muted"><span class="glyphicon glyphicon-calendar"></span> July 23, 2014 @ 1:30 PM</p>
          <p>60% of organizations were exposed to actual or attempted fraud loss last year. As fraud and risk increases year over year, the amount of data being collected increases as well.
            </p><p class="text-muted">Presented by <a href="#">Mike Braatz</a>, <a href="#">Jonathan Eber</a></p>
          
        </div>
      </div>
      <hr><div class="row">
      <div class="col-sm-4"><a href="#" class=""><img src="http://placehold.it/1280X720" class="img-responsive"></a>
      </div>
      <div class="col-sm-8">
        <h3 class="title">How to Fight Fraud with Artificial Intelligence and Intelligent Analytics</h3>
        <p class="text-muted"><span class="glyphicon glyphicon-lock"></span> Available Exclusively for Premium Members</p>
        <p>Could artificial intelligence have been used to prevent the high-profile Target breach? The concept is not so far-fetched. Organizations such as Mastercard and RBS WorldPay have long relied on artificial intelligence to detect fraudulent transaction patterns and prevent card.</p>
        
        <p class="text-muted">Presented by <a href="#">Ellen Richey</a></p>
        
      </div>
      </div>
      <hr>
      <div class="row">
        <div class="col-sm-4"><a href="#" class=""><img src="http://placehold.it/1280X720" class="img-responsive"></a>
        </div>
        <div class="col-sm-8">
          <h3 class="title">Big Payment Data: Leveraging Transactional Data to Ensure an Enterprise Approach to Risk Management</h3>
          <p class="text-muted"><span class="glyphicon glyphicon-calendar"></span> July 23, 2014 @ 1:30 PM</p>
          <p>60% of organizations were exposed to actual or attempted fraud loss last year. As fraud and risk increases year over year, the amount of data being collected increases as well.
            </p><p class="text-muted">Presented by <a href="#">Mike Braatz</a>, <a href="#">Jonathan Eber</a></p>
          
        </div>
      </div>
      <hr>
      <div class="row">
        <div class="col-sm-4"><a href="#" class=""><img src="http://placehold.it/1280X720" class="img-responsive"></a>
        </div>
        <div class="col-sm-8">
          <h3 class="title">How to Fight Fraud with Artificial Intelligence and Intelligent Analytics</h3>
          <p class="text-muted"><span class="glyphicon glyphicon-lock"></span> Available Exclusively for Premium Members</p>
          <p>Could artificial intelligence have been used to prevent the high-profile Target breach? The concept is not so far-fetched. Organizations such as Mastercard and RBS WorldPay have long relied on artificial intelligence to detect fraudulent transaction patterns and prevent card.</p>
          
          <p class="text-muted">Presented by <a href="#">Ellen Richey</a></p>
          
        </div>
      </div>
      <hr>
      <div class="row">
        <div class="col-sm-4"><a href="#" class=""><img src="http://placehold.it/1280X720" class="img-responsive"></a>
        </div>
        <div class="col-sm-8">
          <h3 class="title">Big Payment Data: Leveraging Transactional Data to Ensure an Enterprise Approach to Risk Management</h3>
          <p class="text-muted"><span class="glyphicon glyphicon-calendar"></span> July 23, 2014 @ 1:30 PM</p>
          <p>60% of organizations were exposed to actual or attempted fraud loss last year. As fraud and risk increases year over year, the amount of data being collected increases as well.
            </p><p class="text-muted">Presented by <a href="#">Mike Braatz</a>, <a href="#">Jonathan Eber</a></p>
          
        </div>
      </div>
      <hr>
      <div class="row">
        <div class="col-sm-4"><a href="#" class=""><img src="http://placehold.it/1280X720" class="img-responsive"></a>
        </div>
        <div class="col-sm-8">
          <h3 class="title">How to Fight Fraud with Artificial Intelligence and Intelligent Analytics</h3>
          <p class="text-muted"><span class="glyphicon glyphicon-lock"></span> Available Exclusively for Premium Members</p>
          <p>Could artificial intelligence have been used to prevent the high-profile Target breach? The concept is not so far-fetched. Organizations such as Mastercard and RBS WorldPay have long relied on artificial intelligence to detect fraudulent transaction patterns and prevent card.</p>
          
          <p class="text-muted">Presented by <a href="#">Ellen Richey</a></p>
          
        </div>
      </div>
      <hr>
      <div class="row">
        <div class="col-sm-4"><a href="#" class=""><img src="http://placehold.it/1280X720" class="img-responsive"></a>
        </div>
        <div class="col-sm-8">
          <h3 class="title">Big Payment Data: Leveraging Transactional Data to Ensure an Enterprise Approach to Risk Management</h3>
          <p class="text-muted"><span class="glyphicon glyphicon-calendar"></span> July 23, 2014 @ 1:30 PM</p>
          <p>60% of organizations were exposed to actual or attempted fraud loss last year. As fraud and risk increases year over year, the amount of data being collected increases as well.
            </p><p class="text-muted">Presented by <a href="#">Mike Braatz</a>, <a href="#">Jonathan Eber</a></p>
          
        </div>
      </div>
      <hr>
      <div class="row">
        <div class="col-sm-4"><a href="#" class=""><img src="http://placehold.it/1280X720" class="img-responsive"></a>
        </div>
        <div class="col-sm-8">
          <h3 class="title">How to Fight Fraud with Artificial Intelligence and Intelligent Analytics</h3>
          <p class="text-muted"><span class="glyphicon glyphicon-lock"></span> Available Exclusively for Premium Members</p>
          <p>Could artificial intelligence have been used to prevent the high-profile Target breach? The concept is not so far-fetched. Organizations such as Mastercard and RBS WorldPay have long relied on artificial intelligence to detect fraudulent transaction patterns and prevent card.</p>
          
          <p class="text-muted">Presented by <a href="#">Ellen Richey</a></p>
          
        </div>
      </div>
      <hr>
      <div class="row">
        <div class="col-sm-4"><a href="#" class=""><img src="http://placehold.it/1280X720" class="img-responsive"></a>
        </div>
        <div class="col-sm-8">
          <h3 class="title">Big Payment Data: Leveraging Transactional Data to Ensure an Enterprise Approach to Risk Management</h3>
          <p class="text-muted"><span class="glyphicon glyphicon-calendar"></span> July 23, 2014 @ 1:30 PM</p>
          <p>60% of organizations were exposed to actual or attempted fraud loss last year. As fraud and risk increases year over year, the amount of data being collected increases as well.
            </p><p class="text-muted">Presented by <a href="#">Mike Braatz</a>, <a href="#">Jonathan Eber</a></p>
          
        </div>
      </div>
          </div>
      <hr>
      
       <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
