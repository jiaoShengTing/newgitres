package cn.jst.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatis {
	private static SqlSession sqlSession = null;
	private static SqlSessionFactory sqlSessionFactory = null;
	static {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			sqlSession = sqlSessionFactory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static SqlSession getSqlSession() {
		if (sqlSession == null) {
			sqlSession = sqlSessionFactory != null ? sqlSession : sqlSessionFactory.openSession();
		}
		return sqlSession;
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		InputStream is;
		try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sqlSessionFactory;
	}

	public static void close() {
		if (sqlSession != null) {
			sqlSession.close();
		}

	}

}
