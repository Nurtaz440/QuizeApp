package mening.dasturim.quizapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.internal.ContextUtils.getActivity
import mening.dasturim.quizapp.databinding.ActivityResultBinding
import kotlin.system.exitProcess

class ResultActivity : AppCompatActivity() {

    private  var binding:ActivityResultBinding?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        //  setContentView(R.layout.activity_result)

       /* val meesege=intent.extras?.getInt("score")
        if (meesege != null) {
            binding!!.textView3.setText(meesege )
        }


        */
        binding!!.backImg.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
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