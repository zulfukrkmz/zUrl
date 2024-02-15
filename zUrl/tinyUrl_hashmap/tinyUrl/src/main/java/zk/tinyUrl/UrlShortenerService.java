package zk.tinyUrl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UrlShortenerService {

    private final Map<String, String> urlMappings = new HashMap<>();

    public String shortenUrl(String originalUrl) {
        // Kısaltma işlemi
        String shortUrl = generateShortUrl();

        // HashMap'e ekleme
        urlMappings.put(shortUrl, originalUrl);
        return "http://zUrl.co/su/"+shortUrl;
    }

    public String getOriginalUrl(String shortUrl) {
        // HashMap'ten kısaltılmış URL'e karşılık gelen orijinal URL'i alma
        return urlMappings.get(shortUrl);
    }

    private String generateShortUrl() {
        // UUID kullanarak benzersiz bir kısaltılmış URL üretme
        String shortUrl = UUID.randomUUID().toString().substring(0, 8);
        return shortUrl;
    }
}
