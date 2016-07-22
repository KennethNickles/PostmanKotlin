package com.github.kennethnickles.postmankotlin

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator
import com.workday.postman.Postman
import com.workday.postman.annotations.Parceled

/**
 * @author kenneth.nickles
 * @since 2016-07-22.
 */
@Parceled
class ParcelableClass : Parcelable {

    companion object {
        @JvmField
        val CREATOR: Creator<ParcelableClass> = Postman.getCreator(ParcelableClass::class.java)
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        Postman.writeToParcel(this, dest)
    }

    override fun describeContents(): Int {
        return 0
    }
}