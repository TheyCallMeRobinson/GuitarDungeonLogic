package storage

import model.item.potion.ConcentrationPotion

val concentrationPotionStorage = listOf(
    ConcentrationPotion(
        id = 0,
        name = "Small concentration potion",
        description = "Increases your answer time by 20% for 3 turns",
        price = 10,
        potionSicknessDurationTurns = 7,
        picUri = null,
        activeEffectDurationTurns = 3
    ),
    ConcentrationPotion(
        id = 1,
        name = "Great concentration potion",
        description = "Increases your answer time by 30% for 5 turns",
        price = 100,
        potionSicknessDurationTurns = 10,
        picUri = null,
        activeEffectDurationTurns = 5
    )
)