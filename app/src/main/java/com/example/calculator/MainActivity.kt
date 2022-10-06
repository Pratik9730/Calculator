package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.calculator.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder as ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonClear.setOnClickListener{
            binding.input.text = ""
            binding.output.text =""
        }

        binding.button0.setOnClickListener{
            binding.input.append("0")
        }

        binding.button1.setOnClickListener{
            binding.input.append("1")
        }

        binding.button2.setOnClickListener{
            binding.input.append("2")
        }

        binding.button3.setOnClickListener{
            binding.input.append("3")
        }

        binding.button4.setOnClickListener{
            binding.input.append("4")
        }

        binding.button5.setOnClickListener{
            binding.input.append("5")
        }

        binding.button6.setOnClickListener{
            binding.input.append("6")
        }

        binding.button7.setOnClickListener{
            binding.input.append("7")
        }

        binding.button8.setOnClickListener{
            binding.input.append("8")
        }

        binding.button9.setOnClickListener{
            binding.input.append("9")
        }
        binding.buttonDot.setOnClickListener{
            binding.input.append(".")
        }

        binding.buttonAddition.setOnClickListener{
            binding.input.append(" + ")
        }

        binding.buttonBrackerLeft.setOnClickListener{
            binding.input.append("(")
        }

        binding.buttonBrackerRight.setOnClickListener{
            binding.input.append(")")
        }

        binding.buttonDivision.setOnClickListener{
            binding.input.append(" / ")
        }

        binding.buttonMultiply.setOnClickListener{
            binding.input.append(" * ")
        }

        binding.buttonSubstraction.setOnClickListener{
            binding.input.append(" - ")
        }

        binding.buttonEquals.setOnClickListener{
            val expression = ExpressionBuilder(binding.input.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()

            if (result == longresult.toDouble()){
                binding.output.text = longresult.toString()
            }
            else{
                binding.output.text = result.toString()
            }
        }

    }


}








