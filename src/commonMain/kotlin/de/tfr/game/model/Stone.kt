package de.tfr.game.model


class Stone(private val initBlock: Block) {

    enum class State { Active, Set }

    var state = State.Active

    var block: Block = initBlock

    fun freeze() {
        state = State.Set
    }

    override fun toString(): String {
        return "Stone[$state]"
    }
}