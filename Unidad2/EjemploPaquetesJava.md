# Creación de paquetes en Java

Un paquete de Java es un contenedor de clases de Java. Éste puede tener las clases que se necesiten. Normalmente en los IDEs 
se crean paquetes por defecto en cada uno de los proyectos Java. Cada proyecto Java puede tener los paquetes que se quieran. 

Los paquetes son necesarios para ordenar las clases y para protegerlas de accesos indebidos a ciertas clases asi como ordenar
las clases de forma jerárquica. 

La cláusula **import** es la encargada de importar o llamar a los paquetes y la clase o clases del mismo.

Asimismo, si un paquete está conformado por una clase se llamará:

`import es.avellaneda.contabilidad.MiClase`

Y si quiero importar todas las clases del paquete lo hago con un `*` :
`import es.avellaneda.contabilidad.*`

La API de Java está organizada mediante paquetes. La clase **Scanner** se importa mediante: `import java.util.Scanner`

## Ejemplo de creación de paquetes

* Los paquetes deben
