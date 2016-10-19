<%-- 
    Document   : haceroferta
    Created on : 18-10-2016, 19:13:49
    Author     : ChristopherVaras
--%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hacer Oferta</title>
    </head>
    <body>
        <h1>Hacer Oferta</h1>
         <f:form action="agregarOferta.html" modelAttribute="Oferta">

             
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
