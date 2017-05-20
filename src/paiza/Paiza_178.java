package paiza;

import java.util.Scanner;

/**
 * paizaリファクタ
 * ↓該当問題
 * https://paiza.jp/challenges/178/page/result
 *
 */
public class Paiza_178 {
	public static void main(String[] args) {

		// 入力ストリーム開始
		Scanner sc = new Scanner(System.in);

		// 必要スタミナ値取得
		int needStamina = sc.nextInt();
		// 現在スタミナ値取得
		int currentStamina = sc.nextInt();

		// 現在スタミナより必要スタミナがおおきければ
		if (needStamina > currentStamina) {
			// メッセージ表示
			System.out.print("No");
		} else {
			// 必要スタミナ - 現在スタミナ
			int ans = currentStamina - needStamina;
			System.out.print(ans);
		}

		// 終了
		sc.close();

	}

}
