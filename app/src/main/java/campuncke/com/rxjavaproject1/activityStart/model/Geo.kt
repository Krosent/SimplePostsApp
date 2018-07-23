package campuncke.com.rxjavaproject1.activityStart.model

import android.os.Parcel
import android.os.Parcelable
import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Geo(
	@field:SerializedName("lng")
	val lng: String? = null,

	@field:SerializedName("lat")
	val lat: String? = null
) : Parcelable {
	constructor(parcel: Parcel) : this(
			parcel.readString(),
			parcel.readString())

	override fun writeToParcel(parcel: Parcel, flags: Int) {
		parcel.writeString(lng)
		parcel.writeString(lat)
	}

	override fun describeContents(): Int {
		return 0
	}

	companion object CREATOR : Parcelable.Creator<Geo> {
		override fun createFromParcel(parcel: Parcel): Geo {
			return Geo(parcel)
		}

		override fun newArray(size: Int): Array<Geo?> {
			return arrayOfNulls(size)
		}
	}
}