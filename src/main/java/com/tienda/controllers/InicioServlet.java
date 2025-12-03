
package com.tienda.controllers;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 @WebServlet(name = "Inicio", urlPatterns = {"/Inicio"})
public class InicioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
          
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        if ("julio".equals(usuario) && "1234".equals(password)) {
            request.getRequestDispatcher("inicioCorrecto.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("inicioIncorrecto.jsp").forward(request, response);
        }
    }
}