$(document).ready(function() {
	$("#dataNasc").datepicker();
	$("#dataAtividade").datetimepicker({
		timeFormat: 'HH:mm:ss',
		stepMinute: 5,
		stepSecond: 10
		
	});	
});