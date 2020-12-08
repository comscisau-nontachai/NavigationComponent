package com.feyverly.navcomponentandbottomnav.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.feyverly.navcomponentandbottomnav.R
import com.feyverly.navcomponentandbottomnav.databinding.FragmentBBinding


class FragmentB : Fragment() {

    lateinit var binding: FragmentBBinding
    val args : FragmentBArgs by navArgs()

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.tvShowName.text = arguments?.getString("key_name")
        binding.tvShowName.text = args.name

        binding.btnGoC.setOnClickListener {
//            val bundle = Bundle()
//            bundle.putInt("key_num1",binding.edtNum1.text.toString().toInt())
//            bundle.putInt("key_num2",binding.edtNum2.text.toString().toInt())
//            findNavController().navigate(R.id.action_fragmentB_to_fragmentC,bundle)

            //use safe arg
            findNavController().navigate(FragmentBDirections.actionFragmentBToFragmentC(
                num1 = binding.edtNum1.text.toString().toInt(),
                num2 = binding.edtNum2.text.toString().toInt()
            ))
        }

    }

}