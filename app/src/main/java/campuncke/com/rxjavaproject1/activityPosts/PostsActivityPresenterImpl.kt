package campuncke.com.rxjavaproject1.activityPosts

import campuncke.com.rxjavaproject1.activityStart.model.User
import campuncke.com.rxjavaproject1.retrofit.RetrofitClient
import campuncke.com.rxjavaproject1.retrofit.services.SimpleService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PostsActivityPresenterImpl(private val postsActivityView: PostsActivityView) : PostsActivityPresenter {

    private val api: SimpleService = RetrofitClient.getClient()?.create(SimpleService::class.java)!!

    override fun loadRecyclerViewData(user: User) {
        api.getUserPostsList(user.id.toString())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> postsActivityView.updateRecyclerView(result, user)
                            postsActivityView.hideProgressBar()},
                        { error -> postsActivityView.showError(error.message)
                            postsActivityView.hideProgressBar()})
    }

}