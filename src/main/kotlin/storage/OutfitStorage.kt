package storage

import model.enums.Rarity
import model.item.Outfit

val outfitRuntimeStorage = listOf(
    Outfit(
        id = 0,
        name = "Underwear",
        description = "Confuse your enemy",
        picUri = null,
        price = 0,
        rarity = Rarity.COMMON,
        defence = 0
    ),
    Outfit(
        id = 1,
        name = "Leather Jacket",
        description = "Smells something sweetish and blood",
        picUri = null,
        price = 50,
        rarity = Rarity.UNCOMMON,
        defence = 5
    ),
    Outfit(
        id = 2,
        name = "Kiss outfit",
        description = "Additional damage when attack with tongue or feet",
        picUri = null,
        price = 400,
        rarity = Rarity.EPIC,
        defence = 20
    ),
    Outfit(
        id = 3,
        name = "Metallica outfit",
        description = "Perfect for riding the lightning",
        picUri = null,
        price = 400,
        rarity = Rarity.EPIC,
        defence = 20
    ),
    Outfit(
        id = 4,
        name = "Exploited outfit",
        description = "Punks not dead!",
        picUri = null,
        price = 400,
        rarity = Rarity.EPIC,
        defence = 20
    )
)