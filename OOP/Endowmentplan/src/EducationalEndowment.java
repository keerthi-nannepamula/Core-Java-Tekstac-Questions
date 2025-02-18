
public class EducationalEndowment extends Endowment{
	
	private String educationalInstitution;
	private String educationalDivision;
	
	public String getEducationalInstitution() {
		return educationalInstitution;
	}
	public void setEducationalInstitution(String educationalInstitution) {
		this.educationalInstitution = educationalInstitution;
	}
	public String getEducationalDivision() {
		return educationalDivision;
	}
	public void setEducationalDivision(String educationalDivision) {
		this.educationalDivision = educationalDivision;
	}

	public EducationalEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate,String educationalInstitution,String educationalDivision) {
		super(endowmentId, holderName, endowmentType, registrationDate);
		this.educationalInstitution=educationalInstitution;
		this.educationalDivision=educationalDivision;
	}

	public double calculateEndowment(){
		if(educationalDivision.equalsIgnoreCase("school")) {
			return 30000;
		}else if(educationalDivision.equalsIgnoreCase("undergraduate")) {
			return 60000;
		}else if(educationalDivision.equalsIgnoreCase("postgraduate")) {
			return 90000;
		}else {
			return 0;	
		}
	}

}
