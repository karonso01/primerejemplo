package com.example.primerejemplo

import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.primerejemplo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        variablesYConstantes()
    }
        /*Aquí vamos a hablar de variables y constantes
            */
    private fun variablesYConstantes() {
    //Variables

    var myFirstVariable = "hello Hackerman"
    var myFirstNumber = 1
    println(myFirstVariable)

            myFirstVariable = "bienvenidos a la prueba" +
                    println(myFirstVariable)
            myFirstVariable = 1

            var mySecondVariable = "parte uno de la prueba"
            println(mySecondVariable)

            mySecondVariable = myFirstVariable
            println(mySecondVariable)

            myFirstVariable = "prueba 1 listo"
            println(myFirstVariable)

            myFirstVariable =  "ejemplo1"
            println(myFirstVariable)

            //Constantes
            val myFirstConstant = "Primera parte"


    }

}

