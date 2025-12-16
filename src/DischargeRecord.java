public class DischargeRecord {
    int patientId ;
    long dischargeTime ;

    DischargeRecord(int patientId){
        this.patientId=patientId;
        this.dischargeTime =System.currentTimeMillis();
    }

    public String toString() {

        return "Discharge : " +
                "patientId = " + patientId +
                " time = " + dischargeTime;
    }

}

