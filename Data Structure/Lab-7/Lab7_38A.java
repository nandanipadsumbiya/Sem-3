import java.util.*;

class Stack{
	int [] arr;
	int top;
	int m; //m is length of array


	Stack(int m){
		this.m=m;
		this.top=-1;
		arr=new int[m];

	}
	 void push(int n){
		if(top>=m-1){
			System.out.println("Stack is overflow");
			return;
		}
		else{
			top++;//top=top+1;
			arr[top]=n;
			System.out.println("Element is pushed");
		}
	
	}
	public int pop(){
		
		if(top==-1){
			System.out.println("stack is underflow");
			return(0);

		}
		else{
			top--;
			System.out.println("Element is poped");
			return(arr[top+1]);
		}
	}
	public void peep(int I){
		
		if(top-I+1<=-1){
			System.out.print("stack is overflow");
		}
		else{
			System.out.print( arr[top-I+1]);
		}
	}
	public void Change(int i,int a){
		
		if(top-i+1<=-1){
			System.out.print("stack is underflow");
		}
		else{
			arr[top-i+1]=a;
			
		}
	}

	void display(){
	for(int i=0;i<=top;i++){
		System.out.println(arr[i]);
	}
  }
}
public class Lab7_38A{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		

		System.out.println(" Enter a length of array m:");
		int m=sc.nextInt();
		
		Stack s=new Stack(m);
		boolean flag=true;
		while (flag) {
			System.out.println("enter 1 for push");
			System.out.println("Enter 2 for pop");
			System.out.println("Enter 3 for peep");
			System.out.println("Enter 4 for Chenge");
			System.out.println("Enter 5 for display");
			System.out.println("Enter 6 for Break");

			int x = sc.nextInt();
			if(x==1){
				System.out.println(" Enter element n:");
				int n = sc.nextInt();
			    s.push(n);
			}
			else if (x==2) {
				s.pop();
			}
			else if(x==3){
				 System.out.println("Enter peep element index of stack : ");
				 int i=sc.nextInt();
				 s.peep(i);

			}
			else if(x==4){
				System.out.println("Enter index if stack: ");
				 int i=sc.nextInt();
				 System.out.println("Enter change element stack: ");
				 int a=sc.nextInt();
				 s.Change(i,a);
			}
			else if(x==5){
				System.out.println("...ans....");
				s.display();
			}
			else if(x==6){
				flag=false;
				break;
			}
			// s.display();
			
		}
		
		
	}
}