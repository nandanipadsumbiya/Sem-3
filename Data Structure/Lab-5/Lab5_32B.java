import java.util.*;
public class Lab5_32B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string s:");
        String s=sc.next();
        System.out.println("Enter a string a:");
        String a=sc.next();
    }

public class  checkAnagram(){

    if(s.length()!=a.length()){
        return false;
    }

    char[]s1=s.tocharArray();
    char[]s2=a.tocharArray();
    Arrays.sort(s1);
    Arrays.sort(s2);

    for(int i=0;i<s.length();i++){
        if(s1[i]==s2[i]){
            System.out.println("String is anagram");
        }
    }
    System.out.println("String is not anagram");
}
}