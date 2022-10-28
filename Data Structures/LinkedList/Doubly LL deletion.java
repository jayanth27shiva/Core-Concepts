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
    void insertAtBeginning(int data) {
        Node nn = createNode(data);
        if(head==null) {
            head=nn;
        } else {
            nn.next=head;
            head.prev=nn;
            head=nn;
        }
    }
    void insertAtEnd(int data) {
        Node nn = createNode(data);
        Node temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        } temp.next=nn;
        nn.prev=temp;
    }
    void insertAtPosition(int data,int loc) {
        Node nn = createNode(data);
        Node temp=head;
        Node pre=null;
        while(--loc>0) {
            pre=temp;
            temp=temp.next;
        } nn.next=temp;
        nn.prev=pre;
        pre.next=nn;
        temp.prev=nn;
    }
    void display() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
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
    L.insertAtBeginning(10);
    L.insertAtBeginning(20);
    L.display();
    L.insertAtEnd(30);
    L.insertAtEnd(40);
    L.display();
    L.insertAtPosition(25,2);
    L.display();
    L.deleteAtBegining();
    L.display();
    L.deleteAtEnd();
    L.display();
    L.deleteAtPosition(2);
    L.display();
    }
}
