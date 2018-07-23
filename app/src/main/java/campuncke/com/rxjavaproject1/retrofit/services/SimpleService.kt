package campuncke.com.rxjavaproject1.retrofit.services

import campuncke.com.rxjavaproject1.activityStart.model.User
import io.reactivex.Observable
import retrofit2.http.GET

interface SimpleService {
    @GET("/users")
    fun getUserList(): Observable<List<User>>
}