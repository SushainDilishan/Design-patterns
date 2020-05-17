

public class Student {

    private final String fname;
    private final Double salary;
    private final String lname;
    private final String address;

    public Student(Builder build){
        this.fname = build.fname;
        this.salary= build.salary;
        this.lname= build.lname;
        this.address = build.address;
    }

    static class Builder{

        private String fname;
        private Double salary;
        private String lname;
        private String address;

        public Student build(){
            return new Student(this);
        }

        public Builder(String fname){
            this.fname = fname;
        }

        public Builder salary(Double salary){
            this.salary = salary;
            return this;
        }

        public Builder lname(String lname){
            this.lname = lname;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", salary=" + salary +
                ", lname='" + lname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
