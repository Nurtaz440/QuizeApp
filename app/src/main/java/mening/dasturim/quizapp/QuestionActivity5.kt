package mening.dasturim.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import mening.dasturim.quizapp.databinding.ActivityQuestion5Binding

class QuestionActivity5 : AppCompatActivity() {

    private lateinit var binding: ActivityQuestion5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityQuestion5Binding.inflate(layoutInflater)
        setContentView(binding.root)
       // setContentView(R.layout.activity_question5)

       // val meesege=intent.getIntExtra("score",0)
        binding.radioGroup5.setOnCheckedChangeListener{group, checkedId ->
            val radioButton=findViewById<RadioButton>(checkedId)

            if (radioButton.isClickable){
                binding.invisible.visibility= View.INVISIBLE

            }
            when(checkedId){
                R.id.radio_btn1->{
                    binding.textView8.text= 0.toString()

                }

                R.id.radio_btn2->{
                    binding.textView8.text= 0.toString()

                }

                R.id.radio_btn3->{
                    binding.textView8.text= 0.toString()

                }

                R.id.radio_btn4->{
                    binding.textView8.text= 20.toString()

                }

                R.id.radio_btn5->{
                    binding.textView8.text= 0.toString()

                }


            }

        }

        binding.submit.setOnClickListener {
            val intent= Intent(this,ResultActivity::class.java)
           // val result=binding.textView8.text.toString()+meesege
          //  intent.putExtra("score",result)
            startActivity(intent)

        }
        binding.previous.setOnClickListener {
            val intent= Intent (this,QuestionActivity4::class.java)
            startActivity(intent)
        }


        binding.textView8.visibility=View.GONE
    }
}