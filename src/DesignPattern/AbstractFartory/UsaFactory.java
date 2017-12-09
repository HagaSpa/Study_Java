package DesignPattern.AbstractFartory;

public class UsaFactory implements Factory {
	@Override
	public Capital getCapital() {
		return new WashingtonDC();
	}
}
