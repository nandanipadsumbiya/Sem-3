import java.util.*;
import java.util.Stack;
import java.lang.*;
public class Infix_prefix{
   

    public static int IPF_Stack(char i){
        if(i=='+' || i=='-'){
            return 1;
        }
        else if(i=='*' || i=='/'){
            return 3;
        }
        else if(i=='^'){
            return 6;
        }
        else if(i=='('){
            return 9;
        }
        else if(i==')'){
            return 0;
        }
        else if((i>='A' && i<='Z')||(i>='a' && i<='z') ){
            return 7;
        }
        else{
            return -1;
        }
    }

    public static int SPF_Stack(char i){
        if(i=='+' || i=='-'){
            return 2;
        }
        else if(i=='*' || i=='/'){
            return 4;
        }
        else if(i=='^'){
            return 5;
        }
        else if(i=='('){
            return 0;
        }
        else if((i>='A' && i<='Z')||(i>='a' && i<='z') ){
            return 8;
        }
        else{
            return -1;
        }
    }

    public static int RF(char i){
        if(i=='+' || i=='-' || i=='*' || i=='/' || i=='^'){
            return -1;
        }
        else if((i>='A' && i<='Z')||(i>='a' && i<='z')){
            return 1;
        }
        else{
            return -2;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter infix string");
        String str=sc.nextLine();
        implement(str);
    }

    public static void implement(String str) {
        Stack<Character> s=new Stack<>();

        s.push('(');
        String polish=" ";
        int rank=0;

        for(int i=str.length()-1;i>=0;i--){
        
            char next=str.charAt(i);
            while(SPF_Stack(s.peek())>IPF_Stack(next)){
                char temp=s.pop();
                polish=polish+temp;
                rank=rank+RF(temp);

                if(rank<1){
                    System.out.println("invelid");
                    return;
                }
            }
            if(SPF_Stack(s.peek())!=IPF_Stack(next)){
                 s.push(next);
            }
            else{
                 s.pop();
            }
            
        }
       
        if(!s.isEmpty() || rank!=1){
            System.out.println("invelid");
        }
        else{
            System.out.println("valid");
            
        }
        System.out.println(polish);
    }
}