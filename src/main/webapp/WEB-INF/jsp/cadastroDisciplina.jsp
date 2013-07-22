<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="pt" lang="pt">
    <head>
        <title>CSS Registration Form</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" type="text/css" href="css/cadastro.css"/>
        
        <link rel="stylesheet" href="css/jquery/themes/smoothness/jquery.ui.core.css" />
		<link rel="stylesheet" href="css/jquery/themes/smoothness/jquery.ui.datepicker.css" />
		<link rel="stylesheet" href="css/jquery/themes/smoothness/jquery.ui.theme.css" />
		<link rel="stylesheet" href="css/jquery/jquery-ui-timepicker-addon.css" />
        
        <script src="JScript/jquery-1.9.1.js" type="text/javascript"></script>
        <script src="JScript/ui/jquery.ui.core.min.js" type="text/javascript"></script>
        <script src="JScript/ui/jquery-ui.custom.min.js"></script>
        <script src="JScript/ui/jquery.ui.datepicker.min.js" type="text/javascript"></script>
        <script src="JScript/ui/jquery-ui-timepicker-addon.js" type="text/javascript"></script>
        
        <script src="JScript/ui/jquery.ui.widget.min.js" type="text/javascript"></script>
		<script src="JScript/ui/i18n/jquery.ui.datepicker-pt-BR.min.js" type="text/javascript"></script>
		<script src="JScript/ui/i18n/jquery-ui-timepicker-pt-BR.js" type="text/javascript" ></script>
		<script src="JScript/script.js" type="text/javascript" ></script>
		
    </head>
    <body>    
        <form:form action="cadastroDisciplina" class="register" method="post" commandName="disciplina">
            <h1>Cadastro Disciplina</h1>
            <fieldset class="row1">
                <legend>Detalhes do Cadastro</legend>
                
                <p>
                    <label>Nome Disciplina</label>
                    <form:input name="senha" path="nome"/>
                    <label>Nome Professor</label>
                    <form:input name="senha" path="nomeProfessor"/>
                </p>
            </fieldset>
            <fieldset class="row2">
                <legend>Detalhes do Aluno
                </legend>
                <p>
                    <label>Nome *</label>
                    <input type="text" class="long" name="nomeAluno"/>
                </p>
                <p>
                    <label>Matricula *</label>
                    <input type="text" class="long" name="matricula"/>
                </p>
                <p>
                	<label>Curso *
                    </label>
                    <input type="text" class="long" name="curso"/>
                </p>
            </fieldset>
            <fieldset class="row3">
                <legend>Outras Informações</legend>
                <p>
                    <label>Sexo *</label>
                    <input type="radio" value="radio"/>
                    <label class="gender">Male</label>
                    <input type="radio" value="radio"/>
                    <label class="gender">Female</label>
                </p>
                <p>
                    <label>Data de Nasc. *</label>
                    <input style="width:212px;font-size: 13px" type="text" id="dataNasc" class="long"/>
                </p>
            </fieldset>
            <fieldset class="row4">
                <legend>Terms and Mailing</legend>
                <a href="<c:url value="j_spring_security_logout" />" class="button">Logout</a> 
            </fieldset>
            
            <input class="button" type="submit" value="Registre-se" />
            <a href="listaDisciplinas">Cadastre-se!</a>
<!--             <button class="button">Register &raquo;</button> -->
        </form:form>
    </body>
</html>