package campuncke.com.rxjavaproject1.startActivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import campuncke.com.rxjavaproject1.R
import kotlinx.android.synthetic.main.activity_users.*

class UsersActivity : AppCompatActivity(), UserListView {
    private val userListPresenterImpl = UserListPresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)


        usersRecycleView.layoutManager = LinearLayoutManager(this)
        userListPresenterImpl.loadData()
    }

    override fun updateRecycleView(userListInfo: UserListInfo) {
        val userListRecycleAdapter = UserListRecycleAdapter(userListInfo)
        usersRecycleView.adapter = userListRecycleAdapter
    }

}
