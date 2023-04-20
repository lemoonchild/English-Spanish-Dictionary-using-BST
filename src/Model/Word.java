package Model;

/**
 * The type Word.
 */
public class Word implements Comparable<Word>{
    
    private String spanishWord; 
    private String englishWord;

    /**
     * Instantiates a new Word.
     *
     * @param englishWord the english word
     * @param spanishWord the spanish word
     */
    public Word(String englishWord, String spanishWord) {
   		setSpanishWord(spanishWord.toString());
		setEnglishWord(englishWord.toString());

    }

    /**
     * Gets spanish word.
     *
     * @return the spanish word
     */
    public String getSpanishWord() {
        return spanishWord;
    }

    /**
     * Sets spanish word.
     *
     * @param spanishWord the spanish word
     */
    public void setSpanishWord(String spanishWord) {
        this.spanishWord = spanishWord;
    }

    /**
     * Gets english word.
     *
     * @return the english word
     */
    public String getEnglishWord() {
        return englishWord;
    }

    /**
     * Sets english word.
     *
     * @param englishWord the english word
     */
    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

	public int compareTo(Word userword) {
		return englishWord.compareTo(userword.getEnglishWord());	
	}

}
    
