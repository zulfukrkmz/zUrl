package zk.tinyUrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class UrlShortenerController {

    @Autowired
    private UrlShortenerService urlShortenerService;

    @PostMapping("/api/url/shorten")
    public String shortenUrl(@RequestBody String originalUrl) {
        return urlShortenerService.shortenUrl(originalUrl);
    }

    @GetMapping("/su/{shortUrl}")
    public RedirectView redirectToOriginalUrl(@PathVariable String shortUrl) {
        String originalUrl = urlShortenerService.getOriginalUrl(shortUrl);
        if (originalUrl != null) {
            return new RedirectView(originalUrl);
        } else {
            // Belirli bir hata durumu için yönlendirme
            return new RedirectView("/customErrorPage");
        }
    }
}
