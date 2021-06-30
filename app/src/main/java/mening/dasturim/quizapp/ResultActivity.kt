package mening.dasturim.quizapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.internal.ContextUtils.getActivity
import mening.dasturim.quizapp.databinding.ActivityResultBinding
import kotlin.system.exitProcess

class ResultActivity : AppCompatActivity() {

    private lateinit var binding:ActivityResultBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //  setContentView(R.layout.activity_result)

       /* val meesege=intent.extras?.getInt("score")
        if (meesege != null) {
            binding!!.textView3.setText(meesege )
        }


        */
        binding.backImg.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.shareImg.setOnClickListener{
            val email="saman@gmail.com"


        val intent=Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_EMAIL,email)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT,binding.textView3.toString())


            if (intent.resolveActivity(packageManager)!=null){
                startActivity(intent)
            }else{
                Toast.makeText(this,"No Score",Toast.LENGTH_SHORT).show()
            }


        }


     /*   binding.clearImg.setOnClickListener {
            getActivity()?.finish()
            System.exit(0)
        }

      */
    }

  fun onDestroyImg(view:View?){
      //  finish()
    //  exitProcess()
      moveTaskToBack(true)
      finishAffinity()
    }
/*
    private fun exitProcess() {
        //finish()
        kotlin.system.exitProcess(-1)
    }

 */
/*
    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }


 */
}