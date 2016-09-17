package Decoder; /**
 * Created by Nikolai on 23/8/2016.
 */


import java.util.Arrays;
import java.util.List;

/** This is the class that performs the decoding of morse input
 *
 */
public class Decoder {
    private MorseTree tree;
    private String input;
    private String output = "";
    private List<String> inputList;

    // constructs decoder object, constructs the morse tree
    public Decoder(){
        tree = new MorseTree();
    }

    // converts string input into inputList (helper for decode())
    // effects: fills input array with morse sequences split from string
    public void convertInput(){
        inputList = Arrays.asList(input.split("\\s+"));
    }

    // decodes inputArray into output
    // effects: translates inputArray morse sequences into output string (and returns it)
    public String decode(){
        String letter;
        convertInput();
        for (String item: inputList){
            letter = Character.toString(tree.translate(item)); // convert translated char into string
            output = output.concat(letter); // add string to output
        }
        return output;
    }

    // sets decoder input string
    // effects: updates input string
    public void setInput(String message){
        input = message;
    }

    // clears decoder output string
    // effects: deletes output data
    public void clearDecoder(){
        output = "";
    }

}
