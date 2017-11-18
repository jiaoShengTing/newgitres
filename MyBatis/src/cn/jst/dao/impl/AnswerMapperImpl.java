package cn.jst.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.jst.dao.AnswerMapper;
import cn.jst.entity.Answer;
import cn.jst.util.MyBatis;

public class AnswerMapperImpl  implements AnswerMapper{

	@Override
	public List<Answer> queryList() {
		
		SqlSession sqlSession = MyBatis.getSqlSession();
		List<Answer> list = sqlSession.getMapper(AnswerMapper.class).queryList();
		MyBatis.close();
		return list;
	}

}
