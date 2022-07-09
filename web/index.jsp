<%-- 
    Document   : index
    Created on : 29/06/2022, 05:33:02 PM
    Author     : EliasSan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/Styles.css">
        <title> JSP Con Servlet</title>
    </head>
    <body>
        <div class="formulario">
            <div class="row">
                <div class="col col-7">
                 <h1>Formulario en JSP</h1>
                    <form action="SProcesar" method="post">
                        <div class="form-row">
                          <div class="form-group col-md-5">
                            <label for="inputMatri">Matricula</label>
                            <input type="text" class="form-control" name="tfMatricula" id="inputMatri" placeholder="Matricula">
                          </div>
                          <div class="form-group col-md-5">
                            <label for="inputName">Nombre del alumno</label>
                            <input type="text" class="form-control" name="tfNombre" id="inputName" placeholder="Nombre">
                          </div>
                        </div>
                        <div class="form-group col-md-5" >
                          <label for="inputApellidos">Apellidos</label>
                          <input type="text" class="form-control" name="tfApellidos" id="inputApellidos" placeholder="Apellidos">
                        </div>
                       
                          <div class="form-row">
                          <div class="form-group col-md-1">
                            <label for="inputDdi">DDI</label>
                            <input type="number" class="form-control" name="tfDdi" id="inputDdi" min="1" max="10">
                          </div>
                           <div class="form-group col-md-1">
                            <label for="inputDwi">DWI</label>
                            <input type="number" class="form-control" name="tfDwi" id="inputDwi" min="1" max="10">
                          </div>

                          <div class="form-group col-md-1">
                            <label for="inputEcbd">ECBD</label>
                            <input type="number" class="form-control" name="tfEcbd" id="inputEcbd" min="1" max="10">
                          </div>
                     
                        <button type="submit" name="btnRegistrar" class="btn-fm">Capturar</button>
                    </form>
                </div>
            </div>

           </div>
         </div>
    </body>
</html>
