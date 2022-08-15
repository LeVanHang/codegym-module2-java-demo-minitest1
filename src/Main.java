import manager.Employee;
import manager.FullTimeEmployee;
import manager.PartTimeEmployee;
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new PartTimeEmployee(691, "AnhHieu", 36, 986886222, "xuanhieuvn@gmail.com", 24);
        Employee employee2 = new PartTimeEmployee(692, "TuLinh", 34, 388205097, "tulinhphung1997@gmail.com", 18);
        Employee employee3 = new PartTimeEmployee(693, "CongTrung", 35, 164213030, "trungtashi@gmail.com", 30);

        Employee employee4 = new FullTimeEmployee(694, "Con tró họ Đức", 19, 971365312, "ducminhhuy99tbvn@gmail.com", 3, 20000, 7728000);
        Employee employee5 = new FullTimeEmployee(695,"DuyPhong",18,369678405,"ndphong165@gmail.com",1,0,7728000);
        Employee employee6 = new FullTimeEmployee(696,"PhamHan",20,962088749,"petphamhandc@gmail.com",2,0,7728000);

        Employee[] listEmployee = {employee1, employee2, employee3, employee4, employee5, employee6};
        System.out.println(sortFeInSalary(listEmployee));
}

    public static double getOverageSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return (sum / employees.length);
    }

    public static void makelistFeUnderOverageSalary(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof FullTimeEmployee) {
                double salary = ((FullTimeEmployee) employees[i]).getSalary();
                if (salary < getOverageSalary(employees)){
                    System.out.println(employees[i].getName());
                }
            }
        }
    }

    public static double getTotalPeSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof PartTimeEmployee) {
                sum += ((PartTimeEmployee)employees[i]).getSalary();
            }
        }
        return sum;
    }

    public static Employee[] sortFeInSalary(Employee[] employees) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof FullTimeEmployee){
                count++;
            }
        }
        Employee[] array = new Employee[count];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof FullTimeEmployee){
                for (int j = 0; j < count; j++) {
                    array[j] = (FullTimeEmployee)employees[i];
                }
            }
        }
        return array;
    }
}