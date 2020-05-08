
public class LinkedList {
	//LinkedList head;
	//LinkedList next;
	
	LinkedList head;
	LinkedList next;
	int data;
	public LinkedList() {
				
	}
	public LinkedList(int data) {
		this.data=data;
	}
	
	public void append(int data) {
		if(head==null) {
			head=new LinkedList(data);
			return;
		}
		LinkedList current=head;
		
		while(current.next!=null) {
			current=current.next;
		}
		current.next=new LinkedList(data);
		
		
	}
	
	public void prepend(int data) {
		LinkedList newHead=new LinkedList(data);
		newHead.next=head;
		head=newHead;
	}
	
	public void delete(int data) {
		if(head==null) {
			return;
		}
		if(head.data==data) {
			head=head.next;
			return;
		}
		LinkedList current=head;
		while(current.next!=null) {
			if(current.next.data==data) {
				current.next=current.next.next;
				
			}
			current=current.next;
			
		}
		
		
	}
	
	public void printData() {
		
		if(head==null) {
			System.out.println("empty list");
			return;
		}
		
		if(head.next==null) {
			System.out.println("one element:"+head.data);
			return;
		}	
		LinkedList current=head;
		System.out.print("[");
		while(current!=null) {
			System.out.print(" "+current.data);
			current=current.next;
			
		}
		System.out.print(" ]");
		
	}
}
