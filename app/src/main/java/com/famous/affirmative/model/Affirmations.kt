package com.famous.affirmative.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmations(@StringRes val stringResourceId: Int, @DrawableRes val imageResourcesId: Int)
