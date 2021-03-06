package kr.co.jtimes.reporter.imagecontainer.common.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jtimes.reporter.imagecontainer.common.vo.TbImageVo;
import kr.co.jtimes.util.IbatisUtil;


public class TBImageDao {


	@SuppressWarnings("unchecked")
	public List<TbImageVo> getAllimg() throws SQLException{
		
		return IbatisUtil.getSqlMap().queryForList("getAllimg");
	}
	
	public TbImageVo getImgByNo(int no) throws SQLException{
		
		return (TbImageVo) IbatisUtil.getSqlMap().queryForObject("getImgByNo", no);
	}
	
	public void addtbImageVo(TbImageVo tbImageVo) throws SQLException{
		IbatisUtil.getSqlMap().insert("addtbImageVo", tbImageVo);
	}
}
