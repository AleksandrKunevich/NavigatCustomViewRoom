package com.example.navigatcustomviewroom.presentation.fragment
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import androidx.navigation.fragment.findNavController
//import androidx.navigation.fragment.navArgs
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.navigatcustomviewroom.databinding.NewsFragmentBinding
//import com.example.navigatcustomviewroom.domain.DataN
//import com.example.navigatcustomviewroom.presentation.recycler.RecyclerAdapter
//
//class SortedFragment() : Fragment() {
//
//    private lateinit var binding: NewsFragmentBinding
//    private val adapterNews by lazy { RecyclerAdapter() }
//    private lateinit var data: DataN
//    private val navArgs by navArgs<SortedFragmentArgs>()
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        binding = NewsFragmentBinding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    override fun onStart() {
//        super.onStart()
//
//        data = DataN(navArgs.newsData?.data.orEmpty())
//        binding.apply {
//            recycler.adapter = adapterNews
//            recycler.layoutManager = LinearLayoutManager(activity)
//            adapterNews.submitList(data)
//        }
//
//        binding.buttonChose.setOnClickListener {
//            val action = SortedFragmentDirections.actionSortedFragmentToChoseFilterFragment(data)
//            findNavController().navigate(action)
//        }
//    }
//}