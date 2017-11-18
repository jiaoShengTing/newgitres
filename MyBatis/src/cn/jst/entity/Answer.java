package cn.jst.entity;

import java.io.Serializable;

public class Answer implements Serializable {
	private int id;
	private String ansContent;
	private String ansDate;
	private Questions que;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnsContent() {
		return ansContent;
	}

	public void setAnsContent(String ansContent) {
		this.ansContent = ansContent;
	}

	public String getAnsDate() {
		return ansDate;
	}

	public void setAnsDate(String ansDate) {
		this.ansDate = ansDate;
	}

	public Questions getQue() {
		return que;
	}

	public void setQue(Questions que) {
		this.que = que;
	}

	public Answer(int id, String ansContent, String ansDate, Questions que) {
		super();
		this.id = id;
		this.ansContent = ansContent;
		this.ansDate = ansDate;
		this.que = que;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", ansContent=" + ansContent + ", ansDate=" + ansDate + ", que=" + que + "]";
	}

}
