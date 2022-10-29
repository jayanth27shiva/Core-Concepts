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
class Main{
    public static void main(String[] args) {
    linkedList L = new linkedList();
    int n = sc.nextInt();
	  for(int index=0;index<n;index++) {
	    int data = sc.nextInt();
	    L.insertion(data);
	  }
    L.display();
    int key = sc.nextInt();
	  L.search(key);
    }
}
