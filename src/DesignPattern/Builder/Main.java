package DesignPattern.Builder;

public class Main {
	public static void main(String[] args) {
		if (args[0].equals("Japanese")) {
			// 日本人ビルダを生成
			Builder builder = new JapaneseBuilder();
			// DirectorはBulderインタフェースを渡しているだけなので、Builderの内部実装までは知らない。
			Director director = new Director(builder);	 // JapanseseBuilderかAmericanBuilderか知らない。
			People people = director.construct();
			people.hello();
		} else if (args[0].equals("English")) {
			Builder builder = new AmericanBuilder();
			Director director = new Director(builder);
			People people = director.construct();
			people.hello();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
