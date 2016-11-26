package scenarios;

import org.springframework.stereotype.Component;
@Component
public class Reference {
	
	private Developer developer;
	private ProjectManager projectManager;
	
	public Developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	public ProjectManager getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(ProjectManager projectManager) {
		this.projectManager = projectManager;
	}
	@Override
	public String toString() {
		return "Reference [developer=" + developer + ", projectManager=" + projectManager + "]";
	}
}
