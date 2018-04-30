package test.time;

import java.time.Duration;
import java.time.Instant;

public class CalculateDuration {
	public static void main(String[] args) throws InterruptedException {
		Instant start = Instant.now();
		Thread.sleep(1000);
		System.out.println("Hello");
		Instant end = Instant.now();
		
		Duration elapsed = Duration.between(start, end);
		
		System.out.println(elapsed.toMillis()+" milis");
	}
}
