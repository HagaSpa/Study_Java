package DesignPattern.Singleton;

public class Configure {
	// クラスロード時に初期化
	private static final Configure instance = new Configure();

	private Configure() {
		// 設定ファイルなどの読み込み処理
		
	}
	
	public static Configure getInstance() {
		return instance;
	}
}
