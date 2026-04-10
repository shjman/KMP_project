package com.yahorshymanchyk.mybutton

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform