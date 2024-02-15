1- projede default tomcat hostu olan localhost yerine zurl.co isimli ürettiğim bir eğitim amaçlı url prefix'i çalışması için;
Windows/System32/drivers/etc içerisindeki host dosyasına, yönetici olarak çalıştırılıp en altına 
127.0.0.1   zUrl.co
eklenerek yönlendirme sağlanır.
(browser'da zurl.co olarak görünecektir.)
2- projede TinyUrlApplication isimli sınıf springboot application'dır. O run edilerek proje başlatılmalıdır.
3- UrlShortenerServiceTest sınıfı unit-test sınıfıdır. IDE'den veya mvn komutuyla çalıştırılabilir.
4- Url'ler ve short url'ler hashmap içerisinde tutulmaktadır.
5- apiler "http://zurl.co/swagger-ui/index.html" adresinde otomatik dökümante edilmektedir.
6- http://zUrl.co/api/url/shorten url'ine request body'de raw olarak örnek "https://tr.wikipedia.org/wiki/Mustafa_Kemal_Atat%C3%BCrk" 'i iletildiğinde
aynısı olmayacak ancak benzer formatta "http://zUrl.co/su/948b464c" benzeri bir url döner. 
7- "http://zUrl.co/su/948b464c" benzeri url'i browser'dan çağırdığınızda kısa url sizi orijinal url'e götürecektir.
