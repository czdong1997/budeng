package com.budeng.vo;

public class User extends Person {//继承与Person

	int taste; //口味（可多选，酸甜苦辣）
	int job; //职业(1:本科生 2：研究生 3：博士 4：老师 5：其他)
	int pocke;//钱包
	/**
	 * @param id
	 * @param name
	 * @param sex
	 * @param userName
	 * @param password
	 * @param telephone
	 * @param taste
	 * @param job
	 * @param pocke
	 */
	public User(int id, String name, int sex, String userName, String password,
			String telephone, int taste, int job, int pocke) {
		super(id, name, sex, userName, password, telephone);
		this.taste = taste;
		this.job = job;
		this.pocke = pocke;
	}
	
	public User(){
		
	}

	public int getTaste() {
		return taste;
	}

	public void setTaste(int taste) {
		this.taste = taste;
	}

	public int getJob() {
		return job;
	}

	public void setJob(int job) {
		this.job = job;
	}

	public int getPocke() {
		return pocke;
	}

	public void setPocke(int pocke) {
		this.pocke = pocke;
	}
	
	
}