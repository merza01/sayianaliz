# Rapor

**Ad Soyad:** Merza Züleyha Kulus
**Numara:**      690

## 1. Algoritma Açıklaması
İlk başta degiskenlerin cogunu olusutururuz. Sonra do dongusu kullanıp kullanıcıdan bir sayi alırız ve onun direkt 0 girilip girilmedigini,sayi analizi yapmak icin cift,tek v.b. hesaplarız sonra ozel sayi analizi icin asal sayı be mukemmel sayi ollup olmadigini hesaplariz ve onceki problemlerde yaptıgımız gibi basamak sayisini buluruz. hesapalamalr bitince her sayi basina ozel sayi analizini veririz. sonra donguyu kapatiriz(dongu 0 girilene kadar calısır) donguyu kapadıktan sonra ortalamayı hesaplarız, kullanıcıya sayi analizleri cıktısını veririz.


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
1,2,3,4,5 sonda 0

**İşlemler:**
asal sayi bulma,basamak hesaplama,mukemmel sayi olup olmadigini bulma vb

**Çıktılar:**
(her sayinin ozel analizi) ve 
Sayi girme islemleriniz bitmistir.
-> SAYI ANALIZI <-
Girdiginiz sayilardan 5 tanesi pozitiftir.
Girdiginiz sayilardan 0 tanesi negatiftir.
Girdiginiz sayilardan 3 tanesi tektir.
Girdiginiz sayilardan 2 tanesi cifttir.
Girdiginiz sayilardan en kucuk sayi 1
Girdiginiz sayilardan en buyuk sayi 5
Girdiginiz sayilarin toplami:15
Girdiginiz sayilarin ortalamasi:3.0

## 3. Sözde Kod (Pseudocode)

```
1.
2.
3.
```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Senaryoları (en az 8)

| No | Girilen sayılar | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 |1 2 3 4 5 0 |  5 tanesi pozitif  0 tanesi negatift 3 tanesi tektir 2 tanesi cifttir en kucuk sayi 1 en buyuk sayi 5  toplami:15 ortalamasi:3.0|(aynisi)|evet |
| 2 |0 |!! Hata !! Hic sayi girmeden direkt 0 giremezsiniz! | !! Hata !! Hic sayi girmeden direkt 0 giremezsiniz!| evet|
| 3 |3 -3 -3 3 0  |2 negatif 2 pozitif 4tek 0 cift en kucuk -3 en buyuk 3 toplami 0 ortalama 0 |aynisi |evet |
| 4 |5 5 10 15 15 0 |5 pozitif 0 negatik 4cift 1 tek en kucuk 5 enbuyuk 15 toplami 50 ortalama 10  |aynisi |evet |
| 5 |-1 2 3 -4 |2 negatif 2 pozitif 2 tek 2 cift enkucuk -4 en buyuk 3 toplami 0 ortalama0 |aynisi |evet |
| 6 |1 3 4 0 |0 negatik 3 pozitif 2 tek 1 cift en kucuk 1 en buyuk 4 toplam 8 ortalama 2.66666666667 |ortalama dısında aynı (2)|kısmen |
| 7 | | | | |
| 8 | | | | |

## 6. Ek Görevler (Opsiyonel)
<!-- Max-min farkı, pozitiflerin ortalaması, asal sayı adedi için örnek çıktılar. -->

