package `in`.hypernation.pokedex.data.remote.responses

import hypernation.pokedex.data.remote.responses.Item
import hypernation.pokedex.data.remote.responses.VersionDetail

data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)