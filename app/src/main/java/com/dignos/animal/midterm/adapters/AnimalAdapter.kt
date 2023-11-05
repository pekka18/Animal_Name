package com.dignos.animal.midterm.adapters

import android.app.Activity
import android.content.Intent
import android.provider.ContactsContract.Profile
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dignos.animal.midterm.animalprofile
import com.dignos.animal.midterm.constants.Constants
import com.dignos.animal.midterm.databinding.ItemAnimalsBinding
import com.dignos.animal.midterm.models.Animal

class AnimalAdapter (
    private val activity: Activity,
    private val animals: MutableList<Animal>
    ): RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>(){
        class AnimalViewHolder(
            private val activity: Activity,
            private val binding: ItemAnimalsBinding
        ): RecyclerView.ViewHolder(binding.root) {
            fun bind(animal: Animal) {
                val title = "[${animal.id}] ${animal.name}"
                binding.name.text = title
                binding.details.text = animal.details
                binding.row.setOnClickListener {
                    val intent = Intent(
                        activity,
                        animalprofile::class.java
                    )
                    intent.putExtra(Constants.PARAM_ID, animal.id)
                    intent.putExtra(Constants.PARAM_NAME, animal.name)
                    intent.putExtra(Constants.PARAM_DETAILS, animal.details)

                    activity.startActivity(intent)
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val binding = ItemAnimalsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return AnimalViewHolder(activity, binding)
    }

    override fun getItemCount() = animals.size

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(animals[position])
    }
    }
