
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

