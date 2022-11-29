package com.dogactnrvrdi.todolist.view

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.dogactnrvrdi.todolist.R
import com.dogactnrvrdi.todolist.viewmodel.DeleteAllCompletedViewModel
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DeleteAllCompletedDialogFragment : DialogFragment() {

    private val viewModel: DeleteAllCompletedViewModel by viewModels()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
            AlertDialog.Builder(requireContext())
                .setTitle(getString(R.string.confirm_deletion))
                .setNegativeButton(getString(R.string.cancel), null)
                .setPositiveButton(getString(R.string.yes)) { _, _ ->
                    viewModel.onConfirmClicked()
                }
                .create()


}