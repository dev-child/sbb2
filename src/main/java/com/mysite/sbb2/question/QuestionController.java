package com.mysite.sbb2.question;

import com.mysite.sbb2.answer.AnswerForm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/question")
@RequiredArgsConstructor
@Controller
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Question> questionList = this.questionService.getList();
        model.addAttribute("questionList", questionList);
        return "question/question_list";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id, AnswerForm answerForm) {
        Question question = this.questionService.getQuestion(id);
        model.addAttribute(answerForm);
        model.addAttribute("question", question);
        return "question/question_detail";
    }

    @GetMapping("/create")
    public String createQuestion(QuestionForm questionForm, Model model) {
        model.addAttribute(questionForm);
        return "question/question_form";
    }

    @PostMapping("/create")
    public String createQuestion(@Valid QuestionForm questionForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "question/question_form";
        }
        this.questionService.create(questionForm.getSubject(), questionForm.getContent());
//        this.questionService.create(subject, content);
        return "redirect:/question/list";
    }
}
