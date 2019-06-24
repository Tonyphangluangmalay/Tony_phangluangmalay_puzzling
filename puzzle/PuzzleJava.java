import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;



public class PuzzleJava{


    ArrayList<Integer> printAndReturn(int arr[]){
        ArrayList<Integer> results = new ArrayList<Integer>();
        
        int sum = 0;
		for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
          
            if(arr[i] > 10){
                results.add(arr[i]);
            }
        }
        System.out.println("sum is " + sum);
         return results; 
    }

    ArrayList<String> shuffleNames(){
        ArrayList<String> names = new ArrayList<String>();
            names.add("Nancy");
            names.add("Jinchi");
            names.add("Fujibayashi");
            names.add("Momochi");
            names.add("Ishiwaka");
           
     
        Collections.shuffle(names);
        System.out.println("shuffled " + names);
        String[] array = new String[] {"Nancy", "Jinchi", "Fujibayashi", "Momochi", "Ishiwaka"};
        ArrayList<String> newarr = new ArrayList<String>();
        for(int i = 1; i < array.length; i++){
            newarr.add(array[i]);
                
            }
            System.out.println("names with more than 5 letters " + newarr);
        return newarr;
    }

    public void alphabet(){
        ArrayList<String> abc = new ArrayList<String>();
            abc.add("a");
            abc.add("b");
            abc.add("c");
            abc.add("d");
            abc.add("e");
            abc.add("f");
            abc.add("g");
            abc.add("h");
            abc.add("i");
            abc.add("j");
            abc.add("k");
            abc.add("l");
            abc.add("m");
            abc.add("n");
            abc.add("o");
            abc.add("p");
            abc.add("q");
            abc.add("r");
            abc.add("s");
            abc.add("t");
            abc.add("u");
            abc.add("v");
            abc.add("w");
            abc.add("x");
            abc.add("y");
            abc.add("z");

            Collections.shuffle(abc);
            System.out.println("Shuffled " + abc);
            System.out.println("First letter of array " + abc.get(0));
            System.out.println("last letter of array " + abc.get(25));
            // if(abc.get(0) == "a"; "e"; "i"; "o"; "u"; "y");{
            //     System.out.println("vowel");
            // }
        }

        public void generateRandom10(){
            ArrayList<Integer> ten = new ArrayList<Integer>();
            Random ran = new Random();
            int number;
            for(int i = 0; i < 10; i++){
                number = 55+ran.nextInt(46);
                ten.add(number);
            }
            System.out.println("random 10 numbers " + ten);
        }

        public void generateAndSort(){
            ArrayList<Integer> ten = new ArrayList<Integer>();
            Random ran = new Random();
            int number;
            for(int i = 0; i < 10; i++){
                number = 55+ran.nextInt(46);
                ten.add(number);
            }
            Collections.sort(ten);
            System.out.println(ten);
            System.out.println("minimum value " + ten.get(0));
            System.out.println("maximum value " + ten.get(9));
        }

        public void randomString(){
            Random ran = new Random();
            char[] abc = {'a','b','c','d','e','f','g','h','i','j'};
            String str = "";
            for(int i = 0; i < 5; i++){
                int ran1 = ran.nextInt(10);
                str += abc[ran1];
                
            }
            System.out.println(str);
        }

        public void random10(){
            Random ran = new Random();
            char[] abc = {'a','b','c','d','e','f','g','h','i','j'};
            ArrayList<String> arr = new ArrayList<String>();
            String str = "";
            for(int i = 0; i < 5; i++){
                int ran1 = ran.nextInt(10);
                str += abc[i] + abc[i] + abc[ran1];
                arr.add(str);
            }
           System.out.println(arr);
        }
    }