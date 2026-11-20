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
1.Başla
2.i=1,poz=0,neg=0,tek=0,cift=0,toplam=0,enbuyuk==,enkucuk=0, tanimla ayrica sayi ort sayitaslak diye bos degiskenler olustur
3.Ekrana kacinci sayi oldugunu yazip kullanıcıdan bir sayi girmesini iste (0 girerse bitecegini soyle=
4.Eger kullanici ilk seferde 0 gitdiyse ekrana  "Hata! Hic sayi girmeden 0 giremezsiniz" yaz ve donguden cik.
5.Girilen saiyi toplam degiskenine ekle
6.Eger sayi 0dan buuykse poz degiskenini 1 arttir.
7.Eger sayi 0 ise ve bu ilk sayi degilse ekrana "Sayi gitme islemleriniz bitmsitir" yaz ve donguden cik
8. Eger sayi 0dan kucukse neg degiskenini 1 arttir.
9.Sayinin 2ye bolumunden kalan 0 ise cifti 1 artir degilse teki 1 artir
10.Eger ilk sayi gitildiyse en buyuk ve enkucuk sayiyi bu sayiaya esitle
11.sayi enbuyukten buyukse yeni enbuuyk sayi bu olsun
12.sayi en kucuk sayidan kucukse yeni en kucuk sayi bu olsun
13.sayac olan iyi 1 arttir
14.Asal kontorlu icin asal=true yap sayi 2den kucukse asal false yap degilse 2den sayiya kadar olan sayilarin sayiya bolunup bolunmedigine bak bolunurse asal false yap
15.mukemmel sayi kontrolu icin mukemmel=false yap sayi 0dan buyukse kendisi haric bolumlerini topla toplam sayiya esitse mukemmel=true yap
16. basamak bulmak icin sayiyi sayitaslak degiskenine kopyala ve basamak=0 yap
17.sayitaslaki surekli 10a bol ve her bolmede bsamak degiskenini 1 arttir. (sayitaslak 0 olanan kadar tekrarla)
18.Ekrana ozel sayi analizi basligini yaz, sayinin mukemmel olup olmadigini,asal olup olmadigini ve basamak sayisini yaz
19.kullanici 0 girmedigi surece 3.adima geri don
20.dongu bitince toplam girilen sayi adedine i-1 i bol ve ortalamayi bul
21.ekrana sayi analizi yazip kac tane poziitf,negatif,tek,cift sayi oldugunu , en kucuk sayiyi,en buyuk sayiyi ,toplami ve ortalamayi altata yazdir
22.bitir
```

## 4. Akış Şeması

![Akış Şeması](src/akissemasisayianaliz.pdf)

## 5. Test Senaryoları (en az 8)

| No | Girilen sayılar | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 |1 2 3 4 5 0 |  5 tanesi pozitif  0 tanesi negatift 3 tanesi tektir 2 tanesi cifttir en kucuk sayi 1 en buyuk sayi 5  toplami:15 ortalamasi:3.0|(aynisi)|evet |
| 2 |0 |!! Hata !! Hic sayi girmeden direkt 0 giremezsiniz! | !! Hata !! Hic sayi girmeden direkt 0 giremezsiniz!| evet|
| 3 |3 -3 -3 3 0  |2 negatif 2 pozitif 4tek 0 cift en kucuk -3 en buyuk 3 toplami 0 ortalama 0 |aynisi |evet |
| 4 |5 5 10 15 15 0 |5 pozitif 0 negatik 4cift 1 tek en kucuk 5 enbuyuk 15 toplami 50 ortalama 10  |aynisi |evet |
| 5 |-1 2 3 -4 |2 negatif 2 pozitif 2 tek 2 cift enkucuk -4 en buyuk 3 toplami 0 ortalama0 |aynisi |evet |
| 6 |1 3 4 0 |0 negatik 3 pozitif 2 tek 1 cift en kucuk 1 en buyuk 4 toplam 8 ortalama 2.66666666667 |ortalama dısında aynı (2)|kısmen |
| 7 |-11 17 24 0 |1 negatif 2 pozitif 2 tek 1 cift enkucuk -11 en buyuk 24 toplam 30 ortalama 10 |aynısı |evet |
| 8 |-10 -25 -40 0  |3 negatif  0 pozitif 1 tek 2 cift en kuck -40 en buyuk -10 toplam -75 ortalama -25 |aynısı |evet |

## 6. Ek Görevler (Opsiyonel)
<!-- Max-min farkı, pozitiflerin ortalaması, asal sayı adedi için örnek çıktılar. -->

