import java.util.*;
public class Evaluation_postfix{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter postfix string");
        String postfix=sc.nextLine();
        Evaluationpostfix(postfix);
    }
    public static void Evaluationpostfix(String postfix){
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<postfix.length();i++){
        char temp=postfix.charAt(i);
            if(Character.isDigit(temp)){
                s.push(temp-'0');
            }
            else{
                int op2=s.pop();
                int op1=s.pop();
                switch(temp){
                    case '+':
                    s.push(op1+op2);
                    break;

                    case '-':
                    s.push(op1-op2);
                    break;

                    case '*':
                    s.push(op1*op2);
                    break;

                    case '/':
                    s.push(op1/op2);
                    break;
                }
            }
        }
        System.out.println("Evaluated result:");
        System.out.println(s.pop());
    }
}
