/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	public int getstudentId() {
	    return this.studentId;
	}

	/** 受講生ID */
	private int studentId;

	public String studentName() {
	    return this.studentName;
	}

	/** 受講生氏名 */
	private String studentName;

	public String companyName() {
	    return this.companyName;
	}

	/** 会社名 */
	private String companyName;

	public String className() {
	    return this.className;
	}

	/** 教室名 */
	private String className;

	public String mail() {
	    return this.mail;
	}

	/** メールアドレス */
	private String mail;

	public String password() {
	    return this.password;
	}

	/** パスワード */
	private String password;
}
