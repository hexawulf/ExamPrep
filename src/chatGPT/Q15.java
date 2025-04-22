package chatGPT;

public class Q15
{

	public static void main(String[] args)
	{
//15. Getter and Setter
//Topic: Encapsulation
//Task: Modify and access private attributes name and email using getters and setters.
//Target Concept: Access control and data hiding.

		Customer cus1 = new Customer("0xWulf", "dev@0xwulf.dev");
		System.out.println(cus1);
		cus1.setName("hexawulf");
		cus1.setEmail("hexawulf@proton.me");
		System.out.println(cus1);

	}

}
