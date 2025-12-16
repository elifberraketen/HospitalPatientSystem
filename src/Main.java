public class Main {
    static void main(String[] args) {
        PatientList list= new PatientList();

        list.addPatient(new Patient(123 ,"Elif Berra KETEN",6,19));
        list.addPatient(new Patient(124 ,"Ayşe DALLI",4,60));
        list.addPatient(new Patient(125 ,"Yusuf PATATES",2,49));
        list.addPatient(new Patient(126 ,"Selim ŞEKER",1,8));
        list.addPatient(new Patient(127 ,"Mine TATLI",2,46));


        list.removePatient(126);
        Patient lookingFor =list.findPatient(126);

        if (lookingFor!= null)
            System.out.println(lookingFor);
        else
            System.out.println("Patient not found in the patient list");


        list.printPatientList();

        System.out.println("------------------------");

        TreatmentQueue queue1 = new TreatmentQueue();

        queue1.enqueue(new TreatmentRequest( 100));
        queue1.enqueue(new TreatmentRequest( 101));
        queue1.enqueue(new TreatmentRequest( 102));
        queue1.enqueue(new TreatmentRequest( 103));
        queue1.enqueue(new TreatmentRequest( 104));
        queue1.enqueue(new TreatmentRequest( 105));
        queue1.enqueue(new TreatmentRequest( 106));
        queue1.enqueue(new TreatmentRequest( 107));


        for (int i=0 ; i<=2;i++ ){
            System.out.println("Dequeued part: "+queue1.dequeue());
        }
        System.out.println();
        System.out.println("Remaining Queue: ");
        System.out.println();

        queue1.printQueue();


        System.out.println("------------------------");

        DischargeStack stack = new DischargeStack();

        stack.push(new DischargeRecord(123));
        stack.push(new DischargeRecord(124));
        stack.push(new DischargeRecord(125));
        stack.push(new DischargeRecord(126));
        stack.push(new DischargeRecord(127));


        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.printStack();

        System.out.println("-----------------------");

    }
}
