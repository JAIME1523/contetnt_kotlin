 package com.example.client_content.transaction_service

import com.example.client_content.content_services.ContentProvider
import com.example.client_content.content_services.enums.EnumsUrl
import android.content.Context
import android.util.Log
import com.example.client_content.transaction_service.data.models.ResponseTransaction
import java.util.Base64


 class TransactionService {
//TODO:Aggregate conversion de protos y conversion a string de request y response
private var contentProvider = ContentProvider();
    suspend fun getTransaction(context: Context): ResponseTransaction {
        val resul = contentProvider.queryCustom(context, EnumsUrl.Users, selection = "")
        Log.w("TransactionService", resul.toString())
        return ResponseTransaction(true, resul.response);
    }

    suspend fun getStatus(context: Context): ResponseTransaction {
        var resul = contentProvider.queryCustom(context,EnumsUrl.GetStatus, selection = "", )
        return ResponseTransaction(true, "test");
    }
    suspend fun startTransaction(context: Context): ResponseTransaction {
     val res =   contentProvider.startTransaction(context, "", )
        val resultData =  ResponseTransaction(false, res.response);
        return resultData;
    }

    suspend  fun cancelTransaction(context: Context): ResponseTransaction {
        val resul =contentProvider.cancelTransaction(context,"true" ,
         )
        return ResponseTransaction(true, resul.response);
    }

}
 private fun ByteArray.toBase64(): String =
     String(Base64.getEncoder().encode(this))