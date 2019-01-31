package practice14.common;

public class JavaCourse implements Course{
    public  String getCourseName() {
        return "【Eラーニング】Java";
    }
    public  String[] getCourseUnit() {
    	String str[] = new String[7];
    	str[0] = "式と演算";
    	str[1] = "制御構文";
     	str[2] = "メソッド";
    	str[3] = "配列";
     	str[4] = "オブジェクト指向";
    	str[5] = "継承";
    	str[6] = "高度な継承";
        return str;
    }


}
/*
 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】Java」
 * 単元
 * 		式と演算
 * 		制御構文
 * 		メソッド
 * 		配列
 * 		オブジェクト指向
 * 		継承
 * 		高度な継承
 */
