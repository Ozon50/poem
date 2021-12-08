package prot.zr.a5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

const val POEM = "MainActivity"
public var ticker = 0
val list_poem = listOf(
    "\tБуря мглою небо кроет,\n",
    "\tВихри снежные крутя;\n",
    "\tТо, как зверь, она завоет,\n",
    "\tТо заплачет, как дитя,\n",
    "\tТо по кровле обветшалой\n",
    "\tВдруг соломой зашумит,\n"
)

var flag_butt_connect = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewMain: TextView = findViewById(R.id.textViewId)
        val connectButton: Button = findViewById(R.id.conect_button_id)
        val readButton: Button = findViewById(R.id.main_read_button)
        val editText: EditText = findViewById(R.id.editText)


        connectButton.setOnClickListener {
            if (flag_butt_connect == 0) {
                connectButton.text = getString(R.string.connect)
                flag_butt_connect = 1

            } else if (flag_butt_connect == 1) {
                connectButton.text = getString(R.string.disc)
                flag_butt_connect = 0

            }
        }

        editText.setOnFocusChangeListener { v, hasFocus -> editText.text.clear() }


        readButton.setOnClickListener {
            textViewMain.text = "Начало начал!"
        }
        fun countMe(view: View) {

            val countString = textViewMain.text.toString()
            var count: Int = Integer.parseInt(countString)
            count++
            textViewMain.text = count.toString();
        }

        if (ticker == 0) {
            Log.d(POEM, list_poem[ticker])
            ticker++
        }
    }

    override fun onStart() {
        super.onStart()
        if (ticker == 1) {
            Log.d(POEM, list_poem[ticker])
            ticker++
        }
    }

    override fun onResume() {
        super.onResume()
        if (ticker == 2) {
            Log.d(POEM, list_poem[ticker])
            ticker++
        }
    }

    override fun onPause() {
        super.onPause()
        if (ticker == 3) {
            Log.d(POEM, list_poem[ticker])
            ticker++
        }
    }

    override fun onStop() {
        super.onStop()
        if (ticker == 4) {
            Log.d(POEM, list_poem[ticker])
            ticker++
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (ticker == 5) {
            Log.d(POEM, list_poem[ticker])
            ticker++
        }
    }
}