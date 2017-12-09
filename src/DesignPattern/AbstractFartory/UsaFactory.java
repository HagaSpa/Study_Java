package DesignPattern.AbstractFartory;

public class UsaFactory implements Factory {
	@Override
	public Capital getCapital() {
		return new WashingtonDC();
	}

	@Override
	public Language getLanguage() {
		return new English();
	}
}
