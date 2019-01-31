package practice14.common;

public class DBCourse implements Course{
    public  String getCourseName() {
        return "【Eラーニング】DB基礎";
    }
    public  String[] getCourseUnit() {
    	String str[] = new String[4];
    	str[0] = "DB基礎";
    	str[1] = "SQL基礎";
     	str[2] = "正規化";
    	str[3] = "SQL応用";
        return str;
    }
	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */

}