package campuncke.com.rxjavaproject1.activityStart.model

import android.os.Parcel
import android.os.Parcelable
import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Address(

        @field:SerializedName("zipcode")
	val zipcode: String? = null,

        @field:SerializedName("geo")
	val geo: Geo? = null,

        @field:SerializedName("suite")
	val suite: String? = null,

        @field:SerializedName("city")
	val city: String? = null,

        @field:SerializedName("street")
	val street: String? = null
) : Parcelable {
	constructor(parcel: Parcel) : this(
			parcel.readString(),
			parcel.readParcelable(Geo::class.java.classLoader),
			parcel.readString(),
			parcel.readString(),
			parcel.readString())

	override fun writeToParcel(parcel: Parcel, flags: Int) {
		parcel.writeString(zipcode)
		parcel.writeParcelable(geo, flags)
		parcel.writeString(suite)
		parcel.writeString(city)
		parcel.writeString(street)
	}

	override fun describeContents(): Int {
		return 0
	}

	companion object CREATOR : Parcelable.Creator<Address> {
		override fun createFromParcel(parcel: Parcel): Address {
			return Address(parcel)
		}

		override fun newArray(size: Int): Array<Address?> {
			return arrayOfNulls(size)
		}
	}
}