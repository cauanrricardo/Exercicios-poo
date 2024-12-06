package entities;

public class Employee {
    public String name;
    public double grossSalary; //salario bruto
    public double tax; //taxa em porcentagem

    //salario  bruto
    public double netSalary(){
        return grossSalary - tax;

    }
    //aumento de salario
    public void increaseSalary(double porcentage){
      grossSalary *= 1 + porcentage/100;
    }

    public String toString(){
        return name + ", $" + String.format("%.2f", netSalary());
    }


}
