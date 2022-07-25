package com.example.earthquake


import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater

class LoadingDialog constructor(context: Context?, layoutInflater: LayoutInflater) {

    val builder :AlertDialog=AlertDialog.Builder(context,R.layout.loading_alert).create()
    val inflater=layoutInflater
    fun showAlertDialog(){


        builder.setView(inflater.inflate(R.layout.loading_alert,null))
        builder.setCancelable(true)
        builder.show()
    }
    fun hideAlertDialog(){
        if (builder != null){
            builder.dismiss()
        }
    }
}