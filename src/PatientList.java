
public class PatientList {
    Node tail;
    Node head ;
    int size = 0;

    public static class Node {

        Patient data ;
        Node next ;

        Node(Patient data){
            this.data = data ;
            this.next = null ;
        }
    }
    public boolean isEmpty(){
        return (head == null) ;
    }

    public void addPatient(Patient data){
        Node newNode = new Node(data); //listede sona eklenir
        if (head ==null){
            head =newNode;
            tail =newNode;
            size++;
            return;
        }
        
        tail.next = newNode;
        tail = newNode ;
        size++ ;

    }

    public void removePatient(int id){
        if (head == null){
            System.out.println("There is no patient in the list!");
        }
        Node current = head;
        Node prev =null;
        while (current != null  && current.data.id !=id){
            prev=current;
            current =current.next ;

        }

        if (current == null) {
            System.out.println("Patient with id " + id + " not found!");
        }
        if(current.data.id== id){

            if(prev==null){
                head = head.next;
            }
            else{
                prev.next = current.next;
            }
            System.out.println("Patient with" +id + " id is removed from list.");
            return;
        }
        System.out.println("No patient found with id" + id);
        size --;
    }

    public Patient findPatient(int id){   //????
        Node current = head;
        while(current != null){
            if( current.data.id == id){
                return current.data;
            }
            current =current.next ;
        }
        return null; //returning an object
    }

    public void printPatientList( ){
        Node temp = head ;
        int num =1;

        while(temp != null){
            System.out.println(num +"."+ temp.data );
            temp = temp.next ;
            num++;

        }

    }

}
