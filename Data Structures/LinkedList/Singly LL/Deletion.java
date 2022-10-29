
class Node {
    int data;
    Node next;
} 

class linkedList {
    Node head=null;
    Node createNode(int data) {
        Node nn = new Node();
        nn.data=data;
        nn.next=null;
        return nn;
    }
    void insertion(int data) {
        Node nn=createNode(data);
        Node temp = head;
        while(temp.next!=null) {
            temp=temp.next;
        } 
        temp.next=nn;
    }
    void deleteAtBeginning() {
        if(head!=null) {
            head=head.next;
        }
    }
    void deleteAtEnd() {
        Node temp=head;
        Node prev=null;
        while(temp.next!=null) {
            prev=temp;
            temp=temp.next;
        } prev.next=null;
    }
    void deleteAtPosition(int loc) {
        Node temp=head;
        Node prev=null;
        for(int index=0;index<loc-1;index++) {
            prev=temp;
            temp=temp.next;
        } 
        prev.next=temp.next;
    }
    void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data);
            if(temp.next!=null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		linkedList L = new linkedList();
		int n = sc.nextInt();
	    	for(int index=0;index<n;index++) {
	        	int data = sc.nextInt();
	        	L.insertion(data);
	    	}
	    	L.display();
		L.deleteAtBeginning();
		L.display();
		L.deleteAtEnd();
		L.display();
		L.deleteAtPosition(2);
		L.display();
		
	}
}
