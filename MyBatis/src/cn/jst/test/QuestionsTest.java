package cn.jst.test;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Test;

import cn.jst.dao.QuestionsMapper;
import cn.jst.dao.impl.QuestionMapperImpl;
import cn.jst.entity.Answer;
import cn.jst.entity.Questions;

public class QuestionsTest {
	private static Logger log = Logger.getLogger(QuestionsTest.class);
	private static QuestionsMapper questionMapper = new QuestionMapperImpl();
	

	public static void main(String[] args) {
		List<Questions> list = questionMapper.queryList();
		for (Questions questions : list) {
			log.debug(questions.getTitle());
			Set<Answer> an = questions.getAn();
			
				for (Answer answer : an) {
					if(an !=null){
						log.debug(answer.getAnsContent());
					}
					
				}
			
		}
	}

}
