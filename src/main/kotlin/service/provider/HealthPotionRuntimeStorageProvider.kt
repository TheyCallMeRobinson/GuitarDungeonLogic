package service.provider

import model.item.potion.HealthPotion
import storage.healthPotionRuntimeStorage

class HealthPotionRuntimeStorageProvider : Provider<HealthPotion> {

    override fun provideList(): List<HealthPotion> {
        return ArrayList(healthPotionRuntimeStorage)
    }
}