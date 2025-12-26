
public class DischargeStack {

    public class Node{
        DischargeRecord data ;
        Node next ;

        Node(DischargeRecord data){
            this.data =data;
            this.next = null ;
        }

    }
    Node top ;

    //Add new record to the top
    public void push (DischargeRecord record){
        Node newNode = new Node(record);
        newNode.data =record ;
        newNode.next = top ;
        top = newNode ;
    }

    //Deleting the last record
    public DischargeRecord pop(){
        if (top == null){
            System.out.println("Record stack is empty");
            return null;
        }
        DischargeRecord temp =top.data;
        top =top.next ;
        return temp ;
    }
    public DischargeRecord peek() {
        return top.data ;
    }
    public void printStack(){
        if (top == null){
            System.out.println("Record stack is empty");
        }
        Node current =top ;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
