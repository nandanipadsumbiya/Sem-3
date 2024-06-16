import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(n=='A'||n=='E'||n=='I'||n=='O'||n=='U'||n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){
            System.out.println("letter is vowel");
        }
        else{
            System.out.println("letter is  not vowel");
        }
        
        
    }
}
