package campuncke.com.rxjavaproject1.activityPosts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import campuncke.com.rxjavaproject1.R
import campuncke.com.rxjavaproject1.activityStart.model.User

class PostsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posts)

        Log.e("UserName", intent.extras.getParcelable<User>("user").name)
    }
}
