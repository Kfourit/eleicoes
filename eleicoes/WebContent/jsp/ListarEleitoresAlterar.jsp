<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Eleições</title>
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
		<li><a>Dúvidas Frequentes</a>
			<ul>
				<li><a href="http://www.google.com.br">Como Cadastrar?</a></li>
				<li><a href="http://www.google.com.br">Como Votar?</a></li>
			</ul></li>
	</ul>
	<br>
	<br>
	<br>
	<h1 align="center">Alterar/Excluir Dados Eleitor</h1>
	<br>
	<br>
	<div class="conteudo">
		<h3>Nomes:</h3>
		<br>
		<c:forEach var="e" items="${eleitores}">
			<a href="<%out.print(request.getContextPath());%>/CarregarEleitorServlet?id=${e.id}" class="link">
				${e.nome}
			</a>
			<br>
		</c:forEach>
	</div>

</body>
</html>