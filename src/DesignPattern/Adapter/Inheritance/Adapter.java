package DesignPattern.Adapter.Inheritance;

public class Adapter extends OldSystem implements Target {
	@Override
	public void process() {
		oldProcess();
	}
}
