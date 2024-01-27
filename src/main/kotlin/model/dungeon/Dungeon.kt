package model.dungeon

import model.interfaces.Enterable

data class Dungeon(
    val id: Int,
    val name: String,
    val theme: QuestionTheme,
    val levelThreshold: Int,
    val backgroundUri: String?,
    val monsters: List<Monster>
) : Enterable {
    override fun enter() {
        TODO("Not yet implemented")
    }

    override fun exit() {
        TODO("Not yet implemented")
    }
}