package com.example.navigatcustomviewroom.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigatcustomviewroom.databinding.ChoseFilterFragmentBinding
import com.example.navigatcustomviewroom.domain.DataN
import com.example.navigatcustomviewroom.domain.News
import com.example.navigatcustomviewroom.domain.load

class ChoseFilterFragment : Fragment() {

    private lateinit var binding: ChoseFilterFragmentBinding
    private val navArgs by navArgs<ChoseFilterFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ChoseFilterFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        binding.imageButtonConfirm.setOnClickListener {
            val action =
                ChoseFilterFragmentDirections.actionChoseFilterFragmentToNewsFragment(DataN(load()))
            findNavController().navigate(action)
        }
        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            binding.apply {
                when (checkedId) {
                    radioButtonAuthor.id -> {
                        val sortData: List<News> = navArgs.newsData?.data.orEmpty().sortedBy {
                            it.author
                        }
                        val action =
                            ChoseFilterFragmentDirections.actionChoseFilterFragmentToNewsFragment(
                                DataN(sortData)
                            )
                        findNavController().navigate(action)
                    }
                    radioButtonDate.id -> {
                        val sortData: List<News> = navArgs.newsData?.data.orEmpty().sortedBy {
                            it.date
                        }
                        val action =
                            ChoseFilterFragmentDirections.actionChoseFilterFragmentToNewsFragment(
                                DataN(sortData)
                            )
                        findNavController().navigate(action)
                    }
                    radioButtonTitle.id -> {
                        val sortData: List<News> = navArgs.newsData?.data.orEmpty().sortedBy {
                            it.title
                        }
                        val action =
                            ChoseFilterFragmentDirections.actionChoseFilterFragmentToNewsFragment(
                                DataN(sortData)
                            )
                        findNavController().navigate(action)
                    }
                }
            }
        }
    }
}