package java2;

import java.util.Scanner;
public class Java2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int code;
        String name;
        String gender;
        float salary;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Code : ");
        code=sc.nextInt();
        System.out.print("Enter Name : ");
        name=sc.next();
        System.out.print("Enter Gender : ");
        gender=sc.next();
        System.out.print("Enter Salary : ");
        salary=sc.nextFloat();
        
        System.out.println("\t"+code+"\t"+name+"\t"+gender+"\t"+salary);
    }
    
}
