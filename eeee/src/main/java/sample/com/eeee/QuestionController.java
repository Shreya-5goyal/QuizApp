package sample.com.eeee;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
        @RequestMapping("/questions")
public class QuestionController {

            @Autowired
    QuestionService questionService;
    @GetMapping("/allQuestion")
    public List<Questions> getallQuestion()
    {
        return questionService.getAllQuestions();
    }
    @GetMapping("/ByCategory/{category}")
    public List<Questions> getQuestionByCategory(@PathVariable String category)
    {
        return questionService.getQuestionByCategory(category);
    }
   @GetMapping("/ByLevel/{difficulty}")
   public List<Questions> getQuestionsBydifficulty(@PathVariable String difficulty)
   {
       return questionService.getQuestionsBydifficulty(difficulty);
    }
    @PostMapping("/add")
    public String add(@RequestBody Questions question)
    {
      return  questionService.add(question);

    }
}
