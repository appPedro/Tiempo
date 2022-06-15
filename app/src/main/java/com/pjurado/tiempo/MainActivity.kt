package com.pjurado.tiempo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pjurado.tiempo.databinding.ActivityMainBinding
import com.pjurado.tiempo.servidor.RemoteConection
import com.pjurado.tiempo.servidor.model.RemoteResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lateinit var tiempo: RemoteResult
        GlobalScope.launch(Dispatchers.Main) {
             tiempo = RemoteConection.service.pronosticoCoord("37.350380", "-5.943761", "6f89c731058632df01658d7865b0d166")
            //tiempo = RemoteConection.service.pronosticoCoord("45.358328769923624", "9.302904574896017", "6f89c731058632df01658d7865b0d166")
            binding.temperatura.text = (tiempo.current.temp -  273.15).toString()

        }
        //Toast.makeText(applicationContext, tiempo.current.temp.toString(), Toast.LENGTH_SHORT).show()
    }
}