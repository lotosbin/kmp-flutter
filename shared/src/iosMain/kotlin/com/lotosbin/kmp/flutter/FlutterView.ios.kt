package com.lotosbin.kmp.flutter

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.UIKitViewController
import platform.UIKit.UIViewController

@Composable
actual fun FlutterView(
    modifier: Modifier,
    entrypoint: String,
    initialRoute: String
) {
    UIKitViewController(
        modifier = modifier,
        factory = {
            println("createFlutterView=$createFlutterView")
            createFlutterView(
                entrypoint,
                initialRoute,
            )
        },
        update = {}
    )
}

var createFlutterView: ((entrypoint: String, initialRoute: String) -> UIViewController) = { _, _ ->
    UIViewController()
}