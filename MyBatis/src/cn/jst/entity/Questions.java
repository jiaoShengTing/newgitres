package cn.jst.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Questions implements Serializable{
	private int id;
	private String title;
	private String datailDesc;
	private int answerCount;
	private Date lasModifed;
	private Set<Answer> an;

	

	public Set<Answer> getAn() {
		return an;
	}

	public void setAn(Set<Answer> an) {
		this.an = an;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", title=" + title + ", datailDesc=" + datailDesc + ", answerCount="
				+ answerCount + ", lasModifed=" + lasModifed + "]";
	}

	public Questions(int id, String title, String datailDesc, int answerCount, Date lasModifed, Set<Answer> an) {
		super();
		this.id = id;
		this.title = title;
		this.datailDesc = datailDesc;
		this.answerCount = answerCount;
		this.lasModifed = lasModifed;
		this.an = an;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDatailDesc() {
		return datailDesc;
	}

	public void setDatailDesc(String datailDesc) {
		this.datailDesc = datailDesc;
	}

	public int getAnswerCount() {
		return answerCount;
	}

	public void setAnswerCount(int answerCount) {
		this.answerCount = answerCount;
	}

	public Date getLasModifed() {
		return lasModifed;
	}

	public void setLasModifed(Date lasModifed) {
		this.lasModifed = lasModifed;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

}
