<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Elei��es</title>
<link rel="stylesheet"
	href="<%out.print(request.getContextPath());%>/css/Projeto Final.css">
</head>
<body>

	<ul class="menu">
		<li><a
			href="<%out.print(request.getContextPath());%>/jsp/index.jsp">Home</a></li>
		<li><a>Cadastrar</a>
			<ul>
				<li><a
					href="<%out.print(request.getContextPath());%>/jsp/CadastrarEleitor.jsp">Cadastrar
						Eleitor</a></li>
				<li><a
					href="<%out.print(request.getContextPath());%>/jsp/CadastrarCandidato.jsp">Cadastrar
						Candidato</a></li>
			</ul></li>
		<li><a>Alterar/Excluir Dados</a>
			<ul>
				<li><a
					href="<%out.print(request.getContextPath());%>/ListarEleitorAlterarServlet">Alterar/Excluir
						Dados Eleitor</a></li>
				<li><a
					href="<%out.print(request.getContextPath());%>/ListarCandidatoAlterarServlet">Alterar/Excluir
						Dados Candidato</a></li>
			</ul></li>
		<li><a
			href="<%out.print(request.getContextPath());%>/ListarEleitorVotarServlet">Votar</a></li>
			<li><a href="<%out.print(request.getContextPath());%>/ResultadoServlet">Resultado</a></li>
		<li><a>D�vidas Frequentes</a>
			<ul>
				<li><a href="http://www.google.com.br">Como Cadastrar?</a></li>
				<li><a href="http://www.google.com.br">Como Votar?</a></li>
			</ul></li>
	</ul>
	<br>
	<br>
	<br>
	<h1 align="center">Resultado</h1>
	<br>
	<br>
	<div class="conteudo">
		<table>
			<tr>
				<td><h4>Presidentes</h4></td>
				<td align="center"><h4>N�mero de Votos</h4></td>
			</tr>
			<c:forEach var="p" items="${presidentes}">
				<tr>
					<td>${p.nome}</td>
					<td align="center">${p.numeroDeVotos}</td>
				</tr>
			</c:forEach>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><h4>Governadores</h4></td>
				<td align="center"><h4>N�mero de Votos</h4></td>
			</tr>
			<c:forEach var="p" items="${governadores}">
				<tr>
					<td>${p.nome}</td>
					<td align="center">${p.numeroDeVotos}</td>
				</tr>
			</c:forEach>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><h4>Prefeitos</h4></td>
				<td align="center"><h4>N�mero de Votos</h4></td>
			</tr>
			<c:forEach var="p" items="${prefeitos}">
				<tr>
					<td>${p.nome}</td>
					<td align="center">${p.numeroDeVotos}</td>
				</tr>
			</c:forEach>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><h4>Senadores</h4></td>
				<td align="center"><h4>N�mero de Votos</h4></td>
			</tr>
			<c:forEach var="p" items="${senadores}">
				<tr>
					<td>${p.nome}</td>
					<td align="center">${p.numeroDeVotos}</td>
				</tr>
			</c:forEach>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><h4>Vereadores</h4></td>
				<td align="center"><h4>N�mero de Votos</h4></td>
			</tr>
			<c:forEach var="p" items="${vereadores}">
				<tr>
					<td>${p.nome}</td>
					<td align="center">${p.numeroDeVotos}</td>
				</tr>
			</c:forEach>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><h4>Deputados Estaduais</h4></td>
				<td align="center"><h4>N�mero de Votos</h4></td>
			</tr>
			<c:forEach var="p" items="${deputadosEstaduais}">
				<tr>
					<td>${p.nome}</td>
					<td align="center">${p.numeroDeVotos}</td>
				</tr>
			</c:forEach>

			<tr>
				<td></td>
				<td></td>
			</tr>

			<tr>
				<td><h4>Deputados Federais</h4></td>
				<td align="center"><h4>N�mero de Votos</h4></td>
			</tr>
			<c:forEach var="p" items="${deputadosFederais}">
				<tr>
					<td>${p.nome}</td>
					<td align="center">${p.numeroDeVotos}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>