package khoapham.ptp.phamtanphat.listviewnangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvMonan;
    MonanAdapter monanAdapter;
    ArrayList<Monan> monans = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonan = findViewById(R.id.listviewMonan);
        monans.add(new Monan("Cá kho", 35000,R.drawable.cakho));
        monans.add(new Monan("Canh chua", 400000,R.drawable.canhchuacaloc));
        monans.add(new Monan("Chả cá ", 15000,R.drawable.chacalavong));
        monans.add(new Monan("Cha giò", 20000,R.drawable.chagio));
        monans.add(new Monan("Cơm sườn", 25000,R.drawable.comsuon));
        monanAdapter = new MonanAdapter(MainActivity.this, android.R.layout.simple_list_item_1,monans);
        lvMonan.setAdapter(monanAdapter);

    }
}
