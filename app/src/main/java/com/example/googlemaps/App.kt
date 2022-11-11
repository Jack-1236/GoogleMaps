package com.example.googlemaps

import android.app.Application
import android.opengl.GLSurfaceView
import android.util.Log
import com.google.android.gms.maps.MapsInitializer
import com.google.android.gms.maps.OnMapsSdkInitializedCallback

class App : Application(), OnMapsSdkInitializedCallback {

    override fun onCreate() {
        super.onCreate()

        MapsInitializer.initialize(this)
    }

    override fun onMapsSdkInitialized(renderer: MapsInitializer.Renderer) {
        when (renderer) {
            MapsInitializer.Renderer.LATEST -> Log.d("MapsDemo",
                "The latest version of the renderer is used.")
            MapsInitializer.Renderer.LEGACY -> Log.d("MapsDemo",
                "The legacy version of the renderer is used.")
        }
    }
}