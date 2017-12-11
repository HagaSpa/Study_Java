package DesignPattern.Builder;

public class People {
	private String mainLanguage;

	public String getMainLanguage() {
		return mainLanguage;
	}

	public void setMainLanguage(String mainLanguage) {
		this.mainLanguage = mainLanguage;
	}
	
	void hello() {
		System.out.println("こんにちは。主語は" + mainLanguage);
	}
}
