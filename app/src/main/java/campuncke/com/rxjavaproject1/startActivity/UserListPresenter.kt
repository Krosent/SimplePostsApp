package campuncke.com.rxjavaproject1.startActivity

import campuncke.com.rxjavaproject1.startActivity.model.User

interface UserListPresenter {
    fun loadData()
    fun bindUserList(users: List<User>)
}