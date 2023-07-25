public class Q3_Remove_Duplicate {
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
    public void removeDuplicate(){
        Node current=head;

        while(current!=null && current.next!=null){
            //if current node and next node have same data value then remove next node(point current node to next of next node)
            if (current.next.data==current.data) {
                //point current node to next of next node
                current.next=current.next.next;
            }
            else{
                //point to next node
                current=current.next;
            }
        }
    }


    public static void main(String[] args) {
        Q3_Remove_Duplicate list=new Q3_Remove_Duplicate();

        list.insertAtEnd(1);
        list.insertAtEnd(1);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(2);
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(4);
        list.insertAtEnd(4);

        list.displayLL();

        list.removeDuplicate();
        list.displayLL();
    }

}
