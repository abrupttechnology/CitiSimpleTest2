package com.example.simpletest2

import android.content.res.Resources

/**
 * TODO: Please do reverse the list when presented in UI
 * */
fun fetchData(resources: Resources): List<Article> {
    return listOf(
        Article(
            title = resources.getString(R.string.title_1),
            content = resources.getString(R.string.content_1),
            imageURL = resources.getString(R.string.imageURL_1)
        ),
        Article(
            title = resources.getString(R.string.title_2),
            content = resources.getString(R.string.content_2),
            imageURL = resources.getString(R.string.imageURL_2)
        ),
        Article(
            title = resources.getString(R.string.title_3),
            content = resources.getString(R.string.content_3),
            imageURL = resources.getString(R.string.imageURL_3)
        ),
        Article(
            title = resources.getString(R.string.title_4),
            content = resources.getString(R.string.content_4),
            imageURL = resources.getString(R.string.imageURL_4)
        ),
        Article(
            title = resources.getString(R.string.title_5),
            content = resources.getString(R.string.content_5),
            imageURL = resources.getString(R.string.imageURL_5)
        ),
        Article(
            title = resources.getString(R.string.title_6),
            content = resources.getString(R.string.content_6),
            imageURL = resources.getString(R.string.imageURL_6)
        ),
        Article(
            title = resources.getString(R.string.title_7),
            content = resources.getString(R.string.content_7),
            imageURL = resources.getString(R.string.imageURL_7)
        ),
        Article(
            title = resources.getString(R.string.title_8),
            content = resources.getString(R.string.content_8),
            imageURL = resources.getString(R.string.imageURL_8)
        ),
        Article(
            title = resources.getString(R.string.title_9),
            content = resources.getString(R.string.content_9),
            imageURL = resources.getString(R.string.imageURL_9)
        ),
        Article(
            title = resources.getString(R.string.title_10),
            content = resources.getString(R.string.content_10),
            imageURL = resources.getString(R.string.imageURL_10)
        ),
    )
}
