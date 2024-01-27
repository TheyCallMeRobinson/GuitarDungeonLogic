package model.abst

import model.enums.Rarity
import model.interfaces.Consumable

abstract class Potion(
    override val id: Int,
    override val name: String,
    override val description: String,
    override val price: Int,
    override val picUri: String?,
    open val potionSicknessDurationTurns: Int
) : Item(id = id, name = name, description = description, price = price, rarity = Rarity.COMMON, picUri = picUri),
    Consumable