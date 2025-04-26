package claudeAI2;
//Exercise 4: Primitive Data Types
//Write a Java program that declares variables of each primitive data type covered in the course. Assign appropriate values to each variable and print them.
//Target concept: Primitive data types in Java (Unit 4, Section 4.1, pp. 56-57)
public class Q04
{

	public static void main(String[] args)
	{
		datatypePrinter();

	} // end main


public static void datatypePrinter() {

byte in1= 8;
short in2 = 16;
int in3 = 32;
long in4= 64L;

float f1 = 32.13f;
double d1 = 64.5;

char ch1 = 'A';
boolean isTrue = true;

System.out.println("Print all 8 primitive data types in Java:");
System.out.println("byte value: " + in1);
System.out.println("short value: " + in2);
System.out.println("int value: " + in3);
System.out.println("long value: " + in4);
System.out.println("float value: " + f1);
System.out.println("double value: " + d1);
System.out.println("char value: " + ch1);
System.out.println("boolean value: " + isTrue);
}
} // end class Q04