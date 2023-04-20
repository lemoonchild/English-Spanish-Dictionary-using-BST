package Model;

public class Word implements Comparable<Word>{
    
    private String spanishWord; 
    private String englishWord;

    public Word(String englishWord, String spanishWord) {
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

	public int compareTo(Word userword) {
		return englishWord.compareTo(userword.getEnglishWord());	
	}

}
    
