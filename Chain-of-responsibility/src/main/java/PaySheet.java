public class PaySheet {

    private Integer empNo;
    private Double salary;

    private Double covidDeduction;

    public void setCovidDeduction(Double covidDeduction) {
        this.covidDeduction = covidDeduction;
    }

    public PaySheet(Integer empNo, Double salary) {
        this.empNo = empNo;
        this.salary = salary;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public Double getSalary() {
        return salary;
    }

    public Double getCovidDeduction() {
        return covidDeduction;
    }


}
