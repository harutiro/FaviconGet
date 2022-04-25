package app.makino.harutiro.ReceivingSimpleDataTest

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import java.net.URI


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = "https://twitter.com/home"


        findViewById<TextView>(R.id.textView).text = text


        val domein = URI(text).rawAuthority


        findViewById<TextView>(R.id.textView2).text = domein


        Picasso.get()
            //画像が乗っているURL
            .load("https://www.google.com/s2/favicons?domain=$domein")
            .resize(300, 300) //表示サイズ指定
            .centerCrop() //resizeで指定した範囲になるよう中央から切り出し
            .into(findViewById<ImageView>(R.id.imageView)) //imageViewに流し込み


    }
}