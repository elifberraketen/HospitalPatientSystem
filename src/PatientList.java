
public class PatientList {
    Node tail;
    Node head ;
    int size = 0;

    public static class Node {

        Patient data ;
        Node next ;


        Node(Patient d){
            data = d ;
            next = null ;
        }
    }
    public boolean isEmpty(){
        return (head == null) ;
    }

    public void addPatient(Patient data){
        Node newNode = new Node(data);
        if (head ==null){
            head =newNode;
            return;
        }
        Node temp =head;
        
        tail.next = newNode;
        tail = newNode ;
        size++ ;

    }

    public void removePatient(int id){
        if (head == null){
            System.out.println("List is empty !");
        }
        Node current = head;

        while (current != null  && current.data.id !=id){
            current =current.next ;

        }
        if (current ==null){
            System.out.println("Patient yok");
        }


    }

    public Patient findPatient(int id){
        id =Patient.id;
        while(head != null){
            if(head.data = id){
                return Patient.namesurname;
            }
            head = head.next ;
        }
    }

    public void printPatientList(Patient data ){
        Node temp = head ;

        while(temp != null){
            System.out.println(temp.data + " --->");
            temp = temp.next ;

        }

    }

}
