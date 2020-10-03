package com.example.core.http

/**
 *
 *  author : Jiyf
 *  e-mail : ffaa30703@icloud.com
 *  time   : 2020/10/03
 *  desc   :
 *  version: 1.0
 *
 */
interface EntityCallback <T>{
    fun onSuccess(entity: T)

    fun onFailure(message: String?)
}