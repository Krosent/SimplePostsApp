package campuncke.com.rxjavaproject1.activityStart

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import campuncke.com.rxjavaproject1.R
import campuncke.com.rxjavaproject1.Utils
import campuncke.com.rxjavaproject1.activityPosts.PostsActivity
import kotlinx.android.synthetic.main.activity_users.*

class UsersActivity : AppCompatActivity(), UserListView, Utils.Companion.OnClickListener {

    private val userListPresenterImpl = UserListPresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)
        showProgressBar()

        usersRecycleView.layoutManager = LinearLayoutManager(this)
        usersRecycleView.adapter = UserListRecycleAdapter(UserListInfo(emptyList()), this)
        userListPresenterImpl.loadData()
    }

    override fun updateRecycleView(userListInfo: UserListInfo) {
        usersRecycleView.adapter = UserListRecycleAdapter(userListInfo, this)
    }

    override fun showProgressBar() {
        loadingDataProgressBar.visibility = View.VISIBLE
    }

    override fun hideProgressBar() {
        loadingDataProgressBar.visibility = View.GONE
    }

    override fun itemClicked(position: Int) {
        startActivity(Intent(this@UsersActivity, PostsActivity::class.java).apply {
            val bundle = Bundle()
            bundle.putParcelable("user",
                    (usersRecycleView.adapter as UserListRecycleAdapter)
                            .getItem(position))
            putExtras(bundle)
        })
    }
}
