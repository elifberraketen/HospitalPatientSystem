
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

    public void push (DischargeRecord record){
        Node newNode = new Node(record);
        newNode.data =record ;
        newNode.next = top ;
        top = newNode ;
    }

    public DischargeRecord pop(){
        if (top == null){
            System.out.println("Stack is empty!");
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
            System.out.println("Stack is empty!");
        }
        Node current =top ;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
