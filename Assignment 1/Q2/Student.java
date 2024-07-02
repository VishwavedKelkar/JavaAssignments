import java.util.*;
class Student{
    private int roll_no;
    private String name;
    private int marks;

    Student(){
        this.roll_no=roll_no;
        this.name=name;
        this.marks=marks;
    }
    public void printStudentDetails(){
        System.out.println("The student details are as follows:\n");
        System.out.println("The name is : "+name+"\nThe roll number is : "+roll_no+"\nThe marks are : "+marks);
    }

    public void acceptStudentDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name=sc.nextLine();
        System.out.println("Enter your roll number : ");
        roll_no = sc.nextInt();
        System.out.println("Enter your marks : ");
        marks = sc.nextInt();
    }

    public static void main(String args[]){
        Student stu = new Student();
        stu.acceptStudentDetails();
        stu.printStudentDetails();
    }
}