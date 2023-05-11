package interfaces;

public interface SalaryIncrease {
    final public double FIVE_PERCENT = .05;
    final public double TEN_PERCENT = .10;
    int CURRENT_YEAR = 2023;

    public double getSalaryIncrease(int salary);
}
