package campuncke.com.rxjavaproject1.activityPosts

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import campuncke.com.rxjavaproject1.R
import campuncke.com.rxjavaproject1.activityPosts.model.Post
import campuncke.com.rxjavaproject1.activityStart.model.User

class PostListRecyclerAdapter(private val posts: List<Post>, private val user: User
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class PostListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_post, parent, false)

        return  PostListRecyclerAdapter.PostListViewHolder(v)
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val titleTextView: TextView = holder.itemView.findViewById(R.id.titleTextView)
        val bodyTextView: TextView = holder.itemView.findViewById(R.id.bodyTextView)
        val authorNameTextView: TextView = holder.itemView.findViewById(R.id.authorNameTextView)

        titleTextView.text = posts[position].title
        bodyTextView.text = posts[position].body
        authorNameTextView.text = user.name
    }
}