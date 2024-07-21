import java.util.*;
public class Evaluation_prefix{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter prefix string");
        String prefix=sc.nextLine();
        Evaluationpostfix(prefix);
    }
    public static void Evaluationpostfix(String prefix){
        Stack<Integer> s=new Stack<>();

        for(int i=prefix.length()-1;i>=0;i--){
        char temp=prefix.charAt(i);
            if(Character.isDigit(temp)){
                s.push(temp-'0');
            }
            else{
                int op1=s.pop();
                int op2=s.pop();
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
