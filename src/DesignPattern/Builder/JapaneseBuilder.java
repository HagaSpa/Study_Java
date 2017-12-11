package DesignPattern.Builder;

/**
 * 日本人ビルダ
 * ここで求められていることは、
 * @author sparrow
 *
 */
public class JapaneseBuilder implements Builder {
	private People people;
	
	public JapaneseBuilder() {
		this.people = new People();
	}

	@Override
	public void createMainLanguage() {
		people.setMainLanguage("Japanese");
	}

	@Override
	public People getResult() {
		return this.people;
	}
}
