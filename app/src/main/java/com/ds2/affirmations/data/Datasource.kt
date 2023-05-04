package com.ds2.affirmations.data

import com.ds2.affirmations.R
import com.ds2.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation> (
            Affirmation(R.string.Affirmation01),
            Affirmation(R.string.Affirmation02),
            Affirmation(R.string.Affirmation03),
            Affirmation(R.string.Affirmation04),
            Affirmation(R.string.Affirmation05),
            Affirmation(R.string.Affirmation06)
        )
    }
}