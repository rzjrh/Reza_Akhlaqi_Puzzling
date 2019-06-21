package puzzling;


import java.util.ArrayList;            //for using arrays
import java.util.Collections;          //for sort
import java.util.Random;               //for random selection

public class PuzzleJava {
    
    
    //******    1   ******
    //Create an array Print the sum of all numbers in the array. function return numbers that are greater than 10
   
    //create new method for array with integer value. Array (x)
    public ArrayList<Integer> RetGT10(int[] Array){
        
        //function to sum all numbers in the array and return <10s
        ArrayList<Integer> G10 = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i]; //find sum of all valuse
            if (Array[i]>10){
                G10.add(Array[i]); //.add= .push in JS
            }            
        }
        System.out.println("Sum of all numbers in the array is: " + sum);
        System.out.println("Numbers greater than 10 in the array:");
        return G10;
    }
    
 
    
  //******    2   ******
 /*create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa.
   Shuffle the array and print the name of each person. 
   Have the method also return an array with names that are longer than 5 characters*/
    
   public ArrayList Shuffle5(){
        String[] array = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};

        ArrayList<String> NL = new ArrayList<>(); //to make new array list
        ArrayList<String> G5 = new ArrayList<>();     //to make array with greater than 5 length 

        for(int i = 0; i<array.length; i++){
                if(array[i].length()>5){
                        G5.add(array[i]);
                }
                NL.add(array[i]);
        }
        Collections.shuffle(NL);    //shuffle the array
        System.out.println("Shuffeled list is: "+NL);
        System.out.println("Greater Than 5:");
        return G5;
    }
   
   
   
   
   
 //******    3   ******
/* Create an array  contains all alphabet. Shuffle the array and then display the last letter from the array. 
 also display the first letter of the array. If the first letter in the array is a vowel, have it display a message   */
   public static void SuffleAlpha(){
        char[] Alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> PrintAplha = new ArrayList<>();
        for(int i = 0; i<Alphabet.length; i++){
                PrintAplha.add(Alphabet[i]);
        }
        Collections.shuffle(PrintAplha);
        System.out.println(PrintAplha);
        System.out.println("Last letter: " + PrintAplha.get(25)); // from 0 to 25 is 26 values

        if(PrintAplha.get(0) == 'a' //if the first value in the char array is vowel do this if statement 
        || PrintAplha.get(0) == 'e' 
        || PrintAplha.get(0) == 'i' 
        || PrintAplha.get(0) == 'o' 
        || PrintAplha.get(0) == 'u') {
    System.out.println("First vowel letter: "+ PrintAplha.get(0));
    }
    else{
            System.out.println("First letter: "+PrintAplha.get(0));
    }
    }
   
   
   
   
   //******    4   ******
   // Generate and return an array with 10 random numbers between 55-100
   
    public ArrayList<Integer> Rnd55to100(){
        Random rnd = new Random();  //using import java.util.Random;
        int limit = 0;
        ArrayList<Integer> x= new ArrayList<>(); //make an array list of x
        while(limit<10){
                x.add(rnd.nextInt(45)+55); //nextInt: https://www.tutorialspoint.com/java/util/random_nextint_inc_exc.htm 45 valuse after the 55
                limit++;
        }
        return x;
    }
    
    

    
    
//******    5   ******
/*array with 10 random numbers between 55-100 and have it be sorted (smallest number in the beginning). 
Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value */
   
public ArrayList<Integer> Srt55to100(){
    Random rnd = new Random();      //using import java.util.Random;
    int limit = 0;
    ArrayList<Integer> x= new ArrayList<>();
    while(limit<10){
            x.add(rnd.nextInt(45)+55);  //nextInt 45 valuse which greater than 55
            limit++;
    }
    Collections.sort(x);        //using import java.util.Collections;
    System.out.println("Lowest number: "+x.get(0));
    System.out.println("Largest number: "+x.get(9));
    System.out.println("The Random 10 numbers are:");
    return x;
}





//******    6   ****** 
//Create a random string that is 5 characters long
public String Stringer(){
        Random rnd = new Random();    
        String rndWord = "";
        while(rndWord.length() < 5){            //remmber 0 to 4 is 5 valuse
            int random = rnd.nextInt((127));    //There are 128 alphabets and special  Key in Keyboard
            if (random > 32){                   //
            rndWord += Character.toString((char) random);
            }
        }
        return rndWord;
    }




//******    7   ****** 
//Generate an array with 10 random strings that are each 5 characters long

    public ArrayList < String > Rnd10() {   //create new arraylist method in String type
        ArrayList < String > array = new ArrayList <  > ();     //name our Sting Arraylist as "array"
        for (int i = 0; i < 10; i++) {
            String x = Stringer();      //we call the last method (#6) here
            array.add(x);
        }
        return array;
    }    
 
//end    
}
