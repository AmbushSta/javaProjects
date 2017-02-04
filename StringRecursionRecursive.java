/**
 * Reverses a string using recursion
 */
public class StringReversalRecursion {


   public static void main(String[] args){
      StringReversalRecursion answer = new StringReversalRecursion();
      System.out.println("Result: " + answer.stringRecursion("test"));
   }

   String reversedStr = "";

   private String stringRecursion(String str){
      if(str.length() == 0){

      }else{
         reversedStr += str.charAt(str.length() - 1);
         stringRecursion(str.substring(0, str.length() -1));
      }
      return reversedStr;
   }
}