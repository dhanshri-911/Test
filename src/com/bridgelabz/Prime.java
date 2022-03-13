package com.bridgelabz;
import java.util.Scanner;
//Prime number is the number which is divisible by 1 or itself

public class Prime {

	public static void main(String[] args) {
		int i,m=0,flag=0;   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be cheaked6");
		  int num=sc.nextInt();  
		  m=num/2;      
		  if(num==0||num==1){  
		   System.out.println(num+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(num%i==0){      
		     System.out.println(num+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(num+" is prime number"); }  
		  }//end of else  
		}    

}
