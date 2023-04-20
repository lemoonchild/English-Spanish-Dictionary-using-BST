package Model;

/**
 * The type Tree factory.
 */
public class treeFactory {

    /**
     * Diseño de fabrica según la selección de usuario
     *
     * @param userOp Opcion del usuario
     * @return Tipo de arbol a utilizar por el usuario
     */
    public treeStructure getTypeMap(int userOp){

        treeStructure typeMap = null;  

        switch(userOp){

            case 1: 
                typeMap = new myRedBlackTree(); 
                
                break; 
            case 2: 
                typeMap = new mySplayTree(); 
                break; 
            case 3: 
                 typeMap = new AVLTree();
                break;

            default: 
                typeMap = null; 
                System.out.println("¡Ha ocurrido un error!");
                break; 
        }
        return typeMap;
    }
    
}
