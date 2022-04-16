package com.bridgelabz;

import java.util.Scanner;

class LineDist {

    static double x1,x2,y1,y2,x3,y3,x4,y4;
    public static int Length1, Length2;
    Scanner sc =new Scanner(System.in);

    public void LenLine1() {

        System.out.println("enter x1 & y1 values of first point: ");
        x1=sc.nextDouble();
        y1=sc.nextDouble();

        System.out.println("enter x2 & y2 values of second point: ");
        x2=sc.nextDouble();
        y2=sc.nextDouble();

        Length1=(int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance of first line = "+Length1);
    }


    public void LenLine2() {

        System.out.println("enter x3 & y3 values of third point: ");
        x3=sc.nextDouble();
        y3=sc.nextDouble();

        System.out.println("enter x4 & y4 values of fourth point: ");
        x4=sc.nextDouble();
        y4=sc.nextDouble();

        Length2 =(int)Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Distance of second line = "+ Length2);
    }

    public void Compare() {

        int a= Integer.compare(Length1, Length2);

        if(a==0)
            System.out.println("both lines are equal.");
        else if (a>0)
            System.out.println("Line1 length is Greater.");
        else
            System.out.println("Line2 length is Greater.");
    }

}


public class LineDistOops {
	
	public static void main(String[] args) {
		
		LineDist ob1=new LineDist();
	     ob1.LenLine1();
	     ob1.LenLine2();
	     ob1.Compare();
	}

}
