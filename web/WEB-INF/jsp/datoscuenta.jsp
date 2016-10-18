<%-- 
    Document   : datac
    Created on : 16-10-2016, 19:46:07
    Author     : ChristopherVaras
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Cuentas</title>
    </head>
    <body>
             <a href="crearcuenta.html">Agregar</a>
        <table style="border-collapse: collapse" cellpadding="7px" border="1">
            <tr>
                <th>ID</th>
                <th>Nombre Cuenta</th>
                <th>Contraseña</th>
                <th>Fecha Creacion</th>
                <%-- <th>ID Tipo</th>
                <th>ID Ubicacion</th>--%>
                
                <th>Action</th>
            </tr>

            <c:forEach items="${lst}" var="c">
                <tr>
                    <td>${c.idCuenta}</td>
                    <td>${c.nombreCuenta}</td>
                    <td>${c.passwordCuenta}</td>
                    <td>${c.fechaCreacionCuenta}</td>
                    <%--<td>${c.tipocuenta}</td>
                    <th>${c.idUbicacion}</td>--%>
                    

                    
                    <td>
                        <a href="editcuenta.html?id=${c.idCuenta}">
                            Edit </a>
                        <a href="removecuenta.html?id=${c.idCuenta}" onclick="return confirm('Are you sure?')">Remove</a>
                    </td>
                </tr>
            </c:forEach>

        </table>

    </body>
</html>
