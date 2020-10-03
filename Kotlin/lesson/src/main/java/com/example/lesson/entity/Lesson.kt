package com.example.lesson.entity

/**
 *
 *  author : Jiyf
 *  e-mail : ffaa30703@icloud.com
 *  time   : 2020/10/03
 *  desc   :
 *  version: 1.0
 *
 */
internal class Lesson(val date: String, val content: String, val state: State) {
    enum class State {
        PLAYBACK {
            override fun stateName(): String {
                return "有回放"
            }
        },
        LIVE {
            override fun stateName(): String {
                return "正在直播"
            }
        },
        WAIT {
            override fun stateName(): String {
                return "等待中"
            }
        };

        abstract fun stateName(): String?
    }


}