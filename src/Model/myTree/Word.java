package myTree;

public class Word {
    
    private String spanishWord; 
    private String englishWord;

    public Word(String spanishWord, String englishWord) {
   		setSpanishWord(spanishWord.toString());
		setEnglishWord(englishWord.toString());

    } 

    public String getSpanishWord() {
        return spanishWord;
    }

    public void setSpanishWord(String spanishWord) {
        this.spanishWord = spanishWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }
    
}
