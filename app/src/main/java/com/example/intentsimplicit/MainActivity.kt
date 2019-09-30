import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View

import androidx.appcompat.app.AppCompatActivity
import com.example.intentsimplicit.R

    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?  ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun panggil(view: View) {
        String nomor = "08889391689"
        Intent panggil = new Intent(Intent. ACTION_DIAL)
        panggil.setData(Uri. fromParts("tel", nomor, null))
        startActivity(panggil)
    }

    fun buka(view: View) {
        String url = "https://google.com"
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW)
        buka.setData(Uri. parse(url));
        startActivity(buka)

    }
}

