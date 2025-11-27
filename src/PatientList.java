
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
            return;
        }
        Node temp =head;
        
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
        System.out.println("Patient with " +id+ "id is removed.");

        if (current ==null){
            System.out.println("Patient yok");
        }
        size --;
    }

   /* public Patient findPatient(int id){   //????
        Node current =head;
        while(head != null){
            if(current.data = id){
                return current.data;
            }
            head = head.next ;
        }
    }*/

    public void printPatientList( ){
        Node temp = head ;

        while(temp != null){
            System.out.println(temp.data + " ---> ");
            temp = temp.next ;

        }

    }

}
