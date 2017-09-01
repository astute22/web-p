package util;

import java.lang.reflect.Field;

import custom.annotation.Column;
import custom.annotation.Table;

public class TableUtils {

	public static String parseTableAndColumn(Object obj) throws Exception{
		if(obj == null){
			return null;
		}
		
		Class<?> claz = obj.getClass();
		
		Table table = claz.getDeclaredAnnotation(Table.class);
		if(table == null){
			return null;
		}
		if(!table.generated()){
			return null;
		}
		
		StringBuilder res = new StringBuilder();
		res.append("create table ");
		res.append(table.name());
		res.append(System.lineSeparator());
		res.append(" (");
		
		Field[] fields = claz.getDeclaredFields();
		boolean first = true;

		for(Field field : fields) {
			Column column = field.getDeclaredAnnotation(Column.class);

			if(column != null){
				String type = column.type();
				String name = column.name();
				
				if(first){
					first=false;
				} else{
					res.append(",");
				}
				res.append(name);
				res.append(" ");
				res.append(type);
				res.append(System.lineSeparator());
				
			}
		}
		
		res.append(");");
		
		return res.toString();
	}
}
