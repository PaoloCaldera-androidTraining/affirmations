package com.example.affirmations

import android.content.Context
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Affirmation
import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationListUnitTests {

    /*  mock() allows us to create a fictitious context, in order to test methods which require it
        Remember that unit tests run on the local JVM and not on the device, so there would be
        no context.
     */
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {

        // For unit-tests, it is better to create a dedicated dataset
        val dataset = listOf(
            Affirmation(R.string.affirmation_1, R.drawable.image1),
            Affirmation(R.string.affirmation_2, R.drawable.image2)
        )

        val adapter = ItemAdapter(context, dataset)

        // To be sure that the adapter logic is correct, we test for instance its size, comparing
        // to the one of the dedicated dataset provided
        assertEquals("Adapter is not of the correct size", dataset.size, adapter.itemCount)
    }
}