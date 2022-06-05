package week5;
import java.util.*;

public class AsteriskLogger implements Logger {


	@Override
	public void Log(String log) {
		int word = log.length();
		int i;
		
		for (i = 0; i < 1; i++) {
			i++;
			System.out.println("***" + log + "***");
		}
		
	}

	@Override
	public void Error(String error) {
		int word = error.length();
		int i;
		
		for (i = 0; i < 1; i++) {
			System.out.println("******************");
			System.out.println("***Error: " + error + "***");
			System.out.println("******************");
		}
		
	}

	
		
	}


