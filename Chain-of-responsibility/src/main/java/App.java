public class App {

    public static void main(String[] args) {

        CovidFund covidFund = new CovidFund();
        GovermentFund govermentFund = new GovermentFund();
        SalaryBonus salaryBonus = new SalaryBonus();
        VehicleAllowance vehicleAllowance = new VehicleAllowance();
        Deduct deduct = new Deduct();

        deduct.setSuccessor(covidFund);
        covidFund.setSuccessor(govermentFund);
        govermentFund.setSuccessor(salaryBonus);
        salaryBonus.setSuccessor(vehicleAllowance);

        PaySheet paySheet = new PaySheet(1,200000.00);
        System.out.println(deduct.deductions(paySheet));

        PaySheet paySheet1 = new PaySheet(2,100000.00);
        System.out.println(deduct.deductions(paySheet1));
    }
}
