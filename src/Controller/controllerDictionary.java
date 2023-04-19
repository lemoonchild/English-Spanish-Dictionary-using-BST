package Controller;

import java.util.ArrayList;

import myTree.Word;
import myTree.treeStructure;

public class controllerDictionary {

    public ArrayList<Word> createWords(ArrayList<String> dictionary) {

        ArrayList<Word> finalWords = new ArrayList<>();
    
        for (String words : dictionary) {
            
            String[] wordsToUse = words.trim().split(",");
    
            if (wordsToUse.length >= 2) {
                finalWords.add(new Word(wordsToUse[0], wordsToUse[1]));
            }
        }
    
        return finalWords;
    }

    public void translateWord(ArrayList<Word> wordsToUse, ArrayList<Word> userInput, treeStructure structure){
        
        for (Word word : wordsToUse) {

            structure.add(word);

        }
        
        String result = "";
        
        ArrayList<Word> newUserInput = new ArrayList<Word>(userInput);

        for (int i = 0; i < userInput.size(); i++) {

            Word word = userInput.get(i);

            if (structure.contains(word)) {

                Word translatedWord = structure.get(word);
                newUserInput.set(i, translatedWord.getSpanishWord()); // Actualizar el valor original en userInput

            } else { // no lo encontró
                Word untranslatedWord = new Word("*" + word.getEnglishWord() + "*", null);
                newUserInput.set(i, untranslatedWord);
            }
            
  
        } 

        for (Word element : newUserInput) {
            result += element + " ";
        }

        System.out.println("\tOracion traducida: " + result + "\n");

    } 

}

