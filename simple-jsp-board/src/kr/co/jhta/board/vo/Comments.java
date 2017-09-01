package kr.co.jhta.board.vo;

import java.util.Date;

public class Comments {

	private int no;
	private String contents;
	private Date createdate;
	private User writer;
	private Board board;
	
	public Comments() {
		// TODO Auto-generated constructor stub
	}

	public Comments(int no, String contents, Date createdate, User writer, Board board) {
		super();
		this.no = no;
		this.contents = contents;
		this.createdate = createdate;
		this.writer = writer;
		this.board = board;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public User getWriter() {
		return writer;
	}

	public void setWriter(User writer) {
		this.writer = writer;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
}
