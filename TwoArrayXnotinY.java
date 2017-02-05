import java.util.HashSet;
import java.util.Scanner;

/**
 * Given two sequence of numbers, prints all numbers that are in the first
 * sequence but in the second
 */
public class TwoArrayXnotinY {

   public static void main(String[] args){
      //Getting input
      Scanner scanner = new Scanner(System.in);
      String firstInput = scanner.nextLine();
      String secondInput = scanner.nextLine();

      //Creating the set and adding inputs from second sequence
      HashSet<String> collection = new HashSet<>();

      for (String num : secondInput.split(" ")){
         collection.add(num);
      }

      //Checking
      for (String num : firstInput.split(" ")){
         if(!collection.contains(num)){
            System.out.println(num);
         }
      }
   }
}
