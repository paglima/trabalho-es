<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
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
        <form action="cadastraAluno" class="register" method="post">
            <h1>Cadastro Aluno</h1>
            <fieldset class="row1">
                <legend>Detalhes do Cadastro</legend>
                <p>
                    <label>Email *</label><input type="text"  required="" name="email"/>
                    <label>Repita o email *</label><input type="text"/>
                </p>
                <p>
                    <label>Senha*</label>
                    <input type="text" name="senha" required=""/>
                    <label>Repita a senha*</label>
                    <input type="text"/>
                    <label class="obinfo">* Campos Obrigatórios</label>
                </p>
            </fieldset>
            <fieldset class="row2">
                <legend>Detalhes do Aluno</legend>
                <p>
                    <label>Nome *</label>
                    <input type="text" class="long" required="" name="nomeAluno" />
                </p>
                <p>
                    <label>Matricula *</label>
                    <input type="text" class="long" required="" name="matricula"/>
                </p>
            </fieldset>
            <fieldset class="row3">
                <legend>Curso</legend>
                <p>
                    <label>Nome *</label>
                    <input type="text" style="width:212px;font-size: 13px" class="long" name="nomeCurso"/>
                </p>
                <p>
                    <label>CHOb *</label>
                    <input style="width:212px;font-size: 13px" type="text" id="chob" class="long"/>
                </p>
                 <p>
                    <label>CHOpt *</label>
                    <input style="width:212px;font-size: 13px" type="text" id="chopt" class="long"/>
                </p>
                 <p>
                    <label>CHComp *</label>
                    <input style="width:212px;font-size: 13px" type="text" id="chcomp" class="long"/>
                </p>
            </fieldset>
            <fieldset class="row4">
                <a href="login" class="button">Voltar</a> 
            </fieldset>
            <div>
            	<input class="button" type="submit" value="Registre-se" />
            </div>
<!--             <button class="button">Register &raquo;</button> -->
        </form>
    </body>
</html>