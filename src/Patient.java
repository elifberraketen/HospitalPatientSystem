public class Patient {

    static int id ;  //priv mi olmalı
    public static String namesurname ;
    public int severity ; //priv getter ile değer aralığı kontrol edilir mi
    public int age ;

    public Patient(int id ,String namesurname,int severity,int age){

        this.id = id;
        this.namesurname = namesurname;
        this.severity = severity;
        this.age =age ;
    }

    public String toString() {
        return "Patient id= " + id +
                " name and surname= " + namesurname +
                ", severity= " + severity +
                ", age= " + age;
    }


}


