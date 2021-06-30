package mening.dasturim.quizapp

import android.content.Context
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


        binding.radioBtn1.isChecked = Update("one")
        binding.radioBtn2.isChecked = Update("two")
        binding.radioBtn3.isChecked = Update("three")
        binding.radioBtn4.isChecked = Update("four")
        binding.radioBtn5.isChecked = Update("five")


        binding.radioBtn1.setOnCheckedChangeListener { buttonView, OneisChecked ->

            SaveIntoSharedPrefe("one",OneisChecked)
            if (binding.radioBtn1.isClickable){
                binding.nextInvisible4.visibility=View.INVISIBLE

            }

        }


        binding.radioBtn2.setOnCheckedChangeListener { buttonView, TwoisChecked ->

            SaveIntoSharedPrefe("two",TwoisChecked)
            if (binding.radioBtn2.isClickable){
                binding.nextInvisible4.visibility=View.INVISIBLE

            }
        }


        binding.radioBtn3.setOnCheckedChangeListener { buttonView, threeChecked ->

            SaveIntoSharedPrefe("three",threeChecked)
            if (binding.radioBtn3.isClickable){
                binding.nextInvisible4.visibility=View.INVISIBLE

            }
        }


        binding.radioBtn4.setOnCheckedChangeListener { buttonView, fourisChecked ->

            SaveIntoSharedPrefe("four",fourisChecked)
            if (binding.radioBtn4.isClickable){
                binding.nextInvisible4.visibility=View.INVISIBLE

            }
        }


        binding.radioBtn5.setOnCheckedChangeListener { buttonView, fiveisChecked ->

            SaveIntoSharedPrefe("five",fiveisChecked)
            if (binding.radioBtn5.isClickable){
                binding.nextInvisible4.visibility=View.INVISIBLE

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