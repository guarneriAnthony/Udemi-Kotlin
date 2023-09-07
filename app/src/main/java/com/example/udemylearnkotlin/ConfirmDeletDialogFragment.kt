package com.example.udemylearnkotlin

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class ConfirmDeletDialogFragment : DialogFragment() {

    interface ConfirmDeletListener {
        fun onDialogPositiveClick()
        fun onDialogNegativeClick()
    }

    val TAG = ConfirmDeletDialogFragment::class.java.simpleName
    var listener : ConfirmDeletListener? = null

    override fun onCreateDialog(savedInstanceState: Bundle?) : Dialog {
        val builder = AlertDialog.Builder(activity)
        builder.setMessage("Supprimer tout le contenu du telephone ?")
            .setPositiveButton("Ho Oui !", object : DialogInterface.OnClickListener{
                override fun onClick(dialog: DialogInterface?, id: Int) {
                    Log.i(TAG, "On va tout casser")
                    listener?.onDialogPositiveClick()
                }
            })
            .setNegativeButton("Non on supp pas tout",DialogInterface.OnClickListener{dialog, id ->
                Log.i(TAG, "Bon la prochaine fois ")
                listener?.onDialogNegativeClick()
            })
        return builder.create()
    }


}