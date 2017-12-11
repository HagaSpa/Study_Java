package DesignPattern.Builder;

public class AmericanBuilder implements Builder {
	private People people;
	
	public AmericanBuilder() {
		this.people = new People();
	}

	@Override
	public void createMainLanguage() {
		people.setMainLanguage("English");
	}

	@Override
	public People getResult() {
		return this.people;
	}
}
