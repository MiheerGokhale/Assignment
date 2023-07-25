import java.util.ArrayList;

public class Q4_Palindrome {
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
    //Space Complexity: O(n)
    public void palindrome(){
        Node current=head;
        boolean flag=true;

        //convert Linkedlist to ArrayList
        ArrayList<Integer> list=new ArrayList<>();

        while(current!=null){
            list.add(current.data);
            current=current.next;
        }

        //two point approach
        int low=0,high=list.size()-1;

        while(low<high){
            //compare low and high element equal or not
            if (list.get(low).equals(list.get(high))) {
                low++;
                high--;
            }
            else{
                flag=false;
                break;
            }
        }

        System.out.println(flag);
    }
    public static void main(String[] args) {
        Q4_Palindrome list=new Q4_Palindrome();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(4);
        list.insertAtEnd(2);
        list.insertAtEnd(1);

        list.displayLL();

        list.palindrome();
    }
}
