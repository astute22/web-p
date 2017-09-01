package dao;

import java.util.HashMap;
import java.util.Map;

import vo.User;

public class UserDao {

	private Map<String, User> db = new HashMap<>();
	public UserDao(){
		db.put("hoomba", new User("스티븐 제라드","hoomba","zxcv1234","ADMIN"));
		db.put("lingard", new User("제시 린가드","lingard","zxcv1234","USER"));
	}
	public User getUserById(String id){
		return db.get(id);
	}
}
