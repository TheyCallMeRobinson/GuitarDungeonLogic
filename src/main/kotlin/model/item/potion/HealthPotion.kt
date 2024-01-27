package model.item.potion

import model.abst.Potion

data class HealthPotion(
    override val id: Int,
    override val name: String,
    override val description: String,
    override val price: Int,
    override val potionSicknessDurationTurns: Int,
    override val picUri: String?,
    val healthRestoreAmount: Int,
) : Potion(
    id = id,
    name = name,
    description = description,
    price = price,
    potionSicknessDurationTurns = potionSicknessDurationTurns,
    picUri = picUri
) {
    override fun consume() {
        TODO("Not yet implemented")
    }
}
