package vo;

import java.util.Date;

public class Board {

	private int no;
	private String title;
	private String writer;
	private String contents;
	private Date createdate;
	private int pno;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int no, String title, String writer, String contents, Date createdate, int pno) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.createdate = createdate;
		this.pno = pno;
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
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

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}
	
}
