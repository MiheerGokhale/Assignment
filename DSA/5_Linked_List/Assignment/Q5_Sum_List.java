public class Q5_Sum_List {
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

    public void insertAtFront(int data){
        Node node=new Node(data);

        //if no linked list exist
        if (head==null) {
            head=node;
        }
        else{
            node.next=head;//new node next point front node
            head=node;// head pointer point new head node
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
    public static Q5_Sum_List sumList(Node head1,Node head2){
        Node current1=head1;
        Node current2=head2;

        int sumList1=0,sumList2=0;

        //traverse linkedlist1 and find the number represent by list1
        while (current1!=null) {
            sumList1=sumList1*10+current1.data;
            current1=current1.next;
        }

        //traverse linkedlist2 and find the number represent by list2
        while (current2!=null) {
            sumList2=sumList2*10+current2.data;
            current2=current2.next;
        }

        //total sum of list1 and list2
        int totalSum=sumList1+sumList2;

        //create a new linkedlist with total sum digits
        Q5_Sum_List list=new Q5_Sum_List();

        while(totalSum!=0){
            list.insertAtFront(totalSum%10);
            totalSum/=10;//totalSum=totalSum/10;
        }

        return list;
    }

    public static void main(String[] args) {
        Q5_Sum_List list=new Q5_Sum_List();

        list.insertAtEnd(7);
        list.insertAtEnd(5);
        list.insertAtEnd(9);
        list.insertAtEnd(4);
        list.insertAtEnd(6);
        
        Q5_Sum_List list2=new Q5_Sum_List();

        list2.insertAtEnd(8);
        list2.insertAtEnd(4);

        list.displayLL();
        list2.displayLL();

        Q5_Sum_List sumList=sumList(list.head, list2.head);
        sumList.displayLL();
    }
}
