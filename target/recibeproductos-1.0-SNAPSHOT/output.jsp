<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="producto" scope="request" class="com.emergentes.Producto" />
        <h1>El producto registrado es:</h1>
        <p>Prodcuto: <jsp:getProperty name="producto" property="prodcuto" /> </p>
        <p>Categoria:  <jsp:getProperty name="producto" property="categoria" /> </p>
        <p>Existencia:  <jsp:getProperty name="producto" property="sxistencia" /> </p>
        <p>Precio: <jsp:getProperty name="producto" property="precio" />  </p>
        <a href="index.jsp">Retornar</a>
    </body>
</html>
