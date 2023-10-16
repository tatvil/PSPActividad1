# PSPActividad1

## Requerimiento 1
Se pide hacer dos programas cliente-servidor con sockets e hilos. La aplicación servidora programa consistirá en crear una aplicación que gestione una serie de películas de una biblioteca virtual, la aplicación cliente consumirá dicha aplicación servidora.
Las películas tendrán un ID, un título, un director y un precio. Se encontrarán alojadas en el servidor. Dicho servidor cuando arranque tendrá 5 películas preestablecidas con todos los datos rellenos. Las películas se guardarán en memoria en cualquier tipo de estructura de datos (como puede ser un lista). El servidor deberá estar preparado para que interactúen con él varios clientes (se deberá abrir un hilo por cada cliente).
La aplicación cliente mostrará un menú como el que sigue:
*	Consultar película por ID
*	Consultar película por título
*	Salir de la aplicación
La aplicación se ejecutará hasta que el cliente decida pulsar la opción de “salir de la aplicación”.
El cliente deberá de recoger todos los datos del usuario necesarios y mandarlos al servidor en un solo envío.
 
## Requerimiento 2
Se pide añadir otra opción que sea “Consultar películas por director”. En este caso hay que tener en cuenta que puede haber varias películas por director, por lo que el servidor podrá devolver una lista de películas. Se recomienda pensar en grupo el formato de envío de información.
 
## Requerimiento 3
Se pide añadir otra opción que sea “Añadir película”. En este caso el cliente pedirá todos los datos de la película y los enviará al servidor para que este lo guarde. La lista en el servidor deberá estar preparada para que solo pueda añadir una película cada hilo a la vez, si algún hilo está agregando una película, los demás hilos deberán de esperar a que el hilo acabe.
El cliente deberá de recoger todos los datos y mandarlos al servidor en un solo envío.
 
## Consideraciones
Para toda la actividad se valorará la claridad de código, la modularidad, la eficiencia de los algoritmos empleados y comentarios explicativos sobre los puntos clave de la aplicación (JavaDoc o normales, lo que se consideré más apropiado).
Se recomienda el uso de GITHUB para realizar el trabajo de grupo.
Para la entrega, se subirá el código fuente comprimido a la plataforma, incluyendo un documento PDF con todo lo necesario para demostrar el correcto funcionamiento de la actividad (resultados, capturas de pantalla, ficheros, fotos, etc.). No es necesario que el documento PDF sea muy extenso, pero SÍ que incluya, al menos, las capturas de los resultados obtenidos y la explicación de los puntos clave de la actividad realizada. También puede ser valido para la entrega subir el PDF con la URL de acceso al repositorio GITHUB sin necesidad de incluir el código fuente.

