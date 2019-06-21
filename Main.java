//Author: Reza Akhlaqi      6-18-2019
package puzzling;



public class Main {

    public static void main(String[] args) {
   
PuzzleJava Puzzle = new PuzzleJava ();  //call for the Driver Class and make new object variable "Puzzle"
    
    
//array variables
int [] arr1 = {3,5,1,2,7,9,8,13,25,32};


  
    System.out.println("Sum of the Array and greater than 10"); 
    System.out.println(Puzzle.RetGT10(arr1));
    System.out.println("");
    
    System.out.println("Shuffle and Print Greater than 5 and then return the ones with Greater than 5 length in new array:"); 
    System.out.println(Puzzle.Shuffle5());
    System.out.println("");
    
    System.out.println("Shuffle the Alphabet Letters in the array"); 
    PuzzleJava.SuffleAlpha();
    System.out.println("");
    
    System.out.println("return an array with 10 random numbers between 55-100:");
    System.out.println(Puzzle.Rnd55to100());
    System.out.println("");
    
    System.out.println("Sort, Find lowest and largest numbers of an array with 10 random numbers between 55-100:");
    System.out.println(Puzzle.Srt55to100());
    System.out.println("");
    
    System.out.println("Create a random string that is 5 characters long:");       
    System.out.println(Puzzle.Stringer());
    System.out.println("");

    System.out.println("Generate an array with 10 random strings that are each 5 characters long:");
    System.out.println(Puzzle.Rnd10());
    System.out.println("");

//end
    }
}
