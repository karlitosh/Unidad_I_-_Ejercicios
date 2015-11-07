<%-- 
    Document   : Resultados
    Created on : 7/11/2015, 04:22:32 PM
    Author     : Karlitosh
    *Nombre: Resultados.jsp
    *Objetivo: WebServices (GlassFish)
               Formulario html + jsp que calcula las 4 operaciones aritmeticas
               básicas en un Servlet de Java.
    *Autor: Ing. Carlos Alberto Cásares Farías
    *Fecha: 07/11/2015
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator - Resultados</title>
    </head>
    <body>
        <h1>Imprimiendo los resultados desde el formulario de Resultados</h1>
        
        <% out.println("El resultado de " + request.getAttribute("vNum1") + request.getAttribute("vOperator") + request.getAttribute("vNum2") + " es: " + request.getAttribute("vResult")); %>
    </
    body>
</html>
