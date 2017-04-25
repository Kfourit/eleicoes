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
	<div class="conteudo">
		<form action="<%out.print(request.getContextPath());%>/salvarEleitor" method="post">
			<input type="hidden" name="id" value="${eleitor.id}">
			<label>Nome:<br> <input type="text"
				value="${eleitor.nome}" name="nome"></input>
			</label> <label><br> <br>CPF:<br> <input type="text"
				value="${eleitor.cpfEleitor}" name="cpf"></input> </label> <label><br> <br>RG:<br>
				<input type="text" value="${eleitor.rg_eleitor}" name="rg"></input> </label> <label><br>
				<br>Nome da mãe:<br> <input type="text"
				value="${eleitor.nomeMaeEleitor}" name="nome da mae"></input> </label> <label><br>
				<br>Naturalidade:<br> <input type="text"
				value="${eleitor.naturalidade}" name="naturalidade"></input> </label> <label><br> <br>Data
				de Nascimento:<br> <input type="text"
				value="${eleitor.dataNascimento}" name="data"></input> </label> <label><br>
				<br>Número do Título:<br> <input type="text"
				value="${eleitor.inscricao}" name="titulo"></input> </label> <br> <br> Estado
			Civil:<br> <br> <label for="solteiro"> <input
				type="radio" name="estado_civil" id="solteiro" value="SOLTEIRO"
				checked="checked"> Solteiro(a)
			</label><br> <label for="casado"> <input type="radio"
				name="estado_civil" id="casado" value="CASADO"> Casado(a)
			</label> <br> <br> <input type="submit" value="Atualizar"></input>
			<br> <input type="reset" value="Limpar Campos"></input> <br>

		</form>
		<form
			action="<%out.print(request.getContextPath());%>/ExcluirEleitorServlet"
			method="get">
			<input type="hidden" name="id" value="${eleitor.id}">
			<input type="submit" value="Excluir Registro"></input>	
		</form>
	</div>

</body>
</html>