package scenarios;

import org.springframework.stereotype.Component;

@Component
public class ProjectManager {
	private String projectManagerName;
	private String workingCity;
	
	public ProjectManager() {
		super();
	}
	
	public String getProjectManagerName() {
		return projectManagerName;
	}
	public void setProjectManagerName(String projectManagerName) {
		this.projectManagerName = projectManagerName;
	}
	public String getWorkingCity() {
		return workingCity;
	}
	public void setWorkingCity(String workingCity) {
		this.workingCity = workingCity;
	}
	public ProjectManager(String projectManagerName, String workingCity) {
		super();
		this.projectManagerName = projectManagerName;
		this.workingCity = workingCity;
	}
	@Override
	public String toString() {
		return "ProjectManager [projectManagerName=" + projectManagerName + ", workingCity=" + workingCity + "]";
	}
}
