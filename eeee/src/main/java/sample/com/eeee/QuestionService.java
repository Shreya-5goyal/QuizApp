package sample.com.eeee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Questions> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Questions> getQuestionByCategory(String category) {
      return questionDao.findByCategory(category);
    }

    public List<Questions> getQuestionsBydifficulty(String difficulty) {
        return questionDao.getQuestionsBydifficulty(difficulty);
    }

    public String add(Questions question) {
        questionDao.save(question);
        return "success";
    }
}
