package `in`.hypernation.pokedex.data.remote.responses

import hypernation.pokedex.data.remote.responses.AbilityX

data class Ability(
    val ability: AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)