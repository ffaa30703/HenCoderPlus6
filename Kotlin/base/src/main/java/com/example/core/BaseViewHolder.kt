package com.example.core

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.recyclerview.widget.RecyclerView
import java.util.*

/**
 *
 *  author : Jiyf
 *  e-mail : ffaa30703@icloud.com
 *  time   : 2020/10/03
 *  desc   :
 *  version: 1.0
 *
 */
abstract class BaseViewHolder(view:View) : RecyclerView.ViewHolder(view) {
    @SuppressLint("UseSparseArrays")
    private val viewHashMap: MutableMap<Int, View?> = HashMap()

    protected open fun <T : View?> getView(@IdRes id: Int): T? {
        var view = viewHashMap[id]
        if (view == null) {
            view = itemView.findViewById(id)
            viewHashMap[id] = view
        }
        return view as T?
    }

    protected open fun setText(@IdRes id: Int, text: String?) {
        (getView<View>(id) as TextView).text = text
    }

}