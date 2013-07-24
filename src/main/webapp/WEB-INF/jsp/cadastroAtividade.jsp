<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="pt" lang="pt">
    <head>
        <title>CSS Registration Form</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" type="text/css" href="../css/cadastro.css"/>
        
        <link rel="stylesheet" href="../css/jquery/themes/smoothness/jquery.ui.core.css" />
		<link rel="stylesheet" href="../css/jquery/themes/smoothness/jquery.ui.datepicker.css" />
		<link rel="stylesheet" href="../css/jquery/themes/smoothness/jquery.ui.theme.css" />
		<link rel="stylesheet" href="../css/jquery/jquery-ui-timepicker-addon.css" />
        
        <script src="../JScript/jquery-1.9.1.js" type="text/javascript"></script>
        <script src="../JScript/ui/jquery.ui.core.min.js" type="text/javascript"></script>
        <script src="../JScript/ui/jquery-ui.custom.min.js"></script>
        <script src="../JScript/ui/jquery.ui.datepicker.min.js" type="text/javascript"></script>
        <script src="../JScript/ui/jquery-ui-timepicker-addon.js" type="text/javascript"></script>
        
        <script src="../JScript/ui/jquery.ui.widget.min.js" type="text/javascript"></script>
		<script src="../JScript/ui/i18n/jquery.ui.datepicker-pt-BR.min.js" type="text/javascript"></script>
		<script src="../JScript/ui/i18n/jquery-ui-timepicker-pt-BR.js" type="text/javascript" ></script>
		<script src="../JScript/script.js" type="text/javascript" ></script>
		
    </head>
    <body>    
    <input type="hidden" name="id" value="${id}"></input>
        <form action="../cadastraAtividade/${id}" class="register" method="post">
            <h1>Atividade -- ${id} </h1>
            <fieldset class="row1">
                <legend>Detalhes do Cadastro</legend>
                <p>
                    <label>Nota </label><input type="text" name="notaAtividade"/>
                    <label>Data/Hora</label><input type="text" name="dataAtividade" id="dataAtividade"/>
                </p>
                <p>
                    <label>Conteudo </label><input type="text" name="conteudoAtividade"/>
                    <label>Peso</label><input type="text" name="pesoAtividade"/>
                </p>
                <p>
                	<label>Tipo</label>
                    <select id="tipoAtividade" name="tipoAtividade" style="width:90px">
					  <option value="Prova">Prova</option>
					  <option value="Relatorio">Relatorio</option>
					  <option value="Trabalho">Trabalho</option>
					</select>
                </p>
            </fieldset>
           
            <div style="position:relative;left:600px;">
            	<input class="button" type="submit" value="Cadastrar" />
            </div>
<!--             <button class="button">Register &raquo;</button> -->
        </form>
    </body>
</html>