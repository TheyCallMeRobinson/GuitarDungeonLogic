package service.provider

import model.item.potion.ConcentrationPotion
import storage.concentrationPotionStorage

class ConcentrationPotionRuntimeStorageProvider : Provider<ConcentrationPotion> {

    override fun provideList(): List<ConcentrationPotion> {
        return ArrayList(concentrationPotionStorage)
    }
}