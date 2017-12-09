package DesignPattern.AbstractFartory;

public class Main {
	public static void main(String[] args) {
		String name = "USA";
		Factory factory = createFactory(name);
		Capital capital = factory.getCapital();
		System.out.println("首都名は" + capital.name);
		System.out.println("人口は" + capital.population);
	}
	
	private static Factory createFactory(String name) {
		switch (name) {
			case "Japan":
				return new JapanFactory();
			case "USA":
				return new UsaFactory();
			default:
				throw new IllegalArgumentException();
		}
	}
}
