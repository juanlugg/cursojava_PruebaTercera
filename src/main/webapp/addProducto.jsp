<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.curso.modelo.*"%>
<%@ page import="com.curso.service.AlmacenService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Añadir Producto</title>
</head>
<body style="background-color: #c4fffc">
	<h1 align="center"><i>AÑADIR PRODUCTO</i></h1>
	<div align="right"> 
		<form action="javascript:history.back()"> 
			<input type="submit" value="Volver Atrás" style="background-color:#e5fffc"> 
		</form> 
	</div>
	<div align="center">
		<form action="AddServlet" method="get">
			ID: <input type="text" name="id"> 
			Nombre: <input type="text" name="nombre">
			Categoria: <select name="categoria"> 
							<% for(Categoria c : Categoria.values()){%>
						<option value="<%=c%>"><%=c%></option>	
							<%}%>
						</select>
			<br><br><br>
			Precio: <input type="number" name="precio" step="0.01" style="width: 75px;"> 
			Stock: <input type="number" name="stock" style="width: 75px;"> 
			<input type="submit" value="ACEPTAR">
		</form>
	</div>
</body>
</html>