<%-- 
    Document   : crearcuenta
    Created on : 16-10-2016, 20:05:43
    Author     : ChristopherVaras
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<link rel="stylesheet" tye="text/css" href="{pageContext.request.contextPath}resources/css/estilos.css"
        -->
        <!-- <pring:url  value="/resources/css/estilos.css"/>-->
        <title>Crear cuenta</title>
    </head>
    <body>

        <f:form action="addcuenta.html" modelAttribute="Cuenta">

            <label for="id">Id:</label>


            <input type="hidden" name="idCuenta" id="id" value=""/>
            <label for="nombreid">Nombre :</label>


            <input type="text" id="nombreid" name="nombreCuenta" value=""/>
            </br>
            <label for="pass">Contraseña :</label>


            <input type="text" id="pass" name="passwordCuenta" value=""/>
            </br>
            <label for="fechaid">Fecha Creacion: </label>

            <input type="text" id="fechaid"name="fechaCreacionCuenta" value=""/>
            
            <label for="tipo">Tipo Cuenta</label>

            <input type="text" id="tipo"name="tipocuenta" value=""/>

            </br>

            <label for="ubi">ID Ubicacion</label>

            <input type="text" id="ubi" name="idUbicacion" value=""/>
            
            

            <input type="submit" value="Save"/>
        </f:form>

    </body>
</html>

