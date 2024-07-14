# Conversor de Monedas

## Descripción

Esta aplicación Java funciona como un conversor de monedas utilizando la API de ExchangeRate para obtener las tasas de cambio actuales. Se emplea la biblioteca JSON para manejar las respuestas de la API y convertirlas a código Java.

## Archivos Principales

- **Menu.java**: Este archivo expone un menú en la consola con el que el usuario puede interactuar con la aplicación. Ofrece hasta 6 opciones de conversión:
  1. Peso Mexicano a Dólares
  2. Dólar a Peso Mexicano
  3. Peso Argentino a Dólar
  4. Dólar a Peso Argentino
  5. Real Brasileño a Dólar
  6. Dólar a Real Brasileño

- **Conversor.java**: Este archivo se encarga de manejar la comunicación de la API con la aplicación. Crea la URL, envía la solicitud (request) y maneja la respuesta de la API.

- **Main.java**: Este archivo define la APIKEY (clave de API) que se genera al solicitarla en la página de la API y se encarga de inicializar el menú.

-Creador Josue