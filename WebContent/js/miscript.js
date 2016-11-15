/**
 * 
 */

$(document).ready(function() {
	
	$('form').hide();

	$('#botontarjeta').on("click", function() {
		$('#formulariotarjeta').toggle('slow');

	});

	$('#botonefectivo').on("click", function() {
		$('#formularioefectivo').toggle('slow');

	});
	

	$('#botondiesel0').on("click", function() {
		$('.formulariogasolinaA').toggle('slow');

	});
	
	$('#botondiesel1').on("click", function() {
		$('.formulariodiesel1').toggle('slow');

	});
	
	$('#botongasolina0').on("click", function() {
		$('.formulariogasolina0').toggle('slow');

	});
	$('#botongasolina1').on("click", function() {
		$('.formulariogasolina1').toggle('slow');

	});

});