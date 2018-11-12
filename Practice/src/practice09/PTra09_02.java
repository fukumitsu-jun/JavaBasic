package practice09;

import practice09.util.Util;

public class PTra09_02 {
public static void main(String[] args) {
String[] array = {"Plain", "Island", "Mountain", "Swamp", "Forest"};
// ★ 配列arrayを、Util内のメソッドを用いてランダムに並び替えてください
// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです
// ★ ランダムに並び替えた後の配列を前から順に全て表示してください
//1.シャッフルした配列を格納するための変数（配列）を宣言
String[] shuffledAry;
/*2. Utilクラス内のメソッド：shuffleArrayを使用して配列をシャッフルし、先ほど 1. で作成した
*   String型の配列、shuffledAryの中に格納
*
* ※shuffleArrayメソッドは引数にシャッフルしたい配列Aを渡すことで、
* その配列Aの中身がシャッフルされた 配列Bを戻り値として返します。
* 
*/ 
shuffledAry = Util.shuffleArray(array);
//3. for分を使用して、配列の中身を出力
for(int i = 0;i < shuffledAry.length;i++){
System.out.println("shuffledAry[" + i + "] : " + shuffledAry[i]);
}
}
}
