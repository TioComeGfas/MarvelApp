package cl.tiocomegfas.app.marvelcomics.data.entity.response

import com.google.gson.annotations.SerializedName

data class GetAllCharactersResponse(
    val attributionHTML: String,
    val attributionText: String,
    val code: Int,
    val copyright: String,
    @SerializedName("data") val content: Content,
    @SerializedName("etag") val tag: String,
    val status: String
) {

    data class Content(
        val count: Int,
        val limit: Int,
        val offset: Int,
        val results: List<Result>,
        val total: Int
    )

    data class Result(
        val comics: Comics,
        val description: String,
        val events: Events,
        val id: Int,
        val modified: String,
        val name: String,
        val resourceURI: String,
        val series: Series,
        val stories: Stories,
        val thumbnail: Thumbnail,
        val urls: List<Url>
    )

    data class Events(
        val available: Int,
        val collectionURI: String,
        val items: List<Item>,
        val returned: Int
    )

    data class Comics(
        val available: Int,
        val collectionURI: String,
        val items: List<Item>,
        val returned: Int
    )

    data class Stories(
        val available: Int,
        val collectionURI: String,
        val items: List<ItemXXX>,
        val returned: Int
    )

    data class Series(
        val available: Int,
        val collectionURI: String,
        val items: List<Item>,
        val returned: Int
    )

    data class Thumbnail(
        val extension: String,
        val path: String
    )

    data class Url(
        val type: String,
        val url: String
    )

    data class Item(
        val name: String,
        val resourceURI: String
    )

    data class ItemXXX(
        val name: String,
        val resourceURI: String,
        val type: String
    )
}
