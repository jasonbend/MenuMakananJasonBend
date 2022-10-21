package scwarzcopv.mobile.menumakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Menu_Daftar_Makanan extends AppCompatActivity {

    ListView lvItem;
    ListViewAdapterCall adapter;
    ArrayList<ListViewAdapterMenu> arraylist = new ArrayList<ListViewAdapterMenu>();

    int[] Gambar;
    String[] NamaItem;
    String[] HargaItem;
    String[] Deskripsi;
    String[] NomorHP;
    String[] Lat;
    String[] Long;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_daftar_makanan);

        lvItem		= (ListView)findViewById(R.id.listView1);


        Gambar		= new int[]{
                R.drawable.mie,
                R.drawable.udangkeju,
                R.drawable.udangrambutan,
                R.drawable.pangsit,
                R.drawable.siomay,};

        NamaItem 	= new String[]{
                "Mie Goreng",
                "Udang Keju",
                "Udang Rambutan",
                "Pangsit",
                "Siomay"};

        HargaItem 	= new String[]{
                "Rp 10.000,-",
                "Rp 8.000,-",
                "Rp 8.000,-",
                "Rp 9.000,-",
                "Rp 9.000,-"};

        Deskripsi 	= new String[]{
                "Mie Goreng adalah hidangan mie yang dimasak dengan digoreng tumis khas Indonesia. Mi goreng terbuat dari mi kuning yang digoreng dengan sedikit minyak goreng, dan ditambahkan bawang putih, bawang merah, udang serta daging ayam atau daging sapi, irisan bakso, cabai, sayuran, tomat, telur ayam, dan acar.",

                "Udang keju menjadi cemilan wajib yang harus dipesan dan dinikmati. Bagaimana tidak, rasanya yang kriuk, gurih, lembut dan keju yang meleleh di dalam, membuat udang keju ini diminati banyak orang.",

                "Udang rambutan memiliki rasa yang berbeda, karena dibuat dari campuran daging ayam dan udang. Saat digoreng aromanya benar-benar wangi. Kulitnya pun renyah dan bersarang. Tak hanya sedap di lidah, tetapi juga terlihat cantik saat disajikan.",

                "Pangsit adalah makanan berupa daging cincang yang dibungkus lembaran tepung terigu. Setelah direbus sebentar, pangsit umumnya dihidangkan di dalam sup. Selain direbus, pangsit juga bisa digoreng dengan minyak goreng yang banyak hingga seperti kerupuk. Pangsit termasuk salah satu jenis dimsum.",

                "Siomay umumnya dibuat dari ikan tenggiri, Ikan ini dianggap menjadi bahan paling cocok dan paling enak untuk dibuat menjadi siomay. Selain ikan tenggiri, siomay juga dibuat dari ayam, udang, dan kepiting."};


		//Nomor HP harus dimulai dengan kode negara yaitu : +62
        NomorHP  = new String[]{
                "+62895342885199",
                "+62895342885199",
                "+62895342885199",
                "+62895342885199",
                "+62895342885199"
        };

        Lat  = new String[]{
                "-10.1760821",
                "-10.1768035",
                "-10.171799",
                "-10.1748536",
                "-10.1747994"
        };

        Long  = new String[]{
                "123.6235399",
                "123.6229451",
                "123.6285576",
                "123.6262513",
                "123.6261514"
        };


        for (int i = 0; i < NamaItem.length; i++)
        {
            ListViewAdapterMenu wp = new ListViewAdapterMenu(NamaItem[i], HargaItem[i], Deskripsi[i], Gambar[i], NomorHP[i], Lat[i], Long[i]);
            arraylist.add(wp);
        }

        adapter = new ListViewAdapterCall(this, arraylist);
        lvItem.setAdapter(adapter);

    }

    void showToastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
