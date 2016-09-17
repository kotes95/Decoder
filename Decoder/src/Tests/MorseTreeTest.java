package Tests;

import Decoder.MorseTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is to test the morse tree
 */
public class MorseTreeTest {
    protected MorseTree tree;

    // initialise test object
    @Before
    public void runBefore() {
        tree = new MorseTree();
    }

    // test tree initialisation
    @Test
    public void testConstructor(){
        Assert.assertEquals(40, tree.size());
    }

    // test morse translations
    @Test
    public void testTranslate1(){
        Assert.assertEquals('E', tree.translate("."));
        Assert.assertEquals('T', tree.translate("-"));
    }

    @Test
    public void testTranslate2(){
        Assert.assertEquals('I', tree.translate(".."));
        Assert.assertEquals('A', tree.translate(".-"));
        Assert.assertEquals('N', tree.translate("-."));
        Assert.assertEquals('M', tree.translate("--"));
    }

    @Test
    public void testTranslate3(){
        Assert.assertEquals('S', tree.translate("..."));
        Assert.assertEquals('W', tree.translate(".--"));
        Assert.assertEquals('D', tree.translate("-.."));
        Assert.assertEquals('O', tree.translate("---"));
    }

    @Test
    public void testTranslateBad(){
        Assert.assertEquals(' ', tree.translate("......"));
        Assert.assertEquals(' ', tree.translate("------"));
    }

}