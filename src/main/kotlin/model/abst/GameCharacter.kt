package model.abst

import model.enums.CharacterViewState
import model.item.Outfit
import model.item.Weapon
import java.util.UUID

abstract class GameCharacter(
    open val id: UUID,
    open val name: String,
    open val baseHealthPoints: Int,
    open val currentHealthPoints: Int,
    open val level: Int,
    open val weapon: Weapon?,
    open val outfit: Outfit?,
    open val state: CharacterViewState,
    open val activeEffects: MutableSet<Effect>
) {
    abstract fun attack(target: GameCharacter)
}