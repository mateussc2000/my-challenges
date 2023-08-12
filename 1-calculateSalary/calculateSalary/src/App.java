public class App {
    public static void main(String[] args) throws Exception {

        Dev devSalary = new Dev(4000);
        Dbas dbasSalary = new Dbas(4000);
        Testers testersSalary = new Testers(4000);

        System.out.println("devSalary = " + devSalary.getWage());
        System.out.println();
        System.out.println("dbasSalary = " + dbasSalary.getWage());
        System.out.println();
        System.out.println("testersSalary = " + testersSalary.getWage());
    }
}
