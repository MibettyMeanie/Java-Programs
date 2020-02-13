package lala;


class Node {
	int data;
	Node next ;

}

class LinkedList {
	Node head;
	
	public void insert(int data) {
		 Node temp= new Node();
		 temp.data = data;
		 temp.next=null;
		 if(head==null) {
			 head=temp;
		 }else {
			 Node n=head;
			 while(n.next!=null) {
				  n=n.next; 
			 }
			 n.next =temp;
		 }
	}
	
	public void show() {
		 Node temp= head;
		 while(temp.next!=null) {
			 System.out.println(temp.data);
			 temp=temp.next;
		 }
		 System.out.println(temp.data );
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(20);
		list.insert(18);
		list.insert(50);
		list.show();
	}

}
