<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Greetings</h1>
        <FORM METHOD="GET" action="/webapp-1.0-SNAPSHOT/hw/orders/bymfr">
        		Please enter Manufacturer: <BR>
        		<TEXTAREA NAME="mfr" ROWS="1"></TEXTAREA>
        		<BR> <INPUT TYPE="SUBMIT" VALUE="Submit">
        	</FORM>
    </body>
    </html>