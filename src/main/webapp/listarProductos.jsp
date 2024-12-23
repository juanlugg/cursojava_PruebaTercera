<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.curso.modelo.*"%>
    <%@ page import="com.curso.service.AlmacenService"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Productos</title>
</head>
<body style="background-color:#c4fffc">
	<h1 align="center"><i>LISTA DE PRODUCTOS</i></h1>
	<div align="right"> 
		<form action="javascript:history.back()"> 
			<input type="submit" value="Volver Atrás" style="background-color:#e5fffc"> 
		</form> 
	</div>
	<%
	if(!AlmacenService.getAlmacen().isEmpty()){
	%>
		<table border="2px" align="center" style="background-color:#e5fffc">
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Categoria</th>
				<th>Precio</th>
				<th>Stock</th>
				<th>----</th>			
			</tr>
	<%for(Producto p : AlmacenService.getAlmacen()){%>
			<tr>
				<td><%=p.getId()%></th>
				<td><%=p.getNombre()%></th>
				<td><%=p.getCategoria()%></th>
				<td><%=p.getPrecio()%></th>
				<td><%=p.getStock()%></th>
				<td>
					<form action="modificarBorrar.jsp" method="get">
						<input type="hidden" name="id" value="<%=p.getId()%>">
						<input type="submit" name="modificar" value="BORRAR">
						<input type="submit" name="modificar" value="MODIFICAR">
					</form>
				</td>	
			</tr>
	<%}}
	else{
		%><p align="center"><i>~~NO HAY PRODUCTOS TODAVIA~~</i></p><%
	}
	%>
</table>
</body>
</html>