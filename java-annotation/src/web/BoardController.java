package web;

import java.util.List;

import custom.annotation.Path;

public class BoardController {

	@Path(value = "/add.html")
	public void addBoard(){
		
	}
	
	@Path("/List.html")
	public List<?> listBoard(){
		return null;
	}
	
	@Path(value="/denelte.html")
	public void deleteBoard(int no){
		
	}
}
