package com.lotosbin.kmp.flutter

import platform.UIKit.UIViewController

fun setFlutterViewFactory(factory: (entrypoint: String, initialRoute: String) -> UIViewController) {
    println("setFlutterViewFactory=$factory")
    createFlutterView = factory
}