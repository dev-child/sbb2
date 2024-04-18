package com.mysite.sbb2.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {

    @NotEmpty(message = "required subject")
    @Size(max = 200)
    private String subject;

    @NotEmpty(message = "required content")
    private String content;
}
