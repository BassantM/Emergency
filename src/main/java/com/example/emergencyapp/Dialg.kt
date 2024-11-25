package com.example.emergencyapp

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class Dialg: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        builder
            .setIcon(android.R.drawable.ic_menu_close_clear_cancel)
            .setTitle(getString(R.string.exit))
            . setMessage(getString(R.string.are_you_ok_you_wanna_to_exit))
            .setPositiveButton(getString(R.string.ok)){ _, _ -> activity?.finish()}
            .setNegativeButton(getString(R.string.cancel)){ dialog, _ -> dialog.dismiss()}
        return builder.create()

    }


}