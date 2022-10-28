package com.example.affirmations.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/*  Annotation: tools that provide additional information to classes, methods and parameters
    @StringRes and @DrawableRes are added to annotate the type of resource that a val represents.
 */

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)