package uz.exemple.less510_instagramui_kotlin.model

class Feed {
    var post: Post? = null
    var stories: ArrayList<Story> = ArrayList<Story>()

    constructor(post: Post) {
        this.post = post
    }

    constructor(stories: ArrayList<Story>) {
        this.stories = stories
    }
}