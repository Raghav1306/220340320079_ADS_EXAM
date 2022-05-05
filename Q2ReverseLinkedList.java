import java.util.*;
class Q2ReverseLinkedList{
	
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		public void add(int data){
			Node newNode=new Node(data);
			if(head==null){
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
		}
		
		Node reverseLinkedList(Node node)
		{
			Node prev=null;
			Node temp=null;
			Node next=null;
			while(temp!=null){
				next=temp.next;
				temp.next=prev;
				prev=temp;temp=next;
			}
			node=prev;
			return node;
		}
		public void display(){
			Node temp=head;
			while(temp!=null){
				System.out.println(temp.data+" ");
				temp=temp.next;
				
			}
		}
	}

	public static void main(String[] args){
		 Q2ReverseLinkedList LL=new  Q2ReverseLinkedList();
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int size=sc.nextInt();
		
		
		for(int i=0;i<size;i++){
			int data=sc.nextInt();
			add(data);
		}
		Node temp=reverseLinkedList(head);
		display();
	}

}