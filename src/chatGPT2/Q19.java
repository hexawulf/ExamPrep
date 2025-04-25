package chatGPT2;
//19. Interface for Logger
//Problem: Create a Logger interface with logMessage() method. Implement it in ConsoleLogger.
//Course-book alignment: Unit 9.2 (Interfaces in Java)
//Target concept: Interface implementation
public class Q19
{

	public static void main(String[] args) {

		Logger log1 = new ConsoleLogger();
		String logging = log1.logMessage("Apr 25 13:04:52 rockylinux systemd[1992328]: Finished Create User's Volatile Files and Directories");
		System.out.println(logging);
		}
}
