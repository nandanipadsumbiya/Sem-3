import java.util.*;
class Stack{
    private char[] Array;
    private int top;
    private int m;

    public Stack(int m){
        this.m=m;
        Array=new char[m];
        top=-1;
    }

    public void push(char c){
        Array[++top]=c;
    }
    public char pop(){
        return Array[top--];
    }
}
public class Recognize{
    public static boolean recognize(String str){

        int halflength=str.length() /2;
        Stack s=new Stack(str.length());

        for(int i=0;str.charAt(i)!='c';i++){
            s.push(str.charAt(i));
        }

        int start =(str.length()%2==0)?halflength:halflength+1;
        for(int i=start;i<str.length();i++){
            if(str.charAt(i)!=s.pop()){
                return false;
            }
        }
        return true;
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter input string");
        String str=sc.next();

        boolean iscorrect=recognize(str);
        System.out.println(str+"is grammatically correct?"+iscorrect);


    }

    }
