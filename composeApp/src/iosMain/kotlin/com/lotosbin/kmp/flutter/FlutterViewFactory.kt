package com.lotosbin.kmp.flutter

import platform.UIKit.UIViewController

interface FlutterViewFactory {
    fun create(): UIViewController
}

fun setFlutterViewFactory(factory: (entrypoint: String, initialRoute: String) -> UIViewController) {
    println("setFlutterViewFactory=$factory")
    createFlutterView = factory
}