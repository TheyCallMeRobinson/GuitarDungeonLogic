package model.item

import model.abst.Item
import model.enums.Rarity

data class Outfit(
    override val id: Int,
    override val name: String,
    override val description: String,
    override val picUri: String?,
    override val price: Int,
    override val rarity: Rarity,
    val defence: Int
) : Item(
    id = id,
    name = name,
    description = description,
    picUri = picUri,
    price = price,
    rarity = rarity
)