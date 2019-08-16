package com.example.windows.aplikasimakanan;

import java.util.ArrayList;

public class MakananData {
    public static String[] [] data = new String[][]{
            {"SATE", "Sate adalah daging tusuk yang dimasak di atas arang. Sate tusuk dapat dibuat dari ayam, kambing, daging kambing atau kelinci dan biasanya disajikan dengan saus kacang pedas. Namun daging biasanya direndam dalam bumbu rempah sebelum dimasak.", "https://dolanyok.com/wp-content/uploads/2018/11/Makanan-Khas-Indonesia-Sate.jpg"},
            {"GADO-GADO", "Gado-gado adalah semacam salad sayuran khas Indonesia yang terdiri dari sayuran seperti kubis, wortel, kangkung, bayam, dan pare yang mana semua sayuran itu telah direbus. Setelah itu sayuran tersebut dihidangkan bersama dengan tahu goreng dan tempe kemudian lontong atau ketupat.", "https://dolanyok.com/wp-content/uploads/2018/11/Makanan-Khas-Indonesia-Gado-Gado.jpg"},
            {"SOTO", "Soto adalah semacam sup daging tradisional yang terdiri dari bumbu kaldu dan bahan-bahan rempah yang bervariasi di seluruh nusantara. Soto bisa diisi dengan ayam, kambing atau sapi dan disajikan dengan kobis, wortel dan bihun.", "https://i0.wp.com/dolanyok.com/wp-content/uploads/2018/11/Makanan-Khas-Indonesia-Soto.jpg"},
            {"Nasi Rawon", "Nasi Rawon adalah hidangan yang terbuat dari daging sapi rebus dari Jawa Timur. Rawon memiliki rasa pedas dan warna hitam pekat dari penggunaan kacang keluak. Rawon adalah makanan khas Jawa Timur yang kaya akan rasa rempah. Hidangan ini paling enak dinikmati dengan semangkuk nasi dan kerupuk.", "https://dolanyok.com/wp-content/uploads/2018/11/Makanan-Khas-Indonesia-Nasi-Rawon.jpg"},
            {"Mie Aceh", "Mie Aceh merupakan mie pedas khas Aceh. Bahan utama yang digunakan untuk mie tradisional ini  yaitu mie kuning atau mie telor. Mie aceh disajikan dengan irisan daging kambing atau sapi, namun juga ada yang mengkombinasikan dengan makanan laut seperti kepiting, udang atau cumi. Mie ini disajikan bersama sup kari yang gurih dan pedas.", "http://informazone.com/wp-content/uploads/2019/05/mie-aceh-qraved.com_.jpeg"},
            {"Lempah Kuning", "Lempah kuning merupakan nama umum yang digunakan untuk nama masakan khas ini. Namun untuk menekankan jenis bahan utama yang digunakan, masakan ini sering disebut juga lempah laut. Karena proses memasak ikan tersebut harus menggunakan nanas, maka lempah nanas pun sering menjadi sebutan untuk masakan ini.", "http://informazone.com/wp-content/uploads/2019/05/Resep-Tenggiri-lempah-kuning-resepkoki.id_.jpg"},
         };
    public static ArrayList<Makanan> getListData(){
        ArrayList<Makanan> list = new ArrayList<>();
        for (String[] aData : data){
            Makanan makanan = new Makanan();
            makanan.setName(aData[0]);
            makanan.setFrom(aData[1]);
            makanan.setPhoto(aData[2]);
            list.add(makanan);
        }
        return list;
    }
}
