

import java.util.Scanner;

public class Metodos {

    Scanner teclado = new Scanner(System.in);

    // Registrar productos en vector
    public Producto[] registrarProductos(int cantidad) {

        Producto[] productos = new Producto[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nProducto " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Peso: ");
            double peso = Double.parseDouble(teclado.nextLine());

            System.out.print("Categoría (A, B, C): ");
            String categoria = teclado.nextLine().toUpperCase();

            productos[i] = new Producto(nombre, peso, categoria);
        }

        return productos;
    }

    // Organizar estantería
    public Producto[][] organizarEstanteria(Producto[] productos) {

        int contA = 0, contB = 0, contC = 0;

        // 🔹 CONTAR con for tradicional
        for (int i = 0; i < productos.length; i++) {

            if (productos[i].getCategoria().equals("A"))
                contA++;
            else if (productos[i].getCategoria().equals("B"))
                contB++;
            else if (productos[i].getCategoria().equals("C"))
                contC++;
        }

        // Crear vectores por categoría
        Producto[] vectorA = new Producto[contA];
        Producto[] vectorB = new Producto[contB];
        Producto[] vectorC = new Producto[contC];

        int a = 0, b = 0, c = 0;

        // 🔹 AGRUPAR con for tradicional
        for (int i = 0; i < productos.length; i++) {

            if (productos[i].getCategoria().equals("A")) {
                vectorA[a] = productos[i];
                a++;
            } 
            else if (productos[i].getCategoria().equals("B")) {
                vectorB[b] = productos[i];
                b++;
            } 
            else if (productos[i].getCategoria().equals("C")) {
                vectorC[c] = productos[i];
                c++;
            }
        }

        // Crear matriz final (3 filas)
        int columnas = Math.max(vectorA.length,
                        Math.max(vectorB.length, vectorC.length));

        Producto[][] matriz = new Producto[3][columnas];

        // Llenar matriz
        for (int i = 0; i < vectorA.length; i++) {
            matriz[0][i] = vectorA[i];
        }

        for (int i = 0; i < vectorB.length; i++) {
            matriz[1][i] = vectorB[i];
        }

        for (int i = 0; i < vectorC.length; i++) {
            matriz[2][i] = vectorC[i];
        }

        return matriz;
    }

    // Mostrar matriz
    public void mostrarMatriz(Producto[][] matriz) {

        String[] categorias = {"A", "B", "C"};

        for (int i = 0; i < matriz.length; i++) {

            System.out.println("\nEstantería categoría " + categorias[i]);

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] != null) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}
