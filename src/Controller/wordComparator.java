package Controller;

import java.util.Comparator;

import myTree.Word;

public class wordComparator<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        Word pal1 = (Word)o1;
		Word pal2 = (Word)o2;
		return pal1.getSpanishWord().compareTo(pal2.getEnglishWord());
    }
    
}
