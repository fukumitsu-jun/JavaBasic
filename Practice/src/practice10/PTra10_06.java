package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		 Car car = new Car();
		 Car car2 = new Car();
		 Car car3 = new Car();

		// ★ 変数carに格納されているインスタンスのserialNoフィールドに、10000を代入してください
		 car.serialNo = 10000;
		 car2.serialNo = 1000;
		 car3.serialNo = 100;

		// ★ 変数carに格納されているインスタンスのcolorフィールドに、"Red"を代入してください
		 car.color = "Red";
		 car2.color = "blue";
		 car3.color = "black";

		// ★ 変数carに格納されているインスタンスのgasolineフィールドに、50を代入してください
		 car.gasoline = 50;
		 car2.gasoline = 40;
		 car3.gasoline = 30;

		// 目的地までの距離
		final int distance = 300;

		/*
		 * ★ 変数carに格納されているインスタンスメソッドrunを使って、目的地まで進んでください
		 * ★ 先にガソリンがなくなった場合は、「目的地に到達できませんでした」を出力してください
		 * ★ 目的地についた時点で「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください
		 * ※n：runメソッドを実行した回数, xは残りのガソリンの数です
		 */

		int total = 0;
		int n = 0;

		while( total < distance ) {
			int run = car.run();
			if ( run < 0 ) {

				System.out.println("目的地に到達できませんでした");
				break;

			} else {
				total = total + run;
				n++;

		if ( total >= distance ){
				System.out.println("目的地にまで" + n +"時間かかりました。残りのガソリンは、" +car.gasoline +"リットルです");
			}
			}
			}

	}
}