package model.player

import model.abst.Effect
import model.enums.CharacterViewState
import model.item.Outfit
import model.item.Weapon
import java.util.*
import model.abst.GameCharacter
import model.abst.Item

class Player(
    override val id: UUID = UUID.randomUUID(),
    override val name: String,
    override var baseHealthPoints: Int,
    override var currentHealthPoints: Int,
    override var level: Int,
    override var weapon: Weapon?,
    override var outfit: Outfit?,
    override var state: CharacterViewState,
    override var activeEffects: MutableSet<Effect>,
    val ownItems: List<Item>,
    var coins: Int
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