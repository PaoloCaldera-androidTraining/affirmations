package com.example.affirmations.adapter

import android.content.Context
import com.example.affirmations.data.Affirmation

/* The adapter is the instrument which adapts data so that can be used by an UI element.
   In this case, it takes an affirmation instance (a simple String element) and turns it into
   a LIST ITEM VIEW, a UI element that can be displayed in the RecyclerView.
 */

/* The adapter class must have a constructor containing
    - the context of the project (in other words, the activity/fragment hosting the RecyclerView)
    - the full dataset to be used by the RecyclerView and to display on the screen
 */
class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) {
}