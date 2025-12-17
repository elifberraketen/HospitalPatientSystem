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

        System.out.println("-------------HOSPITAl SYSTEM---------------");

        HospitalSystemDemo hospital = new HospitalSystemDemo();
        hospital.addPatient(new Patient(101, "Ali", 7, 45));
        hospital.addPatient(new Patient(202, "Ayşe", 3, 30));
        hospital.addPatient(new Patient(303, "Mehmet", 9, 60));
        hospital.addPatient(new Patient(404, "Zeynep", 5, 25));
        hospital.addPatient(new Patient(505, "Can", 6, 50));
        hospital.addPatient(new Patient(606, "Elif", 4, 35));
        hospital.addPatient(new Patient(707, "Murat", 8, 55));
        hospital.addPatient(new Patient(808, "Ece", 2, 20));
        hospital.addPatient(new Patient(909, "Ahmet", 10, 70));
        hospital.addPatient(new Patient(1000, "Selin", 1, 18));

        // 2️⃣ Add treatment requests
        hospital.addTreatmentRequest(new TreatmentRequest(1), false);
        hospital.addTreatmentRequest(new TreatmentRequest(2), false);
        hospital.addTreatmentRequest(new TreatmentRequest(3), true);  // priority
        hospital.addTreatmentRequest(new TreatmentRequest(4), false);
        hospital.addTreatmentRequest(new TreatmentRequest(5), true);  // priority
        hospital.addTreatmentRequest(new TreatmentRequest(6), false);
        hospital.addTreatmentRequest(new TreatmentRequest(7), true);  // priority
        hospital.addTreatmentRequest(new TreatmentRequest(8), false);

        // 3️⃣ Add 2 discharge records (manual)
        hospital.dischargeStack.push(new DischargeRecord(99));
        hospital.dischargeStack.push(new DischargeRecord(100));

        // 4️⃣ Sort patients by severity BEFORE treatment
        System.out.println("Patients sorted by severity:");
        hospital.sortPatientsBySeverity();

        // 5️⃣ Process 4 treatment requests (priority first)
        System.out.println("\nProcessing treatment requests...");
        hospital.processTreatment();
        hospital.processTreatment();
        hospital.processTreatment();
        hospital.processTreatment();

        // 6️⃣ Print final system state
        System.out.println("\nFINAL SYSTEM STATE:");
        hospital.printSystemState();
    }
}

    }


}
