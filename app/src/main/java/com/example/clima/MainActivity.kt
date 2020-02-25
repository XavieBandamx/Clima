package com.example.clima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    var tvGrados:TextView? = null
    var tvCiudad:TextView? = null
    var tvEstatus:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvGrados = findViewById(R.id.tvGrados)
        tvCiudad = findViewById(R.id.tvCiudad)
        tvEstatus = findViewById(R.id.tvEstatus)

        val ciudad = intent.getStringExtra("com.example.clima.ciudades.CIUDAD")
        //verifiacion de internet
        if(Network.hayRed(this)){
            //ejecutrar solicitud HTTP
            //api.openweathermap.org/data/2.5/weather?id={city id}&appid={your api key}
            solicitudVolley("https://api.openweathermap.org/data/2.5/weather?id="+ciudad+"&appid=9b14ebe55b3a83085547156603d3dd03&units=metric&lang=es")

        }else{
            //error
            Toast.makeText(this,"isin't network",Toast.LENGTH_SHORT).show()
        }
    }
    //método volley
    private fun solicitudVolley(url:String){
        val queue = Volley.newRequestQueue(this)
        val solicitud = StringRequest(Request.Method.GET,url, Response.Listener<String>{
                response ->
            try{
                Log.d("solicitudHTTPVolley", response)
                val gson = Gson()
                val ciudad = gson.fromJson(response,Ciudad::class.java)
                //Log.d("GSON", ciudad.name)
                tvCiudad?.text = ciudad.name
                tvGrados?.text = ciudad.main?.temp.toString()+"°"
                tvEstatus?.text = ciudad.weather?.get(0)?.description
            }catch (e: Exception){

            }
        }, Response.ErrorListener {  })
        queue.add(solicitud)
    }
}
