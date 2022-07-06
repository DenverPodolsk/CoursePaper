public class Main {
    public static  void countMinSalary(Employee[] employees) {

            if (employees.length >0  ){
                int minSalary=employees[0].getSalaryStaff();
               String staffMan ="";
                for (Employee employee : employees) {
                    if(minSalary>employee.getSalaryStaff()){
                        minSalary =employee.getSalaryStaff();
                        staffMan = employee.getStaff();
                }
                  }
                System.out.println("Сотрудник с минимальной зарплатой "+minSalary+staffMan);
            }
            else
                System.out.println("Массив пустой");
        }
        public static void countMaxSalary(Employee[]employees){
            if (employees.length >0  ){
                int minSalary=employees[0].getSalaryStaff();
                String staffMan ="";
                for (Employee employee : employees) {
                    if(minSalary<employee.getSalaryStaff()){
                        minSalary =employee.getSalaryStaff();
                        staffMan = employee.getStaff();
                    }
                }
                System.out.println("Сотрудник с максимальной зарплатой "+minSalary+staffMan);
            }
            else
                System.out.println("Массив пустой");
    }
    public static void typeAllStaff(Employee[]employees){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    public static int countStaffSalary(Employee[]employees){
        int sum= 0;
        for(Employee employee : employees){
            sum += employee.getSalaryStaff();
        }
        System.out.println("Сумма затрат на зарплаты в месяц "+sum);
        return sum;
    }
    public static void averageSalary(Employee[]employees){
        int sum =countStaffSalary(employees);
        int average = sum / employees.length;
        System.out.println("Средняя зарплата: "+average);
    }
    public static void countAllStaff(Employee[]employees){
        for(Employee employee : employees){
            System.out.println("Сотрудники компании: "+employee.getStaff());
        }
    }
public static void main(String[] args){

        Employee[] employee = new Employee[10];
        employee[0]=new Employee("Knyazev Denis Aleksandrovich",55000,1);
    employee[1]=new Employee("Ivanov Ivan Ivanovich",65000,2);
    employee[2]=new Employee("Ckvorchov Nikolai Petrovich",99000,3);
    employee[3]=new Employee("Petrov Vasilii Dmitrievich",98000,4);
    employee[4]=new Employee("Andreev Dmitrii Nikolaevich",120000,5);
    employee[5]=new Employee("Vasiliev Vadim Andreevich",130000,1);
    employee[6]=new Employee("Lobachev Sergei Dmitrievich",200000,2);
    employee[7]=new Employee("Abramov Andrei Denisovich",33000,3);
    employee[8]=new Employee("Moiseev Denis Valerivich",78000,4);
    employee[9]=new Employee("Bratovskii Mishail Sergeevich",120000,5);

    typeAllStaff(employee);
    countMinSalary(employee);
    countMaxSalary(employee);
    averageSalary(employee);
    countAllStaff(employee);

}
}
        




