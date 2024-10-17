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
        int vowelCount = 0;

        String end = "";
        for(int i=0;i<text.length();i++){
            System.out.println(text.indexOf("kinnikinnik"));
        }
    } 
}

//armadillo your next task and keyword are located in the one hundred and five characters after the longest string of the same consecutive character
//penguin your next task and keyword are located in the eighty characters after the string of length thirty with the most vowels
//ostrich your final keyword is located in the six characters after a palindrome of length eleven
//Key words: armadillo/penguin/ostrich