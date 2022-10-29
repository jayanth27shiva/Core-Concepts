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
    void insertAtbeginning(int data) {
        Node nn=createNode(data);
        if(head==null) {
            head=nn;
        } else {
        nn.next=head;
        head=nn;
        }
    }
    void insertAtEnd(int data) {
        Node nn=createNode(data);
        Node temp = head;
        while(temp.next!=null) {
            temp=temp.next;
        } 
        temp.next=nn;
    }
    void insertAtSpecificPos(int data,int loc) {
        Node nn=createNode(data);
        Node temp = head;
        for(int index=0;index<loc-1;index++) {
            temp=temp.next;
        } 
        nn.next=temp.next;
        temp.next=nn;
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
		linkedList L = new linkedList();
		L.insertAtbeginning(10);
		L.insertAtbeginning(20);
		L.display();
		L.insertAtEnd(5);
		L.insertAtEnd(50);
		L.display();
		L.insertAtSpecificPos(30,3);
		L.display();
		
	}
}
