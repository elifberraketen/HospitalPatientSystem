public class Main {
    static void main(String[] args) {
        PatientList list= new PatientList();

        list.addPatient(new Patient(12 ,"elif",1,19));
        list.addPatient(new Patient(11 ,"berra",4,8));
        list.removePatient(12);
        list.printPatientList();

        TreatmentQueue queue1 = new TreatmentQueue();

        for (int i =1;i<= 8; i++) {
            queue1.enqueue(new TreatmentRequest(10 + i));
        }

        for (int i=0 ; i<=2;i++ ){
            System.out.println("Dequeued part: "+queue1.dequeue());
        }


    }
}
