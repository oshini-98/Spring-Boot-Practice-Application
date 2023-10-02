package com.osh.Quizapp.controller;

import com.osh.Quizapp.entity.Question;
import com.osh.Quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    } // @RequestBody --> convert json data into object

    @DeleteMapping("deleteAll")
    public String deleteAllQuestions(){
        return questionService.deleteAllQuestions();
    }

    @DeleteMapping("deleteById/{id}")
    public String deleteQuestionById(@PathVariable int id){
        return questionService.deleteQuestionById(id);
    }

    @PutMapping("updateQuestion")
    public String updateQuestionById(@RequestBody Question question){
        return questionService.updateQuestionById(question);
    }

}
