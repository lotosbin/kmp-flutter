package com.lotosbin.kmp.flutter

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.fragment.compose.AndroidFragment
import androidx.fragment.compose.FragmentState
import androidx.fragment.compose.rememberFragmentState

@Composable
actual fun FlutterView(
    modifier: Modifier,
    entrypoint: String,
    initialRoute: String,
) {
    val fragmentState: FragmentState = rememberFragmentState()
    AndroidFragment<FlutterFragmentFragment>(
        modifier = modifier,
        fragmentState = fragmentState,
        arguments = Bundle().apply {
            putString("initialRoute", initialRoute)
            putString("entrypoint", entrypoint)
        },
    )
}

