Giriş

Projem bir restoranın sipariş alma sürecini dijital ortamda yönetmeye yönelik bir mobil
uygulama geliştirmeyi amaçlamaktadır. Uygulama kullanıcıların restoran menüsünü
görüntülemelerine, masa seçimi yapmalarına, sipariş vermelerine ve siparişlerini
onaylamalarına olanak tanır. Bu rapor uygulamanın tasarımından geliştirilmesine kadar olan
süreci açıklamakta ve kullanılan teknolojiler ile karşılaşılan zorlukları ele almaktadır.

Kullanılan Teknolojiler

Uygulama Android Studio platformunda geliştirilmiş olup, Java programlama dili ve XML
tabanlı kullanıcı arayüzü tasarımı kullanılmıştır. Android Studio Android uygulamaları
geliştirmek için kullanılan en yaygın entegre geliştirme ortamıdır (IDE). Java dili
uygulamanın temel işlevselliğini sağlarken, XML dosyaları ise uygulamanın kullanıcı
arayüzünü oluşturmak için kullanılmıştır.

Uygulama Tasarımı

Uygulama kullanıcı deneyimini basitleştirmeyi ve restoran siparişlerini kolayca yönetebilmeyi
hedeflemektedir. Ana ekran kullanıcıların belirli masaları seçmesini ve ardından restoranın
menüsünü görüntülemelerini sağlar. Her masa için bir Button elemanı kullanılmıştır ve her
butonun metni strings.xml dosyasından dinamik olarak alınmaktadır. Bu sayede dil desteği
eklemek veya metinleri güncellemek gerektiğinde kolayca değişiklik yapılabilir.
Ana ekranın düzeni LinearLayout kullanılarak dikey bir şekilde sıralanmıştır. Butonlar ve
metinler wrap_content genişlik ve yükseklik değerleriyle yerleştirilmiştir. Tüm öğeler ekranın
ortasında hizalanarak kullanıcı dostu bir deneyim sağlanmıştır. Uygulama tasarımında sade ve
anlaşılır bir arayüz sunulmuş, kullanıcılara karmaşık olmayan bir işlem yapma kolaylığı
sağlanmıştır.

Menü Sayfası

Uygulamanın bir diğer önemli özelliği menü sayfasıdır. Kullanıcılar, ana ekran üzerinde bir
masa seçtiklerinde menü sayfasına yönlendirilirler. Menü sayfası, restoranın sunduğu
yemekleri listeleyen ve her yemek için ayrı bir seçenek sunan bir ekran tasarımına sahiptir.
Menü öğeleri strings.xml dosyasından dinamik olarak alındığı için içerikler kolayca
güncellenebilir ve dil desteği eklenmesi mümkündür. Kullanıcılar bu sayfada istedikleri
yemekleri seçebilir ve siparişlerini oluşturabilirler.

Kullanıcı Arayüzü ve Deneyimi

Uygulama kullanıcı dostu bir arayüzle tasarlanmıştır. Her bir buton ve etkileşimli alan
kullanıcıların rahatça erişebileceği şekilde konumlandırılmıştır. Arka plan renkleri ve öğelerin
yerleşimi de kullanıcı deneyimini iyileştirmek amacıyla titizlikle seçilmiştir. Butonlar menü
öğeleri ve diğer görseller, kullanıcıların hızlı ve rahat bir şekilde işlem yapabilmesi için uygun
şekilde yerleştirilmiştir.
Ayrıca uygulamanın ekran boyutlarına göre uyumlu olması için ConstraintLayout gibi esnek
düzen bileşenleri kullanılmıştır. Bu, uygulamanın farklı cihazlarda sorunsuz çalışmasını
sağlayacak şekilde tasarımın yapılmasına olanak tanır.

Veri Yönetimi
Uygulamanın veri yönetimi için strings.xml dosyası kullanılmıştır. Bu dosya tüm metin
içeriklerini depolar ve bu içeriklerin uygulamanın çeşitli ekranlarında dinamik olarak
kullanılmasını sağlar. Örneğin, menü öğeleri ve masa isimleri gibi sabit metinler strings.xml
dosyasına yerleştirilmiş, böylece metinlerin gerektiğinde değiştirilmesi veya farklı dillere
çevrilmesi kolaylaştırılmıştır.
