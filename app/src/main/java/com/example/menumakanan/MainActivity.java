package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> FotoMakanan = new ArrayList<>();
    private ArrayList<String> NamaMakanan = new ArrayList<>();
    private ArrayList<String> InfoMakanan = new ArrayList<>();
    private ArrayList<String> HargaMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(FotoMakanan, NamaMakanan, InfoMakanan, HargaMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void getDataFromInternet(){
        NamaMakanan.add("Rendang Padang");
        FotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Rendang-padang.jpg");
        InfoMakanan.add("Makanan yang sangat popular di Indonesia bahkan di dunia adalah rendang. Rendang merupakan makanan khas dari padang yang memiliki rasa begitu menggugah selera. Bahan yang digunakan untuk membuat makanan ini adalah daging sapi yang dimasak lama dengan bumbu rempah yang kaya. Anda tentu saja sudah sangat mengenal rasa dari rendang karena banyak dijual dirumah makan padang, restoran modern bahkan banyak restoran luar negeri yang juga menjual makanan ini.");
        HargaMakanan.add("Harga : Rp 45.000");

        NamaMakanan.add("Gudeg Jogja");
        FotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Gudeg-jogja-enak.jpg");
        InfoMakanan.add("Makanan khas dari kota jogja ini juga merupakan salah satu makanan khas nusantara yang sangat banyak digemari oleh masyarakat di Indonesia. Anda yang merupakan masyarakat jogja tentu saja sudah sangat mengenali bagaimana cita rasa dari makanan yang satu ini. Bahan yang digunakan untuk membuat gudeg adalah nangka muda yang dimasak dengan rempah yang lengkap dan juga diberi gula merah sehingga rasanya manis.");
        HargaMakanan.add("Harga : Rp 30.000");

        NamaMakanan.add("Pempek Palembang");
        FotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Pempek-palembang.jpg");
        InfoMakanan.add("Makanan khas Palembang yang sering disebut dengan pempek ini juga merupakan makanan yang sangat terkenal di kalangan masyarakat Indonesia baik di wilayah Palembang atau di daerah lain. Kelezatan dari pempek sudah sangat terkenal dan juga banyak sekali pedagang di jawa yang menjual makanan ini. Pempek terbuat dari ikan dan tepung kemudian dinikmati dengan kuah cuka yang dicampur gula dan garam sedikit.");
        HargaMakanan.add("Harga : Rp 50.000");

        NamaMakanan.add("Mie Kocok Bandung");
        FotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Mie-kocok-bandung.jpg");
        InfoMakanan.add("Makanan pertama yang menjadi salah satu makanan khas dari negara ini adalah mie kocok bandung. Mie kocok merupakan makanan khas dari kota bandung yang memiliki rasa segar, gurih, dan juga nikmat. Salah satu mangkuk mie kocok anda akan menemukan beberapa bahan makanan seperti mie gepeng, sayur tauge, dan juga potongan kikil.");
        HargaMakanan.add("Harga : Rp 25.000");

        NamaMakanan.add("Ayam Betutu Bali");
        FotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/ayam-betutu-bali.jpg");
        InfoMakanan.add("Makanan ini sangat khas Indonesia karena kaya akan rempah-rempah. Cara masak ayam ini sangat unik sehingga menjadikan rasanya terasa berbeda dengan makanan dengan bahan ayam lainnya. Cara memasak ayam betutu ini adalah dengan ayam utuh yang di beri bumbu special kemudian dibakar. Makanan ini merupakan makanan khas dari pulau bali. Rasa ayam yang lembut dan juga kaya akan rempah akan membuat pengalaman anda selama di bali semakin terasa lengkap dan tak terlupakan.");
        HargaMakanan.add("Harga : Rp 60.000");

        NamaMakanan.add("Bika Ambon");
        FotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/04/bika-ambon-sumatera-utara.jpg");
        InfoMakanan.add("Jika Aceh mendunia dengan mienya, berbeda lagi dengan Sumatera Utara yang populer dengan bika ambon. Yakni sejenis kue dengan rasa yang sangat lezat. Bika ambon bahkan juga dijual dengan beberapa varian rasa terbaik, seperti keju hingga durian.");
        HargaMakanan.add("Harga : Rp 55.000");

        NamaMakanan.add("Gulai Ikan Patin");
        FotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/04/gulai-ikan-patin-jambi.jpg");
        InfoMakanan.add("da makanan khas daerah Jambi, dengan nama gulai iakan patin. Masakan yang satu ini sangat populer di tengah masyarakat Jambi dan sekitarnya. Dengan menggunakan daging buah durian yang telah difermentasi, gulai ikan akan dimasak hingga matang dengan rasa yang dijamin bikin ketagihan.");
        HargaMakanan.add("Harga : Rp 60.000");

        prosesRecyclerViewAdapter();
    }
}