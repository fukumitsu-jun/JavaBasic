/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";
		char data[] = str.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= str.length()-1; i++) {
			try{
				// 指定ミリ秒の間眠る
				Thread.sleep(500); 
				}
			catch(InterruptedException e){
			}

			System.out.print(data[i]);
		}

		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */

	}
}

