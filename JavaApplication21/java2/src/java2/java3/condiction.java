
package java2.java3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class condiction {
    public static void main(String[] args) {
        int code;
        String name;
        int qty;
        double dis = 0,pay = 0,total,price;
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("####.00");
        System.out.print("Enter Code  : ");code=sc.nextInt();
        System.out.print("Enter Name  : ");name=sc.next();
        System.out.print("Enter QTY   : ");qty=sc.nextInt();
        System.out.print("Enter Price : ");price=sc.nextDouble();
        
        total = price * qty;
        
        if(total>=1 && total <=10)
        {
            dis = total*0.1;
            pay = total-dis;
        }
        else if(total>10 && total<=20)
        {
            dis = total * 0.2;
            pay = total - dis;
        }
        else if(total>20 && total<=30)
        {
            dis = total * 0.3;
            pay = total - dis;
        }
        else if(total>30 && total<=40)
        {
            dis = total * 0.4;
            pay = total - dis;
        }
        else if(total>40 && total<=50)
        {
            dis = total * 0.5;
            pay = total - dis;
        }
        else if(total>50 && total<=60)
        {
            dis = total * 0.6;
            pay = total - dis;
        }
        else
        {
            dis = total * 0.2;
            pay = total - dis;
        }
        System.out.println("CODE \t NAME \t QTY \t PRICE \t TOTAL \t DISCOUT \t PAYMENT");
        System.out.println(code+"\t"+name+"\t"+qty+"\t"+price+"\t"+d.format(total)+"\t"+d.format(dis)+"\t"+d.format(pay));
    }
}
