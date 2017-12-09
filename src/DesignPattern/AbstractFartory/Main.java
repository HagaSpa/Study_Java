package DesignPattern.AbstractFartory;

public class Main {
	public static void main(String[] args) {
		String name = "Japan";
		Factory factory = createFactory(name);
		Capital capital = factory.getCapital();
		Language language = factory.getLanguage();
		System.out.println("首都名は" + capital.name);
		System.out.println("人口は" + capital.population);
		System.out.println(language.toString());
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
