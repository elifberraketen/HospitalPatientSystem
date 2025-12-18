import java.util.*;

public class HospitalSystemDemo {

    PatientList patientList = new PatientList();
    DischargeStack dischargeStack = new DischargeStack();
    TreatmentQueue priorityQueue = new TreatmentQueue();
    TreatmentQueue normalTreatmentQueue = new TreatmentQueue();
    HashMap<Integer, Patient> patientHashMap = new HashMap<Integer, Patient>();

    public void addPatient(Patient patient){
        patientList.addPatient(patient);
        patientHashMap.put(patient.id,patient);
    }

    public void priorityTreatmentQueue(TreatmentRequest request ,boolean priority){
        if(priority){
            priorityQueue.enqueue(request);
        }
        else {
            normalTreatmentQueue.enqueue(request);
        }
    }

   public void severityHandling(){
       TreatmentRequest request;
       if (priorityQueue.size() > 0) {
           request = priorityQueue.dequeue();
       }
       else {
           request = normalTreatmentQueue.dequeue();
       }
       if (request!= null) {
           dischargeStack.push( new DischargeRecord(request.patientId));
       }
   }
   public void printCurrentState(){
       System.out.println("Patient List: ");
       patientList.printPatientList();

       System.out.println("Priority patient queue :");
       priorityQueue.printQueue();

       System.out.println("Patient queue : ");
       normalTreatmentQueue.printQueue();

       System.out.println("Discharged patients :");
       dischargeStack.printStack();
   }

    static void main(String[] args) {
        System.out.println("-------------HOSPITAl SYSTEM---------------");

        HospitalSystemDemo hospital = new HospitalSystemDemo();
        hospital.addPatient(new Patient(101, "Ali Çanta", 7, 40));
        hospital.addPatient(new Patient(202, "Ayşe Çanta", 3, 33));
        hospital.addPatient(new Patient(303, "Alara Çanta", 9, 60));
        hospital.addPatient(new Patient(404, "Zeynep Çanta", 5, 22));
        hospital.addPatient(new Patient(505, "Caner Çanta", 6, 10));
        hospital.addPatient(new Patient(606, "Selim Çanta", 4, 8));
        hospital.addPatient(new Patient(707, "Yusuf Bitki", 8, 49));
        hospital.addPatient(new Patient(808, "Ecem Bitki", 2, 20));
        hospital.addPatient(new Patient(909, "Mustafa Bitki", 10, 78));
        hospital.addPatient(new Patient(1000, "Selin Bitki", 6, 18));

        System.out.println("__System Request__ :"); //priority handling part
        hospital.priorityTreatmentQueue(new TreatmentRequest(1), false);
        hospital.priorityTreatmentQueue(new TreatmentRequest(2), false);
        hospital.priorityTreatmentQueue(new TreatmentRequest(3), true);  // has a priority
        hospital.priorityTreatmentQueue(new TreatmentRequest(4), false);
        hospital.priorityTreatmentQueue(new TreatmentRequest(5), true);  // has a priority
        hospital.priorityTreatmentQueue(new TreatmentRequest(6), false);
        hospital.priorityTreatmentQueue(new TreatmentRequest(7), true);  // has a priority
        hospital.priorityTreatmentQueue(new TreatmentRequest(8), false);

        System.out.println("\n_-_-_-_-_-_-_-_-_-");
        hospital.dischargeStack.push(new DischargeRecord(99));
        hospital.dischargeStack.push(new DischargeRecord(100));


        System.out.println("\n_-_-_-_-_-_-_-_-_-");
        hospital.patientList.bubblePriortySort();


        System.out.println("\n_-_-_-_-_-_-_-_-_-");
        hospital.severityHandling();
        hospital.severityHandling();
        hospital.severityHandling();
        hospital.severityHandling();


        System.out.println("\nSystem State: ");
        hospital.printCurrentState();
    }






}
