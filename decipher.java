import java.util.Scanner;
import java.io.File;

public class decipher{
    public static void main(String[] args) throws Exception{
        File puzzle = new File("puzzle.txt");
        Scanner reader = new Scanner(puzzle);
        String text = reader.nextLine();

        String firstChar = "";
        String lastChar = "";
        String longString = "";
        int length = 0;
        String newString = "";

        String end = "";
        for(int i=0;i<text.length();i++){
            newString = text.substring(i,i+11);
            for(int j=0;j<newString.length();j++){
                firstChar = newString.substring(j, j+1);
                lastChar = newString.substring(10-j, 11-j);
                if(firstChar.equals(lastChar)){
                    length++;
                }else{
                    length = 0;
                }
                if(length==11){
                    System.out.println(text.substring(i));
                }
            }
            
        }
    } 
}

//armadillo your next task and keyword are located in the one hundred and five characters after the longest string of the same consecutive character
//penguin your next task and keyword are located in the eighty characters after the string of length thirty with the most vowels
//ostrich your final keyword is located in the six characters after a palindrome of length eleven
//yo banana boy badgers
//Key words: armadillo/penguin/ostrich/badger