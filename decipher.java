import java.util.Scanner;
import java.io.File;

public class decipher{
    public static void main(String[] args) throws Exception{
        File puzzle = new File("puzzle.txt");
        Scanner reader = new Scanner(puzzle);
        String text = reader.nextLine();

        String currentChar = "";
        String nextChar = "";
        String longString = "";

        String end = "";
        for(int i=0;i<text.length();i++){
            currentChar = text.substring(i,i+1);
            nextChar = text.substring(i+1,i+2);
            if(currentChar.equals(nextChar)){
                longString = currentChar + nextChar;
                System.out.print(longString);
            }else{
                longString = " ";
                System.out.print(longString);
            }
        }
    }
}

//USE THIS FOR LONGEST STRING OF CHARACTERS "dddddddddddddddddddddddd"
//armadilloyournexttaskandkeywordarelocatedintheonehundredandfivecharactersafterthelongeststringofthesameconsecutivecharacter
//Key words: armadillo