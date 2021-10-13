package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesaProducto", urlPatterns = {"/ProcesaProducto"})
public class ProcesaProducto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Recibe los datos del formulario index.jsp
        String producto = request.getParameter("prodcuto");
        String categoria = request.getParameter("categoria");
        String existencia=request.getParameter("existencia");
        String precio = request.getParameter("precio");
        //Instanciamos un objeto a partir de la clase Producto
        Producto pro = new Producto();
        //Encapsulamos los datos recibidos en el objeto pro
        pro.setProdcuto(producto);
        pro.setCategoria(categoria);
        pro.setSxistencia(existencia);
        pro.setPrecio(precio);
        //Colocar al objeto pro como atributo de request
        request.setAttribute("producto", pro);
        //Enviar al formulario output.jsp
        request.getRequestDispatcher("output.jsp").forward(request, response);
    }
   
}
