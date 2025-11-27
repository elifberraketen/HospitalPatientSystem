public class DischargeRecord {
    int patientId = Patient.id;
    long dischargeTime ;

    DischargeRecord(long dischargeTime){
        this.dischargeTime =dischargeTime ;
    }

    public String toString() {
        return "Discharge: patientId= " + patientId + ", time= " + dischargeTime;
    }

}

