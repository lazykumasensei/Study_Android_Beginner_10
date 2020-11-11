package com.myapp.androidbeginner.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Toolbar
import com.myapp.androidbeginner.R
import kotlinx.android.synthetic.main.c_toolbar.view.*

class CustomToolbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
): Toolbar(context, attrs){
    init {
        addView(LayoutInflater.from(context).inflate(R.layout.c_toolbar, this, false))
    }

    var text:CharSequence
        set(value) {
            cToolbar_title.text = value
        }
        get() = cToolbar_title.text
}