

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
        <title>Crear Usuario</title>
    </head>
    <body>

        <f:form action="add.html" modelAttribute="Usuario">

            <label for="idRut">Id:</label>


            <input type="text" name="rut" id="idRut" value=""/>
            <label for="nombreid">Nombre :</label>


            <input type="text" id="nombreid" name="nombreUsuario" value=""/>
            </br>
            <label for="apeid">Apellido :</label>


            <input type="text" id="apeid" name="apellidoUsuario" value=""/>
            </br>
            <label for="correoid">correo:</label>

            <input type="email" id="correoid"name="emailUsuario" value=""/>
            
            <label for="telefonoid">Telefono:</label>

            <input type="text" id="telefonoid"name="celularUsuario" value=""/>

            </br>

            <label for="edadid">Edad</label>

            <input type="text" id="edadid" name="edadUsuario" value=""/>
            
            <label for="idcuenta">Cuenta</label>

            <input type="text" id="idcuenta" name="cuenta" value=""/>


            <input type="submit" value="Save"/>
        </f:form>

    </body>
</html>

