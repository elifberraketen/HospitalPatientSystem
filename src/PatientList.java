
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

    public void addPatient(Patient data){
        Node newNode = new Node(data);
        if (head ==null){    //this means our list is empty
            head =newNode;
            tail =newNode;
            size++;
            return;
        }
        
        tail.next = newNode;
        tail = newNode ;
        size++ ;

    }
    //Remove patient by id
    public void removePatient(int id){
        if (head == null){
            System.out.println("There is no patient in the list");
        }
        Node current = head;
        Node prev =null;

        while (current != null && current.data.id!=id){  //searching for given id
            prev=current;
            current =current.next ;

        }
        if(current.data.id== id){

            if(prev==null){
                head = head.next;
            }
            else{
                prev.next = current.next;
            }
            System.out.println("Patient with " +id + " id is removed from list.");
        }
        size --;
    }
//Find the patient by its id
    public Patient findPatient(int id){
        Node current = head;
        while(current != null){
            if( current.data.id == id){
                return current.data;  //returning a Patient object
            }
            current =current.next ;
        }
        return null;
    }


    public void printPatientList( ){
        Node temp = head ;
        int count =1;

        while(temp != null){
            System.out.println(count +"."+temp.data );
            temp = temp.next ;
            count++;

        }

        //Sorting the patients
    }
    public void bubblePriortySort(){
        Node i;
        Node j;

        for(i =head  ;i!= null ; i=i.next){
            for(j = head ; j.next!=null ;j =j.next){
                if (j.data.severity> j.next.data.severity){
                    Patient current =j.data;
                    j.data=j.next.data;
                    j.next.data= current;
                }
            }
        }
    }

}
