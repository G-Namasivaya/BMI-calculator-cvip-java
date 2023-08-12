import java.util.Scanner;

class BMI
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter weight");
double weight=s.nextDouble();
System.out.println("Enter hetght: feet");
int feet=s.nextInt();
System.out.println("Enter height: inches");
int inches=s.nextInt();
double bmi=weight/(feeet*12)+inches;
System.out.println("your BMI is" + bmi);
}
}
