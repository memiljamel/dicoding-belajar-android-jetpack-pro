package com.example.moviecatalogue.utils

import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.data.source.local.entity.TvShowEntity
import com.example.moviecatalogue.data.source.remote.response.MovieResponse
import com.example.moviecatalogue.data.source.remote.response.TvShowResponse
import java.util.*

object DataDummy {
    fun generateDummyMovies(): List<MovieEntity> {
        val movies = ArrayList<MovieEntity>()
        movies.add(
            MovieEntity(
                335983,
                "en",
                "Venom",
                "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
                "/2uNW4WbgBXL25BAbXGLnLqX71Sw.jpg",
                "2018-09-28",
                6.8
            )
        )
        movies.add(
            MovieEntity(
                354912,
                "en",
                "Coco",
                "Despite his family’s baffling generations-old ban on music, Miguel dreams of becoming an accomplished musician like his idol, Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead following a mysterious chain of events. Along the way, he meets charming trickster Hector, and together, they set off on an extraordinary journey to unlock the real story behind Miguel's family history.",
                "/gGEsBPAijhVUFoiNpgZXqRVWJt2.jpg",
                "2017-10-27",
                8.2
            )
        )
        movies.add(
            MovieEntity(
                438631,
                "en",
                "Dune",
                "Paul Atreides, a brilliant and gifted young man born into a great destiny beyond his understanding, must travel to the most dangerous planet in the universe to ensure the future of his family and his people. As malevolent forces explode into conflict over the planet's exclusive supply of the most precious resource in existence-a commodity capable of unlocking humanity's greatest potential-only those who can conquer their fear will survive.",
                "/d5NXSklXo0qyIYkgV94XAgMIckC.jpg",
                "2021-09-15",
                8.0
            )
        )
        movies.add(
            MovieEntity(
                550988,
                "en",
                "Free Guy",
                "A bank teller called Guy realizes he is a background character in an open world video game called Free City that will soon go offline.",
                "/xmbU4JTUm8rsdtn7Y3Fcm30GpeT.jpg",
                "2021-08-11",
                7.8
            )
        )
        movies.add(
            MovieEntity(
                568620,
                "en",
                "Snake Eyes: G.I. Joe Origins",
                "After saving the life of their heir apparent, tenacious loner Snake Eyes is welcomed into an ancient Japanese clan called the Arashikage where he is taught the ways of the ninja warrior. But, when secrets from his past are revealed, Snake Eyes' honor and allegiance will be tested – even if that means losing the trust of those closest to him.",
                "/uIXF0sQGXOxQhbaEaKOi2VYlIL0.jpg",
                "2021-07-22",
                6.9
            )
        )
        movies.add(
            MovieEntity(
                580489,
                "en",
                "Venom: Let There Be Carnage",
                "After finding a host body in investigative reporter Eddie Brock, the alien symbiote must face a new enemy, Carnage, the alter ego of serial killer Cletus Kasady.",
                "/rjkmN1dniUHVYAtwuV3Tji7FsDO.jpg",
                "2021-09-30",
                6.9
            )
        )
        movies.add(
            MovieEntity(
                610253,
                "en",
                "Halloween Kills",
                "Minutes after Laurie Strode, her daughter Karen and granddaughter Allyson left masked monster Michael Myers caged and burning in Laurie's basement, Laurie is rushed to the hospital with life-threatening injuries, believing she finally killed her lifelong tormentor. But when Michael manages to free himself from Laurie's trap, his ritual bloodbath resumes. As Laurie fights her pain and prepares to defend herself against him, she inspires all of Haddonfield to rise up against their unstoppable monster. The Strode women join a group of other survivors of Michael's first rampage who decide to take matters into their own hands, forming a vigilante mob that sets out to hunt Michael down, once and for all.",
                "/qmJGd5IfURq8iPQ9KF3les47vFS.jpg",
                "2021-10-14",
                7.1
            )
        )
        movies.add(
            MovieEntity(
                630004,
                "en",
                "The Vault",
                "When an engineer learns of a mysterious, impenetrable fortress hidden under The Bank of Spain, he joins a crew of master thieves who plan to steal the legendary lost treasure locked inside while the whole country is distracted by Spain's World Cup Final. With thousands of soccer fans cheering in the streets, and security forces closing in, the crew have just minutes to pull off the score of a lifetime.",
                "/kWhXubAiIcHW0xn5GThflqaKZqh.jpg",
                "2021-03-03",
                7.1
            )
        )
        movies.add(
            MovieEntity(
                639721,
                "en",
                "The Addams Family 2",
                "The Addams get tangled up in more wacky adventures and find themselves involved in hilarious run-ins with all sorts of unsuspecting characters.",
                "/ld7YB9vBRp1GM1DT3KmFWSmtBPB.jpg",
                "2021-10-01",
                7.4
            )
        )
        movies.add(
            MovieEntity(
                645788,
                "en",
                "The Protégé",
                "Rescued as a child by the legendary assassin Moody and trained in the family business, Anna is the world’s most skilled contract killer. When Moody, the man who was like a father to her and taught her everything she needs to know about trust and survival, is brutally killed, Anna vows revenge. As she becomes entangled with an enigmatic killer whose attraction to her goes way beyond cat and mouse, their confrontation turns deadly and the loose ends of a life spent killing will weave themselves ever tighter.",
                "/o9FY8N5c8CXf22q8s4CmRRjAQJx.jpg",
                "2021-08-19",
                6.8
            )
        )

        return movies
    }

    fun generateDummyTvShows(): List<TvShowEntity> {
        val tvShows = ArrayList<TvShowEntity>()
        tvShows.add(
            TvShowEntity(
                881,
                "en",
                "Days of Our Lives",
                "The Horton and Brady broods endure the romantic trials of life in Salem, a Midwestern hamlet filled with evil geniuses, star-crossed lovers and a rich family history.",
                "/7Zm7epVFEovMEVLpM6FvrjhaNXn.jpg",
                "1965-11-08",
                6.3
            )
        )
        tvShows.add(
            TvShowEntity(
                1991,
                "en",
                "Rachael Ray",
                "Rachael Ray, also known as The Rachael Ray Show, is an American talk show starring Rachael Ray that debuted in syndication in the United States and Canada on September 18, 2006. It is filmed at Chelsea Television Studios in New York City. The show's 8th season premiered on September 9, 2013, and became the last Harpo show in syndication to switch to HD with a revamped studio. In January 2012, CBS Television Distribution announced a two-year renewal for the show, taking it through the 2013–14 season.",
                "/dsAJhCLYX1fiNRoiiJqR6Up4aJ.jpg",
                "2006-09-18",
                5.3
            )
        )
        tvShows.add(
            TvShowEntity(
                2051,
                "en",
                "The Price Is Right",
                "Come on down! The Price Is Right features a wide variety of games and contests with the same basic challenge: Guess the prices of everyday (or not-quite-everyday) retail items.",
                "/6m4uYFAJwkanZXd0n0HUQ0lYHLl.jpg",
                "1972-09-04",
                6.9
            )
        )
        tvShows.add(
            TvShowEntity(
                2778,
                "en",
                "Wheel of Fortune",
                "This game show sees contestants solve word puzzles, similar to those used in Hangman, to win cash and prizes determined by spinning a giant carnival wheel.",
                "/2fvAIyVfFHQdhJ7OsJWuMlF7836.jpg",
                "1983-09-19",
                7.2
            )
        )
        tvShows.add(
            TvShowEntity(
                2912,
                "en",
                "Jeopardy!",
                "America's favorite quiz show where contestants are presented with general knowledge clues in the form of answers, and must phrase their responses in question form.",
                "/11rWvQOEZBouD7wet0sWHwu7NDs.jpg",
                "1984-09-10",
                7.0
            )
        )
        tvShows.add(
            TvShowEntity(
                90462,
                "en",
                "Chucky",
                "After a vintage Chucky doll turns up at a suburban yard sale, an idyllic American town is thrown into chaos as a series of horrifying murders begin to expose the town’s hypocrisies and secrets. Meanwhile, the arrival of enemies — and allies — from Chucky’s past threatens to expose the truth behind the killings, as well as the demon doll’s untold origins.",
                "/iF8ai2QLNiHV4anwY1TuSGZXqfN.jpg",
                "2021-10-12",
                8.0
            )
        )
        tvShows.add(
            TvShowEntity(
                93405,
                "ko",
                "Squid Game",
                "Hundreds of cash-strapped players accept a strange invitation to compete in children's games—with high stakes. But, a tempting prize awaits the victor.",
                "/dDlEmu3EZ0Pgg93K2SVNLCjCSvE.jpg",
                "2021-09-17",
                7.8
            )
        )
        tvShows.add(
            TvShowEntity(
                113901,
                "es",
                "Maradona: Blessed Dream",
                "The controversial life and history of Argentine football legend Diego Armando Maradona. From his beginnings in Villa Fiorito, one of the poorest barrios of Buenos Aires, to achieving glory on the international football league. Earning himself a well-deserved place in history. Living a life strewn with drugs, sex and public scrutiny, he played by his own rules regardless of the consequences. Watch the man who took the world by storm and made his way into the hearts of millions.",
                "/mGPdWEEmfzP7VQBQsXrFt1b1ikQ.jpg",
                "2021-10-29",
                7.7
            )
        )
        tvShows.add(
            TvShowEntity(
                127235,
                "en",
                "Invasion",
                "Earth is visited by an alien species that threatens humanity’s existence. Events unfold in real time through the eyes of five ordinary people across the globe as they struggle to make sense of the chaos unraveling around them.",
                "/7rpiHZx10Nm50AtzTUEO9eyaKdq.jpg",
                "2021-10-21",
                7.5
            )
        )
        tvShows.add(
            TvShowEntity(
                133372,
                "hi",
                "Meet",
                "A remake of Zee Sarthak’s Sindura Bindu. Despite her efforts to provide for her family, Meets disregard for societal gender norms and her nonconformist job as a delivery agent make her an unsuitable girl in the eyes of her family.",
                "/9X7FovF5n8NQUHUPJYYfxRlF3yp.jpg",
                "2021-08-23",
                3.2
            )
        )

        return tvShows
    }

    fun generateRemoteDummyMovies(): List<MovieResponse> {
        val movies = ArrayList<MovieResponse>()
        movies.add(
            MovieResponse(
                335983,
                "en",
                "Venom",
                "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
                "/2uNW4WbgBXL25BAbXGLnLqX71Sw.jpg",
                "2018-09-28",
                6.8
            )
        )
        movies.add(
            MovieResponse(
                354912,
                "en",
                "Coco",
                "Despite his family’s baffling generations-old ban on music, Miguel dreams of becoming an accomplished musician like his idol, Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead following a mysterious chain of events. Along the way, he meets charming trickster Hector, and together, they set off on an extraordinary journey to unlock the real story behind Miguel's family history.",
                "/gGEsBPAijhVUFoiNpgZXqRVWJt2.jpg",
                "2017-10-27",
                8.2
            )
        )
        movies.add(
            MovieResponse(
                438631,
                "en",
                "Dune",
                "Paul Atreides, a brilliant and gifted young man born into a great destiny beyond his understanding, must travel to the most dangerous planet in the universe to ensure the future of his family and his people. As malevolent forces explode into conflict over the planet's exclusive supply of the most precious resource in existence-a commodity capable of unlocking humanity's greatest potential-only those who can conquer their fear will survive.",
                "/d5NXSklXo0qyIYkgV94XAgMIckC.jpg",
                "2021-09-15",
                8.0
            )
        )
        movies.add(
            MovieResponse(
                550988,
                "en",
                "Free Guy",
                "A bank teller called Guy realizes he is a background character in an open world video game called Free City that will soon go offline.",
                "/xmbU4JTUm8rsdtn7Y3Fcm30GpeT.jpg",
                "2021-08-11",
                7.8
            )
        )
        movies.add(
            MovieResponse(
                568620,
                "en",
                "Snake Eyes: G.I. Joe Origins",
                "After saving the life of their heir apparent, tenacious loner Snake Eyes is welcomed into an ancient Japanese clan called the Arashikage where he is taught the ways of the ninja warrior. But, when secrets from his past are revealed, Snake Eyes' honor and allegiance will be tested – even if that means losing the trust of those closest to him.",
                "/uIXF0sQGXOxQhbaEaKOi2VYlIL0.jpg",
                "2021-07-22",
                6.9
            )
        )
        movies.add(
            MovieResponse(
                580489,
                "en",
                "Venom: Let There Be Carnage",
                "After finding a host body in investigative reporter Eddie Brock, the alien symbiote must face a new enemy, Carnage, the alter ego of serial killer Cletus Kasady.",
                "/rjkmN1dniUHVYAtwuV3Tji7FsDO.jpg",
                "2021-09-30",
                6.9
            )
        )
        movies.add(
            MovieResponse(
                610253,
                "en",
                "Halloween Kills",
                "Minutes after Laurie Strode, her daughter Karen and granddaughter Allyson left masked monster Michael Myers caged and burning in Laurie's basement, Laurie is rushed to the hospital with life-threatening injuries, believing she finally killed her lifelong tormentor. But when Michael manages to free himself from Laurie's trap, his ritual bloodbath resumes. As Laurie fights her pain and prepares to defend herself against him, she inspires all of Haddonfield to rise up against their unstoppable monster. The Strode women join a group of other survivors of Michael's first rampage who decide to take matters into their own hands, forming a vigilante mob that sets out to hunt Michael down, once and for all.",
                "/qmJGd5IfURq8iPQ9KF3les47vFS.jpg",
                "2021-10-14",
                7.1
            )
        )
        movies.add(
            MovieResponse(
                630004,
                "en",
                "The Vault",
                "When an engineer learns of a mysterious, impenetrable fortress hidden under The Bank of Spain, he joins a crew of master thieves who plan to steal the legendary lost treasure locked inside while the whole country is distracted by Spain's World Cup Final. With thousands of soccer fans cheering in the streets, and security forces closing in, the crew have just minutes to pull off the score of a lifetime.",
                "/kWhXubAiIcHW0xn5GThflqaKZqh.jpg",
                "2021-03-03",
                7.1
            )
        )
        movies.add(
            MovieResponse(
                639721,
                "en",
                "The Addams Family 2",
                "The Addams get tangled up in more wacky adventures and find themselves involved in hilarious run-ins with all sorts of unsuspecting characters.",
                "/ld7YB9vBRp1GM1DT3KmFWSmtBPB.jpg",
                "2021-10-01",
                7.4
            )
        )
        movies.add(
            MovieResponse(
                645788,
                "en",
                "The Protégé",
                "Rescued as a child by the legendary assassin Moody and trained in the family business, Anna is the world’s most skilled contract killer. When Moody, the man who was like a father to her and taught her everything she needs to know about trust and survival, is brutally killed, Anna vows revenge. As she becomes entangled with an enigmatic killer whose attraction to her goes way beyond cat and mouse, their confrontation turns deadly and the loose ends of a life spent killing will weave themselves ever tighter.",
                "/o9FY8N5c8CXf22q8s4CmRRjAQJx.jpg",
                "2021-08-19",
                6.8
            )
        )

        return movies
    }

    fun generateRemoteDummyTvShows(): List<TvShowResponse> {
        val tvShows = ArrayList<TvShowResponse>()
        tvShows.add(
            TvShowResponse(
                881,
                "en",
                "Days of Our Lives",
                "The Horton and Brady broods endure the romantic trials of life in Salem, a Midwestern hamlet filled with evil geniuses, star-crossed lovers and a rich family history.",
                "/7Zm7epVFEovMEVLpM6FvrjhaNXn.jpg",
                "1965-11-08",
                6.3
            )
        )
        tvShows.add(
            TvShowResponse(
                1991,
                "en",
                "Rachael Ray",
                "Rachael Ray, also known as The Rachael Ray Show, is an American talk show starring Rachael Ray that debuted in syndication in the United States and Canada on September 18, 2006. It is filmed at Chelsea Television Studios in New York City. The show's 8th season premiered on September 9, 2013, and became the last Harpo show in syndication to switch to HD with a revamped studio. In January 2012, CBS Television Distribution announced a two-year renewal for the show, taking it through the 2013–14 season.",
                "/dsAJhCLYX1fiNRoiiJqR6Up4aJ.jpg",
                "2006-09-18",
                5.3
            )
        )
        tvShows.add(
            TvShowResponse(
                2051,
                "en",
                "The Price Is Right",
                "Come on down! The Price Is Right features a wide variety of games and contests with the same basic challenge: Guess the prices of everyday (or not-quite-everyday) retail items.",
                "/6m4uYFAJwkanZXd0n0HUQ0lYHLl.jpg",
                "1972-09-04",
                6.9
            )
        )
        tvShows.add(
            TvShowResponse(
                2778,
                "en",
                "Wheel of Fortune",
                "This game show sees contestants solve word puzzles, similar to those used in Hangman, to win cash and prizes determined by spinning a giant carnival wheel.",
                "/2fvAIyVfFHQdhJ7OsJWuMlF7836.jpg",
                "1983-09-19",
                7.2
            )
        )
        tvShows.add(
            TvShowResponse(
                2912,
                "en",
                "Jeopardy!",
                "America's favorite quiz show where contestants are presented with general knowledge clues in the form of answers, and must phrase their responses in question form.",
                "/11rWvQOEZBouD7wet0sWHwu7NDs.jpg",
                "1984-09-10",
                7.0
            )
        )
        tvShows.add(
            TvShowResponse(
                90462,
                "en",
                "Chucky",
                "After a vintage Chucky doll turns up at a suburban yard sale, an idyllic American town is thrown into chaos as a series of horrifying murders begin to expose the town’s hypocrisies and secrets. Meanwhile, the arrival of enemies — and allies — from Chucky’s past threatens to expose the truth behind the killings, as well as the demon doll’s untold origins.",
                "/iF8ai2QLNiHV4anwY1TuSGZXqfN.jpg",
                "2021-10-12",
                8.0
            )
        )
        tvShows.add(
            TvShowResponse(
                93405,
                "ko",
                "Squid Game",
                "Hundreds of cash-strapped players accept a strange invitation to compete in children's games—with high stakes. But, a tempting prize awaits the victor.",
                "/dDlEmu3EZ0Pgg93K2SVNLCjCSvE.jpg",
                "2021-09-17",
                7.8
            )
        )
        tvShows.add(
            TvShowResponse(
                113901,
                "es",
                "Maradona: Blessed Dream",
                "The controversial life and history of Argentine football legend Diego Armando Maradona. From his beginnings in Villa Fiorito, one of the poorest barrios of Buenos Aires, to achieving glory on the international football league. Earning himself a well-deserved place in history. Living a life strewn with drugs, sex and public scrutiny, he played by his own rules regardless of the consequences. Watch the man who took the world by storm and made his way into the hearts of millions.",
                "/mGPdWEEmfzP7VQBQsXrFt1b1ikQ.jpg",
                "2021-10-29",
                7.7
            )
        )
        tvShows.add(
            TvShowResponse(
                127235,
                "en",
                "Invasion",
                "Earth is visited by an alien species that threatens humanity’s existence. Events unfold in real time through the eyes of five ordinary people across the globe as they struggle to make sense of the chaos unraveling around them.",
                "/7rpiHZx10Nm50AtzTUEO9eyaKdq.jpg",
                "2021-10-21",
                7.5
            )
        )
        tvShows.add(
            TvShowResponse(
                133372,
                "hi",
                "Meet",
                "A remake of Zee Sarthak’s Sindura Bindu. Despite her efforts to provide for her family, Meets disregard for societal gender norms and her nonconformist job as a delivery agent make her an unsuitable girl in the eyes of her family.",
                "/9X7FovF5n8NQUHUPJYYfxRlF3yp.jpg",
                "2021-08-23",
                3.2
            )
        )

        return tvShows
    }
}