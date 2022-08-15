package manager;

public class FullTimeEmployee extends Employee{
    private double bonus;
    private double penalty;
    private double salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(int employeeCode, String name, int age, int phoneNumber, String email, double bonus, double penalty, double salary) {
        super(employeeCode, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.penalty = penalty;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary(){
        return salary + (bonus-penalty);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "bonus=" + bonus +
                ", penalty=" + penalty +
                ", salary=" + salary +
                "} " + super.toString();
    }
}