package model.abst

import model.enums.Rarity

abstract class Item(
    open val id: Int,
    open val name: String,
    open val description: String?,
    open val price: Int,
    open val rarity: Rarity = Rarity.COMMON,
    open val picUri: String?
) {
    fun getInfoText(): String {
        return """
            Rarity: $rarity,
            Name: $name,
            Description: $description,
            Price: $price
        """
    }
}