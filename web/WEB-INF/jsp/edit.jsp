<%-- 
    Document   : edit
    Created on : 16-10-2016, 5:12:32
    Author     : ChristopherVaras
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
         
        <f:form action="update.html" modelAttribute="Usuario">
            <input type="hidden" name="rut" value="${u.rut}"/>
            <label for="nombreid">Nombre: </label>
            <input type="text" name="nombreUsuario" value="${u.nombreUsuario}" id="nombreid"/>
            <label for="apellidoid">Apellido: </label>
            <input type="text" name="apellidoUsuario"  id="apellidoid"value="${u.apellidoUsuario}" />
            <label for="emailid">Correo:</label>
            <input type="email" name="emailUsuario"  id="emailid"value="${u.emailUsuario}" />
            <br/>
            <label for="telefonoid">Telefono:</label>
            <input type="text" name="celularUsuario" id="telefonoid" value="${u.celularUsuario}"/>
            
                        
            <br/>
             <br/>
  
            <input type="submit" id="guardar" value="Save"/>
        </f:form>
            

    </body>
</html>
