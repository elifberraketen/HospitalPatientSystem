public class Patient {

    int id ;
    public  String namesurname ;
    public int severity ;
    public int age ;

    public Patient(int id ,String namesurname,int severity,int age){

        this.id = id;
        this.namesurname = namesurname;
        this.severity = severity;
        this.age =age ;
    }

    public String toString() {
        return "Patient id= " + id +
                " Name and Surname= " + namesurname +
                " Severity= " + severity +
                " Age= " + age;
    }


}


