package Decoder;

/**
 * Created by Nikolai on 27/8/2016.
 */

/** This is the class that specifies the morse tree and its contents
 *
 */
public class MorseTree {
    public MorseNode root;

    // constructs the morse tree and the relevant data
    public MorseTree(){
        root = new MorseNode();

        // enter in morse code data
        // level 1
        add('E', ".");
        add('T', "-");
        // level 2
        add('I', "..");
        add('A', ".-");
        add('N', "-.");
        add('M', "--");
        // level 3
        add('S', "...");
        add('U', "..-");
        add('R', ".-.");
        add('W', ".--");
        add('D', "-..");
        add('K', "-.-");
        add('G', "--.");
        add('O', "---");
        // level 4
        add('H', "....");
        add('V', "...-");
        add('F', "..-.");
        add('L', ".-..");
        add('P', ".--.");
        add('J', ".---");
        add('B', "-...");
        add('X', "-..-");
        add('C', "-.-.");
        add('Y', "-.--");
        add('Z', "--..");
        add('Q', "--.-");
        // level 5
        add('5', ".....");
        add('4', "....-");
        add('3', "...--");
        add('2', "..---");
        add('1', ".----");
        add('6', "-....");
        add('7', "--...");
        add('8', "---..");
        add('9', "----.");
        add('0', "-----");
    }

    // helper function that adds letters based on morse code
    private void add(char letter, String morse){
        MorseNode curr = root;
        String direction;

        // read morse string
        for (int i = 0; i < morse.length(); i++) {
            direction = morse.substring(i,i+1);
            if (direction.equals(".")){ // go left down the tree
                if (curr.getLeft() != null){
                    curr = curr.getLeft();
                } else {
                    curr.setLeft(new MorseNode()); // create a new blank node
                    curr = curr.getLeft();
                }
            } else { // go right down the tree
                if (curr.getRight() != null){
                    curr = curr.getRight();
                } else {
                    curr.setRight(new MorseNode());
                    curr = curr.getRight();
                }
            }
        }

        // after morse code traversed, current is at desired node
        curr.setLetter(letter);
    }

    // takes in a morse string and returns a letter
    // effects: reads morse tree and returns letter corresponding to code
    public char translate(String morse){
        MorseNode curr = root;
        String direction;

        for (int i = 0; i < morse.length(); i++) {
            direction = morse.substring(i,i+1);
            if (direction.equals(".")){ // go left down the tree
                if (curr.getLeft() != null){
                    curr = curr.getLeft();
                } else {
                    curr.setLeft(new MorseNode()); // create a new blank node
                    curr = curr.getLeft();
                }
            } else { // go right down the tree
                if (curr.getRight() != null){
                    curr = curr.getRight();
                } else {
                    curr.setRight(new MorseNode());
                    curr = curr.getRight();
                }
            }
        }

        // after morse code traversed, current is at desired node
        return curr.getLetter();
    }

    // retrieves size of tree for testing purposes
    // effects: returns number of nodes
    public int size(){
        return size(root);
    }

    // retrieves size of subtree for testing purposes
    // effects: returns the number of nodes in subtree
    public int size(MorseNode node){
        int size = 0;

        if (node != null) {
            size += size(node.getLeft());
            size++;
            size += size(node.getRight());

            return size;
        }
        return size;
    }

}
