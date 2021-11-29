package ru.tms.naccomponents.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import ru.tms.naccomponents.R


class SecondFragment : Fragment() {
    private val navArgs by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(), navArgs.data?.string.orEmpty(), Toast.LENGTH_LONG).show()

        requireActivity().findViewById<Button>(R.id.secondButton).setOnClickListener {
            findNavController().navigate(R.id.toFirst)
        }
    }

}