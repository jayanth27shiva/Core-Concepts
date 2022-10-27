
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
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    void search(int key) {
        Node temp = head;
        int flag=0;
        while(temp.next!=null) {
            if(temp.data==key){
                // System.out.println("element found");
                flag=1;
            } temp=temp.next;
        }
            System.out.println(flag==0?"element not found":"element found");
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
		L.deleteAtBeginning();
		L.display();
		L.deleteAtEnd();
		L.display();
		L.deleteAtPosition(2);
		L.display();
		L.search(20);
		
	}
}

