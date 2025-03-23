# Instalación de Maven paso a paso


## Descarga

- Dentro de la página oficial de maven en nuestro caso proporcionada por el profesorado, siendo la siguiente (https://maven.apache.org/download.cgi). 
<br> Nos descargaremos el archivo binario en un .zip como podemos ver el la siguiente imagen [Binary zip archive --> apache-maven-3.9.9-bin.zip]:<br>
![1.png](InstalacionMaven%2F1.png)


- Una vez le demos doble clic en el archivo correspondiente este comenzará la descarga la cual prodremos ver su estado en el navegador como en la siguiente imagen: <br>
![2.png](InstalacionMaven%2F2.png)


- Abriremos el directorio de descargas y veremos el archivo que nos acabamos de descargar: <br>
![3.png](InstalacionMaven%2F3.png)


- El siguiente paso es descomprimirlo pulsando clic izquierdo sobre el archivo comprimido y buscando la opción de "Extraer todo ..." como vemos en la imagen: <br>
![4.png](InstalacionMaven%2F4.png)


- Una vez encontrada y pulsada la opción anterior, nos saldrá la siguiente pantalla donde tendremos que elegir donde queremos extraer el archivo comprimido.
<br>El archivo lo extraeremos en el directorio que queramos. Pero necesitamos saber en donde está situado para los siguientes pasos: <br>
![5.png](InstalacionMaven%2F5.png)


- Una vez elegido el directorio donde queremos descomprimir el archivo presionaremos "Extraer": <br>
![6.png](InstalacionMaven%2F6.png)


- Nos dirigiremos al directorio donde hemos descomprimido el archivo y veremos que nos ha creado un nuevo directorio dentro de este con el siguiente nombre "apache-maven-3.9.9" como vemos en la siguiente imagen: <br>
![7.png](InstalacionMaven%2F7.png)


- El siguiente paso es meternos dentro de este nuevo directorio y nos encontraremos con varios directorios y archivos, necesitamos meternos dentro del directorio "bin": <br>
![8.png](InstalacionMaven%2F8.png)


- Una vez dentro del directorio nombrado en el paso anterior veremos más archivos no necesitamos abrir ninguno, pero sí necesitamos copiar la ruta hasta el directorio bin para el siguiente paso.
<br> En caso de no saber como copiar la ruta solo se necesita hacer clic en el mismo sitio que marcamos en la imagen y presionar "ctrl+c": <br>
![9.png](InstalacionMaven%2F9.png)


## Meter la ruta hasta el directorio "bin" en la variable del sistema "path"

- El siguiente paso es abrir dede el buscador que te proporciona el ordenado el editor de variables de entorno del sistema: <br>
![9-5.png](InstalacionMaven%2F9-5.png)
![10.png](InstalacionMaven%2F10.png)


- Cuando lo abramos nos saldrá la siguiente pantalla donde pulsaremos en "Variables de entorno del sistema": <br>
![11.png](InstalacionMaven%2F11.png)


- Nos llevará a la siguiente pantalla donde encontraremos las variables de usuario y las variables del sistema (las mostramos en la imagen con recuadros verdes). Aquí tendremos que buscar la variable "path" (mostrada en la imagen con recuadros rojos)
<br> Yo he elegido añadir la ruta en las variables del sistema, pero puedes añadirla en las variables del usuario. Pincharemos en path que nos llevará a la siguiente pantalla: <br>
![12.png](InstalacionMaven%2F12.png)


- Una vez en la siguiente pantalla pulsaremos o el botón de "Nuevo" o doble clic en un espacio en blanco: <br>
![13.png](InstalacionMaven%2F13.png)


- Aquí añadiremos la ruta copiada anteriormente haciendo "ctrl+v" o clic izquierdo "Pegar". Comprobamos que la ruta se haya añadido correctamente y pulsamos el botón de "Aceptar": <br>
![14.png](InstalacionMaven%2F14.png)


- Nos llevará a la pantalla anterior donde pulsaremos de nuevo "Aceptar": <br>
![15.png](InstalacionMaven%2F15.png)


- Ahora nos encontraremos en la primera pantalla donde haremos lo mismo que en las dos últimas pulsar "Aceptar" y habremos terminado con la instalación: <br>
![16.png](InstalacionMaven%2F16.png)


## Comprobación 

- Para comprobar que todo se haya realizado correctamente nos iremos de nuevo al buscador que nos proporciona nuestro ordenador y escribiremos "cmd" y abriremos el "Símbolo del sistema" también conocido como "Terminal": <br>
![9-5.png](InstalacionMaven%2F9-5.png)
![17.png](InstalacionMaven%2F17.png)


- Con el terminal abierto meteremos el siguiente comando "mvn -v" y nos debería dar una salida parecida a la siguiente: <br>
![18.png](InstalacionMaven%2F18.png)


- Asi habríamos terminado con la descarga, variable de entorno y comprobación de la "instalación" <br>
