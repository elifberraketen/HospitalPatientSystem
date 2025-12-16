public class TreatmentRequest {
    int patientId ;
    long arrivalTime ;

    TreatmentRequest(int patientId){
        this.patientId =patientId;
        this.arrivalTime =System.currentTimeMillis() ;
    }
    public String toString() {
        return "patient id = " + patientId +
                "arrival Time = " + arrivalTime ;
    }
}
