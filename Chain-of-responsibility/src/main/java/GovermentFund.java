public class GovermentFund extends Handler{

    public double deductions(PaySheet paySheet) {

            paySheet.setCovidDeduction(paySheet.getCovidDeduction()-15000);
            System.out.println("GovermentFund Deducted");

            if(paySheet.getSalary()>50000 && paySheet.getSalary()<=100000){
                return paySheet.getCovidDeduction();
            }

            return successor.deductions(paySheet);
        }

}
