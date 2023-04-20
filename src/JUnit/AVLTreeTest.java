package JUnit;

import Model.AVLTree;
import Model.Word;
import Model.myRedBlackTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVLTreeTest {
    @Test
    void addAndGetAVLTreeTest() {
        AVLTree<Word> AVLTest = new AVLTree<Word>();

        AVLTest.add(new Word("food", "comida"));
        AVLTest.add(new Word("time", "tiempo"));
        AVLTest.add(new Word("computer", "computadora"));


        Word wordToSearch = AVLTest.get(new Word("food", ""));
        assertEquals("comida", wordToSearch.getSpanishWord());

        wordToSearch = AVLTest.get(new Word("time", ""));
        assertEquals("tiempo", wordToSearch.getSpanishWord());

        wordToSearch = AVLTest.get(new Word("computer", ""));
        assertEquals("computadora", wordToSearch.getSpanishWord());
    }
}