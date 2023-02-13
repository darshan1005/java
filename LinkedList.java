

public class LinkedList {
	 static Node head;
	
	 static class Node{
		 
		 int data;
		 Node next;
		 
		 Node(int d){
			 data = d ;
			 next = null ;
		 }
	 }
	
	public static LinkedList insert(LinkedList l, int data) {
		
		Node Newnode = new Node(data);
		
		if (LinkedList.head == null) {
			LinkedList.head = Newnode;
		}
		else {
			Node last = LinkedList.head;
			while(last.next!=null) {
				last = last.next;
			}
			
			last.next = Newnode ;
		}
		return l;
	}
	

	public static void deleteNode(int key) {
		Node temp = head , prev = null;
		
		if (temp!=null && temp.data != key) {
			head = temp.next;
			return;
		}
		
		if (temp == null)
			return;
		
		prev.next = temp.next;
	}
	
	public static void printList(LinkedList l) {
		Node presentnode = LinkedList.head;
		
		System.out.print("LinedLIST: ");
		
		while (presentnode!= null) {
			System.out.print(presentnode.data+" ");
			presentnode = presentnode.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		
		l = insert(l,1);
		l = insert(l,2);
		l = insert(l,3);
		l = insert(l,4);
		l = insert(l,5);
		l = insert(l,6);
		l = insert(l,7);
		l = insert(l,8);
		
		
		printList(l);
		LinkedList.deleteNode(3);
		System.out.println();
		System.out.println("Linked List after Deletion of 2");
	    LinkedList.printList(l);
	}
		//Wrong out put
}
