public class TreatmentQueue {
    class Node{
        int data ;
        Node next ;

       public Node(int data){
            this.data =data ;
            this.next =null;
        }
    }

    Node front ;
    Node end ;
    int size = 0 ;

    public TreatmentQueue(){
        this.end = null ;
        this.front = null ;
    }

    public void enqueue(int data ){
        Node newNode = new Node(data);
        if (end == null){
            front = end = newNode ;
        }
        end.next = newNode ;
        end =newNode ;
        size++ ;
    }

    public int dequeue(){
        if (end == null){
            System.out.println("It's already empty !");
            return -1;
        }
        int temp =front.data ;
        front =front.next ;
        size --;
        return temp;
    }

    public int size(){
        return size ;
    }

    public void printQueue(){
        Node current = front ;
        while(current == null){
            System.out.println(current.data);
            current =current.next ;
        }
    }
}
