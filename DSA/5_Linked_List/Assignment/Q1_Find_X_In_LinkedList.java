class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }
}

class Q1_Find_X_In_LinkedList{
    Node head;

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
    public void isPresent(int key){
        boolean flag=false;

        Node current=head;

        while(current!=null){
            if (current.data==key) {
                flag=true;
                break;
            }
            current=current.next;
        }

        if (flag) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Q1_Find_X_In_LinkedList list=new Q1_Find_X_In_LinkedList();

        list.insertAtEnd(14);
        list.insertAtEnd(21);
        list.insertAtEnd(11);
        list.insertAtEnd(30);
        list.insertAtEnd(10);

        list.displayLL();

        list.isPresent(14);
    }
}