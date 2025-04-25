package chatGPT2;

public class ConsoleLogger implements Logger
{
	private String message;

	@Override
	public String logMessage(String message) {
	return "Logging to console: " + message;
	}
}
