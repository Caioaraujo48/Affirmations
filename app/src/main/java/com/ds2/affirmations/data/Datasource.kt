package com.ds2.affirmations.data

import com.ds2.affirmations.R
import com.ds2.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation> (
            Affirmation(R.string.Affirmation01, R.drawable.image1),
            Affirmation(R.string.Affirmation02, R.drawable.image2),
            Affirmation(R.string.Affirmation03, R.drawable.image3),
            Affirmation(R.string.Affirmation04, R.drawable.image4),
            Affirmation(R.string.Affirmation05, R.drawable.image5),
            Affirmation(R.string.Affirmation06, R.drawable.image6)
        )
    }
}