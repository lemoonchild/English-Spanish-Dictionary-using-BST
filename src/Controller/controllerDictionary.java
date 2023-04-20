package Controller;

import Model.Word;
import Model.treeStructure;

import java.util.ArrayList;

/**
 * The type Controller dictionary.
 */
public class controllerDictionary {

    /**
     * The Verify.
     */
    public ArrayList<String> verify = new ArrayList<>();

    /**
     * Create word array list.
     *
     * @param dictionary the dictionary
     * @return the array list
     */
    public ArrayList<Word> createWord(ArrayList<String[]> dictionary){
        
        ArrayList<Word> finalWords = new ArrayList<>();

        for (String[] row : dictionary) {

            String englishWord = row[0];
            String spanishWord = row[1];

            Word wordsToUse = new Word(englishWord, spanishWord);
            finalWords.add(wordsToUse);
            verify.add(englishWord); 

        }

        return finalWords; 

    }

    /**
     * Translate word.
     *
     * @param dictionaryWords the dictionary words
     * @param userInput       the user input
     * @param structure       the structure
     */
    public void translateWord(ArrayList<Word> dictionaryWords, ArrayList<String> userInput, treeStructure<Word> structure){
        
        for (Word dictWords : dictionaryWords) {

            structure.add(dictWords);

        }

        String result = "";
        ArrayList<String> newUserInput = new ArrayList<String>();

        for (int i = 0; i < userInput.size(); i++) {
            
            String userword = userInput.get(i); 

            if(verify.contains(userword)){

                Word val2 = structure.get(new Word(userword, ""));
                newUserInput.add(val2.getSpanishWord());
                
            } else { // no lo encontró
                String untranslatedWord = "*" + userword + "*";
                newUserInput.add(untranslatedWord);
            }

        }
        for (String element : newUserInput) {
            result += element + " ";
        }
        System.out.println("\tOracion traducida: " + result + "\n");

    }
}


