

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Metodos m = new Metodos();

        System.out.println("¿Cuántos productos desea registrar?");
        int cantidad = Integer.parseInt(teclado.nextLine());

        Producto[] productos = m.registrarProductos(cantidad);

        Producto[][] estanteria = m.organizarEstanteria(productos);

        m.mostrarMatriz(estanteria);
    }
}
