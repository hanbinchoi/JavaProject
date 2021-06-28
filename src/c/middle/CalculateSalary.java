package c.middle;

public class CalculateSalary {
    public static void main(String[] args){
        CalculateSalary sample = new CalculateSalary();
        Employee a = new Employee("hanbin",2,100000);
        sample.calculateSalaries();
    }
    public long getSalaryIncrease(Employee employee){
        long increaseSalary;
        int rate=0;
        switch (employee.getType()){
            case 1:
                rate = -95;
                break;
            case 2:
                rate = 10;
                break;
            case 3:
                rate = 20;
                break;
            case 4:
                rate = 30;
                break;
            case 5:
                rate = 100;
                break;

        }
        increaseSalary = employee.getSalary() * (100+rate) / 100;

        return increaseSalary;
    }
    public void calculateSalaries(){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("LeeDaeRi",1,1000000000);
        employees[1] = new Employee("KimManager",2,100000000);
        employees[2] = new Employee("WhangDesign",3,70000000);
        employees[3] = new Employee("ParkArchi",4,80000000);
        employees[4] = new Employee("LeeDevelop",5,60000000);

        for(Employee person : employees){
            System.out.println(person.getName()+"="+getSalaryIncrease(person));
        }
    }
}
