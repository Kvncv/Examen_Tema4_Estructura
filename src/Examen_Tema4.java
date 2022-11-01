
//Alumno: Kevin del Angel Colunga Vázquez
//Numero de control: 21260139
//Fecha: 01/11/2022
//Estructura de Datos
//Tema 4: Arboles Binarios
//Docente: Diana Grisel Leal Ramos

import java.util.Scanner;

public class Examen_Tema4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        int opcion = 0;
        int numero = 0;

        do{
            System.out.println("1. Insertar un dato");
            System.out.println("2. Eliminar un dato");
            System.out.println("3. Mostrar el recorrido en preorden");
            System.out.println("4. Mostrar el recorrido en orden");
            System.out.println("5. Mostrar el recorrido en postorden");
            System.out.println("6. Buscar un elemento");
            System.out.println("7. Verificar si el árbol está vacío");
            System.out.println("8. Cantidad de elementos");
            System.out.println("9. Altura del árbol");
            System.out.println("10. Nivel del arbol");
            System.out.println("11. Elemento mayor");
            System.out.println("12. Elemento menor");
            System.out.println("13. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("¿Cuántos datos desea agregar al árbol?: ");
                    int cantidad = sc.nextInt();
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("Ingrese un numero: ");
                        arbol.insertar(sc.nextInt());
                    }
                    break;
                case 2:
                    if(arbol.esVacio()){
                        System.out.println("El árbol está vacío, agregue datos primero");
                    }else{
                        System.out.println("¿Cuántos datos desea eliminar del árbol?: ");
                        cantidad = sc.nextInt();
                        for (int i = 0; i < cantidad; i++) {
                            System.out.println("Ingrese el dato a eliminar: ");
                            arbol.eliminar(sc.nextInt());
                            System.out.println("Se ha eliminado el dato");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Recorrido en preorden: ");
                    arbol.preorden();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Recorrido en orden: ");
                    arbol.inorden();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Recorrido en postorden: ");
                    arbol.postorden();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Ingrese el dato a buscar: ");
                    numero = sc.nextInt();
                    if(arbol.buscar(numero)){
                        System.out.println("El dato se encuentra en el árbol");
                    }
                    else{
                        System.out.println("El dato no se encuentra en el árbol");
                    }
                    break;
                case 7:
                    if(arbol.esVacio()){
                        System.out.println("El árbol está vacío");
                    }
                    else{
                        System.out.println("El árbol no está vacío");
                    }
                    break;
                case 8:
                    System.out.println("La cantidad de elementos del árbol es: " + arbol.cantidad());
                    break;
                case 9:
                    System.out.println("La altura del árbol es: " + arbol.altura());
                    break;
                case 10:
                    System.out.println("El nivel del árbol es: " + arbol.nivel());
                    break;
                case 11:
                    if(arbol.esVacio()){
                        System.out.println("El árbol está vacío, agregue datos primero");
                    }else {
                        System.out.println("El elemento mayor del árbol es: " + arbol.mayor());
                    }
                    break;

                case 12:
                    if (arbol.esVacio()) {
                        System.out.println("El árbol está vacío, agregue datos primero");
                    } else {
                        System.out.println("El elemento menor del árbol es: " + arbol.menor());
                    }
                    break;

                case 13:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
        while(opcion != 13);
    }
}