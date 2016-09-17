package Decoder; /**
 * Created by Nikolai on 27/8/2016.
 */

/** Node class that makes up the morse code tree
 *
 */
public class MorseNode {

    // alphabet stored in node
    private char letter;
    // left child reference
    private MorseNode left;
    // right child reference
    private MorseNode right;

    // constructor
    public MorseNode() {
        letter = ' ';
        left = null;
        right = null;
    }

    // sets the letter in the node
    // effects: sets node's letter to specified
    public void setLetter(char c){
        this.letter = c;
    }

    // sets the node's left child
    // effects: sets node's left reference
    public void setLeft(MorseNode n){
        this.left = n;
    }

    // sets the node's right child
    // effects: sets node's right reference
    public void setRight(MorseNode n){
        this.right = n;
    }


    // getters for node
    public char getLetter(){
        return letter;
    }

    public MorseNode getLeft(){
        return left;
    }

    public MorseNode getRight(){
        return right;
    }
}
