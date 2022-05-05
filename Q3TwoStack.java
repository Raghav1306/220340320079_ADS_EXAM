import java.util.*;
class Q3TwoStack{
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[10];
		int n=arr.length;
		int top=-1;
		int bottom=n;
		
		public void push1(int data){
			
			if(top==(n-1)){
				System.out.println("Overflow");
				return;
			}
		
			top=top+1;
			arr[top]=data;
		}
		
		public void pop1(){
			if(top==-1){
				System.out.println("UnderFlow");
				return;
			}
			System.out.println("Popped element from stack1 is "+arr[top]);
			top=top-1;
		}
		
		
		
	
		public  void push2(int data){
			
			if(bottom==0){
				System.out.println("Overflow");
				return;
			}
		
			bottom=bottom-1;
			arr[bottom]=data;
		}
		
		
		
		public void pop2(){
			if(bottom==n){
				System.out.println("UnderFlow");
				return;
			}
			System.out.println("Popped element from stack2 is"+arr[bottom]);
			bottom=bottom+1;
		}
}

class Q3Solution{
	
		public static void main(String[] args){
	Q3TwoStack s=new Q3TwoStack();
	
		s.push1(5); 
		s.push2(10); 
		s.push2(15); 
		s.push1(11); 
		s.push2(7); 
		s.push2(40);
		s.pop1();
		s.pop2();
		
		
	}
}
		
	

