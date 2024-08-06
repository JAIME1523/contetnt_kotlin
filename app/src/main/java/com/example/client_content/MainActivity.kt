package com.example.client_content

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope

import com.example.client_content.transaction_service.TransactionService
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        val myCON = this;
        val btnStart = findViewById<Button>(R.id.btnHola)
        val btnEmit = findViewById<Button>(R.id.btnEmit)

        btnStart.setOnClickListener{
            lifecycleScope.launch {
                //MycontenProvider().query(TypeUrl.Users, selection = "asd", myCallback = fun() {});
             var resul =   TransactionService().startTransaction(myCON)
                Log.e("Main", resul.toString())

            }
        }
        btnEmit.setOnClickListener {
            val cursor = contentResolver.query(Uri.parse("content://com.example.meta_app.MyAndroidContentProvider/users"), null, "getData", null, null)
            Log.d("des", "${cursor}")
        }

    }


}

