package service.provider

import model.dungeon.Monster
import storage.monsterRuntimeStorage

class MonsterRuntimeStorageProvider : Provider<Monster> {

    override fun provideList(): List<Monster> {
        return ArrayList(monsterRuntimeStorage)
    }
}