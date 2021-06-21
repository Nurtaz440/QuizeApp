package mening.dasturim.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import mening.dasturim.quizapp.databinding.ActivityMainBinding
import mening.dasturim.quizapp.databinding.ActivityQuestion3Binding

class QuestionActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityQuestion3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
       // setTheme(android.R.style.Theme)
        super.onCreate(savedInstanceState)
        binding=ActivityQuestion3Binding.inflate(layoutInflater)
        setContentView(binding.root)
      //  setContentView(R.layout.activity_question3)
       // val meesege=intent.getIntExtra("score",0)
     //   binding.textView6.setText(meesege)


        binding.radioGroup3.setOnCheckedChangeListener{group, checkedId ->
            val radioButton=findViewById<RadioButton>(checkedId)

            if (radioButton.isClickable){
                binding.nextInvisivle.visibility= View.INVISIBLE

            }

            when(checkedId){
                R.id.radio_btn1->{
                    binding.textView6.text= 0.toString()

                }

                R.id.radio_btn2->{
                    binding.textView6.text= 0.toString()

                }

                R.id.radio_btn3->{
                    binding.textView6.text= 0.toString()

                }

                R.id.radio_btn4->{
                    binding.textView6.text= 20.toString()

                }

                R.id.radio_btn5->{
                    binding.textView6.text= 0.toString()

                }


            }

        }

        binding.nextVisible3.setOnClickListener {
            val intent=Intent(this,QuestionActivity4::class.java)
           // intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
           // val result=binding.textView6.text.toString()+meesege
          //  intent.putExtra("score",result)
            startActivity(intent)

        }






        binding.previous.setOnClickListener {
            val intent= Intent (this,Question2Activity::class.java)
          //  intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        binding.textView6.visibility=View.GONE
    }
}