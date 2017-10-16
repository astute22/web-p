package demo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookDao {

	private Map<Integer, Book> db = new HashMap<>();
	
	public BookDao() {
		db.put(1, new Book(1, "이것이 자바다", "신용권", "한빛미디어", 35000, true));
		db.put(2, new Book(2, "실전 스프링 부트워크북", "이일웅", "한빛미디어", 30000, true));
		db.put(3, new Book(3, "앵귤러 첫걸음", "조우진", "한빛미디어", 25000, true));
		db.put(4, new Book(4, "알고리즘", "김도형", "한빛미디어", 18000, true));
		db.put(5, new Book(5, "JPA 입문", "최범균", "가메출판사", 22000, true));
		db.put(6, new Book(6, "데이터베이스 개론", "박우창", "한빛아카데미", 18000, true));
		db.put(7, new Book(7, "처음 시작하는 리액트", "곽현철", "한빛미디어", 28000, true));
		db.put(8, new Book(8, "tomcat 이야기", "최진식", "좋은땅", 32000, true));
		db.put(9, new Book(9, "쉬운 자료구조", "이지영", "한빛미디어", 30000, true));
	}
	
	public List<Book> getAllBook() {
		return new ArrayList<Book>(db.values());
	}
	
	public Book getBook(int no) {
		return db.get(no);
	}
}





