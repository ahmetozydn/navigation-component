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

class PageBFragment : Fragment() {
    private lateinit var binding: FragmentPageBBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPageBBinding.inflate(inflater, container, false)

        binding.goToPageY.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.gotoYFromB)
        }
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

}