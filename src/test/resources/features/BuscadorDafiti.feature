Feature: Buscar productos en la Pagina Dafiti
  Yo como comprador de dafiti, ingreso a la pagina 
  y en el buscador de productos, quiero obtener los productos 
  de interes

  Scenario Outline: <Escenario>
    Buscar Productos en el buscador Exitosamente

    Given El usuario ingresa a la pagina de Dafiti <url>
    When Cuando busco el producto <Producto> en el buscador
    Then podre ver la informacion del producto <Producto> En Pantalla

    Examples: 
      | Escenario                                | Producto                                               | url                       |
      | Buscar producto en el buscador de dafiti | Jean Juvenil Femenino Azul Hielo Atypical              | https://www.dafiti.com.co |
      | Buscar producto en el buscador de dafiti | TENIS FILA KIDS F-13 BLK/BLK/GUM 3VF80128-976          | https://www.dafiti.com.co |
      | Buscar producto en el buscador de dafiti | Brocha Kabuki Retractil Morada Salon Exp               | https://www.dafiti.com.co |
      | Buscar producto en el buscador de dafiti | Perfume One Million De Paco Rabanne Para Hombre 200 Ml | https://www.dafiti.com.co |
      | Buscar producto en el buscador de dafiti | Cepillo Metalico Oro Salon Expert                      | https://www.dafiti.com.co |
