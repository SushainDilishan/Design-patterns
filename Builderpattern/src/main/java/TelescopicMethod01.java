public class TelescopicMethod01 {

    String fname;
    Double salary;
    String lname;
    String address;

    public TelescopicMethod01(String fname){
        this.fname = fname;
    }

    public TelescopicMethod01(String fname,Double salary){
        this(fname);
        this.salary = salary;
    }

    public TelescopicMethod01(String fname,Double salary,String lname){
        this(fname,salary);
        this.lname = lname;
    }

    public TelescopicMethod01(String fname,Double salary,String lname,String address){
        this(fname,salary,lname);
        this.address = address;
    }

    @Override
    public String toString() {
        return "TelescopicMethod01{" +
                "fname='" + fname + '\'' +
                ", salary=" + salary +
                ", lname='" + lname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
