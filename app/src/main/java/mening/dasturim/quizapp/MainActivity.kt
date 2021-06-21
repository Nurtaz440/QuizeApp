package mening.dasturim.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.core.view.isVisible
import mening.dasturim.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    /*    setContentView(R.layout.activity_main)

    val radioGroup=findViewById<RadioGroup>(R.id.radioGroup)

        val button=findViewById<Button>(R.id.next_id_invisible)
        val button2=findViewById<Button>(R.id.next_id_visible)



        radioGroup.setOnCheckedChangeListener{group, checkedId ->
            val radioButton=findViewById<RadioButton>(checkedId)

            if (radioButton.isClickable){
             button.visibility=(View.INVISIBLE)
            }

        }

        button2.setOnClickListener {
            val intent=Intent(this,Question2Activity::class.java)

            startActivity(intent)

        }



     */

        binding=ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)


        binding.radioGroup.setOnCheckedChangeListener{group, checkedId ->
            val radioButton=findViewById<RadioButton>(checkedId)

            if (radioButton.isClickable){
                binding.nextIdInvisible.visibility=View.INVISIBLE
             //   binding.nextIdVisible.rootView.visibility=View.INVISIBLE
            }

            when(checkedId){
                R.id.radio_btn1->{
                  binding.textView4.text= 0.toString()

                }

                  R.id.radio_btn2->{
                      binding.textView4.text= 0.toString()

                }

                  R.id.radio_btn3->{
                      binding.textView4.text= 0.toString()

                }

                  R.id.radio_btn4->{
                      binding.textView4.text= 20.toString()

                }

                  R.id.radio_btn5->{
                      binding.textView4.text= 0.toString()

                }


            }

        }

        binding.nextIdVisible.setOnClickListener {
            val intent=Intent(this,Question2Activity::class.java)
        //    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
          //  val result=binding.textView4.text.toString()
         //   intent.putExtra("score",result)
            startActivity(intent)

        }


        binding.textView4.visibility=View.GONE

    }
}