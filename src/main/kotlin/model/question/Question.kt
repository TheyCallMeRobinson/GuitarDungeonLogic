package model.question

import model.dungeon.QuestionTheme

data class Question(
    val id: Int,
    val text: String,
    val theme: QuestionTheme,
    val answers: List<Answer>
)
