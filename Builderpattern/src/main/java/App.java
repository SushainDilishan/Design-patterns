public class App {

    public static void main(String[] args) {

        TelescopicMethod01 telescopicMethod01 = new TelescopicMethod01("sushi");
        System.out.println(telescopicMethod01);

        TelescopicMethod02 telescopicMethod02 = new TelescopicMethod02("su");
        System.out.println(telescopicMethod02);

        Student.Builder builder = new Student.Builder("sushi");

        Student student = builder.salary(20000.00).address("aaaaa").build();
        System.out.println(student);

    }
}
