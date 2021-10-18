package org.robertsiagian.moviecatalogue.ui.detail.movies

import androidx.lifecycle.ViewModel
import org.robertsiagian.moviecatalogue.data.MoviesEntity
import org.robertsiagian.moviecatalogue.ui.utils.DataDummy

class DetailMoviesViewModel : ViewModel() {

    private lateinit var moviesId: String

    fun setSelectedMovies(moviesId: String) {
        this.moviesId = moviesId
    }

    fun getMovies(): MoviesEntity {
        val adapterMovies = DetailMoviesAdapter()
        lateinit var movies: MoviesEntity
        val moviesEntities = DataDummy.generateDummyMovies()
        adapterMovies.setDetailMovies(moviesEntities)
        for (moviesEntity in moviesEntities) {
            if (moviesEntity.moviesId == moviesId) {
                movies = moviesEntity
            }
        }
        return movies
    }
}