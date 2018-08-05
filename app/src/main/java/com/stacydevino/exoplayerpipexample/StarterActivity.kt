package com.stacydevino.exoplayerpipexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_starter.*

class StarterActivity : AppCompatActivity() {
    /* Sample public HLS Streams
        https://bitdash-a.akamaihd.net/content/MI201109210084_1/m3u8s/f08e80da-bf1d-4e3d-8899-f0f6155f6efa.m3u8
        https://bitdash-a.akamaihd.net/content/sintel/hls/playlist.m3u8
        https://mnmedias.api.telequebec.tv/m3u8/29880.m3u8
        http://184.72.239.149/vod/smil:BigBuckBunny.smil/playlist.m3u8
        http://www.streambox.fr/playlists/test_001/stream.m3u8
     */

    var videoUrl = "https://content.jwplatform.com/manifests/yp34SRmf.m3u8"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starter)
        button.setOnClickListener({ onStartVideo() })
    }

    fun onStartVideo(){
        val intent = Intent(this, VideoActivity::class.java)
        intent.putExtra(VideoActivity.ARG_VIDEO_URL, videoUrl)
        startActivity(intent)
    }
}
