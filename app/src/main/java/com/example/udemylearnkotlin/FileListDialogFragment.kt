package com.example.udemylearnkotlin

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import android.app.AlertDialog
import android.app.Dialog

class FileListDialogFragment: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)

        val inflater = activity?.layoutInflater
        builder.setView(inflater?.inflate(R.layout.dialog_file_list, null))
            .setPositiveButton("supprimer", null)
            .setNegativeButton("Annuler", null)
            .setTitle("Contenu Supprimé : ")


        return builder.create()
    }
}