package util;

public class StringUtils {
	
	public static String nullToBlank(String str){
		if(str==null){
			return "";
		}else return str.trim();
	}
}
