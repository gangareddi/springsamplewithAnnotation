package scenarios;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new 
				AnnotationConfigApplicationContext(Configuration.class);
		
		Developer developer=(Developer)applicationContext.getBean("developer");
		ProjectManager projectManager=(ProjectManager)applicationContext.getBean("projectManager");
		
		developer.setDeveloperName("ganga");
		developer.setProjectName("ESB");
		
		projectManager.setProjectManagerName("Aruna");
		projectManager.setWorkingCity("CA");
		
		Reference reference=(Reference)applicationContext.getBean("reference");
		
		reference.setDeveloper(developer);
		reference.setProjectManager(projectManager);
		
		System.out.println(reference);
	}
}
