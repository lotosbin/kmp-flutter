package com.lotosbin.kmp.flutter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.lotosbin.kmp.flutter.shared.R
import io.flutter.embedding.android.FlutterFragment

internal class FlutterFragmentFragment : Fragment(R.layout.kmp_flutter_fragment_flutter_fragment) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            val initialRoute = arguments?.getString("initialRoute", "/") ?: "/"
            val entrypoint = arguments?.getString("entrypoint", "main") ?: "main"
            val flutterFragment = FlutterFragment.withNewEngine()
                .initialRoute(initialRoute)
                .dartEntrypoint(entrypoint)
                .build<FlutterFragment>()
            childFragmentManager.commit { add(R.id.fragment_container_view, flutterFragment) }
        }
    }
}