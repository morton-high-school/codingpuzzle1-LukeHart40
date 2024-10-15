import java.util.Scanner;
import java.io.File;

public class decipher{
    public static void main(String[] args) throws Exception{
        File puzzle = new File("puzzle.txt");
        Scanner reader = new Scanner(puzzle);
        String text = reader.nextLine();

        String g = "giraffe";
        int giraffeCount = 0;
        for(int i=0;i<text.length();i++){
            if(text.substring(i,i+7).equals(g)){
                giraffeCount++;
            }else if(giraffeCount == 10){
                System.out.println(text.indexOf(g));
                break;
            }
        }
        System.out.println(giraffeCount);
    }
}