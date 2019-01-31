/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_02 {


	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう
		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"), "UTF-8")) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] data = line.split(",");	
				Player p = new Player();	
				p.setPosition(data[0]);	
				p.setName(data[1]);	
				p.setCountry(data[2]);	
				p.setTeam(data[3]);	
				array.add(p);	
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう
		for (Player p : array) {
			System.out.println(p.toString());
		}
	}
}
