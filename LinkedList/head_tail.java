package LinkedList;

public class head_tail {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
//Add first
    public void addfirst(int data){
        // crate new node
        Node newNode = new Node(data);
        if(head==null){
            head =tail =newNode;
            return;
        }
        // Step 2-  newNode next =head
        newNode.next =head;
        //step 3 head = new node
        head =newNode;

    }
    public void print(){
        Node temp =head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;          
        }
    }
    public static void main(String[] args){
        head_tail ll = new head_tail();
        ll.addfirst(1);
        ll.addfirst(2);

    }
}


    

