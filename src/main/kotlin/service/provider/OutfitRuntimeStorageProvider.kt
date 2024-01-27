package service.provider

import model.item.Outfit
import storage.outfitRuntimeStorage

class OutfitRuntimeStorageProvider : Provider<Outfit> {

    override fun provideList(): List<Outfit> {
        return ArrayList(outfitRuntimeStorage)
    }
}