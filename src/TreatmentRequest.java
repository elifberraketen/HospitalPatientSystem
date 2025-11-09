public class TreatmentRequest {
    int patiendId ;
    long arrivalTime ;

    TreatmentRequest(int patientId){
        this.patiendId =Patient.id;
        this.arrivalTime =System.currentTimeMillis() ;
    }
}
