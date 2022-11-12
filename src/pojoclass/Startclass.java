package pojoclass;

import java.util.List;

public class Startclass {
	
	private String name;
	private List<ExperienceList> experienceList;
	
	public List<ExperienceList> getExperienceList(){
		return experienceList;
	}
	
	public void setExperienceList(List<ExperienceList> exlist) {
		this.experienceList=exlist;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String data) {
		this.name=data;
	}
	
	
}
