package mening.dasturim.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import mening.dasturim.quizapp.databinding.ActivityQuestion4Binding

class QuestionActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityQuestion4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       // setContentView(R.layout.activity_question4)

        binding=ActivityQuestion4Binding.inflate(layoutInflater)
        setContentView(binding.root)

      //  val meesege=intent.getIntExtra("score",0)

        binding.radioGroup4.setOnCheckedChangeListener{group, checkedId ->
            val radioButton=findViewById<RadioButton>(checkedId)

            if (radioButton.isClickable){
                binding.nextInvisible4.visibility= View.INVISIBLE

            }
            when(checkedId){
                R.id.radio_btn1->{
                    binding.textView7.text= 0.toString()

                }

                R.id.radio_btn2->{
                    binding.textView7.text= 0.toString()

                }

                R.id.radio_btn3->{
                    binding.textView7.text= 0.toString()

                }

                R.id.radio_btn4->{
                    binding.textView7.text= 20.toString()

                }

                R.id.radio_btn5->{
                    binding.textView7.text= 0.toString()

                }


            }
        }

        binding.nextId.setOnClickListener {
            val intent= Intent(this,QuestionActivity5::class.java)
          //  val result=binding.textView7.text.toString()+meesege
            //intent.putExtra("score",result)
            startActivity(intent)

        }






        binding.previous.setOnClickListener {
            val intent= Intent (this,QuestionActivity3::class.java)
            startActivity(intent)
        }
        binding.textView7.visibility=View.GONE
    }
}