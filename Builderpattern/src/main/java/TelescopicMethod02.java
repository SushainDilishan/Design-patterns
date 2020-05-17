public class TelescopicMethod02 {

    private String fname;
    private Double salary;
    private String lname;
    private String address;

    public TelescopicMethod02(String fname, Double salary, String lname, String address) {
        this.fname = fname;
        this.salary = salary;
        this.lname = lname;
        this.address = address;
    }

    public TelescopicMethod02(String fname,Double salary,String lname){
        this(fname,salary,lname,null);
    }
    public TelescopicMethod02(String fname,Double salary){
        this(fname,salary,null);
    }

    public TelescopicMethod02(String fname){
        this(fname,null);
    }

    @Override
    public String toString() {
        return "TelescopicMethod02{" +
                "fname='" + fname + '\'' +
                ", salary=" + salary +
                ", lname='" + lname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
