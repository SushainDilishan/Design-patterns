public class CovidFund extends Handler {

    public double deductions(PaySheet paySheet) {

        paySheet.setCovidDeduction(paySheet.getSalary()-10000);

        System.out.println("CovidFund Deducted");

        if(paySheet.getSalary()<=50000){
            return paySheet.getCovidDeduction();
        }

        return successor.deductions(paySheet);
    }
}
