package `in`.hypernation.pokedex.data.remote.responses

import hypernation.pokedex.data.remote.responses.Species
import hypernation.pokedex.data.remote.responses.Sprites
import hypernation.pokedex.data.remote.responses.Stat
import hypernation.pokedex.data.remote.responses.Type
import `in`.hypernation.pokedex.data.remote.responses.Ability

data class Pokemon(
    val abilities: List<Ability>,
    val base_experience: Int,
    val forms: List<Form>,
    val game_indices: List<GameIndice>,
    val height: Int,
    val held_items: List<HeldItem>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<Move>,
    val name: String,
    val order: Int,
    val past_types: List<Any>,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Int
)