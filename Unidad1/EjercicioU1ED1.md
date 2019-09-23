# Ejercicios

### Ejercicio 1: Compiladores 

Vamos a escribir un pequeño programa en lenguaje C. Para ello utiliza Geany para crear el siguiente archivo:

```c
#include <stdio.h> 
#include <stdlib.h>
int main() { 
	int num1; 
	int num2; 
	int resultado; 
	num1=3; 
	num2=7; 
	resultado=num1+num2; 
    printf("Resultado: %d",resultado);
	return 0; 
}
```



- Guárdalo con el nombre ejemploc.c

- Lo compilaremos con la herramienta gcc que ejecutaremos desde la ubicación donde esté el fichero de la siguiente forma:

```
gcc -o ejemploc ejemploc.c
./ejemploc
Resulatdo :10
```

* Podéis ver con Geany el fichero resultante que estará lleno de caracteres extraños, no es más que el ejecutable binario

Ahora realizaremos lo siguiente, utilizaremos la opción S

```
gcc -S ejemploc.c
```

- La opción S es para que compile con el código ensamblador y podemos ver el fichero resultante con el nombre `ejemploc.s`   Si lo vemos con Geany podemos ver el código en ensamblador.

```assembly
       .file   "ejemploc.c"
        .section        .rodata
.LC0:
        .string "Resulatdo :%d"
        .text
        .globl  main
        .type   main, @function
main:
.LFB6:
        .cfi_startproc
        pushq   %rbp
        .cfi_def_cfa_offset 16
        .cfi_offset 6, -16
        movq    %rsp, %rbp
        .cfi_def_cfa_register 6
        subq    $16, %rsp
        movl    $3, -4(%rbp)
        movl    $7, -8(%rbp)
		
```



### Ejercicio 2. Intérpretes

El lenguaje Python es un lenguaje que está integrado en casi todos los sistemas linux, se puede probar de la siguiente forma:

```python
$ python
Python 2.7.13 (default, Sep 26 2018, 18:42:22) 
[GCC 6.3.0 20170516] on linux2
Type "help", "copyright", "credits" or "license" for more information.
>>> a = 2.5
>>> b = 3.6
>>> a + b
6.1
>>> c = a + b
>>> print c
6.1
>>> 
Para salir Ctrl-D
```

Vamos a crear un programa con el nombre `ejemplopython.py`con el siguiente código:

```python
a=float(input("Ingresa numero\n"))
b=float(input("Ingresa numero\n"))
suma=a+b
print(suma)
```

Es un sencillo programa que suma dos números que pueden ser con decimales con punto y que dichos valores son solicitados por teclado, la suma sale por pantalla

```python
python ejemplopython.py 
Ingresa numero
12.3
Ingresa numero
13.3
25.6

```

Aquí tienes varios ejemplos para poder probar algunos programas python:

https://www.comoprogramar.org/ejemplos-de-python-codigo/

### Ejercicio 3. POO y Visual con Java

Podemos ejecutar el siguiente programa:

```java
import javax.swing.JOptionPane;

class MultiplicaNumeros {
	public static void main (String [] args) {
		String strNum1;
		String strNum2;
		int intNum1;
		int intNum2;
		int suma;
		strNum1 = JOptionPane.showInputDialog("Ingrese el entero 1: ");
		strNum2 = JOptionPane.showInputDialog("Ingrese el entero 2: ");
		intNum1 = Integer.parseInt(strNum1);
		intNum2 = Integer.parseInt(strNum2);
		suma = intNum1 + intNum2;
		JOptionPane.showMessageDialog(null, "La multiplicación es "+ suma, "Resultado,", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}
}
```



Hacemos:

```
javac MultiplicaNumeros.java 
java MultiplicaNumeros 
```

Se ejecutará una ventana con la solicitud de los datos.



### Ejercicio 4. Herramientas Ágiles

Leer el artículo **Modelos de desarrollo ágil.pdf** y crearos una cuenta en Trello para probar algunas características que podéis ver en el video del final del artículo. 



### Ejercicio 5. Planificación proyecto

La empresa **NaN** ha recibido un nuevo encargo de software.

Se trata de diseñar una aplicación para una tienda especializada en vender productos estéticos.

La tienda desea trabajar con software libre. Además, desea explícitamente que la aplicación sea capaz de cumplir las siguientes tareas:


* Proporcionar facturas de las ventas.
* Llevar la cuenta de lo que vende cada trabajador.
* Controlar el stock de productos en almacén.
* Operar con lector de código de barras y tarjetas de crédito.
* Controlar los precios de los productos y ofrecer la posibilidad de operar con ellos.
* El tiempo de respuesta de la aplicación ha de ser lo menor posible.
* No se podrán procesar dos peticiones a la vez, aunque haya varios equipos funcionando simultáneamente.
* La empresa también quiere almacenar información de sus trabajadores: DNI, nombre, apellidos, número de la Seguridad Social, fecha de nacimiento, teléfono y localidad. Asimismo, de los productos interesa almacenar: código, marca, nombre comercial, precio, cantidad.


Tendrás que diseñar una planificación del proyecto de desarrollo de ese software que cumpla con las premisas estudiadas en la presente unidad de trabajo.

Esencialmente, el proyecto se divide en los siguientes apartados:

   * Sintetiza el análisis de requerimientos del sistema para nuestro cliente. Plantea el diseño y determina el modelo de ciclo de vida más idóneo para esta aplicación.
    
   * Planifica la codificación, indicando el lenguaje de programación y las herramientas que usarías para la obtención del código fuente, objeto y ejecutable, explicando por qué eliges esas herramientas.
    
   *Planifica las restantes fases del ciclo de vida, indicando en cada una el objetivo que persigues y cómo lo harías.

