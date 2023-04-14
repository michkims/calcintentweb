package com.example.calcintentweb

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class IntentActivity : AppCompatActivity() {
    lateinit var btn_sms:Button
    lateinit var btn_dial:Button
    lateinit var btn_call:Button
    lateinit var btn_share:Button
    lateinit var btn_stk:Button
    lateinit var btn_cam:Button
    lateinit var btn_email:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intentactivity)
        btn_sms=findViewById(R.id.Btn_sms)
        btn_dial=findViewById(R.id.Btn_dial)
        btn_call=findViewById(R.id.Btn_call)
        btn_share=findViewById(R.id.Btn_share)
        btn_stk=findViewById(R.id.Btn_mpesa)
        btn_cam=findViewById(R.id.Btn_cam)
        btn_email=findViewById(R.id.Btn_email)


        btn_sms.setOnClickListener {
            val uri = Uri.parse("smsto:0735048165")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "How is todays weather")

            startActivity(intent)
        }
        btn_cam.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)

        }
        btn_call.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254735048165"))

            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntentActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }


        }
        btn_share.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)

        }
        btn_stk.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }

        }
        btn_dial.setOnClickListener {
            val phone = "+254735048165"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)

        }
        btn_email.setOnClickListener {

            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
    }
}

        

