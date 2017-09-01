package app;

import util.PathUtils;
import util.TableUtils;
import vo.User;
import web.BoardController;

public class App {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

//		BoardController controller = new BoardController();
//		
//		PathUtils.parsePath(controller);
		
		User user = new User();
		String ddl = TableUtils.parseTableAndColumn(user);
		System.out.println(ddl);
	}

}
