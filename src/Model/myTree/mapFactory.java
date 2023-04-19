package myTree;

import java.util.Map;

import structure5.BinarySearchTree;
import structure5.RedBlackSearchTree;
import structure5.SplayTree;

public class mapFactory {
    
     /**
     * Diseño de fabrica según la selección de usuario 
     * @param userOp Opcion del usuario 
     * @return Tipo de arbol a utilizar por el usuario 
     */
    public Map getTypeMap(int userOp){

        Map typeMap = null;  

        switch(userOp){

            case 1: 
                typeMap = (Map) new RedBlackSearchTree(); 
                break; 
            case 2: 
                typeMap = (Map) new SplayTree(); 
                break; 
            case 3: 
                 
                break;

            default: 
                typeMap = null; 
                System.out.println("¡Ha ocurrido un error!");
                break; 
        }
        return typeMap;
    }
    
}
