package Controller;

import java.util.ArrayList;

import myTree.Word;
import myTree.treeStructure;

public class controllerDictionary {

    public ArrayList<Word> createWord(ArrayList<String[]> dictionary, treeStructure structure){
        
        ArrayList<Word> finalWords = new ArrayList<>(); 

        for (String[] row : dictionary) {

            String englishWord = row[0];
            String spanishWord = row[1];

            Word wordsToUse = new Word(englishWord, spanishWord);
            finalWords.add(wordsToUse);

        }

        return finalWords; 

    }
    public void translateWord(Word words, ArrayList<Word> dictionaryWords, ArrayList<String> userInput, treeStructure structure){
        
        for (Word dictWords : dictionaryWords) {

            structure.add(dictWords);

        }

        String result = "";
        ArrayList<String> newUserInput = new ArrayList<String>(userInput);

        for (int i = 0; i < userInput.size(); i++) {
            
            String userword = userInput.get(i); 

            if(words.compareTo((Word) userword) == 0){
        
                newUserInput.set(i, words.getSpanishWord()); // Actualizar el valor original en userInput

            } else { // no lo encontró
                String untranslatedWord = "*" + words.getEnglishWord() + "*";
                newUserInput.set(i, untranslatedWord);
            }
        
        for (String element : newUserInput) {
                result += element + " ";
        }

        System.out.println("\tOracion traducida: " + result + "\n");

        } 

    }
}


