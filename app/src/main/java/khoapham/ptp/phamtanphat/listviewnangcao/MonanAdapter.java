package khoapham.ptp.phamtanphat.listviewnangcao;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MonanAdapter extends ArrayAdapter<Monan> {

    public MonanAdapter( @NonNull Context context, int resource,@NonNull List<Monan> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,  @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.dong_monan_item,null);
        TextView txtTenmonan = convertView.findViewById(R.id.textviewTenmonan);
        TextView txtGiamonan = convertView.findViewById(R.id.textviewGiamonan);
        ImageView imgMonan = convertView.findViewById(R.id.imageviewMonan);

        Monan monan =  getItem(position);
        txtTenmonan.setText(monan.getTen());
        txtGiamonan.setText(monan.getGiatien() + " Đồng ");
        imgMonan.setImageResource(monan.getHinhanh());
        return convertView;
    }
}
