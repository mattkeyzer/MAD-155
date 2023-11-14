package com.example.knowyourgrow.ui.home

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.knowyourgrow.R
import com.example.knowyourgrow.adapter.rvItemAdapter
import com.example.knowyourgrow.databinding.FragmentHomeBinding
import com.example.knowyourgrow.models.rvItemModel
var plants: ArrayList<rvItemModel> = ArrayList()
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
      //  val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

       // val plantRV: RecyclerView = binding.plantRV
        setupData()
        val adpater = rvItemAdapter(plants)
        binding.plantRV.adapter = adpater
     //   homeViewModel.text.observe(viewLifecycleOwner) {

    //    }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun setupData(): ArrayList<rvItemModel>{


        plants.add(rvItemModel(R.drawable.plant, "Plant Name", "Description"))
        plants.add(rvItemModel(R.drawable.plant, "Plant Name", "Description"))
        plants.add(rvItemModel(R.drawable.plant, "Plant Name", "Description"))
        plants.add(rvItemModel(R.drawable.plant, "Plant Name", "Description"))
        plants.add(rvItemModel(R.drawable.plant, "Plant Name", "Description"))
        plants.add(rvItemModel(R.drawable.plant, "Plant Name", "Description"))
        plants.add(rvItemModel(R.drawable.plant, "Plant Name", "Description"))
        plants.add(rvItemModel(R.drawable.plant, "Plant Name", "Description"))
        plants.add(rvItemModel(R.drawable.plant, "Plant Name", "Description"))
        plants.add(rvItemModel(R.drawable.plant, "Plant Name", "Description"))
        plants.add(rvItemModel(R.drawable.plant, "Plant Name", "Description"))

        return plants
    }
}