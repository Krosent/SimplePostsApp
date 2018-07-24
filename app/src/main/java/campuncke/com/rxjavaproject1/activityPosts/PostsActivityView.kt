package campuncke.com.rxjavaproject1.activityPosts

import campuncke.com.rxjavaproject1.activityPosts.model.Post
import campuncke.com.rxjavaproject1.activityStart.model.User

interface PostsActivityView {

    fun updateRecyclerView(posts: List<Post>, user: User)
    fun showError(msg: String?)
    fun showProgressBar()
    fun hideProgressBar()
}