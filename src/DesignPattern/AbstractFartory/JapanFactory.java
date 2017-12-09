package DesignPattern.AbstractFartory;

public class JapanFactory implements Factory {
	@Override
	public Capital getCapital() {
		return new Tokyo();
	}

	@Override
	public Language getLanguage() {
		return new Japanese();
	}
}
