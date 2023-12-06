package com.example.knowyourgrow.ui.home

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.knowyourgrow.Constants
import com.example.knowyourgrow.PlantModel
import com.example.knowyourgrow.R
import com.example.knowyourgrow.Adapter
import com.example.knowyourgrow.databinding.FragmentHomeBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val fabAddPlant = view.findViewById<FloatingActionButton>(R.id.fabAddPlant)
        fabAddPlant.setOnClickListener {
            showAddPlantDialog()
            updateRecyclerView()
        }

        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val plantList = Constants.getPlantData()
        val adapter = Adapter(plantList)
        recyclerView.adapter = adapter
    }

    private fun showAddPlantDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Add New Plant")

        val inflater = layoutInflater
        val dialogView = inflater.inflate(R.layout.add_plant_layout, null)

        val etName = dialogView.findViewById<EditText>(R.id.etName)
        val etId = dialogView.findViewById<EditText>(R.id.etId)

        val etSunlight = dialogView.findViewById<EditText>(R.id.etsunlight)


        builder.setView(dialogView)

        builder.setPositiveButton("Add") { dialog, _ ->
            val name = etName.text.toString()
            val id = etId.text.toString()
            val sunlight = etSunlight.text.toString()

            if (name.isNotEmpty() && id.isNotEmpty() && sunlight.isNotEmpty()) {
                // Create a new plant with user input
                val newPlant = PlantModel(name, id, sunlight)
                Constants.addPlant(newPlant)
                updateRecyclerView()
                Toast.makeText(requireContext(), "New plant added", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }

            dialog.dismiss()
        }

        builder.setNegativeButton("Cancel") { dialog, _ ->
            dialog.dismiss()
        }

        builder.show()
    }

    private fun updateRecyclerView() {

        val recyclerView: RecyclerView = requireView().findViewById(R.id.recycleView)
        val adapter = recyclerView.adapter as? Adapter
        adapter?.updateData(Constants.getPlantData())
        adapter?.notifyDataSetChanged()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
