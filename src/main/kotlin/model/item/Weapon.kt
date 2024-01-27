package model.item

import model.abst.Item
import model.enums.DamageType
import model.enums.Rarity
import model.enums.WeaponType

data class Weapon(
    override val id: Int,
    override val name: String,
    override val description: String?,
    override val price: Int,
    override val rarity: Rarity = Rarity.COMMON,
    override val picUri: String?,
    val baseAnswerTimeMs: Int,
    val baseDamage: Int,
    val damageType: DamageType,
    val weaponType: WeaponType
) : Item(
    id = id,
    name = name,
    description = description,
    price = price,
    rarity = rarity,
    picUri = picUri
)