package gemini25;
//Exercise 9: Applying Logical Operators
//Declare boolean variables and use logical operators (&&, ||, !) to perform logical operations. Print the results.
//
//Course-book alignment: Unit 4, Section 4.3 (Page 60) 



public class Q09
{

	public static void main(String[] args)
	{

boolean a,b,c,d;
boolean result;

a=true;
b=false;
c=true;
d=false;


// &&
result = a && d;  
System.out.println(result);


// ||
result =  a || b;
System.out.println(result);



// !=
result =  a != c;
System.out.println(result);

// !
result = !a;
System.out.println(result);

// ^
result = a ^ c;
System.out.println(result);

	}

}
