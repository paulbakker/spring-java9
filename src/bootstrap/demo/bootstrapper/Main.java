package demo.bootstrapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public void setup() {
		System.out.println("Starting demo...");

		ApplicationContext context =
    		new ClassPathXmlApplicationContext(new String[] {"classpath:/services.xml"});

    		for(String name : context.getBeanDefinitionNames()) {
    			System.out.println(name);
    		}
	}

	public static void main(String[] args) {
		new Main().setup();
	}
}