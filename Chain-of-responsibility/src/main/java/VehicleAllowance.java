public class VehicleAllowance extends Handler {

    public double deductions(PaySheet paySheet) {

        paySheet.setCovidDeduction(paySheet.getCovidDeduction()-25000);
        System.out.println("Vehicle Allowance Deducted");

        if(paySheet.getSalary()>150000 && paySheet.getSalary()<=200000){
            return paySheet.getCovidDeduction();
        }

        return successor.deductions(paySheet);
    }
}
