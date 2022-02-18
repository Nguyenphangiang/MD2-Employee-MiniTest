package models;

public class FulltimeEmployee extends Employee{
    private double bonus;
    private double fineMoney;
    private double baseSalary;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(double bonus, double fineMoney,double baseSalary) {
        this.bonus = bonus;
        this.fineMoney = fineMoney;
        this.baseSalary = baseSalary;
    }

    public FulltimeEmployee(String employeeCode, String fullName, int age,String phone, String email, double bonus, double fineMoney,double baseSalary) {
        super(employeeCode, fullName, age,phone,email);
        this.bonus = bonus;
        this.fineMoney = fineMoney;
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFineMoney() {
        return fineMoney;
    }

    public void setFineMoney(double fineMoney) {
        this.fineMoney = fineMoney;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getNetSalary() {
        double result = getNetSalary() + (getBonus() - getFineMoney());
        return result;
    }

    @Override
    public String
    toString() {
        return "FulltimeEmployee{" + super.toString()+
                "bonus=" + bonus +
                ", fineMoney=" + fineMoney +
                '}';
    }
}
