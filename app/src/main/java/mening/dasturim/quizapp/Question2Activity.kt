package mening.dasturim.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import mening.dasturim.quizapp.databinding.ActivityQuestion2Binding


class Question2Activity : AppCompatActivity() {

    private lateinit var bindingQuestion2Binding: ActivityQuestion2Binding
 //   private lateinit var bindingQuestion2Activity: Question2Activity

 //   private var binding:ResultProfileBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //  setContentView(R.layout.activity_question2)


        bindingQuestion2Binding= ActivityQuestion2Binding.inflate(layoutInflater)
        setContentView(bindingQuestion2Binding.root)

    //    val meesege=intent.getIntExtra("score",0)
      //  bindingQuestion2Binding.textView5.setText(meesege)

        bindingQuestion2Binding.radioGroup2.setOnCheckedChangeListener{group, checkedId ->
            val radioButton=findViewById<RadioButton>(checkedId)

            if (radioButton.isClickable){
                bindingQuestion2Binding.nextInvisible.visibility= View.INVISIBLE

                when(checkedId) {
                    R.id.radio_btn1 -> {
                        bindingQuestion2Binding.textView5.text = 0.toString()

                    }

                    R.id.radio_btn2 -> {
                        bindingQuestion2Binding.textView5.text = 0.toString()

                    }

                    R.id.radio_btn3 -> {
                        bindingQuestion2Binding.textView5.text = 0.toString()

                    }

                    R.id.radio_btn4 -> {
                        bindingQuestion2Binding.textView5.text = 20.toString()

                    }

                    R.id.radio_btn5 -> {
                        bindingQuestion2Binding.textView5.text = 0.toString()

                    }
                }

                }

        }

        bindingQuestion2Binding.nextVisible.setOnClickListener {
            val intent= Intent (this,QuestionActivity3::class.java)
           // intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
         //   val result=bindingQuestion2Binding.textView5.text.toString()+meesege
          //  intent.putExtra("score",result)
            startActivity(intent)
        }
        bindingQuestion2Binding.previous.setOnClickListener {
            val intent= Intent (this,MainActivity::class.java)
          //  intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

            bindingQuestion2Binding.textView5.visibility=View.GONE
    }
}