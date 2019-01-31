/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ① ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください ★
		 * ArrayListを作成して、Playerインスタンスを格納してください
		 */
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

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		Iterator<Player> ite = array.iterator();	
		
		while (ite.hasNext()) {	
			Player p = ite.next();	
			if (p.getTeam().equals("レアル・マドリード") || p.getTeam().equals("バルセロナ")) {
				ite.remove();	
			}
		}

		// ★ 削除後のArrayListの中身を全件出力してください
		for (Player p : array) {
			System.out.println(p.toString());
		}
	}
}
