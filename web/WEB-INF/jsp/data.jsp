<%-- 
    Document   : data
    Created on : 16-10-2016, 2:10:50
    Author     : ChristopherVaras
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Usuario</title>
    </head>
    <body>
             <a href="crear.html">Agregar</a>
        <table style="border-collapse: collapse" cellpadding="7px" border="1">
            <tr>
                <th>Rut</th>
                <th>Email</th>
                <th>Celular</th>
                <th>Nombre</th>
                <th>apellido</th>
                <th>Edad</th>
                
                <th>Action</th>
            </tr>

            <c:forEach items="${lst}" var="u">
                <tr>
                    <td>${u.rut}</td>
                    <td>${u.emailUsuario}</td>
                    <td>${u.celularUsuario}</td>
                    <td>${u.nombreUsuario}</td>
                    <td>${u.apellidoUsuario}</td>
                    <th>${u.edadUsuario}</td>
                    

                    
                    <td>
                        <a href="edit.html?rut=${u.rut}">
                            Edit </a>
                        <a href="remove.html?rut=${u.rut}" onclick="return confirm('Are you sure?')">Remove</a>
                    </td>
                </tr>
            </c:forEach>

        </table>

    </body>
</html>
