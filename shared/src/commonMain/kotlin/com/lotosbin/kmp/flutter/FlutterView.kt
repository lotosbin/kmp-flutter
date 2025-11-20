package com.lotosbin.kmp.flutter

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
expect fun FlutterView(
    modifier: Modifier = Modifier,
    entrypoint: String = "main",
    initialRoute: String = "/",
)

@Preview
@Composable
fun FlutterViewPreview() {
    MaterialTheme {
        FlutterView(
            modifier = Modifier.fillMaxSize(),
            entrypoint = "main",
            initialRoute = "/",
        )
    }
}