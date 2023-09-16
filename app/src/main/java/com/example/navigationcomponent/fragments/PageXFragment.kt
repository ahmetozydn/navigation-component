package com.example.navigationcomponent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentMainBinding
import com.example.navigationcomponent.databinding.FragmentPageABinding
import com.example.navigationcomponent.databinding.FragmentPageBBinding
import com.example.navigationcomponent.databinding.FragmentPageXBinding

class PageXFragment : Fragment() {
    private lateinit var binding: FragmentPageXBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPageXBinding.inflate(inflater, container, false)

        binding.goToPageY.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.gotoY)
        }
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

}