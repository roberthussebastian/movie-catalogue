package org.robertsiagian.moviecatalogue.ui.utils

import org.robertsiagian.moviecatalogue.data.MoviesEntity

object DataDummy {

    fun generateDummyMovies(): List<MoviesEntity> {
        val movies = ArrayList<MoviesEntity>()

        movies.add(MoviesEntity("movies1","Army of the Dead","Army of the Dead adalah sebuah film heist mayat hidup Amerika Serikat garapan Zack Snyder, dari skenario karya Snyder, Shay Hatten dan Joby Harold dan cerita karya Snyder.","14 Mei 2021","https://www.awn.com/sites/default/files/styles/original/public/image/featured/army_of_the_dead1280x720.jpg?itok=en2dwNq4"))
        movies.add(MoviesEntity("movies2","Oxygen","Oxygen adalah film thriller fiksi ilmiah berbahasa Prancis 2021 yang disutradarai dan diproduksi oleh Alexandre Aja, dari skenario oleh Christie LeBlanc. Sebagai bagian dari produksi bersama Amerika-Prancis, film ini dibintangi oleh Mélanie Laurent, Mathieu Amalric, dan Malik Zidi.","12 Mei 2021","https://movieden.net/wp-content/uploads/2021/05/oxygen.jpg"))
        movies.add(MoviesEntity("movies3","Mortal Kombat","Petarung MMA Cole Young, yang terbiasa menerima pukulan demi uang, tidak menyadari warisannya-atau mengapa Kaisar Dunia Luar Shang Tsung telah mengirim prajurit terbaiknya, Sub-Zero, seorang Cryomancer dunia lain, untuk memburu Cole.","14 April 2021","https://cinemags.co.id/wp-content/uploads/2021/03/Mortal-Kombat.jpg"))
        movies.add(MoviesEntity("movies4","Monster Hunter","Ketika Letnan Artemis dan pasukanya berpindah ke dunia baru, mereka terlibat dalam pertempuran yang mengerikan demi bertahan hidup melawan mahluk besar dengan kekuatan yang luar biasa.","13 Januari 2021","https://assets.pikiran-rakyat.com/crop/0x538:1080x1349/x/photo/2020/09/05/176396990.jpg"))
        movies.add(MoviesEntity("movies5","The Beast","The Beast adalah film thriller aksi Italia 2020 yang disutradarai oleh Ludovico Di Martino dan dibintangi oleh Fabrizio Gifuni, Lino Musella dan Monica Piseddu.","26 Oktober 2020","https://i1.wp.com/readysteadycut.com/wp-content/uploads/2020/11/AAAABYc9QZJDXi1CYA-yPR297emnn8hmXNBpyo4ibDtXFUktn-QQds3Lg8WezxhNWMMQNVSoCsmWyMlJc-AEun-N86M7D2V4V-9HIIDxPviIWvCaAK4DrOJU4-VIh6jhEw.jpg?fit=1024%2C576&ssl=1"))
        movies.add(MoviesEntity("movies6","Call","The Call, juga dikenal sebagai Call, adalah film thriller Korea Selatan tahun 2020 yang disutradarai oleh Lee Chung-hyun, dibintangi oleh Park Shin-hye dan Jeon Jong-seo.","27 November 2020","https://assets.pikiran-rakyat.com/crop/0x0:0x0/x/photo/2020/11/30/691995092.jpg"))
        movies.add(MoviesEntity("movies7","The Paramedic","The Paramedic adalah film thriller Spanyol tahun 2020 yang disutradarai oleh Carles Torras, ditulis oleh David Desola dan Hèctor Hernández Vicens dan dibintangi oleh Celso Bugallo, Mario Casas dan Déborah François. The Paramedic dirilis pada 16 September 2020 oleh Netflix.","16 September 2020","https://theparamedic2020watchfullmp4engsub.files.wordpress.com/2020/09/ggtmrbvz6zzgmlvcnmqcuoitvhl.jpg"))
        movies.add(MoviesEntity("movies8","Alive","#Alive adalah sebuah film mayat hidup seru Korea Selatan tahun 2020 garapan Cho Il-hyung, dan menampilkan Yoo Ah-in dan Park Shin-hye. Film tersebut berdasarkan pada film Amerika Serikat tahun 2019 Alone karya Matt Naylor.","24 Juni 2020","https://www.heavenofhorror.com/wp-content/uploads/2020/09/alive-netflix.jpg"))
        movies.add(MoviesEntity("movies9","The Empty Man","Setelah sekelompok remaja dari sebuah kota kecil di Amerika mulai satu-persatu menghilang secara misterius, penduduk setempat percaya bahwa itu adalah perbuatan legenda masyarakat yang dikenal sebagai The Empty Man.","4 Desember 2020","https://assets.pikiran-rakyat.com/crop/0x696:2025x2316/x/photo/2020/12/05/3100312626.jpg"))
        movies.add(MoviesEntity("movies10","Don't Listen","Don't Listen merupakan film yang disutradarai oleh Angel Gomez Hernandez. Sedangkan penulis naskah film tersebut adalah Santiago Diaz.","24 Juli 2020","https://cdn-2.tstatic.net/tribunnews/foto/bank/images/film-dont-listen-di-netflix.jpg"))
        return movies
    }
}