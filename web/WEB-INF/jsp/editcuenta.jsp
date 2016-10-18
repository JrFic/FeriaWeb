<%-- 
    Document   : editc
    Created on : 16-10-2016, 19:47:39
    Author     : ChristopherVaras
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Cuenta</title>
    </head>
    <body>
         
        <f:form action="updatecuenta.html" modelAttribute="Cuenta">
            <input type="hidden" name="id" value="${c.idCuenta}"/>
            <label for="nombreid">Nombre Cuenta: </label>
            <input type="text" name="nombreCuenta" value="${c.nombreCuenta}" id="nombreid"/>
            <label for="passwordCuentaid">Contraseña </label>
            <input type="text" name="passwordCuenta"  id="passwordCuentaid"value="${c.passwordCuenta}" />
            <label for="fechaid">Fecha creacion:</label>
            <input type="text" name="fechaCreacionCuenta"  id="fechaid"value="${c.fechaCreacionCuenta}" />
            <br/>
                        
            <br/>
             <br/>
  
            <input type="submit" id="guardar" value="Save"/>
        </f:form>
            

    </body>
</html>


