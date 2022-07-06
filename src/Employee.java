

    public class Employee {
        private String staff;
        private int salaryStaff;
        private int deportamentNomber;
        private  int id;
        private static int counter;

        public Employee(String staff,int salaryStaff,int deportamentNomber){
            this.staff=staff;
            this.salaryStaff=salaryStaff;
            this.deportamentNomber=deportamentNomber;
            this.id=getCounter();
            counter++;
        }
        public static int getCounter(){return counter;}

        public String getStaff(){
            return staff;
        }
        public int getId() {return id;}

        public int getSalaryStaff() {return salaryStaff;}

        public int getDeportamentNomber() {return deportamentNomber;}

        public void setStaff(String staff){this.staff =staff;}

        public void setSalaryStaff(int salaryStaff){this.salaryStaff=salaryStaff;}

        public void setDeportamentNomber(int deportamentNomber) {this.deportamentNomber=deportamentNomber;}

        @Override

        public String toString(){
            return " Ф.И.О Сотрудника "+staff+ " Зарплата сотрудника " + salaryStaff + " Номер Депортамента  " + deportamentNomber + "Идентификационный номер "+id;





        }
    }

