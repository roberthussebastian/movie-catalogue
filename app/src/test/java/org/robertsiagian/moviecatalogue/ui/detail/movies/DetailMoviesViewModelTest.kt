package org.robertsiagian.moviecatalogue.ui.detail.movies

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.robertsiagian.moviecatalogue.ui.utils.DataDummy

class DetailMoviesViewModelTest {

    private lateinit var viewModel: DetailMoviesViewModel
    private val dummyMovies = DataDummy.generateDummyMovies()[0]
    private val moviesId = dummyMovies.moviesId

    @Before
    fun setUp() {
        viewModel = DetailMoviesViewModel()
        viewModel.setSelectedMovies(moviesId)
    }

    @Test
    fun getMovies() {
        viewModel.setSelectedMovies(dummyMovies.moviesId)
        val moviesEntity = viewModel.getMovies()
        assertNotNull(moviesEntity)
        assertEquals(dummyMovies.moviesId, moviesEntity.moviesId)
        assertEquals(dummyMovies.pubYear, moviesEntity.pubYear)
        assertEquals(dummyMovies.description, moviesEntity.description)
        assertEquals(dummyMovies.imagePath, moviesEntity.imagePath)
        assertEquals(dummyMovies.titles, moviesEntity.titles)

    }
}