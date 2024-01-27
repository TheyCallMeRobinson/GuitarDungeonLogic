package storage

import model.dungeon.Monster
import model.enums.CharacterViewState
import java.util.UUID
import kotlin.collections.mutableSetOf

private const val GOBLIN_BASE_HEALTH_POINTS = 30
private const val GREMLIN_BASE_HEALTH_POINTS = 50
private const val PIGLIN_BASE_HEALTH_POINTS = 100

private const val GOBLIN_BASE_LEVEL = 1
private const val GREMLIN_BASE_LEVEL = 2
private const val PIGLIN_BASE_LEVEL = 3

private const val GOBLIN_WEAPON_INDEX = 0
private const val GREMLIN_WEAPON_INDEX = 1
private const val PIGLIN_WEAPON_INDEX = 4

private const val GOBLIN_OUTFIT_INDEX = 0
private const val GREMLIN_OUTFIT_INDEX = 1
private const val PIGLIN_OUTFIT_INDEX = 1


val monsterRuntimeStorage = listOf(
    Monster(
        id = UUID.randomUUID(),
        name = "Goblin",
        baseHealthPoints = GOBLIN_BASE_HEALTH_POINTS,
        currentHealthPoints = GOBLIN_BASE_HEALTH_POINTS,
        level = GOBLIN_BASE_LEVEL,
        weapon = weaponRuntimeStorage[GOBLIN_WEAPON_INDEX],
        outfit = outfitRuntimeStorage[GOBLIN_OUTFIT_INDEX],
        state = CharacterViewState.ALIVE,
        activeEffects = mutableSetOf()
    ),
    Monster(
        id = UUID.randomUUID(),
        name = "Gremlin",
        baseHealthPoints = GREMLIN_BASE_HEALTH_POINTS,
        currentHealthPoints = GREMLIN_BASE_HEALTH_POINTS,
        level = GREMLIN_BASE_LEVEL,
        weapon = weaponRuntimeStorage[GREMLIN_WEAPON_INDEX],
        outfit = outfitRuntimeStorage[GREMLIN_OUTFIT_INDEX],
        state = CharacterViewState.ALIVE,
        activeEffects = mutableSetOf()
    ),
    Monster(
        id = UUID.randomUUID(),
        name = "Piglin",
        baseHealthPoints = PIGLIN_BASE_HEALTH_POINTS,
        currentHealthPoints = PIGLIN_BASE_HEALTH_POINTS,
        level = PIGLIN_BASE_LEVEL,
        weapon = weaponRuntimeStorage[PIGLIN_WEAPON_INDEX],
        outfit = outfitRuntimeStorage[PIGLIN_OUTFIT_INDEX],
        state = CharacterViewState.ALIVE,
        activeEffects = mutableSetOf()
    )
)