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
				<li><a href="<%out.print(request.getContextPath());%>/jsp/CadastrarCandidato.jsp">Cadastrar Candidato</a></li>
			</ul></li>
		<li><a>Alterar/Excluir Dados</a>
			<ul>
				<li><a href="<%out.print(request.getContextPath());%>/ListarEleitorAlterarServlet">Alterar/Excluir
						Dados Eleitor</a></li>
				<li><a href="<%out.print(request.getContextPath());%>/ListarCandidatoAlterarServlet">Alterar/Excluir
						Dados Candidato</a></li>
			</ul></li>
		<li><a href="<%out.print(request.getContextPath());%>/ListarEleitorVotarServlet">Votar</a></li>
		<li><a href="<%out.print(request.getContextPath());%>/ResultadoServlet">Resultado</a></li>
		<li><a>Dúvidas Frequentes</a>
			<ul>
				<li><a href="http://www.google.com.br">Como Cadastrar?</a></li>
				<li><a href="http://lmgtfy.com/?q=como+votar%3F">Como Votar?</a></li>
			</ul></li>
	</ul>
	<br>
	<br>
	<br>
	<h1 align="center">Alterar/Excluir Dados Candidato</h1>
		<div class="conteudo">
		<form action="<%out.print(request.getContextPath());%>/salvarCandidato" method="post">
			<input type="hidden" name="id" value="${candidato.id}">
			<label>Nome:<br>
				<input type="text" value="${candidato.nome}" name="nome"></input>
			</label>
			<label><br><br>Partido:<br>
				<input type="text" value="${candidato.partido}" name="partido"></input>
			</label>
			<label><br><br>Número:<br>
				<input type="text" value="${candidato.numero}" name="numero"></input>
			</label>
			<label><br><br>Escolaridade:<br>
				<input type="text" value="${candidato.escolaridade}" name="escolaridade"></input>
			</label>
			<label><br><br>Coligação:<br>
				<input type="text" value="${candidato.coligacao}" name="coligacao"></input>
			</label>
			<label><br><br>Data de Nascimento:<br>
				<input type="text" value="${candidato.dataNascimento}" name="data"></input>
			</label>
			<label><br><br>Naturalidade:<br>
				<input type="text" value="${candidato.naturalidade}" name="naturalidade"></input>
			</label>
			<br><br>
			Estado Civil:<br> <br> <label for="solteiro">
				<input type="radio" name="estado_civil" id="solteiro"
				value="SOLTEIRO" checked="checked"> Solteiro(a)
			</label><br> <label for="casado"> <input type="radio"
				name="estado_civil" id="casado" value="CASADO"> Casado(a)
			</label> 
			<input type="hidden" name="cargo" value="none">
			<br><br><input type="submit" value="Atualizar"></input>
			<br><input type="reset" value="Limpar Campos"></input>
			<br>
		</form>
		<form action="<%out.print(request.getContextPath());%>/ExcluirCandidatoServlet" method="get">
			<input type="hidden" name="id" value="${candidato.id}">
			<input type="submit" value="Excluir Registro"></input>
		</form>
		</div>

</body>
</html>