package uz.exemple.less510_instagramui_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less510_instagramui_kotlin.adapter.FeedAdapter
import uz.exemple.less510_instagramui_kotlin.model.Feed
import uz.exemple.less510_instagramui_kotlin.model.Post
import uz.exemple.less510_instagramui_kotlin.model.Story

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(getAllFeeds())
    }

    fun refreshAdapter(feeds: ArrayList<Feed>) {
        val adapter = FeedAdapter(this, feeds)
        recyclerView.adapter = adapter
    }

    fun getAllFeeds(): ArrayList<Feed> {

        val stories: ArrayList<Story> = ArrayList<Story>()
        stories.add(Story(R.drawable.profile4, "Yamach"))
        stories.add(Story(R.drawable.profile3, "Sarvar"))
        stories.add(Story(R.drawable.profile2, "Qambar"))
        stories.add(Story(R.drawable.profile1, "Anvar"))
        stories.add(Story(R.drawable.profile3, "Sarvar"))
        stories.add(Story(R.drawable.profile1, "Anvar"))
        stories.add(Story(R.drawable.profile2, "Qambar"))
        stories.add(Story(R.drawable.profile4, "Yamach"))

        val feeds: ArrayList<Feed> = ArrayList<Feed>()
        feeds.add(Feed(stories))
        feeds.add(Feed(Post(R.drawable.profile4, "Yamach", getTwoPhotos(),false)))
        feeds.add(Feed(Post(R.drawable.profile1, "Anvaar", getThreePhotos(),false)))
        feeds.add(Feed(Post(R.drawable.profile3, "Sarvar", R.drawable.photo7,true)))
        feeds.add(Feed(Post(R.drawable.profile2, "Qambar", R.drawable.photo2,false)))
        feeds.add(Feed(Post(R.drawable.profile4, "Yamach", R.drawable.photo4,false)))
        feeds.add(Feed(Post(R.drawable.profile1, "Anvar", R.drawable.photo1,false)))

        return feeds;
    }
    fun getTwoPhotos(): IntArray {
        val photos = IntArray(2)
        photos[0] = R.drawable.photo5
        photos[1] = R.drawable.photo6
        return photos
    }

    fun getThreePhotos(): IntArray {
        val photos = IntArray(3)
        photos[0] = R.drawable.photo9
        photos[1] = R.drawable.photo8
        photos[2] = R.drawable.photo7
        return photos
    }
}