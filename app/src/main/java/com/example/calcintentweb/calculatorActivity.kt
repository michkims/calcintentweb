package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculatorActivity : AppCompatActivity() {
    lateinit var Tv_answer:TextView
    lateinit var edt_fnum:EditText
    lateinit var edt_snum:EditText
    lateinit var btnadd:Button
    lateinit var btnsub:Button
    lateinit var btnmult:Button
    lateinit var btndiv:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculatoractivity)
        Tv_answer=findViewById(R.id.Txt_answer)
        edt_fnum=findViewById(R.id.Edt_Fnum)
        edt_snum=findViewById(R.id.Edt_Snum)
        btnadd=findViewById(R.id.Btn_add)
        btnsub=findViewById(R.id.Btn_sub)
        btnmult=findViewById(R.id.Btn_Mult)
        btndiv=findViewById(R.id.Btn_div)

        btnadd.setOnClickListener {
            var myfnum=edt_fnum.text.toString()
            var mysnum=edt_snum.text.toString()
            if(myfnum.isEmpty() && mysnum.isEmpty()){
                Tv_answer.text="Please fill in all inputs"
            }else{
//                lets now calculate the sum
                var answer=myfnum.toDouble()+ mysnum.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
        btnsub.setOnClickListener {
            var myfnum=edt_fnum.text.toString()
            var mysnum=edt_snum.text.toString()
            if(myfnum.isEmpty() && mysnum.isEmpty()){
                Tv_answer.text="Please fill in all inputs"
            }else {
//                lets now calculate the difference
                var answer = myfnum.toDouble() - mysnum.toDouble()
                Tv_answer.text = answer.toString()
            }
        }
        btnmult.setOnClickListener {
            var myfnum = edt_fnum.text.toString()
            var mysnum = edt_snum.text.toString()
            if (myfnum.isEmpty() && mysnum.isEmpty()) {
                Tv_answer.text = "Please fill in all inputs"
            } else {
//                lets now calculate the multiplication
                var answer = myfnum.toDouble() * mysnum.toDouble()
                Tv_answer.text = answer.toString()
            }
        }
        btndiv.setOnClickListener {
            var myfnum = edt_fnum.text.toString()
            var mysnum = edt_snum.text.toString()
            if (myfnum.isEmpty() && mysnum.isEmpty()) {
                Tv_answer.text = "Please fill in all inputs"
            } else {
//                lets now calculate the division
                var answer = myfnum.toDouble() / mysnum.toDouble()
                Tv_answer.text = answer.toString()
            }
        }
    }
}