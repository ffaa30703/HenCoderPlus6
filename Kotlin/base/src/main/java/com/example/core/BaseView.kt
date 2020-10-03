package com.example.core

/**
 *
 *  author : Jiyf
 *  e-mail : ffaa30703@icloud.com
 *  time   : 2020/10/03
 *  desc   :
 *  version: 1.0
 *
 */
interface BaseView<T> {
  open  fun getPresenter(): T
}