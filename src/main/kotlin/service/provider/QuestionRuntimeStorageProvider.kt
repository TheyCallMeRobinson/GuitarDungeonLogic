package service.provider

import model.question.Question
import storage.questionRuntimeStorage

class QuestionRuntimeStorageProvider : Provider<Question> {

    override fun provideList(): List<Question> {
        return ArrayList(questionRuntimeStorage)
    }
}