package mening.dasturim.quizapp

import android.content.Context
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


        bindingQuestion2Binding.radioBtn1.isChecked = Update("one")
        bindingQuestion2Binding.radioBtn2.isChecked = Update("two")
        bindingQuestion2Binding.radioBtn3.isChecked = Update("three")
        bindingQuestion2Binding.radioBtn4.isChecked = Update("four")
        bindingQuestion2Binding.radioBtn5.isChecked = Update("five")


        bindingQuestion2Binding.radioBtn1.setOnCheckedChangeListener { buttonView, OneisChecked ->

            SaveIntoSharedPrefe("one",OneisChecked)
            if (bindingQuestion2Binding.radioBtn1.isClickable){
                bindingQuestion2Binding.nextInvisible.visibility=View.INVISIBLE

            }

        }


        bindingQuestion2Binding.radioBtn2.setOnCheckedChangeListener { buttonView, TwoisChecked ->

            SaveIntoSharedPrefe("two",TwoisChecked)
            if (bindingQuestion2Binding.radioBtn2.isClickable){
                bindingQuestion2Binding.nextInvisible.visibility=View.INVISIBLE

            }
        }


        bindingQuestion2Binding.radioBtn3.setOnCheckedChangeListener { buttonView, threeChecked ->

            SaveIntoSharedPrefe("three",threeChecked)
            if (bindingQuestion2Binding.radioBtn3.isClickable){
                bindingQuestion2Binding.nextInvisible.visibility=View.INVISIBLE
            }
        }


        bindingQuestion2Binding.radioBtn4.setOnCheckedChangeListener { buttonView, fourisChecked ->

            SaveIntoSharedPrefe("four",fourisChecked)
            if (bindingQuestion2Binding.radioBtn4.isClickable){
                bindingQuestion2Binding.nextInvisible.visibility=View.INVISIBLE
            }
        }


        bindingQuestion2Binding.radioBtn5.setOnCheckedChangeListener { buttonView, fiveisChecked ->

            SaveIntoSharedPrefe("five",fiveisChecked)
            if (bindingQuestion2Binding.radioBtn5.isClickable){
                bindingQuestion2Binding.nextInvisible.visibility=View.INVISIBLE
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
    fun SaveIntoSharedPrefe(key:String,value:Boolean){


        val sharedPreferenceEditor=getSharedPreferences("save", Context.MODE_PRIVATE).edit()
        sharedPreferenceEditor.putBoolean(key,value)
        sharedPreferenceEditor.apply()


    }


    fun   Update(key:String):Boolean{
        val sharedPreferences=getSharedPreferences("save", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean(key,false)

    }
}