package org.robertsiagian.moviecatalogue.ui.detail.tvshow

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.robertsiagian.moviecatalogue.ui.utils.DataDummy

class DetailTvShowViewModelTest {

    private lateinit var viewModel: DetailTvShowViewModel
    private val dummyTvShow = DataDummy.generateDummyTvShows()[0]
    private val showsId = dummyTvShow.showsId

    @Before
    fun setUp() {
        viewModel = DetailTvShowViewModel()
        viewModel.setSelectedtvSHow(showsId)
    }

    @Test
    fun getTvShow() {
        viewModel.setSelectedtvSHow(dummyTvShow.showsId)
        val tvShowEntity = viewModel.getTvShow()
        assertNotNull(tvShowEntity)
        assertEquals(dummyTvShow.showsId, tvShowEntity.showsId)
        assertEquals(dummyTvShow.showsPubYear, tvShowEntity.showsPubYear)
        assertEquals(dummyTvShow.showsDescription, tvShowEntity.showsDescription)
        assertEquals(dummyTvShow.showsImage, tvShowEntity.showsImage)
        assertEquals(dummyTvShow.showsTitle, tvShowEntity.showsTitle)

    }
}