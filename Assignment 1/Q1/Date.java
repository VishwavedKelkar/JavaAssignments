import java.util.*;
class Date{
    private int day;
    private int month;
    private int year;

    public void initDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void printDate(){
        System.out.println("The date is : "+day+"/"+month+"/"+year);
    }

    public void acceptDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day : ");
        day=sc.nextInt();
        System.out.println("Enter the month : ");
        month=sc.nextInt();
        System.out.println("Enter the year: ");
        year=sc.nextInt();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        date.acceptDate();
        date.printDate();
    }
}