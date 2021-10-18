package org.robertsiagian.moviecatalogue.ui.movies

import androidx.lifecycle.ViewModel
import org.robertsiagian.moviecatalogue.data.MoviesEntity
import org.robertsiagian.moviecatalogue.ui.utils.DataDummy

class MoviesViewModel : ViewModel() {

    fun getMovies() : List<MoviesEntity> = DataDummy.generateDummyMovies()
}