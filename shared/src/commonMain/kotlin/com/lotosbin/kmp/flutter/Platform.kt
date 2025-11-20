package com.lotosbin.kmp.flutter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform