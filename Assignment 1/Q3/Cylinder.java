import java.util.*;
class Cylinder{
    Scanner sc = new Scanner(System.in);
    private float height;
    private float radius;
    private float volume;

    Cylinder(){
        this.height = height;
        this.radius = radius;
        this.volume = volume;
    }

    //Cylinder(double radius, double height){
      //  return 0;
    //}

    //Getting radius
    public void getRadius(){
        System.out.println("Enter the radius : ");
        radius = sc.nextFloat();
    }
    //Setting radius
    public void setRadius(){
        System.out.println("The radius is : "+radius);
    }
    //Getting height
    public void getHeight(){
        System.out.println("Enter the height : ");
        height = sc.nextFloat();
    }
    //Setting height
    public void setHeight(){
        System.out.println("The height is : "+height);
    }

    //Getting the volume
    public void getVolume(){
        volume = (float)(3.14*radius*radius*height);

    }
    //Setting the volume double
    public void printVolume(){
        System.out.println("The volume is : "+volume);
    }
    public static void main(String args[]){
        Cylinder cy = new Cylinder();
        cy.getHeight();
        cy.getRadius();
        cy.getVolume();
        cy.setHeight();
        cy.setRadius();
        cy.printVolume();
    }
}