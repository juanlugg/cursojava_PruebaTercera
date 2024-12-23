<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.curso.modelo.*"%>
<%@ page import="com.curso.service.AlmacenService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Producto</title>
</head>
<body style="background-color: #c4fffc">
	<h1 align="center"><i>EDITAR PRODUCTO</i></h1> 
	<%
	String accion = request.getParameter("modificar");
	int id = Integer.parseInt(request.getParameter("id"));
	Producto producto = null;
	for (Producto p : AlmacenService.getAlmacen()){
		if(p.getId() == id)
			producto = p;
	}%>	
		
	<%if(accion.equals("BORRAR")){%>
		<h3>¿Deseas eliminar este producto?</h3>
		<p><%=producto.toString()%></p>
		<p align="center">
			<form action="BorrarServlet" method="get">
			<input type="hidden" name="producto" value="<%=producto.getId()%>">
			<input type="submit" value="ACEPTAR" > 
		</form>  
		<br>
		<form action="javascript:history.back()"> 
			<input type="submit" value="CANCELAR" > 
		</form> 
	</p>
	<%}%>

<%if(accion.equals("MODIFICAR")){%>
		<h3>¿Deseas editar este producto?</h3>
		
		
		<div align="center">
			<form action="ModificarServlet" method="get">
			<input type="text" name="producto" value="<%=producto.getId()%>" readonly="readonly">
			<input type="text" name="nombre" value="<%=producto.getNombre()%>">		
			<select name="categoria"> 
				<% for(Categoria c : Categoria.values()){%>
			%> <option value="<%=c%>" <%= c.equals(producto.getCategoria()) ? "selected" : "" %>><%=c%></option>	
			<%}%>
			</select>
			<input type="text" name="precio" value="<%=producto.getPrecio()%>">
			<input type="text" name="stock" value="<%=producto.getStock()%>">	
			<input type="submit" value="ACEPTAR" > 
		</form>  
		<br>
		<form action="javascript:history.back()"> 
			<input type="submit" value="CANCELAR" > 
		</form> 
	</div>
	<%}%>

</body>
</html>