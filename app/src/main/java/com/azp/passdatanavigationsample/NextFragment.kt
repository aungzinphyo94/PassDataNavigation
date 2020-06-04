package com.azp.passdatanavigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_next.*

/**
 * A simple [Fragment] subclass.
 * Use the [NextFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_next, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var messageArgs = arguments?.let { NextFragmentArgs.fromBundle(it) }

        var message: String? = messageArgs?.message

        txtMessage.text = message
    }

}