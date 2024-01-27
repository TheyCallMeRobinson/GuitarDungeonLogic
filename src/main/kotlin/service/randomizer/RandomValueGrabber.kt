package service.randomizer

import service.provider.Provider
import kotlin.random.Random

class RandomValueGrabber<V>(private val provider: Provider<V>) {

    fun provideRandom(): V {
        val entityList = provider.provideList()
        return entityList[Random.nextInt(from = 0, until = entityList.size)]
    }
}