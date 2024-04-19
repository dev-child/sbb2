package com.mysite.sbb2.answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AnswerForm {

    @NotEmpty(message = "required content")
    private String content;
}
