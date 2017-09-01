package util;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IbatisUtil {
	
	private static SqlMapClient sqlMapClient;
	
	static{
		try {
			Reader reader = Resources.getResourceAsReader("dao/ibatis/SqlMapConfig.xml");
			sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	public static SqlMapClient getSqlMap(){
		return sqlMapClient;
	}
}
