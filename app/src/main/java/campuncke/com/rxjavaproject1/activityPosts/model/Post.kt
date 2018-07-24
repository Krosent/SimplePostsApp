package campuncke.com.rxjavaproject1.activityPosts.model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Post(

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("body")
	val body: String? = null,

	@field:SerializedName("userId")
	val userId: Int? = null
)