class Node {
    int data;
    Node prev,next;
} 
class linkedList {
    Node head = null;
    Node createNode(int data) {
        Node nn = new Node();
        nn.data=data;
        nn.next=null;
        nn.prev=null;
        return nn;
    } 
    void insertion(int data) {
        Node nn = createNode(data);
        Node temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        } temp.next=nn;
        nn.prev=temp;
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
    void deleteAtBegining() {
        if(head!=null) {
            head=head.next;
            head.prev=null;
        }
    }
    void deleteAtEnd() {
        Node temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        } temp.prev.next=null;
    }
    void deleteAtPosition(int loc) {
        Node temp=head;
        while(--loc>0) {
            temp=temp.next;
        } temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }
}
class Main{
    public static void main(String[] args) {
    linkedList L = new linkedList();
    int n = sc.nextInt();
	for(int index=0;index<n;index++)
	{
	    int data = sc.nextInt();
	    L.insertion(data);
	}
    L.display();
    L.deleteAtBegining();
    L.display();
    L.deleteAtEnd();
    L.display();
    L.deleteAtPosition(2);
    L.display();
    }
}
