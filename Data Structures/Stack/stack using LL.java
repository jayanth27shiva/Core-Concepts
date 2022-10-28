class Node {
    int data;
    Node next;
} 
class stackLL {
    Node top=null;
    Node createNode(int data) {
        Node nn = new Node();
        nn.data=data;
        nn.next=null;
        return nn;
    } 
    void push(int data) {
        Node nn = createNode(data);
        if(top==null) {
            top=nn;
        } else {
            nn.next=top;
            top=nn;
        }
    }
    void pop() {
        if(top!=null) {
            top=top.next;
        }
    }
    void peek() {
        System.out.println(top.data);
    }
    void display() {
        Node temp=top;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
}
class Main{
    public static void main(String[] args) {
    stackLL L = new stackLL();
    L.push(10);
    L.push(20);
    L.push(30);
    L.display();
    L.pop();
    L.display();
    L.peek();
    }
}
