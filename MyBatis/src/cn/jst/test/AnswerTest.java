package cn.jst.test;

import java.util.List;

import org.apache.log4j.Logger;

import cn.jst.dao.AnswerMapper;
import cn.jst.dao.impl.AnswerMapperImpl;
import cn.jst.entity.Answer;

public class AnswerTest {
	private static Logger log = Logger.getLogger(QuestionsTest.class);
	private static AnswerMapper am = new AnswerMapperImpl();
	public static void main(String[] args) {
		List<Answer> anl = am.queryList();
		System.out.println("----------------------");
		for (Answer answer : anl) {
			log.debug(answer.getAnsContent());
			log.debug(answer.getQue().getTitle());
			System.out.println("----------------------\n\n");

		}
	}

}
