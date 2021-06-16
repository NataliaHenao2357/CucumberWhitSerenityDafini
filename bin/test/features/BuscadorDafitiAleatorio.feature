Feature: Buscar productos en la Pagina Dafiti

  Scenario Outline: <Escenario>
    Buscar Productos en el buscador Exitosamente

    Given El usuario ingresa a la pagina de Dafiti <url>
    When busco un producto aleatorio en la pagina
    Then podre ver un producto aleatorio en pantalla

    Examples: 
      | Escenario                                | url                       |
      | Buscar producto en el buscador de dafiti | https://www.dafiti.com.co |
