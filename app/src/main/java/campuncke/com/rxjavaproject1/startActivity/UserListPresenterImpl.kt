package campuncke.com.rxjavaproject1.startActivity

import android.util.Log
import campuncke.com.rxjavaproject1.retrofit.RetrofitClient
import campuncke.com.rxjavaproject1.retrofit.services.SimpleService
import campuncke.com.rxjavaproject1.startActivity.model.User
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class UserListPresenterImpl(private val userListView: UserListView): UserListPresenter {
    private val api: SimpleService = RetrofitClient.getClient()?.create(SimpleService::class.java)!!

    override fun loadData() {
        api.getUserList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result ->  bindUserList(result) },
                        { error -> Log.e("Something get wrong", error.message) }
                )

    }

    override fun bindUserList(users: List<User>) {
        val userListInfo = UserListInfo(users)
        userListView.updateRecycleView(userListInfo)
    }


}
