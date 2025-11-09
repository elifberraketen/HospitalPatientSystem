
public class PatientList {

    Node head ;

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

        Node new_node = new Node(data);

    }

    public void removePatient(int id){

    }

    public int findPatient(int id){

        return id;
    }

    public void printPatientList(Patient data ){

    }

}
