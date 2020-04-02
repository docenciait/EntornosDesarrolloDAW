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

La API de Java está organizada mediante paquetes. La clase **Scanner** se importa mediante:

`import java.util.Scanner`

## Ejemplo de creación de paquetes

* Los paquetes deben crearse según una disposición de nombres cualificados. Esto es, se separan por puntos igual que hacen 
los nombres dns, ya que tienen una estructura jerárquica.

* El siguiente ejemplo crearemos la jerarquía de paquetes `com.avellaneda.contabilidad` y dentro crearemos las clases que necesitemos. 

* Esto quiere decir que, en el IDE crearemos un paquete de nombre `com.avellaneda.contabilidad`
* Pero en el sistema de ficheros se va a crear una carpeta *es*, luego dentro otra *avellaneda* y luego otra dentro de esta *contabilidad*.
* Debemos crear las carpetas necesarias según el nombre del paquete separado por puntos.
* Exsite la opción de no crear paquetes separados por puntos, sólo con un nombre de paquete, lo cual lo hace más sencillo pero los proyectos tienden a tener un sistema jerárquico de paquetes.
* Las clases que estén en el paquete deben llevar la cláusula **package** y debe ser declarado al principio de la siguiente forma:
`package com.avellaneda.contabilidad`


Veamos el ejemplo:

```bash
# Creamos la estructura de carpeta de una sola vez con opción -p

$ mkdir -p com/avellenada/contabilidad  

# Añadimos a la carpeta contabilidad la siguiente clase:

$ nano com/avellaneda/contabilidad/MiClase.java
package com.avellaneda.contabilidad;
public class MiClase {

        public static void main(String[] args){
                System.out.println("MiClase");
        }

}

# Tenemos que compilar desde el directorio base donde se comenzó a crear la jerarquía de paquetes

$ javac com/avellaneda/contabilidad/MiClase.java 

# Se puede compilar con el nombre de paquete siempre separado por puntos y el último será la clase

$ java com.avellaneda.contabilidad.MiClase 
MiClase
```
Podéis instalar tree (apt install tree) para ver la estructura:

```bash
$ tree com/
com/
└── avellaneda
    └── contabilidad
        ├── MiClase.class
        └── MiClase.java

```

* Ahora crea otro similar en eclipse y observa cómo se crea la estructura de carpetas.


