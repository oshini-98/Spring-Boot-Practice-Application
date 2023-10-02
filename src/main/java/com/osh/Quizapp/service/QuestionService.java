package com.osh.Quizapp.service;

import com.osh.Quizapp.dao.QuestionDao;
import com.osh.Quizapp.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }

    public String deleteAllQuestions() {
        questionDao.deleteAll();
        return "All deleted";
    }

    public String deleteQuestionById(int id) {
        questionDao.deleteById(id);
        return "Question deleted";
    }

    public String updateQuestionById(Question question) {
        questionDao.save(question);
        return "Question Updated";
    }
}
