package com.example.navigationcomponent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentPageYBinding

class PageYFragment : Fragment() {
    private lateinit var binding: FragmentPageYBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        binding = FragmentPageYBinding.inflate(inflater, container, false)

        val backButton = object :   OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.gotoMainPage)
            }
            }


        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backButton)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

}