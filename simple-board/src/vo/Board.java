package vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {

	private int no;
	private String title;
	private String writer;
	private String contents;
	private Date createdate;
	private int hit;
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
	public Date getCreateDate() {
		return createdate;
	}
	public void setCreateDate(Date createdate) {
		this.createdate = createdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getSimpleCreatedate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(createdate);
	}
	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", contents=" + contents
				+ ", createdate=" + createdate + ", hit=" + hit + "]";
	}
	
}
