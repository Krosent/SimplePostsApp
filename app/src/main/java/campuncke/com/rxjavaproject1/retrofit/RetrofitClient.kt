package campuncke.com.rxjavaproject1.retrofit

import android.content.Context
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object {
        private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
        private var retrofit: Retrofit? = null

        fun getClient(context: Context): Retrofit? {
            if(retrofit == null) {
                retrofit = Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .baseUrl(BASE_URL)
                        .build()
            }
            return retrofit
        }
    }
}