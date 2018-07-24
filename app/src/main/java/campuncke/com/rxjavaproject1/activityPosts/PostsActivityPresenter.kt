package campuncke.com.rxjavaproject1.activityPosts

import campuncke.com.rxjavaproject1.activityStart.model.User

interface PostsActivityPresenter {

    fun loadRecyclerViewData(user: User)
}