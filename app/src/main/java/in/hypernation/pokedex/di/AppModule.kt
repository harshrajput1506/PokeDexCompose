package `in`.hypernation.pokedex.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import `in`.hypernation.pokedex.data.remote.PokeApi
import `in`.hypernation.pokedex.repository.PokemonRepository
import `in`.hypernation.pokedex.util.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRepository(
        api: PokeApi
    ) = PokemonRepository(api)

    @Singleton
    @Provides
    fun providePokeApi() : PokeApi {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)

        return retrofit
    }


}