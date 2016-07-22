package com.github.kennethnickles.postmankotlin

import android.app.Activity
import android.os.Bundle
import kennethnickles.github.com.postmankotlin.R
import kotlin.properties.Delegates

/**
 * @author kenneth.nickles
 * @since 2016-07-22.
 */
class SomeActivity : Activity() {

    private var parcelableClass: ParcelableClass by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        parcelableClass = if (savedInstanceState == null) ParcelableClass() else savedInstanceState.getParcelable("key")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.putParcelable("key", parcelableClass)
        super.onSaveInstanceState(outState)
    }


}