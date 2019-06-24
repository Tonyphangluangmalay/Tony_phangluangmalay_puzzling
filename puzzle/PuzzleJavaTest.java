import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJavaTest{
    public static void main(String[] args){
        
        PuzzleJava iD = new PuzzleJava();
        
        int arr[] = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> results = iD.printAndReturn(arr);
        ArrayList<String> names = iD.shuffleNames();
        iD.alphabet();
        iD.generateRandom10();
        iD.generateAndSort();
        iD.randomString();
        iD.random10();
           
            
       


    }
}