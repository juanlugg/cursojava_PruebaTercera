# TERCERA PRUEBA CURSO JAVA
## Juan Luis Guerra Gennich 24/12/2024

### Descripción
Proyecto que consiste en la utilización de JAVA junto HTML utilizando herramientas como Servlets y JSP con una gestión de una base de datos de un almacén y sus productos.

### Funcionalidades
* Menú:
    El menú esta dividido en un fichero HTML(menu.html) para la vista y el backend en un fichero de servlet (MenuServlet) que 
    servirá para elegir dos opciones, uno será listar los productos y el otro para añadir uno nuevo.
* Producto:
    Objeto que tiene como propiedades el ID, nombre, categoria, precio y stock.
* ProductoDao:
    Clase que representa las sentencias para manipular la tabla producto de la base de datos almacen
* AlmacenService:
    Objeto que servirá como "base de datos estático" para tener productos inicializados en ejecución.
* Listar Productos:
    El listado de productos es un fichero JSP que contiene toda la lista que esta guardada en AlmacenService
    Dentro de este apartado encontramos dos opciones por cada Producto, que son borrar y modificar (ambas opciones
    se envian a modificarBorrar.jsp que hará la gestión correspondiente).
    * Modificar Borrar Producto:
        Estará dividido en modificarBorrar.jsp que será de intermediario para identificar el producto y que enviará la opción
        elegida al servlet correspondiente que son BorrarServlet o ModificarServlet. Cuando se termine de realizar la opción elegida se da la opción de volver al menu.
* Añadir Producto:
    Está es la segunda opción del menú principal, donde será enviado a un jsp (addProducto.jsp) para recoger los datos que se quieran añadir y enviarlos al AddServlet que se encargará de añadirlo a AlmacenService.
    
