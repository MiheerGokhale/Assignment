
public class Q2_Insert_In_Given_position {
    Node head;
    
    class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void insertAtEnd(int data){
        Node node=new Node(data);

        //if no linked list exist
        if (head==null) {
            head=node;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
        }
    }

    public void displayLL(){
        Node curent=head;

        while (curent!=null) {
            System.out.print(curent.data+" ");
            curent=curent.next;
        }
        System.out.println();
    }

    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public void insertAtPosition(int position,int data){
        Node current=head;

        //traverse to given position
        while(current!=null && position>1){
            current=current.next;
            position--;
        }

        // for (int i = 1; i < position; i++) {
        //     current=current.next;
        // }

        //add new node
        Node newNode=new Node(data);
        newNode.next=current.next;
        current.next=newNode;
    }
    public static void main(String[] args) {
        Q2_Insert_In_Given_position list=new Q2_Insert_In_Given_position();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);

        list.displayLL();

        list.insertAtPosition(2,3);
        list.displayLL();
    }
}
