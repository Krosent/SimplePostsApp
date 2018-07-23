package campuncke.com.rxjavaproject1.activityStart.model

import android.os.Parcel
import android.os.Parcelable
import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class User(
		@field:SerializedName("website")
	val website: String? = null,

		@field:SerializedName("address")
	val address: Address? = null,

		@field:SerializedName("phone")
	val phone: String? = null,

		@field:SerializedName("name")
	val name: String? = null,

		@field:SerializedName("company")
	val company: Company? = null,

		@field:SerializedName("id")
	val id: Int? = null,

		@field:SerializedName("email")
	val email: String? = null,

		@field:SerializedName("username")
	val username: String? = null
) : Parcelable {
	constructor(parcel: Parcel) : this(
			parcel.readString(),
			parcel.readParcelable(Address::class.java.classLoader),
			parcel.readString(),
			parcel.readString(),
			parcel.readParcelable(Company::class.java.classLoader),
			parcel.readValue(Int::class.java.classLoader) as? Int,
			parcel.readString(),
			parcel.readString())

	override fun writeToParcel(parcel: Parcel, flags: Int) {
		parcel.writeString(website)
		parcel.writeParcelable(address, describeContents())
		parcel.writeString(phone)
		parcel.writeString(name)
		parcel.writeParcelable(company, describeContents())
		parcel.writeValue(id)
		parcel.writeString(email)
		parcel.writeString(username)
	}

	override fun describeContents(): Int {
		return 0
	}

	companion object CREATOR : Parcelable.Creator<User> {
		override fun createFromParcel(parcel: Parcel): User {
			return User(parcel)
		}

		override fun newArray(size: Int): Array<User?> {
			return arrayOfNulls(size)
		}
	}
}