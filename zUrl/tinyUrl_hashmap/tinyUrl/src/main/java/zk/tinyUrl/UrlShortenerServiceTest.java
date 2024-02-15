package zk.tinyUrl;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UrlShortenerServiceTest {

    @Test
    public void shortenUrl_ShouldReturnShortenedUrl() {
        //shorturl beklentimiz gibi short url prefix ile baslıyor mu kontrolü
        UrlShortenerService urlShortenerService = new UrlShortenerService();
        String originalUrl = "http://example.com";

        String shortUrl = urlShortenerService.shortenUrl(originalUrl);

        assertThat(shortUrl).isNotNull().startsWith("http://zUrl.co/su/");
    }

    @Test
    public void getOriginalUrl_ShouldReturnOriginalUrl() {
        //orjinal url ile short url'in yönlendirdiği url aynı mı kontrolü
        UrlShortenerService urlShortenerService = new UrlShortenerService();
        String originalUrl = "http://example2.com";
        String shortUrl = urlShortenerService.shortenUrl(originalUrl);
        String[] splitArray = shortUrl.split("zUrl.co/su/");
        String uuidval= splitArray[1];

        String retrievedUrl = urlShortenerService.getOriginalUrl(uuidval);

        assertThat(retrievedUrl).isEqualTo(originalUrl);
    }
}
