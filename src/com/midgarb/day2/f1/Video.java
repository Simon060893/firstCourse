package com.midgarb.day2.f1;

public class Video {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello();
		Hello("Vasia");
		Sum(5, 2.5);
		square(4);
		square(5.0);
System.out.println(Sum1(4,5.2));
System.out.println(square1(45.6,8));
String a = "sss";
String b = "4";
a=b;
//a+= "a";
System.out.println(a);
System.out.println(oldAge(52));
System.out.println(min(20,-50,-50));
System.out.println(min(20,30,20));
System.out.println(isSpring(12));
	}

	static void hello()
	{
		System.out.println("Hello");
	}
	static void Hello(String name){
		 System.out.println("Hello " + name + "!");
	}
	 static void Sum(int num1, double num2) {
		// TODO Auto-generated method stub
System.out.println("void Sum " + num1 + num2);
	}
	 static double Sum1(int num1, double num2) {
			// TODO Auto-generated method stub
	return(num1 + num2);
		}
	 
	 static void square(double num){
		 System.out.println("void" + num * num);
	 }
	 static double square1(double num, int g){
		 return (num * num/g);
	 }
	 //обьявим метод с сущ именем принимающий на вход целый тип 
	 static int square(int number){
		 number = number * number;
		 System.out.println("int" + number);
		 double d =2;
		 return number;
	 }
	 //оператор if
	 static boolean oldAge(int age){
		
		 if(age>=21)
	 { //System.out.println(age>=21);
	 return true;
			 }
		 return false;
		 
	 }
	 //в видео-уроке 
	 static int min(int a, int b, int c){
		 if((a<b)  && (a<c)){
			a=a;	 
		 }
		
		 else if((b<c) && (b<a)){
			 a=b;	 
			 }
		 //if((c<b) && (c<a))
		 else{
			 a=c;	
		 }
		 return a;
		
	 }
	 static int min1(int a, int b, int c){
		 if(a<=b){
			 if(a<=c){
				 return a;
			 }
		 }else if(b<=c){
			 return b;
		 }return c;
	 }
	 static int isSpring(int month){
		 if(month >= 3 && month<=5){
			 return 1;
		 }
		 else if (month<=12 && month>=1){return  0; 
		 }
		 else{return -1;}
	 }
}
