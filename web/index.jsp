<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Examen EXT3</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.0.0.js"></script>
<script src="https://code.jquery.com/jquery-migrate-3.0.0.js"></script>
</head>
<style type="text/css">
.progress-bar {
    color: #333;
} 
* {
    -webkit-box-sizing: border-box;
       -moz-box-sizing: border-box;
            box-sizing: border-box;
    outline: none;
}
    .form-control {
      position: relative;
      font-size: 16px;
      height: auto;
      padding: 10px;
        @include box-sizing(border-box);
        &:focus {
          z-index: 2;
        }
    }
      .navbar-default .navbar-fixed-top {
    background-color: #000000;
}
body {
    color: black;
    background: url(http://i.imgur.com/GHr12sH.jpg) no-repeat center center fixed;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
}
.login-form {
    margin-top: 60px;
}
form[role=login] {
    color: #5d5d5d;
    background: #f2f2f2;
    padding: 26px;
    border-radius: 10px;
    -moz-border-radius: 10px;
    -webkit-border-radius: 10px;
}
    form[role=login] img {
        display: block;
        margin: 0 auto;
        margin-bottom: 35px;
    }
    form[role=login] input,
    form[role=login] button {
        font-size: 18px;
        margin: 16px 0;
    }
    form[role=login] > div {
        text-align: center;
    }
    
.form-links {
    text-align: center;
    margin-top: 1em;
    margin-bottom: 50px;
}
    .form-links a {
        color: #fff;
    }
</style>
<body>
    <div class="col-md-4 divlog center-block">
      <section class="login-form">
        <form method="post" action="" role="regis">
          <input type="text" name="nombre" placeholder="nombre" required class="form-control input-lg nombre" value="" required="" />
		  <br>
		  <input type="text" class="form-control input-lg apellido" placeholder="primer apellido" required="" />
		  <br>
		  <input type="text" class="form-control input-lg apellido2" placeholder="segundo apellido" required="" />
		  <br>
		  <label>Pronvincia: </label><select class="groupprovincia" style="width:50%;"></select>
		  <br>
		  <label>Poblacion: </label><select class="grouppoblacion" style="width:50%;"></select>
		  <br>
		  <label>Calle: </label><select class="groupcalle" style="width:50%;"></select>
		  <input type="text" name="numero" placeholder="numero" required class="form-control input-lg numero" value="" required="" />
		  <br>
		  <input type="text" name="piso" placeholder="piso" required class="form-control input-lg piso" value="" required="" />
		  <br>
		  <input type="text" name="metros" placeholder="metro" required class="form-control input-lg metros" value="" required="" />
          <br>
          <button type="button" name="registro" class="btn btn-lg btn-primary btn-block registro">Regístrate</button>
        </form>
      </section>  
	</div>
	<div class="col-md-4 divlog center-block">
      <section class="login-form">
        <form method="post" action="" role="busc">
          <input type="text" name="codigo" placeholder="Codigo del cliente" required class="form-control input-lg codigo" value="" required="" />
          <br>
          <button type="button" name="buscar" class="btn btn-lg btn-primary btn-block datosc">Buscar</button>
          <button type="button" name="borrar" class="btn btn-lg btn-primary btn-block borrar">Borrar</button>
        </form>
      </section>  
	</div>
	<div class="col-md-4 divlog center-block">
	</div>

<div class="container datosclient">
  <div class="row datosclient">
    <h2>Datos</h2>
      <div class="col-xs-12 col-sm-9">Datos del cliente:</div>
  </div>
    <table class="table" id="table-dato">
      <thead>
        <tr>
          <th>Nombre</th>
          <th>1er Apellido</th>
          <th>2do Apellido</th>
          <th>Calle</th>
          <th>Numero</th>
          <th>Cod. provincia</th>
          <th>Cod. poblacion</th>
        </tr>
      </thead>
      <tbody id="dato"></tbody>
	</table>
</div>

</body>   
<script>
   
$(document).ready(function() {
	$('.datosclient').hide();
	provincias();

        
    // PETICION DE REGISTRO
    $('.registro').click(function(){
        
        var codi = $('.codig').val();
        var nomb = $('.nombre').val();
        var ape = $('.apellido').val();
        var apel = $('.apellido2').val();
        var call = $('.groupcalle').prop('value'); 
        var nume = $('.numero').val();
        var piso = $('.piso').val();
        var metr = $('.metros').val();
        var cpo = $('.grouppoblacion').prop('value'); 
        var cpro = $('.groupprovincia').prop('value'); 
        
        $.ajax({
            type: "POST",
            url: "controlador?accion=registrar",
            dataType: "json",
            data: { "codigo": codi, "nombre": nomb, "apellido" : ape, "apellido2" : apel, "calle" : call, "numero": nume, "piso": piso, "metros" : metr, "codigoPoblacion" : cpo, "codigoProvincia" : cpro},
            success: function(data) {
                
                if (data.error!=null) {

					alert(data.error);
				} else {
					
					alert("Cliente creado correctamente");

				}
            },
            error: function (xhr, ajaxOptions, thrownError) {
                console.log(xhr.headers);
                console.log(xhr.status);
                console.log(xhr.responseText);
                console.log(ajaxOptions);
                console.log(thrownError);
            }           
        });
    });


    	//PETICION DATOS PROVINCIAS
	   function provincias(){
              $.ajax({
            type: "GET",
            url: "controlador?accion=provincias",
            dataType: "json",
            success: function(data) {
                      

                for(i = 0; i < data.length; i++){
						
						$('.groupprovincia').append($('<option>', { value: data[i].codigoProvincia, text: data[i].provincia}));
						
                      }
                      
            }, 
            error: function (xhr, ajaxOptions, thrownError) {
                console.log(xhr.headers);
                console.log(xhr.status);
                console.log(xhr.responseText);
                console.log(ajaxOptions);
                console.log(thrownError);
            }
        });
        
      }
      
      
          	//PETICION DATOS POBLACION
	   $('.groupprovincia').on('change', function(){
	   
	   		var prov = $('.groupprovincia').prop('value'); 
              $.ajax({
            type: "GET",
            url: "controlador?accion=poblaciones",
            dataType: "json",
            data: { "codigoProvincia": prov },
            success: function(data) {
                      

                for(i = 0; i < data.length; i++){
						
						$('.grouppoblacion').append($('<option>', { value: data[i].codigoPoblacion, text: data[i].poblacion}));
						
                      }
                      
            }, 
            error: function (xhr, ajaxOptions, thrownError) {
                console.log(xhr.headers);
                console.log(xhr.status);
                console.log(xhr.responseText);
                console.log(ajaxOptions);
                console.log(thrownError);
            }
        });
        
      });
      
          	//PETICION DATOS CALLES
	   $('.grouppoblacion').on('change', function(){
	   var pob = $('.grouppoblacion').prop('value'); 
              $.ajax({
            type: "GET",
            url: "controlador?accion=calles",
            dataType: "json",
            data: { "codPoblacion": pob },
            success: function(data) {
                      

                for(i = 0; i < data.length; i++){
						
						$('.groupcalle').append($('<option>', { value: data[i].idCalle, text: data[i].nombre}));
						
                      }
                      
            }, 
            error: function (xhr, ajaxOptions, thrownError) {
                console.log(xhr.headers);
                console.log(xhr.status);
                console.log(xhr.responseText);
                console.log(ajaxOptions);
                console.log(thrownError);
            }
        });
        
      });


	//PETICION BORRAR CLIENTE
	   $('.borrar').click(function(){
	   var codi = $('.codigo').val();
              $.ajax({
            type: "GET",
            url: "controlador?accion=borrar",
            dataType: "json",
            data: { "codigo": codi},
            success: function(data) {
                if (data.error!=null) {

					alert(data.error);
				} else {
					
					alert("Cliente borrado correctamente");

				}

            }, 
            error: function (xhr, ajaxOptions, thrownError) {
                console.log(xhr.headers);
                console.log(xhr.status);
                console.log(xhr.responseText);
                console.log(ajaxOptions);
                console.log(thrownError);
            }
        });
      });


	//PETICION DATOS CLIENTE
	   $('.datosc').click(function(){
	   var codi = $('.codigo').val();
              $.ajax({
            type: "GET",
            url: "controlador?accion=datos",
            dataType: "json",
            data: { "codigo": codi},
            success: function(data) {
                      var htmlNuevaFila="";

                for(i = 0; i < data.length; i++){
                          htmlNuevaFila+= '<tr><td>'+data[i].nombre+'</td><td>'+data[i].apellido+'</td><td>'+data[i].apellido2+'</td><td>'+data[i].calle+'</td><td>'+data[i].numero+'</td><td>'+data[i].codigoPoblacion+'</td><td>'+data[i].codigoProvincia+'</td></tr>';

                      }
                      $('#dato').html(htmlNuevaFila);
            }, 
            error: function (xhr, ajaxOptions, thrownError) {
                console.log(xhr.headers);
                console.log(xhr.status);
                console.log(xhr.responseText);
                console.log(ajaxOptions);
                console.log(thrownError);
            }
        });
        
        $('.datosclient').show();
      });


});
</script>
    
    
    
</html>