package prot.zr.a5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.Toast

const val POEM = "MainActivity"
var ticker = 0
val list_poem = listOf(
    "\tБуря мглою небо кроет,\n",
    "\tВихри снежные крутя;\n",
    "\tТо, как зверь, она завоет,\n",
    "\tТо заплачет, как дитя,\n",
    "\tТо по кровле обветшалой\n",
    "\tВдруг соломой зашумит,\n"
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (ticker == 0) {
            Log.d(POEM, list_poem.get(ticker))
            ticker++
        }
    }

    override fun onStart() {
        super.onStart()
        if (ticker == 1) {
            Log.d(POEM, list_poem.get(ticker))
            ticker++
        }
    }

    override fun onResume() {
        super.onResume()
        if (ticker == 2) {
            Log.d(POEM, list_poem.get(ticker))
            ticker++
        }
    }

    override fun onPause() {
        super.onPause()
        if (ticker == 3) {
            Log.d(POEM, list_poem.get(ticker))
            ticker++
        }
    }

    override fun onStop() {
        super.onStop()
        if (ticker == 4) {
            Log.d(POEM, list_poem.get(ticker))
            ticker++
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (ticker == 5) {
            Log.d(POEM, list_poem.get(ticker))
            ticker++
        }
    }
}