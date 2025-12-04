public class Main {
    static void main(String[] args) {
        PatientList list= new PatientList();

        list.addPatient(new Patient(123 ,"Elif Berra KETEN",1,19));
        list.addPatient(new Patient(124 ,"Ayşe DAĞ",4,60));
        list.addPatient(new Patient(125 ,"Yusuf PATATES",7,49));
        list.addPatient(new Patient(126 ,"Selim ŞEKER",2,8));
        list.addPatient(new Patient(127 ,"Mine TATLICI",2,46));


        list.removePatient(126);
        list.findPatient(125);
        list.printPatientList();
        System.out.println("------------------------");

        TreatmentQueue queue1 = new TreatmentQueue();

        for (int i =1;i<= 8; i++) {
            queue1.enqueue(new TreatmentRequest(10 + i));
        }

        for (int i=0 ; i<=2;i++ ){
            System.out.println("Dequeued part: "+queue1.dequeue());
        }
        queue1.printQueue();
        System.out.println("------------------------");


    }
}
