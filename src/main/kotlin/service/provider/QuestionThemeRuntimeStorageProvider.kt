package service.provider

import model.dungeon.QuestionTheme
import storage.questionThemeRuntimeStorage

class QuestionThemeRuntimeStorageProvider : Provider<QuestionTheme> {

    override fun provideList(): List<QuestionTheme> {
        return ArrayList(questionThemeRuntimeStorage)
    }
}