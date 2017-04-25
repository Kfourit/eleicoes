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
	<h1 align="center">Votar</h1>
	<div class="conteudo">
		<form method="post" action="<%out.print(request.getContextPath());%>/FinalizarVotacaoServlet">
			<br>
			<br>
			<h3>Presidente:</h3>
			<c:forEach var="p" items="${presidentes}">
				<br>
				<label>
					<input type="radio" name="presidente" value="${p.id}">
					${p.nome}
				</label>
			</c:forEach>
			<br>
			<br>
			<h3>Governador:</h3>
			<c:forEach var="p" items="${governadores}">
				<br>
				<label>
					<input type="radio" name="governador" value="${p.id}">
					${p.nome}
				</label>
			</c:forEach>
			<br>
			<br>
			<h3>Prefeito:</h3>
			<c:forEach var="p" items="${prefeitos}">
				<br>
				<label>
					<input type="radio" name="prefeito" value="${p.id}">
					${p.nome}
				</label>
			</c:forEach>
			<br>
			<br>
			<h3>Senador:</h3>
			<c:forEach var="p" items="${senadores}">
				<br>
				<label>
					<input type="radio" name="senador" value="${p.id}">
					${p.nome}
				</label>
			</c:forEach>
			<br>
			<br>
			<h3>Vereador:</h3>
			<c:forEach var="p" items="${vereadores}">
				<br>
				<label>
					<input type="radio" name="vereador" value="${p.id}">
					${p.nome}
				</label>
			</c:forEach>
			<br>
			<br>
			<h3>Deputado Estadual:</h3>
			<c:forEach var="p" items="${deputadosEstaduais}">
				<br>
				<label>
					<input type="radio" name="deputadoEstadual" value="${p.id}">
					${p.nome}
				</label>
			</c:forEach>
			<br>
			<br>
			<h3>Deputado Federal:</h3>
			<c:forEach var="p" items="${deputadosFederais}">
				<br>
				<label>
					<input type="radio" name="deputadoFederal" value="${p.id}">
					${p.nome}
				</label>
			</c:forEach>
			<br>
			<br>
			<input type="submit"></input> <br>
			<input type="reset" value="Limpar Campos"></input>
		</form>
	</div>

</body>
</html>