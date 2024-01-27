package service.generator

import model.enums.CharacterViewState
import model.item.Outfit
import model.item.Weapon
import model.player.Player
import java.util.*
import kotlin.collections.HashSet

private const val PLAYER_BASE_HEALTH_POINTS = 100
private const val PLAYER_INITIAL_COINS_AMOUNT = 100
private const val PLAYER_INITIAL_LEVEL = 1

class PlayerGenerator {

    fun generatePlayer(playerName: String, startWeapon: Weapon, startOutfit: Outfit): Player {
        return Player(
            id = UUID.randomUUID(),
            name = playerName,
            baseHealthPoints = PLAYER_BASE_HEALTH_POINTS,
            currentHealthPoints = PLAYER_BASE_HEALTH_POINTS,
            level = PLAYER_INITIAL_LEVEL,
            weapon = startWeapon,
            outfit = startOutfit,
            state = CharacterViewState.ALIVE,
            activeEffects = HashSet(),
            ownItems = mutableListOf(startWeapon, startOutfit),
            coins = PLAYER_INITIAL_COINS_AMOUNT
        )
    }
}
