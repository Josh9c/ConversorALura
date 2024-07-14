Esta aplicación Java funciona como un conversor de monedas utilizando la API de ExchangeRate para obtener las tasas de cambio actuales. Se emplea la biblioteca JSON para manejar las respuestas de la API y convertirlas a código Java.

Archivos Principales
Menu.java: Este archivo expone un menú en la consola con el que el usuario puede interactuar con la aplicación. Ofrece hasta 6 opciones de conversión:

Peso Mexicano a Dólares
Dólar a Peso Mexicano
Peso Argentino a Dólar
Dólar a Peso Argentino
Real Brasileño a Dólar
Dólar a Real Brasileño
Conversor.java: Este archivo se encarga de manejar la comunicación de la API con la aplicación. Crea la URL, envía la solicitud (request) y maneja la respuesta de la API.

Main.java: Este archivo define la APIKEY (clave de API) que se genera al solicitarla en la página de la API y se encarga de inicializar el menú.

-Creador Josue
