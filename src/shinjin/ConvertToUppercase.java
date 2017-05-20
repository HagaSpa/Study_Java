package shinjin;

import java.util.HashMap;
import java.util.Map;

/**
 * 入力ｓれた一文字の小文字を大文字へ変換して、出力
 * ↓やってみた
 * http://www.tawashix.com/entry/program
 * @param 入力された一文字のアルファベット
 * @return 大文字のアルファベット
 *
 */
public class ConvertToUppercase {

	// 変換用マップ
	private static final Map<String, String> convertMap = createMap();

	public static void main(String[] args) {

		// 合致する小文字（key）のvalueを取得
		String uppercse = convertMap.get(args[0]);

		// 変換用マップに合致する文字がなければ
		if (uppercse == null) {
			System.out.print("一文字のアルファベットを小文字で入力して下さい");
			return;
		}

		// 出力
		System.out.print(uppercse);
	}

	// マップ生成処理
	public static Map<String, String> createMap() {
		Map<String, String> map = new HashMap<String, String>();

		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
		map.put("d", "D");
		map.put("e", "E");
		map.put("f", "F");
		map.put("g", "G");
		map.put("h", "H");
		map.put("i", "I");
		map.put("j", "J");
		map.put("k", "K");
		map.put("l", "L");
		map.put("m", "M");
		map.put("n", "N");
		map.put("o", "O");
		map.put("p", "P");
		map.put("q", "Q");
		map.put("r", "R");
		map.put("s", "S");
		map.put("t", "T");
		map.put("u", "U");
		map.put("v", "V");
		map.put("w", "W");
		map.put("x", "X");
		map.put("y", "Y");
		map.put("z", "Z");

		return map;
	}

}
