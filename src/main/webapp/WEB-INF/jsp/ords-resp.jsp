<%@page import="homeworkx.OrdersContainer"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        	<%
        		OrdersContainer ordersCont = (OrdersContainer)request.getAttribute("model");
        		if (ordersCont.getOrders().size() > 0) {
        	%>
        	<h5>Manufacturer = <%=ordersCont.getOrders().get(0).getMfr()%></h5>
        	<table border="2">
        	    <tr>
        	        <th>Id</th>
        	        <th>registration date</th>
        	        <th>customer</th>
        	        <th>manager</th>
        	        <th>manufacturer</th>
        	        <th>product id</th>
        	        <th>quantity</th>
        	        <th>profit</th>
        	    </tr>
        	    <c:forEach items="<%=ordersCont.getOrders()%>" var="order" varStatus="status">
        	        <tr>
        	            <td>${order.orderNum}</td>
        	            <td>${order.date}</td>
        	            <td>${order.cust}</td>
        	            <td>${order.rep}</td>
        	            <td>${order.mfr}</td>
        	            <td>${order.product}</td>
        	            <td>${order.qty}</td>
        	            <td>${order.amount}</td>
        	        </tr>
        	    </c:forEach>
        	</table>
        	<br>
        	<form action="/webapp-1.0-SNAPSHOT/hw/orders/bymfr" method="get">
                <input type="submit" value="return"
                     name="Submit" id="frm1_submit" />
            </form>
        	<%
        		}
        	%>
    </body>
</html>