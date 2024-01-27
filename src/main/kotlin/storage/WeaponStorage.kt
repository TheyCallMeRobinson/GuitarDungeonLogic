package storage

import model.enums.DamageType
import model.enums.Rarity
import model.enums.WeaponType
import model.item.Weapon

val weaponRuntimeStorage = listOf(
    Weapon(
        id = 0,
        name = "Fists",
        description = "Rip and Tear",
        price = 0,
        rarity = Rarity.COMMON,
        picUri = null,
        baseAnswerTimeMs = 5000,
        baseDamage = 5,
        damageType = DamageType.EARTH,
        weaponType = WeaponType.UNIQUE
    ),
    Weapon(
        id = 1,
        name = "FABIO ST100",
        description = "Cheap guitar with the sound of chinese national anthem",
        price = 100,
        rarity = Rarity.UNCOMMON,
        picUri = null,
        baseAnswerTimeMs = 5000,
        baseDamage = 10,
        damageType = DamageType.LIGHTNING,
        weaponType = WeaponType.ELECTRIC
    ),
    Weapon(
        id = 2,
        name = "FENDER SQUIER",
        description = "Heavy and reliable classic electric guitar",
        price = 200,
        rarity = Rarity.RARE,
        picUri = null,
        baseAnswerTimeMs = 7000,
        baseDamage = 15,
        damageType = DamageType.LIGHTNING,
        weaponType = WeaponType.ELECTRIC
    ),
    Weapon(
        id = 3,
        name = "EPIPHONE LES PAUL",
        description = "Half-electric, half-acoustic, together awesome",
        price = 700,
        rarity = Rarity.EPIC,
        picUri = null,
        baseAnswerTimeMs = 10000,
        baseDamage = 50,
        damageType = DamageType.LIGHTNING,
        weaponType = WeaponType.ELECTRIC
    ),
    Weapon(
        id = 4,
        name = "BELUCCI BLS",
        description = "Sounds like there's a several picks lost inside",
        price = 120,
        rarity = Rarity.UNCOMMON,
        picUri = null,
        baseAnswerTimeMs = 5000,
        baseDamage = 10,
        damageType = DamageType.EARTH,
        weaponType = WeaponType.ACOUSTIC
    ),
    Weapon(
        id = 5,
        name = "MATON CUSTOM FLATPICKER",
        description = "Japanese masterpiece",
        price = 1000,
        rarity = Rarity.LEGENDARY,
        picUri = null,
        baseAnswerTimeMs = 6000,
        baseDamage = 100,
        damageType = DamageType.FIRE,
        weaponType = WeaponType.ACOUSTIC
    )
)