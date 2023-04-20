package Controller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class readFile{

    /**
     * Metodo para guardar las palabras del diccionario en el txt dentro de un hashmap
     * @param path Ubicacion del archivo 
     * @return Hashmap con valores del diccionario 
     */
    public ArrayList<String[]> readDictionary(String path) {

        ArrayList<String[]> diccionario = new ArrayList<>();

        try {

            FileReader file = new FileReader(path);
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();

            while (line != null) {

                String[] words = line.trim().split(",");
                diccionario.add(words);
                line = reader.readLine();

            }
            reader.close();
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred reading the file: " + path);
            e.printStackTrace();
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
