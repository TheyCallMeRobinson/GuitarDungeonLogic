package service.provider

import model.item.Weapon
import storage.weaponRuntimeStorage

class WeaponRuntimeStorageProvider : Provider<Weapon> {

    override fun provideList(): List<Weapon> {
        return ArrayList(weaponRuntimeStorage)
    }
}