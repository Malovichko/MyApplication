package com.example.myapplication

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface


object DialogScreen {
    const val IDD_ABOUT = 1
    fun getDialog(activity: Activity, ID: Int): AlertDialog? {
        val builder: AlertDialog.Builder = AlertDialog.Builder(activity)
        return when (ID) {
            IDD_ABOUT -> {
                builder.setTitle(R.string.dialog_about_title)
                builder.setMessage(R.string.dialog_about_message)
                builder.setCancelable(true)
                builder.setPositiveButton(
                    R.string.ok,
                    DialogInterface.OnClickListener { dialog, which ->
                        dialog.dismiss()
                    })
                builder.create()
            }
            else -> null
        }
    }
}