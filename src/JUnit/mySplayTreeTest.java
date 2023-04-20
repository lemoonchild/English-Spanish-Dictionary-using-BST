package JUnit;

import Model.Word;
import Model.myRedBlackTree;
import Model.mySplayTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mySplayTreeTest {

    @Test
    void addAndGetSplayTreeTest() {
        mySplayTree<Word> SplayTest = new mySplayTree<Word>();

        SplayTest.add(new Word("car", "coche"));
        SplayTest.add(new Word("music", "musica"));
        SplayTest.add(new Word("water", "agua"));


        Word wordToSearch = SplayTest.get(new Word("car", ""));
        assertEquals("coche", wordToSearch.getSpanishWord());

        wordToSearch = SplayTest.get(new Word("music", ""));
        assertEquals("musica", wordToSearch.getSpanishWord());

        wordToSearch = SplayTest.get(new Word("water", ""));
        assertEquals("agua", wordToSearch.getSpanishWord());
    }


}