package util;

import java.lang.reflect.Method;

import custom.annotation.Path;

public class PathUtils {
	public static void parsePath(Object obj) throws Exception{
		//전달받은 객체의 설계도 정보를 담고있는 class타입의 객체를 반환
		Class<?> clazz = obj.getClass();
		
		Method[] methods = clazz.getDeclaredMethods();
		
		//선언된 메소드 정보 조회하기
		for(Method m : methods){
			Path pathAnnotation = m.getDeclaredAnnotation(Path.class);
			
			String pathValue = pathAnnotation.value();
			
			System.out.println(m.getName() + " : " + pathValue);
		}
	}
}
