package UI;

import java.util.Scanner;
import Model.*;
import Controller.controllerDictionary;
import Controller.readFile;

/**
 * The type Ui.
 */
public class UI {

    /**
     * The Sc.
     */
    Scanner sc = new Scanner(System.in);
    /**
     * The Tree factory.
     */
    treeFactory treeFactory = new treeFactory();
    /**
     * The Read file.
     */
    readFile readFile = new readFile();
    /**
     * The Controller.
     */
    controllerDictionary controller = new controllerDictionary();

    /**
     * User menu.
     */
    public void userMenu(){

        System.out.println("\n¡Bienvenid@ al diccionario Ingles-Español!");
        System.out.println("\tAhora con más palabras implementadas");

        System.out.println("\n¿Qué tipo de árbol le gustaría utilizar?");
        System.out.println("\t1. RedBlackTree");
        System.out.println("\t2. SplayTree");
        System.out.println("\t3. AVL tree");

        int type = sc.nextInt(); 

        System.out.println("\t\nSe está realizando la lectura de su archivo... por favor esperar un momento");

        String userPhrase = "src\\userPhrase.txt"; 
        String dictionary = "src\\dictionary.txt"; 

        System.out.println("\nA continuación, el resultado de su texto ingresado al txt: ");

        controller.translateWord(controller.createWord(readFile.readDictionary(dictionary)), readFile.readUITXT(userPhrase), treeFactory.getTypeMap(type));


    }
}