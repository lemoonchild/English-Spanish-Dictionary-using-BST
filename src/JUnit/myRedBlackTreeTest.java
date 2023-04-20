package JUnit;

import Model.Word;
import Model.myRedBlackTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myRedBlackTreeTest {

    @Test
    void addAndGetRBTreeTest() {
        myRedBlackTree<Word> RBTest = new myRedBlackTree<Word>();

        RBTest.add(new Word("hello", "hola"));
        RBTest.add(new Word("cat", "gato"));
        RBTest.add(new Word("book", "libro"));


        Word wordToSearch = RBTest.get(new Word("hello", ""));
        assertEquals("hola", wordToSearch.getSpanishWord());

        wordToSearch = RBTest.get(new Word("cat", ""));
        assertEquals("gato", wordToSearch.getSpanishWord());

        wordToSearch = RBTest.get(new Word("book", ""));
        assertEquals("libro", wordToSearch.getSpanishWord());
    }

}