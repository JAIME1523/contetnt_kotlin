package com.example.client_content.content_services
import android.content.Context
import android.database.ContentObserver
import android.database.Cursor
import android.net.Uri
import android.os.Handler
import com.example.client_content.content_services.enums.EnumsUrl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async


class ContentProvider {
    private var  baseUrl = "content://com.example.meta_app.MyAndroidContentProvider";
     suspend fun queryCustom(context: Context, urlType:EnumsUrl, selection:String):String{
       return  CoroutineScope(Dispatchers.Default).async {
           val cursor = context.contentResolver.query(
               Uri.parse("${baseUrl}/${urlType.value}"),
               null,
               selection,
               null,
               null
           )
           cursor?.moveToNext()
           return@async cursor?.getString(0)?:"";
       }.await()
    }
    suspend fun startTransaction(context: Context,selection:String) : String {
      return queryObserver(context, selection, EnumsUrl.StartTransaction, EnumsUrl.TransactionResult);
    }
    suspend fun cancelTransaction(context: Context,selection:String) : String {
        return queryObserver(context, selection, EnumsUrl.StartTransaction, EnumsUrl.TransactionResult);
    }

    private suspend fun queryObserver(context: Context, selection:String, urlInit:EnumsUrl, urlResult:EnumsUrl ) : String {
        var finalResult  = "";

        val curs =  CoroutineScope(Dispatchers.Default).async {
                val cursor = context.contentResolver.query(
                    Uri.parse("${baseUrl}/${urlInit.value}"),
                    null,
                    selection,
                    null,
                    null
                )

                cursor?.moveToNext()

            return@async cursor;
        }.await()
        CoroutineScope(Dispatchers.Default).async {
        curs?.registerContentObserver(
            TransactionContentObservers(
                null,
                curs,
                fun() {
                    val cursor = context.contentResolver.query(
                        Uri.parse("${baseUrl}/${urlResult.value}"),
                        null,
                        selection,
                        null,
                        null
                    )
                    cursor?.moveToNext()
                    finalResult  = cursor?.getString(0) ?: "nada";
                },

        ))}.await()
        CoroutineScope(Dispatchers.Default).async {
    while (finalResult.isEmpty()){

    }}.await()

return  finalResult;
    }
}




private class TransactionContentObservers(handler: Handler?,
                                  cursor: Cursor,
                                  myCallback: () -> Unit,
) : ContentObserver(handler) {

    private var myCursor = cursor;
    private var callback = myCallback;

    override fun onChange(selfChange: Boolean) {
        processChange();
    }

    private fun processChange(){
        myCursor.unregisterContentObserver(this)
        myCursor.close();
        callback();
    }

}





