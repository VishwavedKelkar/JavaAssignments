package com.app.org;

public class Emp {
    private int id;
    private String name;
    private String deptid;
    private double basic;

    public Emp(int id, String name, String deptid, double basic) {
        this.id = id;
        this.name = name;
        this.deptid = deptid;
        this.basic = basic;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeptid() {
        return deptid;
    }

    public double getBasic() {
        return basic;
    }

    
    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", deptid=" + deptid + ", basic=" + basic + "]";
    }

    public double getnetSalary() {
        return 0;
    }

    
}
