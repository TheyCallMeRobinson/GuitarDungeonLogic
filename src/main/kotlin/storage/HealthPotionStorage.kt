package storage

import model.item.potion.HealthPotion

val healthPotionRuntimeStorage = listOf(
    HealthPotion(
        id = 0,
        name = "Small Restore Potion",
        description = "Cheap way to restore your health",
        price = 10,
        potionSicknessDurationTurns = 4,
        picUri = null,
        healthRestoreAmount = 30
    ),
    HealthPotion(
        id = 1,
        name = "Great Restore Potion",
        description = "Expensive way to restore your health",
        price = 50,
        potionSicknessDurationTurns = 6,
        picUri = null,
        healthRestoreAmount = 100
    )
)