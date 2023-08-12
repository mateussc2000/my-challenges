public class Dev extends Employee {
    
    public Dev(double salary) {
        super(salary);
    }

    public double getWage() {   
         double wage = 0;

            if (salary > 3000) {
                
                System.out.println("caso1: 10% de " + salary + " reais");
                wage = (double) 10 /100 * salary;
                return wage;
           
            } else {
                System.out.println("caso2: 20% de " + salary + " reais");
                wage = (double) 20 /100 * salary;
                return wage;
            }
    }   
}
