import java.util.*;

class Stack{
   char [] s;
	int top;
	// int n; //n is length of stack
    // int i;
    
    public Stack(int n){
        this.top=-1;
     
        s = new char[n];
    }

    void push(char X){
		if(top>=s.length){
			System.out.println("Stack is overflow");
			return;
		}
		else{
			top++;//top=top+1;
			s[top]=X;
            // return;
			System.out.println("Element is pushed");
		}
	
	}
    char pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
            return 0;
        }
        else{
            top=top-1;
            return s[top+1];
        }
    }

  
}

public class Lab7_39A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String");
        String sr=sc.next();

        Stack st=new Stack(sr.length());
        st.push('c');
        int i=0;
        char next=sr.charAt(0);
        while (next!='c'){
            if(next==' '){
                System.out.println("Invalid String");
                return;
            }
            else{
                st.push(next);
                i++;
                next = sr.charAt(i);
            }
        }
        i++;
        int x;
        while(st.s[st.top]!='c'){
            next =sr.charAt(i);
            x=st.pop();
            if(next!=x){
                System.out.println("Invalid String");
                return;
            }
            i++;
        }
        System.out.println("valid String");
    }
}
