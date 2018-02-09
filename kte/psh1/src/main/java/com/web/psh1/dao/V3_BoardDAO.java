package com.web.psh1.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.psh1.vo.V3_Board;
import com.web.psh1.vo.V3_BoardImg;

//DAO일 경우
@Service
public class V3_BoardDAO {
	/*
	mybatis-context.xml의 마지막 bean의 ID값을
	Resource의 name값으로 넣음.
	sqlSession이 1개일 경우는 생략가능함.
	<bean id="sqlSession" 
	*/
	
	@Autowired
	@Resource(name="sqlSession")
	private SqlSession sqlsession = null;
	
	public int getlastno() {
		return sqlsession.selectOne("V3_Board.getlastno");
	}
	public int insert(V3_Board vo) {
		return sqlsession.insert("V3_Board.insert",vo);
	}
	public List<V3_Board> selectlist(int bvo) {
		return sqlsession.selectList("V3_Board.selectlist",bvo);
	}
	public int insertimg(V3_BoardImg map) {
		return sqlsession.insert("V3_Board.insertimg",map);
	}
}
