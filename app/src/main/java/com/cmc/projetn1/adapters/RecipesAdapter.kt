package com.cmc.projetn1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cmc.projetn1.R

class RecipesAdapter(private val recipeList: List<Recipe>) :
    RecyclerView.Adapter<RecipesAdapter.RecipeViewHolder>() {

    inner class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.recipeImage)
        val nameTextView: TextView = view.findViewById(R.id.recipeName)
        val priceTextView: TextView = view.findViewById(R.id.recipePrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recipes, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipeList[position]
        holder.imageView.setImageResource(recipe.imageResId)
        holder.nameTextView.text = recipe.name
        holder.priceTextView.text = recipe.price
    }

    override fun getItemCount() = recipeList.size
}

data class Recipe(
    val name: String,
    val imageResId: Int,
    val price: String
)


