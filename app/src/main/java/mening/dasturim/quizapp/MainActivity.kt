package mening.dasturim.quizapp

import android.content.Context
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


        binding.radioBtn1.isChecked = Update("one")
        binding.radioBtn2.isChecked = Update("two")
        binding.radioBtn3.isChecked = Update("three")
        binding.radioBtn4.isChecked = Update("four")
        binding.radioBtn5.isChecked = Update("five")


        binding.radioBtn1.setOnCheckedChangeListener { buttonView, OneisChecked ->

            SaveIntoSharedPrefe("one",OneisChecked)
            if (binding.radioBtn1.isClickable){
                binding.nextIdInvisible.visibility=View.INVISIBLE

            }

        }


        binding.radioBtn2.setOnCheckedChangeListener { buttonView, TwoisChecked ->

            SaveIntoSharedPrefe("two",TwoisChecked)
            if (binding.radioBtn2.isClickable){
                binding.nextIdInvisible.visibility=View.INVISIBLE

            }
        }


        binding.radioBtn3.setOnCheckedChangeListener { buttonView, threeChecked ->

            SaveIntoSharedPrefe("three",threeChecked)
            if (binding.radioBtn3.isClickable){
                binding.nextIdInvisible.visibility=View.INVISIBLE

            }
        }


        binding.radioBtn4.setOnCheckedChangeListener { buttonView, fourisChecked ->

            SaveIntoSharedPrefe("four",fourisChecked)
            if (binding.radioBtn4.isClickable){
                binding.nextIdInvisible.visibility=View.INVISIBLE

            }
        }


        binding.radioBtn5.setOnCheckedChangeListener { buttonView, fiveisChecked ->

            SaveIntoSharedPrefe("five",fiveisChecked)
            if (binding.radioBtn5.isClickable){
                binding.nextIdInvisible.visibility=View.INVISIBLE

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