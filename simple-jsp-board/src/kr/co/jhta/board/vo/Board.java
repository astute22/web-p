package kr.co.jhta.board.vo;

import java.util.Date;

public class Board {

	private int no;
	private String title;
	private String contents;
	private Date createDate;
	private User writer;
	private int likes;
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public User getWriter() {
		return writer;
	}
	public void setWriter(User writer) {
		this.writer = writer;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getContentsWithBr(){
		return contents.replace(System.lineSeparator(), "<br/>");
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", contents=" + contents + ", createDate=" + createDate
				+ ", writer=" + writer + ", likes=" + likes + "]";
	}
	
}
