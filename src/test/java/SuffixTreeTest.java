import org.junit.Assert;
import org.junit.Test;
import suffix_tree.SuffixTree;

import java.util.ArrayList;
import java.util.List;

public class SuffixTreeTest {


    private String textToTest = "this text tightly some terrible sophisticated text";
    private String pattern;
    private SuffixTree suffixTree = new SuffixTree(textToTest);

    @Test
    public void okPattern() {

        pattern = "text";
        List<Integer> actual = suffixTree.searchPositions(pattern);
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(46);

        Assert.assertEquals(expected, actual);

    }

    @Test (expected = NullPointerException.class)
    public void nullPattern() {

        String pattern = null;
        suffixTree.searchPositions(pattern);

    }

    @Test
    public void noSuchSymbolsPattern() {

        pattern = "hello";

        List<Integer> actual = suffixTree.searchPositions(pattern);
        List<Integer> expected = new ArrayList<>();

        Assert.assertEquals(actual,expected);


    }


}
