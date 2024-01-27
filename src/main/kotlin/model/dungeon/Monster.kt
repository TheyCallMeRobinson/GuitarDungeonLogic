package model.dungeon

import model.item.Outfit
import model.item.Weapon
import model.abst.GameCharacter
import model.abst.Effect
import model.enums.CharacterViewState
import java.util.*

data class Monster(
    override val id: UUID,
    override val name: String,
    override val baseHealthPoints: Int,
    override val currentHealthPoints: Int,
    override val level: Int,
    override val weapon: Weapon?,
    override val outfit: Outfit?,
    override val state: CharacterViewState,
    override val activeEffects: MutableSet<Effect>
) : GameCharacter(
    id = id,
    name = name,
    baseHealthPoints = baseHealthPoints,
    currentHealthPoints = currentHealthPoints,
    level = level,
    weapon = weapon,
    outfit = outfit,
    state = state,
    activeEffects = activeEffects
) {
    override fun attack(target: GameCharacter) {
        TODO("Not yet implemented")
    }
}