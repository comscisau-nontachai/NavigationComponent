package com.feyverly.navcomponentandbottomnav.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.feyverly.navcomponentandbottomnav.R
import com.feyverly.navcomponentandbottomnav.databinding.FragmentCBinding

class FragmentC : Fragment() {

    lateinit var binding: FragmentCBinding
    val args : FragmentCArgs by navArgs()

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val num1 = args.num1
        val num2 = args.num2
        binding.lblSumOf.text = "sum of $num1 + $num2 = "
        binding.tvShowSum.text = "${num1?.plus(num2?:0)}"

        binding.btnGoA.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentC_to_fragmentA)
        }
    }

}