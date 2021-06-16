Feature: HU-005 Buscar productos en la Pagina Dafiti
  Yo como comprador de dafiti, ingreso a la pagina 
  y en el buscador de productos, quiero obtener los productos 
  de interes
  
  Scenario: Buscar el producto en el buscador de Dafiti con respuesta Fallida
    Given El cliente inicializa la pagina de Dafiti https://www.dafiti.com.co
    When Se realiza busqueda de un producto
      | nombreProducto |
      | Mortadela      |
    Then Puedo validar el articulo en la pantalla
  
   Scenario: Buscar el producto en el buscador de Dafiti con respuesta exitosa
    Given El cliente inicializa la pagina de Dafiti https://www.dafiti.com.co
    When Se realiza busqueda de un producto
      | nombreProducto                                |
      | TENIS FILA KIDS F-13 BLK/BLK/GUM 3VF80128-976 |
    Then Puedo validar el articulo en la pantalla

  

 
