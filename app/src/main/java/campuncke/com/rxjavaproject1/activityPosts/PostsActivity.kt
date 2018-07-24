package campuncke.com.rxjavaproject1.activityPosts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import campuncke.com.rxjavaproject1.R
import campuncke.com.rxjavaproject1.activityPosts.model.Post
import campuncke.com.rxjavaproject1.activityStart.model.User
import kotlinx.android.synthetic.main.activity_posts.*

class PostsActivity : AppCompatActivity(), PostsActivityView {

    private val postsActivityPresenterImpl = PostsActivityPresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posts)

        showProgressBar()
        val user = intent.extras.getParcelable<User>("user")
        postsActivityPresenterImpl.loadRecyclerViewData(user)

        postsRecyclerView.layoutManager = LinearLayoutManager(this)

        postsActivityPresenterImpl.loadRecyclerViewData(user)
    }

    override fun updateRecyclerView(posts: List<Post>, user: User) {
        postsRecyclerView.adapter = PostListRecyclerAdapter(posts, user)
    }

    override fun showError(messsage: String?) {
        Toast.makeText(this, messsage, Toast.LENGTH_LONG).show()
    }

    override fun showProgressBar() {
        loadPostsPB.visibility =  View.VISIBLE
    }

    override fun hideProgressBar() {
        loadPostsPB.visibility =  View.GONE
    }
}
