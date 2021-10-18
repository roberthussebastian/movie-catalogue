package org.robertsiagian.moviecatalogue.ui.detail.movies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import org.robertsiagian.moviecatalogue.R
import org.robertsiagian.moviecatalogue.data.MoviesEntity
import org.robertsiagian.moviecatalogue.databinding.ActivityDetailMoviesBinding
import org.robertsiagian.moviecatalogue.databinding.ContentDetailMoviesBinding

class DetailMoviesActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    private lateinit var detailMoviesBinding: ContentDetailMoviesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailMoviesBinding = ActivityDetailMoviesBinding.inflate(layoutInflater)
        detailMoviesBinding = activityDetailMoviesBinding.detailContentMovies

        setContentView(activityDetailMoviesBinding.root)

        setSupportActionBar(activityDetailMoviesBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMoviesViewModel::class.java]

        val extrasMovies = intent.extras
        if (extrasMovies != null) {
            val moviesId = extrasMovies.getString(EXTRA_MOVIE)
            if (moviesId != null) {
                viewModel.setSelectedMovies(moviesId)
                populateMovies(viewModel.getMovies())
            }
        }
    }

    private fun populateMovies(moviesEntity: MoviesEntity) {
        detailMoviesBinding.textTitle.text = moviesEntity.titles
        detailMoviesBinding.textDescription.text = moviesEntity.description
        detailMoviesBinding.textDate.text = resources.getString(R.string.pubYear_date, moviesEntity.pubYear)

        Glide.with(this)
                .load(moviesEntity.imagePath)
                .transform(RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(detailMoviesBinding.imagePoster)
    }
}
