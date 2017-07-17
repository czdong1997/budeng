package com.budeng.vo;

public class User extends Person {//�̳���Person

	int taste; //��ζ���ɶ�ѡ�����������
	int job; //ְҵ(1:������ 2���о��� 3����ʿ 4����ʦ 5������)
	int pocke;//Ǯ��
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