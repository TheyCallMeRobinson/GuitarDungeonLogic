package service.usecase

import model.abst.GameCharacter
import model.abst.Effect

class ActiveEffectService {

    fun setActiveEffectTo(activeEffect: Effect, target: GameCharacter) {
        target.activeEffects.add(activeEffect)
    }

    fun removeActiveEffectFrom(activeEffect: Effect, target: GameCharacter) {
        target.activeEffects.remove(activeEffect)
    }
}