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


}
