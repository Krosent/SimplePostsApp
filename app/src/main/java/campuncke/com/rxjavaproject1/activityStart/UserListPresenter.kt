package campuncke.com.rxjavaproject1.activityStart

import campuncke.com.rxjavaproject1.activityStart.model.User

interface UserListPresenter {
    fun loadData()
    fun bindUserList(users: List<User>)
}