/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacionestructurada;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class ProgramacionEstructurada {

    public static void main(String[] args) {
       
    }
}

    
    //validacionNota();
    //contadorNum();
    //sumaPares();
         //calculadoraDescuento();
        //clasificasionEdad();
       // elMayor();
     /*   
// Ejercicio numero 1
   public atatic void esBisiesto();
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el año: ");
        int anio = Integer.parseInt(input.nextLine());
        
        if ((anio % 4 ==0 && anio % 100 != 0)||(anio % 400== 0)){
            System.out.println("Es año bisiesto");
            } else {
            System.out.println(" Este año no es bisiesto");
            }
*/
    
    
   /* 
// Ejercicio numero 2
    public static void elMayor(){
        Scanner ing = new Scanner(System.in);
          
        System.out.print("Ingrese el primer número: ");
         int n1 = Integer.parseInt(ing.nextLine());
         
        System.out.print("Ingrese el segundo número: ");
         int n2 = Integer.parseInt(ing.nextLine());
         
                 System.out.print("Ingrese el tercer número: ");
         int n3 = Integer.parseInt(ing.nextLine());
        
         if (n1 > n2 && n1 > n3) {
            System.out.println("el número " + n1+ "es el mayor de los tres");
         } else if (n2 > n1 && n2 > n3) {
            System.out.println("El número " + n2 + " es el mayor de los tres");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("El número " + n3 + " es el mayor de los tres");
        } else {
            System.out.println("Hay números iguales");
        
        }
    };
    */


     /*
// Ejercicio numero 3
       public static void clasificasionEdad(){
        Scanner ing = new Scanner(System.in);
          
        System.out.print("Ingrese el su edad por favor : ");
         int edad = Integer.parseInt(ing.nextLine());
         if (edad < 12) {
            System.out.println("Tienes "+ edad + " años eres un niño");
         } else if (edad >= 12 && edad < 18) {
            System.out.println("Tienes "+ edad + " años eres un adolescente");
        } else if (edad >= 18 && edad < 60) {
            System.out.println("Tienes "+ edad + " años eres un adulto");
        } else {
            System.out.println("Tienes "+ edad + " años eres un adulto mayor!!");
        }
         ing.close(); // Encontre como recomendacion siempre cerrar el scanner al finalizar
    }
}
*/

/*
// ejercicion numero 4
    public static void calculadoraDescuento() {
        Scanner cal = new Scanner(System.in);

        // Pedir precio original
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(cal.nextLine());

        // Pedir categoría
        System.out.print("Ingrese la categoría (A, B o C): ");
        String categoria =  cal.nextLine().toUpperCase(); // convierto a mayúscula para evitar errores

        double descuento = 0;

        // Calcular descuento según categoría
        switch (categoria) {
            case "A":
                descuento = 0.10;
                break;
            case "B":
                descuento = 0.15;
                break;
            case "C":
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoría inválida. No se aplicará descuento.");
        }

        // Cálculos finales
        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;

        // Mostrar resultados
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Precio final: $" + precioFinal);

        cal.close();
    }
*/


/*
// Ejercicio numero 5
public static void sumaPares(){
    
     Scanner sum = new Scanner(System.in);
     int pares = 0;    
     int numerito;   
     
      System.out.print("Ingrese un numero ");
     while (true) {
         
         System.out.println("Numero: ");
         numerito = Integer.parseInt(sum.nextLine());
         if (numerito == 0){
             System.out.println("Usted a ingresado el número 0 y con eso dio por finalizado el programa. Muchas gracias!!");
             break;
         }
         if (numerito % 2 ==0){
             pares += numerito;
         }
                 
    }
     System.out.println("\nLa suma de los numeros pares ingresados hasta el momneto fue de : " + pares + ".");
     sum.close();
}

*/


/*
// Ejercicio numero 6
    public static void contadorNum() {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Ingrese 10 números enteros:");

        // Ciclo for para pedir 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = Integer.parseInt(sc.nextLine());

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostrar resultados
        System.out.println("\nCantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        sc.close();
    }
  */  


/*
// Ejercicio numero 7
    public static void validacionNota() {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Intente nuevamente.");
            }

        } while (nota < 0 || nota > 10); // sigue pidiendo mientras la nota sea inválida

        System.out.println("La nota ingresada es: " + nota);
        sc.close();
    }
}
*/


/*
  
// Ejercicio numero 8
public class PrecioFinalProducto {

    // Método que calcula el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // PrecioFinal = PrecioBase + (PrecioBase * Impuesto) - (PrecioBase * Descuento)
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de impuesto (ej: 0.21 para 21%): ");
        double impuesto = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento (ej: 0.10 para 10%): ");
        double descuento = sc.nextDouble();

        // Calcular precio final
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostrar resultados
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Precio final con impuesto y descuento: $" + precioFinal);

        sc.close();
    }}
*/




/*
//Ejercicio numero 10
 public class ProgramacionEstructurada {
// Método que calcula el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // PrecioFinal = PrecioBase + (PrecioBase * Impuesto) - (PrecioBase * Descuento)
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de impuesto (ej: 0.21 para 21%): ");
        double impuesto = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento (ej: 0.10 para 10%): ");
        double descuento = sc.nextDouble();

        // Calcular precio final
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostrar resultados
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Precio final con impuesto y descuento: $" + precioFinal);

        sc.close();
    }
        
    }
    */



