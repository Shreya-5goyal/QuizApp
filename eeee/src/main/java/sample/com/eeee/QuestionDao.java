package sample.com.eeee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Questions,Integer> {

    public List<Questions> findByCategory(String category);
    public List<Questions> getQuestionsBydifficulty(String difficulty);

}
