/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		int numGK = 0;
		int numDF = 0;
		int numMF = 0;
		int numFW = 0;

		while (numGK < 1 || numDF < 4 || numMF < 4 || numFW < 2) {	
			Player p = array.get(new Random().nextInt(array.size()));	
			switch (p.getPosition()) {	
			case "GK":	
				if (numGK == 1)
					continue;	
				System.out.println(p);
				numGK++;	
				break;
			case "DF":	
				if (numDF == 4)
					continue;	
				System.out.println(p);
				numDF++;	
				break;
			case "MF":	
				if (numMF == 4)
					continue;	
				System.out.println(p);
				numMF++;	
				break;
			case "FW":	
				if (numFW == 2)
					continue;	
				System.out.println(p);
				numFW++;	
				break;
			}
		}
	}
}
