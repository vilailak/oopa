package chap4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your name : ");
        String name = sc.nextLine(); 
        
        System.out.print("Please enter your age :");
        int age = sc.nextInt();
       if(age<= 11){
            System.out.println("วัยเด็ก");
        }else if (age <=20){
            System.out.println("วัยรุ่น");
        }else if (age <=40){
            System.out.println("วัยผู้ใหญ่");
        }else if (age <=60){
            System.out.println("วัยกลางคน");
        }else if (age <=65){
            System.out.println("วัยสูงอายุ");
        }else if (age>=65){
            System.out.println("Error");
        }
        System.out.print("Please enter your salary :");
        double salary = sc.nextDouble();
        
        System.out.print("Please enter your degree :");
        int degree = sc.nextInt();
         switch (degree){
        case 1:
            System.out.println("Please enter your degree : ปริญญาตรี");
            break;
        case 2:
            System.out.println("Please enter your degree : ปริญญาโท");
            break;
        case 3:
            System.out.println("Please enter your degree : ปริญญาเอก");
            break;
        case 4:
            System.out.println("Please enter your degree : ไม่ระบุ");
            break;
        default:
            System.out.println("Please enter your degree : error");
            break;
    }
        System.out.print("Exployee name : "+name);
        System.out.println(", age : "+age+",salary : "+salary);
    }
    
}
