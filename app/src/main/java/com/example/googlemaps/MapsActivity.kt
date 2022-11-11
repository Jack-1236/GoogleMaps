package com.example.googlemaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get

import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.googlemaps.databinding.ActivityMapsBinding
import com.google.android.gms.maps.*

class MapsActivity : BaseActivity<ActivityMapsBinding>() {


    override fun getLayoutId(): Int {
        return R.layout.activity_maps
    }

    override fun init() {

        val options = GoogleMapOptions()

        options.mapType(GoogleMap.MAP_TYPE_SATELLITE)//地图类型
            .compassEnabled(true)//指南针
            .rotateGesturesEnabled(true)//旋转
            .tiltGesturesEnabled(true)//倾斜
            .ambientEnabled(true)//环境启用
            .mapToolbarEnabled(true)//地图工具栏
            .scrollGesturesEnabled(true)//滚动手势
            .scrollGesturesEnabledDuringRotateOrZoom(true)//滚动或者缩放期间禁用滚动手势
            .zoomGesturesEnabled(true)//启用缩放手势


    }


}