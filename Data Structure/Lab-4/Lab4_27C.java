import java.util.*;
public class Lab4_27C{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();

		System.out.println("final String :");
		String str2=" ";

		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c>='A' && c<='z'){
				c=(char)(c+32);
			}
			else if(c>='a' && c<='z'){
				c=(char)(c-32);
			}

			str2=str2+c;
			else{
				System.out.println("please Enter valid input");
			}
		}
		System.out.println(str2);
	}
}