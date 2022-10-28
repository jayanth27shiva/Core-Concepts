class Node {
    int data;
    Node next;
} 
class QueueLL {
    Node front=null ,rear = null;
    Node createNode(int data) {
        Node nn = new Node();
        nn.data=data;
        nn.next=null;
        return nn;
    } 
    void enqueue(int data) {
        Node nn = createNode(data);
        if(front==null) {
            front=nn;
            rear=nn;
        } else {
            rear.next=nn;
            rear=nn;
        }
    }
    void dequeue() {
        if(front!=null) {
            front=front.next;
        }
    }
    void peek() {
        System.out.println(front.data);
    }
    void display() {
        Node temp=front;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
}
class Main{
    public static void main(String[] args) {
    QueueLL L = new QueueLL();
    L.enqueue(10);
    L.enqueue(20);
    L.enqueue(30);
    L.display();
    L.dequeue();
    L.display();
    L.peek();
    }
}
