package UI;

import java.util.Scanner;

public class UI {
    
    Scanner sc = new Scanner(System.in); 
    
    public void userMenu(){

        System.out.println("\n¡Bienvenid@ al diccionario Ingles-Español!");
        System.out.println("\tAhora con más palabras implementadas");

        System.out.println("\n¿Qué tipo de árbol le gustaría utilizar?");
        System.out.println("\t1. RedBlacTree");
        System.out.println("\t2. SplayTree");
        System.out.println("\t3. PENDIENTE");

        int type = sc.nextInt(); 




        System.out.println("\t\nSe está realizando la lectura de su archivo... por favor esperar un momento");

        String userPhrase = "src/userPhrase"; 

        System.out.println("\nA continuación, el resultado de su texto ingresado al txt: ");


    }
}