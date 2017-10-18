$(document).ready(function () {


  $('html, body').scrollTop(0);

  /* Login */

  $('.img-down').on('click', function(){
    $('.menu-init').slideToggle(500);
  });

  var login = $('.send-login');
  var socio = false;
  var password = false;
  var check_campo = false;
  var check_pass = false;
  login.on('click', function(e){
    e.preventDefault();
    var num_socio = $('#numero-socio').val();
    var password_input = $('#contrasena').val();

    if(num_socio !== ''){
      socio = true;
      check_campo = false;
      $('#numero-socio').removeClass('error');
      $('.socio-error').remove();
    }else{
      socio = false;
      $('#numero-socio').addClass('error');
      if(!check_campo){
        $('#numero-socio').after('<div id="error-field" class="socio-error"><p>Número inválido</p></div>');
        check_campo = true;
      }
    }

    if(password_input !== ''){
      password = true;
      check_pass = false;
      $('#contrasena').removeClass('error');
      $('.pass-error').remove();
    }else{
      password = false;
      if(!check_pass){
        $('#contrasena').addClass('error');
        $('#contrasena').after('<div id="error-field" class="pass-error"><p>Contraseña incorrecta</p></div>');
        check_pass = true;
      }
    }

    if(socio && password){
      alert('check num socio and password');
    }

  });

  var solicitar = $('#new-password');
  var olvido = $('#forgot-password');
  var regresar = $('.back');

  solicitar.on('click', function(e){
    e.preventDefault();
    $('#inicio-sesion').fadeOut(300);
    setTimeout(function(){
      $('#solicitud-contrasena').fadeIn(300);
    },300);
  });

  olvido.on('click', function(e){
    e.preventDefault();
    $('#inicio-sesion').fadeOut(300);
    setTimeout(function(){
      $('#olvido-contrasena').fadeIn(300);
    },300);
  });

  regresar.on('click', function(e){
    e.preventDefault();
    $('#solicitud-contrasena, #olvido-contrasena').fadeOut(300);
    setTimeout(function(){
      $('#inicio-sesion').fadeIn(300);
    },300);
  });


  var boton_solicitar = $('#btn-solicitar');

  boton_solicitar.on('click', function(e){
    e.preventDefault();
    $('#solicitud-contrasena').fadeOut(300);
    setTimeout(function(){
      $('#fin-solicitud').fadeIn(300);
    },300);
  });

  $('#modal-login .closeModal').on('click', function(){
    $('#inicio-sesion').show(500);
    $('#solicitud-contrasena, #olvido-contrasena').hide(500);
    $('.input-login').removeClass('error');
    $('.socio-error, .pass-error').remove();
  });

  $('#search #habitaciones input').val('2 habitaciones - 4 adultos ');

  /* Ramdom img home */
  var number = 1 + Math.floor(Math.random() * 10);
  $('.content-home').css('background',"url('../cc4-web/static/img/Home/home-background"+number+".jpg') repeat scroll center center / cover");

  /* Search habitacion */
  var habitaciones = 1;
  var habitaciones_finales = 1;
  var adultos_finales = 0;
  var ninos_finales = 0;

  $('#habitacion-input').on('click', function(){
    $('#search').addClass('searching');
    $('#search #habitaciones').addClass('released');
    $('#search #habitaciones input').val(habitaciones_finales);
    habitaciones = $('#search #habitaciones input').val();
  });

  $('#search #entrada input, #search #salida input').on('click', function(){
    $('#search').removeClass('searching');
    $('#search #habitaciones').removeClass('released');
  });

  $('.spinnerIncrease').on('click', function(e){
    e.preventDefault();
    if(habitaciones < 4){
    habitaciones++;
    $('#search #habitaciones input').val(habitaciones);
    $('.finalizar-btn').before('<div id="habitacion'+habitaciones+'" class="habitacion"><div class="num-habitacion"><p>Habitación <span>'+habitaciones+'</span></p></div><div class="num-personas"><p>2 Adultos - 0 niños</p><div class="input-habitacion adultos"><p>Adultos</p><span class="num-adultos_'+habitaciones+'">2</span><a class="IncreaseAdultos" data-habitacion="adultos_'+habitaciones+'" href=""></a><a class="DecreaseAdultos" data-habitacion="adultos_'+habitaciones+'" href=""></a></div><div class="input-habitacion ninos"><p>Niños</p><span class="num-ninos_'+habitaciones+'">0</span><a class="IncreaseNinos" data-habitacion="ninos_'+habitaciones+'" href=""></a><a class="DecreaseNinos" data-habitacion="ninos_'+habitaciones+'" href=""></a></div></div></div>');
    }

  });

  $('.spinnerDecrease').on('click', function(e){
    e.preventDefault();
    if(habitaciones > 1){
      habitaciones--;
      $('#search #habitaciones input').val(habitaciones);
      $('.habitacion:last').remove();
    }
  });

  /* Numero de personas */
  $(document).on('click', '.habitacion', function(){
    $(this).addClass('active');
  });

  var adultos, ninos;
  $(document).on('click', '.IncreaseAdultos', function(e){
    e.preventDefault();

    var actual_habitacion = $(this).attr('data-habitacion');
    adultos = $('.num-'+actual_habitacion+'').text();
    adultos++;
    $('.num-'+actual_habitacion+'').html(adultos);
  });

  $(document).on('click', '.DecreaseAdultos', function(e){
    e.preventDefault();
    if(adultos > 2){
      var actual_habitacion = $(this).attr('data-habitacion');
      adultos = $('.num-'+actual_habitacion+'').text();
      adultos--;
      $('.num-'+actual_habitacion+'').html(adultos);
    }
  });

  $(document).on('click', '.IncreaseNinos', function(e){
    e.preventDefault();
    var actual_habitacion = $(this).attr('data-habitacion');
    ninos = $('.num-'+actual_habitacion+'').text();
    ninos++;
    $('.num-'+actual_habitacion+'').html(ninos);
  });

  $(document).on('click', '.DecreaseNinos', function(e){
    e.preventDefault();
    if(ninos > 0){
      var actual_habitacion = $(this).attr('data-habitacion');
      ninos = $('.num-'+actual_habitacion+'').text();
      ninos--;
      $('.num-'+actual_habitacion+'').html(ninos);
    }
  });

  /* Fin habitaciones */

  $('.finalizar-btn').on('click', function(e){
    e.preventDefault();
    habitaciones_finales = $('#search #habitaciones input').val();
    for(i=1; i<=habitaciones_finales; i++){
      adultosbox = parseInt( $(".open-box").children(".habitacion").find('.num-adultos_'+i+'').html() );
      ninosbox = parseInt( $(".open-box").children(".habitacion").find('.num-ninos_'+i+'').html() );
      ninos_finales = ninosbox+ninos_finales;
      adultos_finales = adultosbox+adultos_finales;
    }
    $('#search').removeClass('searching');
    $('#search #habitaciones').removeClass('released');
    $('#search #habitaciones input').val(''+habitaciones_finales+' habitaciones - '+adultos_finales+' adultos - '+ninos_finales+' niño(s)');
    ninos_finales = 0;
    adultos_finales = 0;
  });


  ( function( factory ) {
	if ( typeof define === "function" && define.amd ) {

		// AMD. Register as an anonymous module.
		define( [ "../widgets/datepicker" ], factory );
	} else {

		// Browser globals
		factory( jQuery.datepicker );
	}
}( function( datepicker ) {

datepicker.regional.es = {
	closeText: "Cerrar",
	prevText: "Anterior",
	nextText: "Siguiente",
	currentText: "Hoy",
	monthNames: [ "Enero","Febrero","Marzo","Abril","Mayo","Junio",
	"Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre" ],
	monthNamesShort: [ "ene","feb","mar","abr","may","jun",
	"jul","ago","sep","oct","nov","dic" ],
	dayNames: [ "Domingo","Lunes","Martes","Miércoles","Jueves","Viernes","Sábado" ],
	dayNamesShort: [ "dom","lun","mar","mié","jue","vie","sáb" ],
	dayNamesMin: [ "D","L","M","M","J","V","S" ],
	weekHeader: "Sm",
	dateFormat: "dd/mm/yy",
	firstDay: 1,
	isRTL: false,
	showMonthAfterYear: false,
	yearSuffix: "" };
datepicker.setDefaults( datepicker.regional.es );

return datepicker.regional.es;

} ) );

  var dateToday = new Date();

  var dateTomorrow = dateToday.getDate() + 1;

  var $datepicker = $('#datepicker-entrada');
  $datepicker.datepicker({
    minDate: 0,
    dateFormat: 'mm/dd/yy',
    onClose: function (selectedDate) {
      var minDate2 = new Date(selectedDate);
      minDate2.setDate(minDate2.getDate() + 1);
      $("#datepicker-salida").datepicker("option", "minDate", minDate2);
    }
  });
  $datepicker.datepicker('setDate', new Date());

  var $datepicker1 = $('#datepicker-salida');
  $datepicker1.datepicker({
    minDate: 1,
    dateFormat: 'mm/dd/yy',
    onClose: function (selectedDate) {
      $("#datepicker-entrada").datepicker("option", "maxDate", selectedDate);
    }
  });
  $datepicker1.datepicker('setDate', "1");


/* mobile */
$('#menuToggle input').on('click', function(e){
  $('#menuToggle').toggleClass('active');
  $('body').toggleClass('open-menu-mobile');
});

$('.container-main, .footer-fix').on('click', function(){
  if($("body").hasClass('open-menu-mobile')){
    $('body').removeClass('open-menu-mobile');
    $('#menuToggle').removeClass('active');
  }
});


  /* Footer menu */
  $('.toggle').on('click', function(e){
    e.preventDefault();
    $('footer .wrapper').toggleClass('visible');
    $('.toggle-footer').toggleClass('active');
  });

  /* auto complete */
  var availableTags = [
  "Cancun",
  "Ciudad de México",
  "Acapulco",
  "Veracruz",
  "Baja California",
  "Los cabos",
  "Guadalajara",
  "Monterrey",
  "Chetumal",
  "Chiapas",
  "Chihuahua",
];
$( "#destino input" ).autocomplete({
  source: availableTags
});

var availableTags1 = [
"Cancun",
"Ciudad de México",
"Acapulco",
"Veracruz",
"Baja California",
"Los cabos",
"Guadalajara",
"Monterrey",
"Chetumal",
"Chiapas",
"Chihuahua",
];
$( ".habitaciones .destino-input, .destinos .destino-input" ).autocomplete({
source: availableTags1
});

$('.selection-map').on('click', function(){
  $('.selection-map').removeClass('selected');
  $(this).addClass('selected');
});

/* Validar la busqueda */
$('#buscar').on('click', function(e){
  e.preventDefault();
  var destino = $('#destino input').val();
  if(destino === '' || destino === undefined){
    $('#destino').addClass('error');
    $('#destino').append('<div id="error-field"><span></span><p>Por favor elija un destino.</p></div>');
  }
});

$('#destino input').keyup(function() {
  if($('#destino').hasClass('error')){
    $('#destino').removeClass('error');
    $('#error-field').remove();
  }
});


/*************** PAGINA HABITACIONES *****************************/

/* Add height size container */
var height_menu = $('.main_menu').height();
var height_busqueda = $('.trip-description').height();
var height_window = $("body").innerHeight();

var height_container =  height_window - height_busqueda - height_menu;
$('#content-carousel').height(height_container);

var height_content = $('.content-menu').height();

$('#map-ubicacion').height(height_content);


home_page_size();
$(window).bind('resize', function (){
  home_page_size();
});

function home_page_size(){

var height_menu = $('.main_menu').height();
var height_busqueda = $('.trip-description').height();
var height_window = $("body").innerHeight();
var window_width = $('body').width();
var height_container =  height_window - height_busqueda - height_menu;
if(window_width >= 768){
  $('#content-carousel').height(height_container);
}else{
  $('#content-carousel').css('height','auto');
  $("#datepicker").datepicker("option", "numberOfMonths", 1);
  $("#datepicker1").datepicker("option", "numberOfMonths", 1);
}
}

var mySwiper = new Swiper ('.swiper-restaurantes', {
    // Optional parameters
    direction: 'horizontal',
    loop: true,
    // Navigation arrows
    nextButton: '.swiper-button-next',
    prevButton: '.swiper-button-prev',
    autoplay: 4000
  });

    $('.swiper-mob').slick({
      arrows: false,
        centerMode: true,
        centerPadding: '40px',
        slidesToShow: 1
  });

  var activo = 0;
  var actual = 'habitaciones';
  $('.content-menu:nth-child(1)').show();
  $('#menu-hotel ul li').on('click', function(e){
    e.preventDefault();
    $('#menu-hotel ul li').removeClass('active');
    $(this).addClass('active');
    var slide = $(this).attr('data-content');
    var window_width = $('body, html').width();
    if(slide === 'ubicacion' && activo === 0){
      activo = 1;
      setTimeout(initMap,500);
    }
    if(slide === 'servicios' && window_width <= 768){
      setTimeout(initSwiper,500);
    }
      if(actual !== slide){
        actual = slide;
      $('.content-menu').fadeOut(300);
      setTimeout(function(){
        $('#'+slide+'-tab').fadeIn(300);
      },300);
      }

  });

    function initSwiper(){
      var mySwiper2 = new Swiper ('.swiper-restaurantes-mob', {
      // Optional parameters
      direction: 'horizontal',
      loop: true,
      autoplay: 3000,
      // If we need pagination
      pagination: '.swiper-pagination',
      nextButton: '.swiper-button-next',
      prevButton: '.swiper-button-prev',
    });

    }

  /* Habitaciones acordeon */
  var nuevo;
  $('.titulos').on('click', function(){
    var data = $(this).attr('data-habitacion');

    switch (data) {
      case 'deluxe':
          $('.habitaciones .contents #deluxe-room .price').toggleClass('invisible');
        break;
      case 'junior':
          $('.habitaciones .contents #junior-suite .price').toggleClass('invisible');
        break;
      case 'master':
          $('.habitaciones .contents #master-suite .price').toggleClass('invisible');
        break;
      case 'junior1':
          $('.habitaciones .contents #junior1-suite .price').toggleClass('invisible');
        break;
    }
    $('#'+data+'-content').slideToggle(500);
    nuevo = data;

  });


  var habitaciones_number = 2;
  var switch_habt1 = true;
  var switch_habt2 = true;
  var prendido = false;
  var prendido1 = false;
  var actual_habt;
  var actual_habt1;
  var tipo_habt = 'deluxe-room';
  var tipo_habt2;

  $('.count-habitacion').on('click', function(){
    var numero_habitacion = $(this).attr('data-number');
    var tipo_habitacion = $(this).attr('data-select');


    switch (numero_habitacion) {
      case '1':
        $('.habt1').removeClass('filled');
        $(this).addClass('filled');

        if(switch_habt1){
          $(this).addClass('filled');
          switch_habt1 = false;
          habitaciones_number--;
          $('#'+tipo_habitacion+'').addClass('seleccionado');
        }else{
          if(actual_habt === tipo_habitacion){
            $(this).removeClass('filled');

            if($('#'+actual_habt+' .count-habitacion').hasClass('filled')){

            }else{
              $('#'+actual_habt+'').removeClass('seleccionado');
            }
            habitaciones_number++;
            switch_habt1 = true;
          }
        }

        if(tipo_habt !== tipo_habitacion){
          if($('#'+tipo_habt+' .count-habitacion').hasClass('filled')){

          }else{
            $('#'+tipo_habt+'').removeClass('seleccionado');
          }

          $('#'+tipo_habitacion+'').addClass('seleccionado');
        }else{

        }
        tipo_habt = tipo_habitacion;
        actual_habt = tipo_habitacion;
        checkHabitacion();
      break;
      case '2':
        $('.habt2').removeClass('filled');
        $(this).addClass('filled');

        if(switch_habt2){
          $(this).addClass('filled');
          switch_habt2 = false;
          habitaciones_number--;
        }else{
          if(actual_habt1 === tipo_habitacion){
            $(this).removeClass('filled');
            if($('#'+actual_habt1+' .count-habitacion').hasClass('filled')){

            }else{
              $('#'+actual_habt1+'').removeClass('seleccionado');
            }
            habitaciones_number++;
            switch_habt2 = true;
          }
        }

        if(tipo_habt2 !== tipo_habitacion){
          if($('#'+tipo_habt2+' .count-habitacion').hasClass('filled')){

          }else{
            $('#'+tipo_habt2+'').removeClass('seleccionado');
          }

          $('#'+tipo_habitacion+'').addClass('seleccionado');
        }else{

        }
        tipo_habt2 = tipo_habitacion;
        actual_habt1 = tipo_habitacion;
        checkHabitacion();
      break;
      case '3':
        $('.habt3').removeClass('filled');
        $(this).toggleClass('filled');
        //habitaciones_number--;
      break;
      case '4':
        $('.habt4').removeClass('filled');
        $(this).toggleClass('filled');
        //habitaciones_number--;
      break;

    }

    function checkHabitacion(){
      if(habitaciones_number === 0){
        $('.habitaciones #reservar-btn, .habitaciones #reservar-btn-mob').addClass('activo');
      }else{
        $('.habitaciones #reservar-btn-mob, .habitaciones #reservar-btn').removeClass('activo');
      }
    }
  });

  $('#reservar-btn, #reservar-btn-mob').on('click', function(e){
    e.preventDefault();
    if($('.habitaciones #reservar-btn, .habitaciones #reservar-btn-mob').hasClass('activo')){
      $('#modal-puntos').modal('show');
    }
  });

  $('.habitaciones #modal-puntos .closeModal, .habitaciones #modal-puntos #regresar').on('click', function(e){
    e.preventDefault();
    $('#modal-puntos').modal('hide');
  });
  /* Seleccionar una habitacion */
  /*$('.count-habitacion').on('click', function(){
    var tipo_habitacion = $(this).attr('data-select');
    var numero_habitacion = $(this).attr('data-number');


    if(habitaciones_number !== 0){
      $('#'+tipo_habitacion+'').addClass('seleccionado');
      $(this).toggleClass('filled');
      if($(this).hasClass('filled')){
        habitaciones_number--;
      }else{
        habitaciones_number++;
      }
    }else{
      if($(this).hasClass('filled')){
        habitaciones_number++;
        $(this).removeClass('filled');
      }
    }
    if(!$('#'+tipo_habitacion+' .count-habitacion').hasClass('filled')){
      $('#'+tipo_habitacion+'').removeClass('seleccionado');
    }
  });*/

  /* Seleccionar un restaurante*/
  $('.habitaciones .contents #selection-restaurant ul li').on('click', function(e){
    e.preventDefault();
    $('.habitaciones .contents #selection-restaurant ul li').removeClass('visible');
    $(this).addClass('visible');
    var restaurant = $(this).attr('id');
    $('.content-restaurant').hide();
    $('#'+restaurant+'-description').show();
  });

  /* Seleccionar un servicio */
  $('.titles-servicios').on('click', function(){
    var actual = $(this).attr('id');
    $('#'+actual+'-content').slideToggle();
  });

  /* Cambiar busqueda */
  var modal = $('.change-trip');
  var close = $('.closeModal');
  var preview = $('.preview span');
  var regresar = $('.icon');

  $('.change-trip-mob, .change-trip').on('click', function(e){
    e.preventDefault();
    //$('body').append('<div class="modal-backdrop fade"></div>');
    $('#modal-busqueda').show('fade',200, function(){
      //$('#modal-busqueda').addClass('scale');
      $('body, html').addClass('modal-open');
      //$( "#datepicker" ).datepicker();
    });
  });

  close.on('click', function(){
    //$('#modal-busqueda').removeClass('scale');
    $('#modal-busqueda').hide('fade',200);
    $('body, html').removeClass('modal-open');
    //$('.modal-backdrop').remove();
  });


  var arrayMonths = ['Enero','Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];
  var weekday = ["Domingo","Lunes","Martes","Miercoles","Jueves","Viernes", "Sabado"];
  var $datepicker_cambio;
  var $datepicker_cambio1;
  var window_width = $('body').width();
  $('#date_entrada').on('click', function(){
    $('#llegada-busqueda').addClass('activo');
    $('.habitaciones .spinner-habitacion, .habitaciones .habitaciones-content').hide();
    $datepicker_cambio = $('#datepicker');
    $datepicker_cambio1 = $('#datepicker1');
    $datepicker_cambio.show();
    $datepicker_cambio1.hide();
    $datepicker_cambio.datepicker({
      minDate: 0,
      dateFormat: 'mm/dd/yy',
      numberOfMonths: 2,
      onSelect: function(selectedDate) {
        $('#llegada-busqueda').removeClass('activo');
        $datepicker_cambio.hide();
        var minDate2 = new Date(selectedDate);
        var day = minDate2.getDate();
        var month = arrayMonths[minDate2.getMonth()];
        var dayName = weekday[minDate2.getDay()];
        var year = minDate2.getFullYear();
        $('#date_entrada .day-div p').html(day);
        $('#date_entrada .month-div p').html(month + ' ' + year);
        $('#date_entrada .dayName-div p').html(dayName);
        minDate2.setDate(minDate2.getDate() + 1);
        $('#date_salida .day-div p').html(day + 1);
        $('#date_salida .month-div p').html(month + ' ' + year);
        $('#date_salida .dayName-div p').html(weekday[minDate2.getDay()]);
        $('#salida-busqueda').addClass('activo');
        $datepicker_cambio1 = $('#datepicker1');
        $datepicker_cambio1.show();
        $datepicker_cambio1.datepicker({
          minDate: 0,
          dateFormat: 'mm/dd/yy',
          numberOfMonths: 2,
          onSelect: function(selectedDate) {
            $datepicker_cambio1.hide();
            var minDate2 = new Date(selectedDate);
            var day = minDate2.getDate();
            var month = arrayMonths[minDate2.getMonth()];
            var dayName = weekday[minDate2.getDay()];
            var year = minDate2.getFullYear();
            $('#date_salida .day-div p').html(day);
            $('#date_salida .month-div p').html(month + ' ' + year);
            $('#date_salida .dayName-div p').html(weekday[minDate2.getDay()]);
            $('#salida-busqueda').removeClass('activo');
            $('.habitaciones .spinner-habitacion, .habitaciones .habitaciones-content').show();
          }
        });
        if(window_width <= 768){
          $datepicker_cambio1.datepicker("option", "numberOfMonths", 1);
        }
        $datepicker_cambio1.datepicker("option", "minDate", minDate2);
      }
    });
    if(window_width <= 768){
      $datepicker_cambio.datepicker("option", "numberOfMonths", 1);
    }
  });





  $('#date_salida').on('click', function(){
    $datepicker_cambio.hide();
    $datepicker_cambio1.show();
  });

  /* Spinner modal */
  $('.spinnerIncreaseModal').on('click', function(e){
    e.preventDefault();
    if(habitaciones < 4){
    habitaciones++;
    $('#habitacion-input-modal').html(habitaciones);
    $('.habitaciones-content').append('<div id="habitacion_modal'+habitaciones+'" class="habitacion-modal"><p class="habitacion-num">Habitacion <span>'+habitaciones+'</span></p><div class="adultos-modal"><p class="name-input">Adultos</p><span class="input-num-personas num_adulto_'+habitaciones+'">2</span><a href="" class="increaseModalAdultos" data-habitacion="adulto_'+habitaciones+'"></a><a href="" class="decreaseModalAdultos" data-habitacion="adulto_'+habitaciones+'"></a></div><div class="ninos-modal"><p class="name-input">Niños</p><span class="input-num-personas num_nino_'+habitaciones+'">0</span><a href="" class="increaseModalNinos" data-habitacion="nino_'+habitaciones+'"></a><a href="" class="decreaseModalNinos" data-habitacion="nino_'+habitaciones+'"></a></div></div>');
    }

  });

  $('.spinnerDecreaseModal').on('click', function(e){
    e.preventDefault();
    if(habitaciones > 1){
      habitaciones--;
      $('#habitacion-input-modal').html(habitaciones);
      $('.habitacion-modal:last').remove();
    }
  });

  var adultos1, ninos1;
  $(document).on('click', '.increaseModalAdultos', function(e){
    e.preventDefault();
    var actual_habitacion = $(this).attr('data-habitacion');
    adultos1 = $('.num_'+actual_habitacion+'').text();
    adultos1++;
    $('.num_'+actual_habitacion+'').html(adultos1);
  });

  $(document).on('click', '.decreaseModalAdultos', function(e){
    e.preventDefault();
    if(adultos1 > 1){
      var actual_habitacion = $(this).attr('data-habitacion');
      adultos1 = $('.num_'+actual_habitacion+'').text();
      adultos1--;
      $('.num_'+actual_habitacion+'').html(adultos1);
    }
  });

  $(document).on('click', '.increaseModalNinos', function(e){
    e.preventDefault();
    var actual_habitacion = $(this).attr('data-habitacion');
    ninos1 = $('.num_'+actual_habitacion+'').text();
    ninos1++;
    $('.num_'+actual_habitacion+'').html(ninos1);
  });

  $(document).on('click', '.decreaseModalNinos', function(e){
    e.preventDefault();
    if(ninos1 > 0){
      var actual_habitacion = $(this).attr('data-habitacion');
      ninos1 = $('.num_'+actual_habitacion+'').text();
      ninos1--;
      $('.num_'+actual_habitacion+'').html(ninos1);
    }
  });

  /* Destinos */
  $("#select-ordenar li").on('click',function(e){
    e.preventDefault();
      if(!$(this).hasClass('current')){
        $("#select-ordenar li").removeClass('current');
        $(this).addClass('current');
      }
  });


  if(window_width <= 768){
    var height_cont = $('.pts-description').height();
    $('.content-hotel-img').height(height_cont + 20);
  }



  function initMap() {
    var uluru = {lat: 20.633138, lng: -87.067346};
    map = new google.maps.Map(document.getElementById('map-ubicacion'), {
      zoom: 15,
      center: uluru
    });

    // InfoWindow content
  var content = '<div id="iw-container">' +
                '<p>Live Aqua Boutique Resort</p>' +
                '<p>Playa del Carmen</p>'+
                '<div class="rating-map">'+
                '<i class="fa fa-star"></i>'+
                '<i class="fa fa-star"></i>'+
                '<i class="fa fa-star"></i>'+
                '<i class="fa fa-star"></i>'+
                '<i class="fa fa-star no-rating"></i>'+
                '</div>'+
                '<p id="direccion-map">5a Avenida esquina Calle 32, Playa del Carmen, Quintana Roo, México.</p>'+
                '</div>';

    var infowindow = new google.maps.InfoWindow({
      content: content,
      maxWidth: 270
    });
    var image = 'images/Mapa/marcador.png';
    var marker = new google.maps.Marker({
      position: uluru,
      map: map,
      title: 'Uluru (Ayers Rock)',
      icon: image
    });
    marker.addListener('click', function() {
      infowindow.open(map, marker);
    });

    var styles = [
      {
        "featureType": "all",
        "elementType": "labels.text.fill",
        "stylers": [
          {
            "saturation": 36
          },
          {
            "color": "#333333"
          },
          {
            "lightness": 40
          }
        ]
      },
      {
        "featureType": "all",
        "elementType": "labels.text.stroke",
        "stylers": [
          {
            "visibility": "on"
          },
          {
            "color": "#ffffff"
          },
          {
            "lightness": 16
          }
        ]
      },
      {
        "featureType": "all",
        "elementType": "labels.icon",
        "stylers": [
          {
            "visibility": "off"
          }
        ]
      },
      {
        "featureType": "administrative",
        "elementType": "geometry.fill",
        "stylers": [
          {
            "color": "#fefefe"
          },
          {
            "lightness": 20
          }
        ]
      },
      {
        "featureType": "administrative",
        "elementType": "geometry.stroke",
        "stylers": [
          {
            "color": "#fefefe"
          },
          {
            "lightness": 17
          },
          {
            "weight": 1.2
          }
        ]
      },
      {
        "featureType": "landscape",
        "elementType": "geometry",
        "stylers": [
          {
            "color": "#f5f5f5"
          },
          {
            "lightness": 20
          }
        ]
      },
      {
        "featureType": "poi",
        "elementType": "geometry",
        "stylers": [
          {
            "color": "#f5f5f5"
          },
          {
            "lightness": 21
          }
        ]
      },
      {
        "featureType": "poi.park",
        "elementType": "geometry",
        "stylers": [
          {
            "color": "#dedede"
          },
          {
            "lightness": 21
          }
        ]
      },
      {
        "featureType": "road.highway",
        "elementType": "geometry.fill",
        "stylers": [
          {
            "color": "#ffffff"
          },
          {
            "lightness": 17
          }
        ]
      },
      {
        "featureType": "road.highway",
        "elementType": "geometry.stroke",
        "stylers": [
          {
            "color": "#ffffff"
          },
          {
            "lightness": 29
          },
          {
            "weight": 0.2
          }
        ]
      },
      {
        "featureType": "road.arterial",
        "elementType": "geometry",
        "stylers": [
          {
            "color": "#ffffff"
          },
          {
            "lightness": 18
          }
        ]
      },
      {
        "featureType": "road.local",
        "elementType": "geometry",
        "stylers": [
          {
            "color": "#ffffff"
          },
          {
            "lightness": 16
          }
        ]
      },
      {
        "featureType": "transit",
        "elementType": "geometry",
        "stylers": [
          {
            "color": "#f2f2f2"
          },
          {
            "lightness": 19
          }
        ]
      },
      {
        "featureType": "water",
        "elementType": "geometry",
        "stylers": [
          {
            "color": "#e9e9e9"
          },
          {
            "lightness": 17
          }
        ]
      },
      {
        "featureType": "water",
        "elementType": "geometry.fill",
        "stylers": [
          {
            "color": "#72b1c8"
          },
          {
            "gamma": "3.53"
          }
        ]
      }
    ];

    map.setOptions({styles: styles});
  }

  /* Habitaciones1 */
  var galleryTop = new Swiper('.gallery-top', {
      nextButton: '.swiper-button-next',
      prevButton: '.swiper-button-prev',
      direction: 'vertical',
      spaceBetween: 10,
  });
  var galleryThumbs = new Swiper('.gallery-thumbs', {
      spaceBetween: 10,
      centeredSlides: true,
      slidesPerView: 'auto',
      touchRatio: 0.2,
      direction: 'vertical',
      slideToClickedSlide: true,
  });
  galleryTop.params.control = galleryThumbs;
  galleryThumbs.params.control = galleryTop;


});
