package com.org.app;
import java.util.*;

public class Mgr extends Emp {
    Scanner sc = new Scanner(System.in);
    private double performanceBonus;

    public Mgr(int id, String name, String deptid, double basic,double performanceBonus) {
        super(id,name,deptid,basic);
        this.performanceBonus = performanceBonus;
    }

    public double performanceBonus(){
        System.out.println("Enter your performance bonus : ");
        performanceBonus=sc.nextDouble();
        return performanceBonus;
    }

    public double getNetSalary(){
        double netSalary = basic + performanceBonus;
        return netSalary;
    }

    @Override
    public String toString() {
        return "Mgr[id: " + getId() + " name : " +getName()+ " deptId: " +getDeptId()+ 
    			" basic: " +getBasic()+ " performanceBonus: " +performanceBonus+ "]";
    }
    
    

}
