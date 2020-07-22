
//Al escribir sout y luego la tecla TAB se crea la sintaxis Sistem.out.println();

package ejemplo_1; //Se especifica el nombre del paquete donde se encuentra la clase
//Java por defecto siempre importa el paquete Java.Lang, por mas que no lo veamos
import java.io.*; //C/esto lo que estamos haciendo es importar una clase o un conjunto de clases( al usar el * traemos todas las clases de ese paquete) de un paquete de clases

public class Ejemplo_1 //La clase principal tiene el mismo nobre del archivo, esto tiene que ser asi ya que de esa forma la MVJ sabe cual es la clase donde comiena el programa
{
   int m=0; //Variable de clase accedidad por cualquier metodo dentro de la clase 
//  metodo de acceso publico, static poque es un metodo estatico, y void porque no devuelve ningun valo
    public static void main(String[] args) // Un programa tiene en su clase principal el metodo main, este metodo es el metodo iniciador del progama, es decir donde comienza todas las llemadas a otros metodos, etc.
    //el argumento que tiene es un arreglo donde se le pasa valores para ejecutar el programa esto normalmente se da cuando por ejemplo queremos que al ejecutar el programa cargue unos ciertos valores , el nombre "args" es el nombre del arreglo, este podria llamarse como quisiera
    { 
     //Elementos lexicos, representa todos los indentificadores, palabras reservadas, operadores (+,-,)etc.
     //Variables mas importantes
     int entero;// pesa unos 4 bytes
     short enterocorto; //pesa unos 2 bytes, se recomienda usar por ejemplo en las estructuras de control for
     float comaflotante = 0; // se usa para representar mayomente numeros irracionales tales como 1,2 22,3, etc
     double segundotipocomaflotante; // tambien se usa para representar aquellos valoroes irracionales, pero a diferencia del float el double soporta mas caracteres
     char caracteres; //representa todos los caracteres  UNICODE o ASCII
     boolean datoboleano; //se utiliza para variables que solo pueden tomas dos valores Verdadero o Falso
     String Cadena; // se utiliza para representa cadenas de caracteres como palabras o oraciones, nombres, etc.
     /* Diferencia entre Variables y Constantes, las constantes una vez que se le asigna un valor no se le puede 
     cambiar, mientras que las variables si*/
     /*Ejemplo de Constante:*/ final int constante=0; //c/esta declaracion a lo largo del programa la constante no podra ser modificada
     // Otro caso a tener en cuenta es si por ejemplo tenemos que el usuario ingresa un numero real y solo aceptamos numeros naturales, podemos convertir dicho numero real en natual asi:
     entero=(int)comaflotante;
     /*Para imprimir por pantalla, se usa la clase System, el atributo out,
     y su método println() o print() así: System.out.println() o System.out.print()*/
     System.out.print("Probando");  
     System.out.println("Probando");//Muestra en pantalla el caracter y un  salto de línea (como si presionara enter)   
     System.out.println(" probando \n"+"el salto de linea \n"+"muy buena heramienta");
    }
//Las variables locales son aquellas que estan dentro de un metodo y sirven solo dentro de ese metodo, en otro metodo o en la clase dara error
    void sumar()
    {
        int m=0;//variable local
    }
   
    
}
