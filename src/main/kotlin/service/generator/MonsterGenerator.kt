package service.generator

import model.dungeon.Monster
import service.provider.MonsterRuntimeStorageProvider
import service.provider.Provider
import service.randomizer.RandomValueGrabber

class MonsterGenerator {
    private val monsterProvider: Provider<Monster> = MonsterRuntimeStorageProvider()
    private val randomMonsterGrabber = RandomValueGrabber(monsterProvider)

    fun generateMonsterSequence(size: Int): List<Monster> {
        val monsterSequenceList = mutableListOf<Monster>()

        for (i in 0..size) {
            monsterSequenceList.add(randomMonsterGrabber.provideRandom())
        }

        return monsterSequenceList
    }
}
