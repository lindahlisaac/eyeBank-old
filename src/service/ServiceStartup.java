package service;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ServiceStartup {

	static boolean running;

	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new Thread());
		running = true;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resources/spring-config.xml");
		context.registerShutdownHook();

		while (running) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}

		}
		System.out.println("Shutting down application");
		context.close();
	}
}
