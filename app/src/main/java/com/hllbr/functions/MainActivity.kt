package com.hllbr.functions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*

        Functions  && Classes == biz her zaman en az bir fonksiyon kullanıyoruz kodlarımızda örnek vermek gerekirsde main/oncrate ... şeklinde örnekler arttırılabilir.

        OnCreate bizim için derleyici tarafından hazır yazılmış bizim üzerinde ekelemeler yapabildiğimiz bir fonksiyon oalrka karşımıza çıkyıor bunun dışında Android studio/NetbeaNS/eCLİPS vb derleyicilerde de bizim için hazırlanmış fonksiyon/fonksiyonlar bulunmakta

        istersek kendimizide fonksiyonlar yazabiliriz veya hazır fonksiyonlar üzerinde gerekli değişiklikleri yaparak kodlarımız<ı derleyebilir(Çalıştırabiliriz).

        App çalıştırıldığında(Mobil uygulama için ) ilk çağrılan fonksiyon OnCreate fonksiyonudur.

        Uygulama .alıştırıldığında daha kullanıcı görmeden çalıştırılan alanımız OnCreate

        Fonksiyonun en büyük avantajı istediğimiz kodu istediğimiz yerde/zamanda çalıştırma imkanı sunuyor olması en büyük avantajımız diyebiliriz.

        Kodların düzenli olması açısındanda büyük önem taşıyor.Clear Code için kritik önem taşıyor


         */
        test()

        mySum(6,7)
    }

    //Kotlinde fonksiyon yazımı ==
    fun test() {
        //Test isimli bir fonksiyon oluştur ve buaraya yazdığım herşeyi test fonksiyonu çağrıldığında yap.Çağrılması demek onCreate yada başka bir yapı içerisinde test ibaresinin kullanılması oalrak düşünülebilir.
        println("test called")
        println("*****")
        println("test function")
        //Fonksiyonu oluşturduğumda bir yerde çağırmam gerekiyor onCreate altında yada başka bir yapı içersinde yok yazmış odluğum fonksiyon pasif durumda ve işlevsiz şekilde bekleyecek ve hiçbir zaman devreye alınmayacaktır.

        //Fonksiyonların en önemli avantajlarından biri girdi verip çıktı alabiliyor olmamız.INPUT/OUTPUT-INPUT/RETURNING gibi işlemler yapabiliyoruz

    }

    //input && return
    fun mySum(a: Int, b: Int) {//Toplama fonksiyonum}
        println(a + b)
    textView.text = "Result : ${a+b}"
        //şuan ben bir sonuç alıyorum fakat bir sonuç döndürmüyorum
        

    }
}
//Kotlinde Unit == Boşluk anlamına geliyor.Javada Void kelimesi bu iş için kullanılırken Kotlinde Unit kelimesi bu işi ifade etmek için kullanılıyor
//Bu ifadelerin anlamı bu fonksiyon herhangi birşey döndürmüyor demek
//Unit(Kotlin) == Void(Java)
