<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de productos</h1>
         <form action="ProcesaProducto" method="post">
            <table>
                <tr>
            <td>Producto:</td>
            <td><input type="text" name="producto" value=""></td>
                </tr>
                <tr>
            <td>Categoria:</td>
                    <td><select name="categoria" >
                            <option>Frutas</option>
                            <option>Repuestos</option>
                            <option>Medicamentos</option>
                            <option>Muebles</option>
                </select></td>
               </tr>
               <tr>
            <td>Existencia:</td>
            <td><input type="text" name="existencia" value=""></td>
              </tr> 
              <tr>
            <td>Precio:</td>
            <td><input type="text" name="precio" value=""></td>
              </tr> 
              <tr>
                  <td><input type="submit" value="Registrar"></td>
              </tr>
            </table>
        </form>
    </body>
</html>
