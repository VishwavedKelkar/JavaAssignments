package com.app.org;
import java.util.*;


public class Worker {
    private double hourlyRate;
    private double hourlyWorked;
    Scanner sc = new Scanner(System.in);

    public Worker(int id, String name, String deptid, double basic,double performanceBonus,double hourlyRate, double hourlyWorked) {
        super(id,name,deptid,basic,performanceBonus);
        this.hourlyRate = hourlyRate;
        this.hourlyWorked = hourlyWorked;
    }


    public double setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
        System.out.println("Enter your hourly rate :");
        hourlyRate = sc.nextDouble();
        return hourlyRate;
    }

    public double getnetSalary(){
        double netSalary=getBasic() + (hourlyWorked*hourlyRate);
        return netSalary;
    }

    @Override
    public String toString() {
        return "Worker[id: "+getId()+" name: "+getName()+" deptId: "+getDeptId()+
        " basic: "+getBasic()+" hoursWorked: "+hoursWorked+" hourlyRate: "+hourlyRate+" ]";
    }

    

    
}
