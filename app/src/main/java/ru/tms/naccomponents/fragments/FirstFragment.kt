package ru.tms.naccomponents.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import ru.tms.naccomponents.R
import ru.tms.naccomponents.model.Data


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().findViewById<Button>(R.id.firstButton).setOnClickListener {
            val action = FirstFragmentDirections.toSecond(Data("Привет второму фрагменту!"))
            findNavController().navigate(action)
        }
    }
}