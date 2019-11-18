# Creación de un entorno de trabajo Linux+Netbeans+Eclipse+java 11

En este laboratorio vamos a crear el entorno de trabajo para poder programar en Eclipse y en Netbeans. 

### Material

* Debian 9.5 con lxde
* jdk11
* Eclipse 4.16
* Netbeans 11.1
* Tema 2 de ED (Aula Virtual)

La MV se deja preinstalada pero se tiene que realizar el resto de instalaciones mediante el terminal:

* Descarga e instalación del jdk11. 
* Descargar Netbeans y Eclipse
* Pasos para instalar Eclipse
* Pasos para instalar Netbeans
* Configuración de las variables de entorno necesarias
* Crear un acceso directo para ambos IDEs.
* Ejecución de ambos entornos Netbeans y Eclipse.

Después se debe realizar lo siguiente:

1. Según la clase:

```
package com.campusAvellaneda.admin
import java.util.Scanner;
 public class Calculadora {
     public static void main(String[] args) {
          Scanner miScan = new Scanner(System.in);
          System.out.println("Calculadora que suma dos numeros enteros");
          System.out.println("Introduce el primer numero");
          String sPrimerNum = miScan.nextLine();
          int iPrimerNum = Integer.parseInt(sPrimerNum);
          System.out.println("Introduce el primer numero");
          String sSegNum = miScan.nextLine();
          int iSegNum = Integer.parseInt(sSegNum);
          int iResul = iPrimerNum + iSegNum;
          System.out.println("El resultado es: " + iResul);
     }
}
```

Crear la estructura desde consola y compilar la aplicación además de realizar el correspondiente **Calculadora.jar** para poder ejectuarlo.

2. Importar las clases a un nuevo proyecto en Eclipse y ejecútalo
3. Importar el proyecto en Netbeans y ejecútalo.
4. Instala el plugin Enhanced Class Decompiler. 
5. Decompilar el .class creado con el anterior software.
6. Desinstalar el plugin.

