package DesignPattern.Builder;

public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public People construct() {
		builder.createMainLanguage();
		return builder.getResult();
	}
}
