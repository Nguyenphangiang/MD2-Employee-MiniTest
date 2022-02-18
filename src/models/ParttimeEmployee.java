package models;



public class ParttimeEmployee extends Employee{
    public static final int SALARYPERHOUR = 100;
    private double wordHour;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(double wordHour) {
        this.wordHour = wordHour;
    }

    public ParttimeEmployee(String employeeCode, String fullName, int age,String phone, String email, double wordHour) {
        super(employeeCode, fullName, age,phone, email);
        this.wordHour = wordHour;
    }

    public double getWordHour() {
        return wordHour;
    }

    public void setWordHour(double wordHour) {
        this.wordHour = wordHour;
    }

    @Override
    public double getNetSalary() {
        double result = getWordHour()* SALARYPERHOUR;
        return result;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" + super.toString() +
                "wordHour=" + wordHour +
                '}';
    }
}
