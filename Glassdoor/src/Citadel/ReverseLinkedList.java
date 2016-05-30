package Citadel;

public class ReverseLinkedList {
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data =d;
			this.next = null;
		}
		void display()
		{
			System.out.print(data + " ");
		}
	}
	
	public static void print (Node n)
	{
		Node temp = n;
		while(temp!=null)
		{
			temp.display();
			temp = temp.next;
		}
	}
	public static Node reverse(Node head)
	{
		if(head==null||head.next==null)
	        return head;
	 
	    Node p1 = head;
	    Node p2 = p1.next;
	 
	    head.next = null;
	    while(p1!=null&& p2!=null){
	        Node t = p2.next;
	        p2.next = p1;
	        p1 = p2;
	        p2 = t;
	    }
	 
	    return p1;
	}
	public static void main(String[] args) {
		ReverseLinkedList r = new ReverseLinkedList();
		Node head = r.new Node(1);
		head.next = r.new Node(2);
		head.next.next = r.new Node(3);
		head.next.next.next = r.new Node(4);
		print(head);
		Node rev = reverse(head);
		System.out.println("The Reversed Linked List is");
		print(rev);
	}
}
