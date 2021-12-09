# Proyecto Automoviles
Proyecto MVC que comprende las operaciones básicas con Java y MySQL


### **Donaciones**

<a href="https://www.paypal.com/paypalme/EAjset?locale.x=es_XC" alt="paypal" target="_blank">
<img src="https://i.imgur.com/IWPug8j.png" title="paypal" width="10%"></a>


### **REQUISITOS**
------------
Este proyecto fue realizado utilizando OpenJDK 17.0.1_12, utilice la misma version o superior para evitar problemas de compilación.
Tambien puede optar por realizar un Downgrade si fuera necesario, tomando en cuenta que quiza necesite realizar cambios al codigo para su correcto funcionamiento.

### **CONFIGURACIONES INICIALES**
------------

Luego de clonar este repocitorio, es necesario que en MySQL realice una nueva base de datos y en ella cree la tabla "Vehiculos", el script para la creación se encuentra en el archivo "bd.sql".

Despues de tener lista la BD, realice los cambios en la clase "Conexion" del paquete BD.
Los datos a editar son, usuario, contraseña y nombre de la base de datos creada, estos parametros se encuentran en las variables remarcadas.

<a href="https://imgur.com/0ZrbcI8"><img src="https://i.imgur.com/0ZrbcI8.jpg" title="source: imgur.com" /></a>


### **FUNCIONALIDADES DEL PROYECTO**


------------

## Agregar

Se muestra el formulario para agregar un vehiculo nuevo a la base de datos

<a href="https://imgur.com/8Sd1nzE"><img src="https://i.imgur.com/8Sd1nzE.jpg" title="source: imgur.com" width="40%"/></a>

Se manejan los posibles errores como pueden ser:
<ul>
  <li>Patente ya existente</li>
  
  <a href="https://imgur.com/3RQjnUm"><img src="https://i.imgur.com/3RQjnUm.jpg" title="source: imgur.com" width="40%"/></a>
  
  <li>Formulario incompleto</li>
  
  <a href="https://imgur.com/P4YfWhK"><img src="https://i.imgur.com/P4YfWhK.jpg" title="source: imgur.com" width="40%"/></a>
  
  <li>Formato en año invalido</li>
  
  <a href="https://imgur.com/Kni2YaX"><img src="https://i.imgur.com/Kni2YaX.jpg" title="source: imgur.com" width="40%"/></a>
  
</ul>

## Listar

Muestra los registros en la base de datos, si no se ingresa una patente, mostrará todos los registros existentes
<a href="https://imgur.com/SLmwOep"><img src="https://i.imgur.com/SLmwOep.jpg" title="source: imgur.com" width="40%"/></a>

Al ingresar una patente, se mostrará solo ese registro.

<a href="https://imgur.com/UIhCEDs"><img src="https://i.imgur.com/UIhCEDs.jpg" title="source: imgur.com"  width="40%"/></a>

En caso no existir coincidencias se muestra una alerta.

<a href="https://imgur.com/JmeSQYG"><img src="https://i.imgur.com/JmeSQYG.jpg" title="source: imgur.com"  width="40%"/></a>

## Eliminar
Elimina un registro de la base de datos, por medio del ingreso de la patente que se desea eliminar.

<a href="https://imgur.com/9iJMXm3"><img src="https://i.imgur.com/9iJMXm3.jpg" title="source:" width="40%" /></a>

## Modificar
Busca un registro por medio del ingreso de la patente, desplegando los datos registrados y permitiendo la modificación de los datos a excepción de la patente.

<a href="https://imgur.com/ohGqkGI"><img src="https://i.imgur.com/ohGqkGI.jpg" title="source: imgur.com" width="40%"/></a>
