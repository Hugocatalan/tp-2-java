package ejercfaltantes;

import java.util.Locale;
import java.util.Scanner;

public class NewClass {

    private static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=== Menú de ejercicios ===");
            System.out.println("9) Costo de envío y total de compra");
            System.out.println("11) Descuento especial (variable global)");
            System.out.println("12) Arrays: modificación y muestra de precios");
            System.out.println("13) Impresión recursiva antes y después de modificar");
            System.out.println("0) Salir");
            System.out.print("Elegí una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 9 -> ejercicio9(sc);
                case 11 -> ejercicio11(sc);
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
                case 0 -> System.out.println("Fin.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    // ===== Ejercicio 9 =====
    private static void ejercicio9(Scanner sc) {
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine(); // limpiar 

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine();

        double costoEnvio;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5.0;
        } else { // Internacional
            costoEnvio = peso * 10.0;
        }
        double total = precioProducto + costoEnvio;

        System.out.printf(Locale.US, "El costo de envío es: %.1f%n", costoEnvio);
        System.out.printf(Locale.US, "El total a pagar es: %.1f%n", total);
    }

    // ===== Ejercicio 11 =====
    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL; // variable local
        double precioFinal = precio - descuentoAplicado;

        System.out.printf(Locale.US, "El descuento especial aplicado es: %.1f%n", descuentoAplicado);
        System.out.printf(Locale.US, "El precio final con descuento es: %.1f%n", precioFinal);

        return precioFinal;
    }

    private static void ejercicio11(Scanner sc) {
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        calcularDescuentoEspecial(precio);
    }

    // ===== Ejercicio 12 =====
    private static void ejercicio12() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }

        // Modificar el tercer elemento 
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
    }

    // ===== Ejercicio 13 =====
    private static void ejercicio13() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirOriginalesRec(precios, 0);

        // Modificar el tercer elemento 
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirModificadosRec(precios, 0);
    }

    private static void imprimirOriginalesRec(double[] arr, int i) {
        if (i >= arr.length) return;
        System.out.println("Precio: $" + arr[i]);
        imprimirOriginalesRec(arr, i + 1);
    }

    private static void imprimirModificadosRec(double[] arr, int i) {
        if (i >= arr.length) return;
        System.out.println("Precio: $" + arr[i]);
        imprimirModificadosRec(arr, i + 1);
    }
}
