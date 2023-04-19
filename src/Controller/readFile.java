package Controller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class readFile{

    /**
     * Metodo para guardar las palabras del diccionario en el txt dentro de un hashmap
     * @param path Ubicacion del archivo 
     * @return Hashmap con valores del diccionario 
     */
    public HashMap<String, String> readDictionary(String path) {

        HashMap<String, String> diccionario = new HashMap<>();
        
        try (BufferedReader buffreader = new BufferedReader(new FileReader(path))) {
    
            String words;
        
            while ((words = buffreader.readLine()) != null) {
                // Separar la palabra en ingles y sus traduccion en español 
                String[] wordAndTranslations = words.split(",");
                // Verificar si la línea tiene el formato esperado
                if (wordAndTranslations.length != 2) {
                    System.out.println("La línea no tiene el formato esperado: " + words);
                    continue;
                }
                String enWord = wordAndTranslations[0];
                String spanWord = wordAndTranslations[1];
    
                diccionario.put(enWord, spanWord);
            
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
            
        return diccionario;
    }
    
    /**
     * Metodo para leer la oracion ingresada por el usuario dentro del txt 
     * @param path Ubicacion del archivo 
     * @return Arraylist con oracion ingresada por usuario 
     */
    public ArrayList<String> readUITXT(String path){
        ArrayList<String> wordsToTrad = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = ""; 

            while ((line = br.readLine()) != null) {
                line = line.replace(".", "");
                String[] wordsLine = line.split(" ");
                wordsToTrad.addAll(Arrays.asList(wordsLine));
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return wordsToTrad;

    }    
}
