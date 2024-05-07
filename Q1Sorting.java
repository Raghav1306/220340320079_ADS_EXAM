import java.util.*;
class Q1Sorting{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a1[]=new int[5];
		int n=a1.length;
		System.out.println("Enter array elemnts");
		for(int k=0;k<n;k++){
			a1[k]=sc.nextInt();
		}
		
		
		for(int i=0;i<n;i++){
			int temp=a1[i];
			int j=i-1;
			while(j>=0 && a1[j]>temp){
				a1[j+1]=a1[j];
				j=j-1;
			}
			a1[j+1]=temp;
		}
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}
}
