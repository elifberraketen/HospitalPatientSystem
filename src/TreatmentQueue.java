public class TreatmentQueue {
    class Node{
        TreatmentRequest data ;
        Node next ;

       public Node(TreatmentRequest data){
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

    public void enqueue(TreatmentRequest request ){
        Node newNode = new Node(request);
        if (end == null){
            front = end = newNode ;
        }
        end.next = newNode ;
        end =newNode ;
        size++ ;
    }

    public TreatmentRequest dequeue(){
        if (end == null){
            System.out.println("It's already empty !");
            return null ;
        }

        TreatmentRequest temp =front.data ;
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
