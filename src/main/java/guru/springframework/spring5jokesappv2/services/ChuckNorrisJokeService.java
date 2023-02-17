package guru.springframework.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokeService implements JokeService {

    private final ChuckNorrisQuotes quotesGenerator;

    public ChuckNorrisJokeService(ChuckNorrisQuotes quotesGenerator) {
        this.quotesGenerator = quotesGenerator;
    }

    @Override
    public String getJoke() {
        return quotesGenerator.getRandomQuote();
    }

}
