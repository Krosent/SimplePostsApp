package campuncke.com.rxjavaproject1.retrofit.services

import campuncke.com.rxjavaproject1.activityPosts.model.Post
import campuncke.com.rxjavaproject1.activityStart.model.User
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface SimpleService {
    @GET("/users")
    fun getUserList(): Observable<List<User>>
    @GET("/posts")
    fun getUserPostsList(@Query(value="userId", encoded=true) name: String): Observable<List<Post>>
}