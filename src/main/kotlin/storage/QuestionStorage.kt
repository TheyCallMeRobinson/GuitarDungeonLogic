package storage

import model.dungeon.QuestionTheme
import model.question.Answer
import model.question.Question

val questionRuntimeStorage = listOf(
    Question(
        id = 0,
        text = "Standard tuning for guitar",
        theme = QuestionTheme(id = 0, name = "Notes"),
        answers = listOf(
            Answer(id = 0, text = "E standard", isCorrect = true),
            Answer(id = 1, text = "Drop E", isCorrect = false),
            Answer(id = 2, text = "Drop C", isCorrect = false),
            Answer(id = 3, text = "D standard", isCorrect = false)
        )
    ),
    Question(
        id = 1,
        text = "C Minor consists of next pitches",
        theme = QuestionTheme(id = 0, name = "Notes"),
        answers = listOf(
            Answer(id = 4, text = "C, D, E♭, F, G, A♭, B♭", isCorrect = true),
            Answer(id = 5, text = "Cb, D, E, F, G, A, B", isCorrect = false),
            Answer(id = 6, text = "Cb, D, E♭, F, G, A♭, B♭", isCorrect = false),
            Answer(id = 7, text = "Cb, D, E♭, F, G, A, B♭", isCorrect = false)
        )
    )
)