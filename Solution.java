import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
       
        System.out.println("enter string");
       Scanner s = new Scanner(System.in);
       
         String str = new String(s.nextLine());
         System.out.println("String: "+str);
         
           s.close();
    }
}
