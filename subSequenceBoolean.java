import java.util.Scanner;

/**
 * CodingBat groupSum question: http://codingbat.com/prob/p145416
 *
 * Question: Given an array of ints, is it possible to choose a
 * group of some of the ints, such that the group sums to the given target?
 *
 *
 * My idea: Treat each number as a 1 or 0. Obtain all combination
 * of 1 and 0s for the list of nums, if 1 remove from the target if 0
 * leave the number. The means there will be 2^n combinations to obtain the answer
 * If the target is 0 when we are at the remaining index, it means that
 * that combination of numbers equals the target goal.
 *
 * Note: Modified to take sequence and target from standard input
 */
public class groupSum {

   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      String[] numsString = scanner.nextLine().split(" ");
      int target = Integer.parseInt(scanner.nextLine());

      int[] nums = new int[numsString.length];
      for(int index = 0; index < nums.length; index++){
         nums[index] = Integer.parseInt(numsString[index]);
      }


      System.out.println(groupSum(0, nums, target));
   }
   public static boolean groupSum(int index, int[] nums, int target) {
      //Base case
      if (index >= nums.length){
         if (target == 0){
            return true;
         } else{
            return false;
         }
      }
      /*The two following boolean statements return true
      * if the base case is met during the recursive calls
      * or it will reach the false at the bottom since
      * it returns false and fails the boolean condition
      */

      //Current index being treated as a 1 and being removed
      if (groupSum(index + 1, nums, target - nums[index])){
         return true;
      }
      //Current index being treated as a 0, and NOT being removed
      if ((groupSum(index +1, nums, target))){
         return true;
      }
      //If both if conditions fail
      return false;
   }
}
