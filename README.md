# Prueba Técnica Corunet

## Enunciado

---

En la base de datos de comercio electrónico de la compañía disponemos de la tabla `PRICES` que refleja el precio final (pvp) y la tarifa que aplica a un producto de una cadena entre unas fechas determinadas. 

A continuación se muestra un ejemplo de la tabla con los campos relevantes:

`PRICES`

-------

| BRAND_ID | START_DATE          | END_DATE            | PRICE_LIST | PRODUCT_ID | PRIORITY | PRICE | CURR |
|:--------:|:-------------------:|:-------------------:|:----------:|:----------:|:--------:|:-----:|:----:|
| 1        | 2020-06-14-00.00.00 | 2020-12-31-23.59.59 | 1          | 35455      | 0        | 35.50 | EUR  |
| 1        | 2020-06-14-15.00.00 | 2020-06-14-18.30.00 | 2          | 35455      | 1        | 25.45 | EUR  |
| 1        | 2020-06-15-00.00.00 | 2020-06-15-11.00.00 | 3          | 35455      | 1        | 30.50 | EUR  |
| 1        | 2020-06-15-16.00.00 | 2020-12-31-23.59.59 | 4          | 35455      | 1        | 38.95 | EUR  |                     4                        35455                1                        38.95            EUR

Campos

---

- **BRAND_ID** - Foreign Key de la cadena del grupo (1 = ZARA).
- **START_DATE**, **END_DATE** - Rango de fechas en el que aplica el precio tarifa indicado.
- **PRICE_LIST** - Identificador de la tarifa de precios aplicable.
- **PRODUCT_ID** - Código identificador del producto.
- **PRIORITY** - Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rango de fechas se aplica la de mayor prioridad (mayor valor numérico).
- **PRICE** - Precio final de venta.
- **CURR** - ISO de la moneda.

### Se pide

---

Construir una aplicación/servicio en **SpringBoot** que provea un endpoint REST de consulta tal que:

- Acepte como parámetros de entrada: fecha de aplicación, identificador de producto, identificador de cadena.
- Devuelva como datos de salida: identificador de producto, identificador de cadena, tarifa a aplicar, fechas de aplicación y precio final a aplicar.
- Se debe utilizar una base de datos en memoria (tipo H2) e inicializar con los datos del ejemplo, (se pueden cambiar el nombre de los campos y añadir otros nuevos si se quiere, elegir el tipo de dato que se considere adecuado para los mismos).
- Desarrollar unos test al endpoint rest que  validen las siguientes peticiones al servicio con los datos del ejemplo:

  - **Test 1** - Petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ZARA).
  - **Test 2** - Petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ZARA).
  - **Test 3** - Petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ZARA).
  - **Test 4** - Petición a las 10:00 del día 15 del producto 35455 para la brand 1 (ZARA).
  - **Test 5** - Petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ZARA).

## Solución

---

1. Creación de un repositorio de código en GitHub llamado [prueba-corunet](https://github.com/AlvarX4z/prueba-corunet) pensado para albergar esta prueba.
2. Creación de un proyecto de SpringBoot y selección de dependencias en [Spring Initializr](https://start.spring.io/). Se pueden ver las versiones que he utilizado en el archivo _stack.md_.
3. Conexión entre el proyecto local recién iniciado de SpringBoot y el repositorio de GitHub mediante Git. Se realizarán diversas ramas para desarrollar las distintas partes que conforman la prueba.
4. Configuración de la base de datos H2 en el _application.properties_ y creado juegos de datos que se ejecutan automáticamente en los archivos _schema.sql_ y _data.sql_. Se ha añadido un campo nuevo a la tabla **PRICES**: `PRICE_ID` para que pueda servir como **Primary Key** de la tabla. También se ha creado una tabla **BRANDS** para poder usar **BRAND_ID** como **Foreign Key** en **PRICES**. Rama empleada: `feature/setting-h2-database`.
