package com.example.makananindonesia;

import java.util.ArrayList;

public class FoodsData {
    private static String[] foodNames = {
            "Bakso",
            "Gado-gado",
            "Gudeg",
            "Kerak Telor",
            "Nasi Rawon",
            "Pempek",
            "Rendang",
            "Sate",
            "Sop Buntut",
            "Soto"
    };

    private static String[] foodDetails = {
            "Salah satu makanan jalanan terbaik di Indonesia, adalah bakso. Bakso adalah makanan yang begitu lunak dan kenyal, terbuat dari daging ayam atau sapi atau bahkan kombinasi dari keduanya. Anda biasanya akan disajikan bakso dengan beberapa mie telur, bihun, telur rebus, tahu, beberapa cabe dan beberapa bawang goreng.\n" +
                    "\n" +
                    "Tuangkan sedikit kecap manis untuk lebih menikmati hidangan favorit yang lezat ini. Bahkan saat mantan Presiden Amerika Serikat, Barack Obama mengunjungi Indonesia, ia mengklaim bakso adalah salah satu makanan favoritnya di Indonesia!",
            "Gado-gado adalah semacam salad sayuran khas Indonesia yang terdiri dari sayuran seperti kubis, wortel, kangkung, bayam, dan pare yang mana semua sayuran itu telah direbus. Setelah itu sayuran tersebut dihidangkan bersama dengan tahu goreng dan tempe kemudian lontong atau ketupat.\n" +
                    "\n" +
                    "Hidangan tersebut lalu disiram dengan saus kacang pedas manis. Gado-gado juga hadir dalam berbagai variasi, sesuai dengan pilihan sayuran yang digunakan.",
            "Gudeg adalah hidangan dalam masakan Indonesia yang membutuhkan sedikit kesabaran. Makanan khas Yogyakarta ini sedikit manis, karena menggunakan buah nangka manis sebagai bahan utamanya.\n" +
                    "\n" +
                    "Buah ini direbus dalam campuran santan, gula aren dan bumbu khas Yogyakarta selama beberapa jam hingga menghasilkan hidangan yang sangat lembut. Gudeg adalah pilihan yang bagus untuk Anda seorang vegetarian.\n" +
                    "\n" +
                    "Gudeg akan disajikan dengan beberapa daging ayam atau kulit sapi goreng untuk sedikit tambahan protein. Hidangan ini juga bagus jika disajikan dengan nasi dan telur rebus.",
            "Kerak telor adalah hidangan yang dimiliki oleh masyarakat Betawi. Betawi adalah kelompok etnis asli Jakarta dan daerah sekitarnya. Nah, untuk mencari kerak telor sendiri sangatlah mudah karena jika Anda berada di Jakarta Anda akan sering menemukannya di area Kota Tua dan Monas.\n" +
                    "\n" +
                    "Makanan tradisional ini semacam nasi goreng yang dimasak di atas arang dan dibuat dari ketan dan telur. Hidangan  berbentuk omelet ini biasanya diisi dengan bawang goreng dan kelapa parut. Anda dapat meminta kerak telor Anda untuk dimasak dengan telur ayam atau telur bebek. Pilihlah bebek untuk rasa yang lebih tidak biasa, lebih berlemak dan lebih lezat.\n" +
                    "\n" +
                    "Anda harus mengunjungi Pasar Baru Jakarta untuk mencoba beberapa makanan Betawi, Jawa, dan bahkan Aceh yang paling nikmat! Menikmati wisata kuliner di Jakarta adalah salah satu hal utama yang harus dilakukan di Jakarta.",
            "Nasi Rawon adalah hidangan yang terbuat dari daging sapi rebus dari Jawa Timur. Rawon memiliki rasa pedas dan warna hitam pekat dari penggunaan kacang keluak. Rawon adalah makanan khas Jawa Timur yang kaya akan rasa rempah. Hidangan ini paling enak dinikmati dengan semangkuk nasi dan kerupuk.\n" +
                    "\n" +
                    "Rawon sendiri berbahan dasar dari daging sapi yang direbus lama dengan kacang keluak untuk memberikan rasa pedas dan warna hitam pekat.\n" +
                    "\n" +
                    "Setelah rawon ditambahkan dengan bawang putih, bawang merah, jahe, kunir dan cabe merah untuk membuatnya enak dan pedas.",
            "Hidangan pempek adalah makanan khas Palembang. Konon nama pempek berasal dari seorang pria Tionghoa yang pertama kali menyajikan makanan di Palembang, Sumatera Selatan. Pempek adalah makanan yang terbuat dari ikan dan tepung tapioka.\n" +
                    "\n" +
                    "Makanan yang enak dan murah ini tersedia dalam berbagai rasa, bentuk dan ukuran. Variasi yang paling populer disebut kapal selam, isinya termasuk telur di tengah. Taburkan pempek Anda dengan beberapa bubuk udang dan celupkan ke dalam saus pempek. Saus pempek sendiri terbuat dari cuka, cabe dan gula yang khas.",
            "Jika Anda penggemar kari, Anda pasti menyukai semangkuk rendang daging sapi. Makanan Indonesia ini lebih seperti kari daging sapi, tetapi tanpa kaldu. Rendang terbuat dari daging sapi yang perlahan dimasak dalam saus santan dan rempah-rempah selama beberapa jam.\n" +
                    "\n" +
                    "Rendang sapi bukan sesuatu yang Anda akan temukan di mana saja, karena dibutuhkan kesabaran dan keterampilan untuk membuat rendang daging sapi yang enak. Rendang yang enak bisa Anda temukan  di wilayah Padang Sumatera Barat dan biasanya disajikan dengan nasi.",
            "Sate adalah daging tusuk yang dimasak di atas arang. Sate tusuk dapat dibuat dari ayam, kambing, daging kambing atau kelinci dan biasanya disajikan dengan saus kacang pedas. Namun daging biasanya direndam dalam bumbu rempah sebelum dimasak.\n" +
                    "\n" +
                    "Anda dapat menemukan hidangan lezat ini di mana saja karena berbagai daerah Indonesia hampir menyediakan tempat makan yang menjual sate. Anda pasti akan senang dengan masakan sate bumbu kacang khas Madura ini setelah gigitan pertama Anda. Sate paling nikmat dimakan dengan lontong.",
            "Sop buntut adalah salah satu sop daging yang lezat. Makanan khas nusantara ini kebanyakan ditemukan di Jawa Barat dan terdiri dari irisan ekor sapi yang digoreng atau dibakar dalam kuah yang jernih.\n" +
                    "\n" +
                    "Hidangan ini umumnya dibumbui dengan bawang merah, bawang putih, lada, pala dan cengkeh.  Selain ekor sapi, sop buntut ini juga terdiri dari beberapa sayuran lezat yang dapat ditambahkan seperti kentang rebus, wortel, tomat, seledri, daun bawang dan bawang merah. Untuk benar-benar mendapatkan rasa yang segar, peras sedikit jeruk nipis atau lemon di atas sup buntut.",
            "Soto adalah semacam sup daging tradisional yang terdiri dari bumbu kaldu dan bahan-bahan rempah yang bervariasi di seluruh nusantara. Soto bisa diisi dengan ayam, kambing atau sapi dan disajikan dengan kobis, wortel dan bihun.\n" +
                    "\n" +
                    "Tidak lupa soto ini biasanya ditaburi dengan bawang merah renyah dan bawang putih goreng, kecap sambal dan perasan jeruk nipis untuk memperlezat hidangan berkuah ini. Jika Anda adalah orang yang suka pedas, akan terasa lebih nikmat jika menambahkan banyak sambal di atas kuahnya yang berwarna kuning."

    };

    private static int[] foodsImages = {
            R.drawable.bakso,
            R.drawable.gado_gado,
            R.drawable.gudeg,
            R.drawable.kerak_telor,
            R.drawable.nasi_rawon,
            R.drawable.pempek,
            R.drawable.rendang,
            R.drawable.sate,
            R.drawable.sop_buntut,
            R.drawable.soto
    };

    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++){
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodsImages[position]);
            list.add(food);
        }
        return list;
    }
}