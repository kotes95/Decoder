package Tests;

import static org.junit.Assert.*;
import Decoder.Decoder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is to test the decoder
 */
public class DecoderTest {
    protected Decoder decoder;

    // initialise test object
    @Before
    public void runBefore() {
        decoder = new Decoder();
    }

    // test decoder method
    @Test
    public void testConvert1() {
        decoder.setInput("..-");

        Assert.assertEquals("U", decoder.decode());
    }

    @Test
    public void testConvert2() {
        decoder.setInput(".");
        Assert.assertEquals("E", decoder.decode());
    }

    @Test
    public void testConvert3() {
        decoder.setInput(". -");
        Assert.assertEquals("ET", decoder.decode());
    }

    @Test
    public void testConvert4() {
        decoder.setInput("..-. .- -");
        Assert.assertEquals("FAT", decoder.decode());
    }

    @Test
    public void testClear() {
        decoder.setInput("..-. .- -");
        Assert.assertEquals("FAT", decoder.decode());
        decoder.clearDecoder();
        decoder.setInput(". -");
        Assert.assertEquals("ET", decoder.decode());
    }


}