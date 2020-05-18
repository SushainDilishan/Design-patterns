public class SalaryBonus extends Handler {

    public double deductions(PaySheet paySheet) {

        paySheet.setCovidDeduction(paySheet.getCovidDeduction()-20000);
        System.out.println("Salary Bonus Deducted");

        if(paySheet.getSalary()>100000 && paySheet.getSalary()<=150000){
            return paySheet.getCovidDeduction();
        }

        return successor.deductions(paySheet);
    }

}
