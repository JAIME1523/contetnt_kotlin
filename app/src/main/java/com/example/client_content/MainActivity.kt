package com.example.client_content

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope
import com.example.client_content.transaction_service.data.proto.test.TestConect

import com.example.client_content.transaction_service.TransactionService
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        val myCON = this;
        val btnStart = findViewById<Button>(R.id.btnHola)
        val btnEmit = findViewById<Button>(R.id.btnEmit)

        btnStart.setOnClickListener {
            lifecycleScope.launch {
                //MycontenProvider().query(TypeUrl.Users, selection = "asd", myCallback = fun() {});
                val result = TransactionService().startTransaction(myCON)
                Log.e("Main", "$result")

            }
        }
        btnEmit.setOnClickListener {
        val newTex =    TestConect.RequestClientInfo.newBuilder().setStatus(true).build()
           var newAr = newTex.toByteArray()
            var deser = TestConect.RequestClientInfo.parseFrom(newAr)

            Log.w("Mian", "$newTex")
            Log.w("Mian", "$newAr")
            Log.w("Mian", "$deser")


        }

    }


}


