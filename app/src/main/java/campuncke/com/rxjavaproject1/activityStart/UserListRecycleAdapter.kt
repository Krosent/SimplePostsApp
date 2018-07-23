package campuncke.com.rxjavaproject1.activityStart

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import campuncke.com.rxjavaproject1.R
import campuncke.com.rxjavaproject1.Utils
import campuncke.com.rxjavaproject1.activityStart.model.User

class UserListRecycleAdapter(
        private var userListInfo: UserListInfo,
        private var onClickListener: Utils.Companion.OnClickListener
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    class UserListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_user, parent, false)

        return  UserListRecycleAdapter.UserListViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userListInfo.users.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var nameTextView: TextView = holder.itemView.findViewById(R.id.nameTextView)
        var emailTextView: TextView = holder.itemView.findViewById(R.id.emailTextView)
        var phoneTextView: TextView = holder.itemView.findViewById(R.id.phoneTextView)
        var wwwTextView: TextView = holder.itemView.findViewById(R.id.wwwTextView)

        nameTextView.text = userListInfo.users[position].name
        emailTextView.text = userListInfo.users[position].email
        phoneTextView.text = userListInfo.users[position].phone
        wwwTextView.text = userListInfo.users[position].website

        holder.itemView.setOnClickListener { onClickListener.itemClicked(position) }
    }

    fun getItem(position: Int): User {
        return userListInfo.users[position]
    }
}