package com.example.affirmations.adapter

/*  Adapters are the instrument which adapt data so that can be used by an UI element.
    In this case, it takes an affirmation instance (a simple String element) and turns it into
    a LIST ITEM VIEW, a UI element that can be displayed in the RecyclerView.
 */

/*  ViewHolders are the components that directly interact with the RecyclerView.
    A ViewHolder represents a single list item view, and can be re-used when possible.
    It holds references to the views of the list_item.xml layout
*/

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.data.Affirmation



/*  The view holder class must have a constructor containing
    - a general view, to which the list_item.xml layout will be inflated
*/
class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    // Reference to all the components to update
    val textView = view.findViewById<TextView>(R.id.list_item_text)
}



/*  The adapter class must have a constructor containing
    - the context of the project (in other words, the activity/fragment hosting the RecyclerView)
    - the full dataset to be used by the RecyclerView and to display on the screen
 */
class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemViewHolder>() {


    /*  Create a new ViewHolder for the recycler view, when no other ViewHolder can be re-used
        - parent: view that will contain all the list item views, in this case the RecyclerView
        - viewType: identifies the type of view to be recycled. When you have different list item
            layouts in the same RecyclerView, then this parameter distinguishes between them.
            Only views of the same type can be recycled.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val listItemView =
            LayoutInflater
                // creates the LayoutInflater by giving the RecyclerView context
                .from(parent.context)
                // inflate the layout and refer it to the parent root view
                .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(listItemView)
    }


    /*  Fills with contents, or replaces the contents, of an already created ViewHolder.
        - holder: ViewHolder already created that has to be filled or updated
        - position: index of the list item view belonging to the list
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // context.resources returns the Resources object associated to the MainActivity context
        holder.textView.text = context.resources.getString(dataset[position].stringResourceId)
    }


    // Returns the size of your dataset
    override fun getItemCount(): Int = dataset.size

}