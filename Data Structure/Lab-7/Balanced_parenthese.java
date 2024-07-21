import java.util.*;
public class Balanced_parenthese {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter number of test :");
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            System.out.println("Enter a string test " +i+ ":");
            String input=sc.next();

            if(Balanced(input)){
                    System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }

    public static boolean Balanced(String s){
        int balance=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='('|| c=='{'||c=='['){
                balance++;
            }
            else if(c==')'||c=='}'||c==']'){
                balance--;
            }

            if(balance<0){
                return false;
            }
        }
        return balance==0;
    }
}
