package com.codepath.articlesearch
import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/*@Keep
@Serializable
data class SearchNewsResponse(
    @SerialName("response")
    val response: BaseResponse?
)*/

@Keep
@Serializable
data class ListOfShows(
    @SerialName("results")
    val results: List<TvShow>?
)

@Keep
@Serializable
data class TvShow(
    @SerialName("name")
    val name: String?,
    @SerialName("overview")
    val overview: String?,
    @SerialName("poster_path")
    val poster_path: String?,
    @SerialName("first_air_date")
    val first_air_date: String?,
    @SerialName("vote_average")
    val vote_average: String?,
    @SerialName("original_language")
    val original_language: String?,
) : java.io.Serializable {
    val posterUrl = "https://image.tmdb.org/t/p/w500/${poster_path}"
    val rating = "Rating = ${vote_average}/10"
    val aired = "First aired ${first_air_date}"
    val lang = "Original language: ${original_language}"
    //val mediaImageUrl = "https://www.nytimes.com/${multimedia?.firstOrNull { it.url != null }?.url ?: ""}"
}

/*@Keep
@Serializable
data class HeadLine(
    @SerialName("main")
    val main: String
) : java.io.Serializable

@Keep
@Serializable
data class Byline(
    @SerialName("original")
    val original: String? = null
) : java.io.Serializable

@Keep
@Serializable
data class MultiMedia(
    @SerialName("url")
    val url: String?
) : java.io.Serializable*/