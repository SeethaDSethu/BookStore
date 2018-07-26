<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book List</title>
</head>
<body>
  <h1>Books List</h1>       
  <table border="1">             
  <tr> 
  <th align="left">Author</th> 
  <th align="left">Book Title</th> 
  </tr>       
  
  <c:forEach items="${book}" var="book">
  <tr>         
  <td>${book.author.firstName}
  </td>
  
  <td>${book.bookTitle}
  </td>      
  </tr>            
  </c:forEach> 
  </table>
</body>
</html>