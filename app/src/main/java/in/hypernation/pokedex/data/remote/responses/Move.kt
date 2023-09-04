package `in`.hypernation.pokedex.data.remote.responses

import hypernation.pokedex.data.remote.responses.VersionGroupDetail

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)