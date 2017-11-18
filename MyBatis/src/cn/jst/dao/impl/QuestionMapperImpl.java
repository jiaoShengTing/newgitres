package cn.jst.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.jst.dao.QuestionsMapper;
import cn.jst.entity.Questions;
import cn.jst.util.MyBatis;

public class QuestionMapperImpl implements QuestionsMapper {

	@Override
	public List<Questions> queryList() {
		SqlSession sqlSession = MyBatis.getSqlSession();
		List<Questions> list = sqlSession.getMapper(QuestionsMapper.class).queryList();
		MyBatis.close();
		return list;
	}

}
