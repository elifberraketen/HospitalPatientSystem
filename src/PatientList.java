
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

    public boolean ısEmpty(){

        return (head == null) ;
    }



    public void addPatient(Patient data){

        Node new_node = new Node(data);





    }

    public void removePatient(int ıd){

    }

    public int findPatient(int ıd){

        return ıd;
    }

    public void printPatientList(Patient data ){

    }

}
