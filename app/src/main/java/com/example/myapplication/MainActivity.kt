package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var yenibirstring: String
        yenibirstring="5"

        var baskabirstring: String
        baskabirstring="7"

        println (yenibirstring+baskabirstring)

        println("---------Boolean---------")

        var benimboolean= true
        benimboolean= false

        println(3<5)

        println("---------Dönüştürme---------")

        val kullanicigirdisi="20"
        val intecevir= kullanicigirdisi.toInt()
        println(intecevir)

        //koleksiyonlar
        //Array-dizi
        println("---------Dizi---------")
        val kelimestring="ali"

        val benimDizim= arrayOf(kelimestring,"Şilan","Boran","Murat","Karabulut")
        //index
       println(benimDizim[0])
        println(benimDizim[4])
        println(benimDizim.get(3))

        benimDizim[2]="ilayda"
        println(benimDizim.get(2))

        benimDizim.set(4,"kerem")
        println(benimDizim.get(4))

        val numaraDizisi= doubleArrayOf(1.0,2.0,3.1254)
        println(numaraDizisi.get(2))

        val karisikDizi= arrayOf("Şilan",12,125.32,true)
        println(karisikDizi.get(3))
        println(karisikDizi[3])
        println("---------DiziListesi---------")//ArrayList
        val isimListesi= arrayListOf<String>("Ali","Mehmet","Şilan","Ayşe")

        isimListesi.add(2,"kadir")
        isimListesi.add("mehmet")
        println(isimListesi.get(5))
        println(isimListesi.size)

        val karisikArrayList= arrayListOf<String>()

        println("---------Set---------")
        val benimSet= setOf<Int>(7,8,9,10,11,12,7,8,9)
        println(benimSet.size)
        //for each
        benimSet.forEach {
            println(it)

        }

        val digerset= HashSet<String>()
        digerset.add("Mehmet")
        digerset.add("Şilan")
        digerset.add("Şilan")
        digerset.add("Şilan")
        digerset.add("Ali")
        digerset.add("Şilan")
        digerset.add("Şilan")
        digerset.add("Boran")

        digerset.forEach {
            println(it)
        }
        //Map-Harita

        println("---------Map---------")
        // Anahtar kelime - Değer( key- value pairing)

        val YemekDizisi= arrayOf("Elma","Et","Tavuk")
        val KaloriDizisi= arrayOf(10,20,30)

        println("${YemekDizisi[0]}'nın kalorisi: ${KaloriDizisi[0]}" )

        val yemekKaloriMap= hashMapOf<String,Int>()
        yemekKaloriMap.put("Elman",5)
        yemekKaloriMap.put("Ekmek",45)
        println(yemekKaloriMap.get("Elma"))

        val benimMapim= HashMap<String,String>()
        benimMapim.put("Örnek","Değer")

        val yeniMap= hashMapOf<String,Int>("Şilan" to 40,"Örnek" to 50)
        println(yeniMap.get("Örnek"))

        //Matematiksek İşlemler
        println("---------Matematiksel İşlemler--------")

        var sayi=8
        println(sayi)
        sayi= sayi+1
        println(sayi)

        sayi++
        println(sayi)
        sayi--
        println(sayi)

        var digerSayi=10
        println(digerSayi> sayi)
        //&& --> ve
        // || --> veya
        println(digerSayi>sayi && 2>3)
        println(digerSayi>sayi || 2>3)

        println(8+7)
        println(9*7)
        println(8/2)

        // Remainder- Kalanı Bulmak
        println(10%3)

        //if kontrolleri
        println("---------if kontrolleri (eğer kontrolleri)--------")

        val skor =40
        if (skor<11){
            println("Oyunu kaybettin")
        }
        else if (skor>=10 && skor<20 ){
            println("Oyunu kazandın")
        }
        else if (skor>=20 && skor <30){
            println("rekorlar kırıyorsun")
        }
        else{
            println("skorun 30 un üstünde efsanesin")
        }

        //When-ne zaman - switch
        println("---------When--------")
        // else if çok olunca kullanırız.

        var notRakami=0
        var notStringi=""

        when (notRakami){
            0 -> notStringi="Geçersiz Not"
            1 -> notStringi="zayıf"
            2 -> notStringi="kötü"
            3 -> notStringi="orta"
            4 -> notStringi="iyi"
            5 -> notStringi="pekiyi"
        }

        /*
        if (notRakami==0){
            notStringi="geçersiz not"

        }
        else if(notRakami==1){
            notStringi="zayıf"
        }
        else if(notRakami==2){
            notStringi="kotü"
        }
        else if(notRakami==3){
            notStringi="orta"
        }
        else if(notRakami==4){
            notStringi="iyi"
        }
        else{
            notStringi="pekiyi"
        }
        */

        println(notStringi)
        // when ile yaptığımızda if ile yaptığımızda aynı sonucu verecektir.

        //Döngüler
        println("---------For döngüsü--------")
        val baskanumaraDizisi= arrayOf(5,10,15,20,25,30)
        val q = baskanumaraDizisi[0]/5+3
        println(q)
         println("döngü başladı")
        for (numara in baskanumaraDizisi)// baskanumaradizisindeki rakamları numaraya aktarıldı.
        {
            println(numara/5 +3)
        }
        println("döngü bitti")

        for (index in baskanumaraDizisi.indices){
            println(index)
        }

        for (b in 0..9)// 0 dan 9 a bütün rakamlar
        {
            println(b)
        }

        val benimDigerString= ArrayList<String>()
        benimDigerString.add("Şilan")
        benimDigerString.add("Boran")
        benimDigerString.add("Taha")

        for (isimlerim in benimDigerString){
            println(isimlerim)
        }

        benimDigerString.forEach{
            println(it)
        }
        //While
        println("---------While döngüsü--------")

        var j=0

        while (j<10){
            println(j)
            j=j+1

        }




    }
}