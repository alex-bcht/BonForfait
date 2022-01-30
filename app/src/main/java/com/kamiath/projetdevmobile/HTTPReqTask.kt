package com.kamiath.projetdevmobile

import android.os.AsyncTask
import android.util.Log
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL

class HTTPReqTask : AsyncTask<Void, Void, String>() {
    override fun doInBackground(vararg params: Void?): String? {
        var urlConnection: HttpURLConnection? = null
        try {
            val url = URL("https://61f1bd94072f86001749f363.mockapi.io")
            urlConnection = url.openConnection() as HttpURLConnection
            val code: Int = urlConnection.responseCode
            if (code != 200) {
                throw IOException("Invalid response from server: $code")
            }
            val rd = BufferedReader(
                InputStreamReader(
                    urlConnection.inputStream
                )
            )
            var line: String?
            while (rd.readLine().also { line = it } != null) {
                Log.i("data", line.toString())
            }
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            urlConnection?.disconnect()
        }
        return null
    }
}