    <div id="modal-busqueda" class="modal fade">
      <div class="modal-color"></div>
      <span class="closeModal"></span>
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-body">
            <p class="destino-modal">Destino</p>
            <input placeholder="Ingresa un hotel o ciudad" class="ui-autocomplete-input destino-input" autocomplete="off" type="text">
            <div id="calendar-busqueda">
              <div class="row">
                <div id="llegada-busqueda" class="col-md-4 col-sm-4 col-xs-6">
                  <p class="destino-modal">Llegada</p>
                  <div id="date_entrada" class="date-div">
                    <div class="day-div">
                      <p>06</p>
                    </div>
                    <div class="month-div">
                      <p>Marzo 2017</p>
                    </div>
                    <div class="dayName-div">
                      <p>Lunes</p>
                    </div>
                    <span class="arrow-btn"></span>
                  </div>
                </div>
                <div id="salida-busqueda" class="col-md-4 col-sm-4 offset-md-4 offset-sm-4 col-xs-6">
                  <p class="destino-modal">Salida</p>
                  <div id="date_salida" class="date-div">
                    <div class="day-div">
                      <p>11</p>
                    </div>
                    <div class="month-div">
                      <p>Marzo 2017</p>
                    </div>
                    <div class="dayName-div">
                      <p>Sábado</p>
                    </div>
                    <span class="arrow-btn"></span>
                  </div>
                </div>
              </div>
            </div>
            <div id="datepicker"></div>
            <div id="datepicker1"></div>
            <div class="spinner-habitacion">
              <p class="destino-modal">Habitaciones</p>
              <div id="input-busqueda">
                <span id="habitacion-input-modal" class="destino-input">1</span>
                <a class="spinnerIncreaseModal" href=""></a>
                <a class="spinnerDecreaseModal" href=""></a>
              </div>
            </div>
            <div class="habitaciones-content">
              <div id="habitacion_modal1" class="habitacion-modal">
                <p class="habitacion-num">Habitacion <span>1</span></p>
                <div class="adultos-modal">
                  <p class="name-input">Adultos</p>
                  <span class="input-num-personas num_adulto_1">2</span>
                  <a class="increaseModalAdultos" data-habitacion="adulto_1" href=""></a>
                  <a class="decreaseModalAdultos" data-habitacion="adulto_1" href=""></a>
                </div>
                <div class="ninos-modal">
                  <p class="name-input">Niños</p>
                  <span class="input-num-personas num_nino_1">0</span>
                  <a class="increaseModalNinos" data-habitacion="nino_1" href=""></a>
                  <a class="decreaseModalNinos" data-habitacion="nino_1" href=""></a>
                </div>
              </div>
            </div>
            <a href="" id="buscar-btn">Buscar</a>
          </div>
        </div>
      </div>
    </div>