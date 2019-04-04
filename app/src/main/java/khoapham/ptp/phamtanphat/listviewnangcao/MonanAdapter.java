package khoapham.ptp.phamtanphat.listviewnangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonanAdapter extends BaseAdapter {
    ArrayList<Monan> mangmonan;
    Context context;

    public MonanAdapter(ArrayList<Monan> monans , Context context){
        mangmonan = monans;
        this.context = context;
    }
    @Override
    public int getCount() {
        return mangmonan.size();
    }

    @Override
    public Object getItem(int position) {
        return mangmonan.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    class ViewHolder{
        TextView txtTenmonan , txtGiamonan;
        ImageView imgMonan;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.dong_monan_item,null);
            viewHolder = new ViewHolder();
            viewHolder.txtTenmonan = convertView.findViewById(R.id.textviewTenmonan);
            viewHolder.txtGiamonan = convertView.findViewById(R.id.textviewGiamonan);
            viewHolder.imgMonan = convertView.findViewById(R.id.imageviewMonan);
            convertView.setTag(viewHolder);
        }else{
            convertView.getTag();

        }
        Monan monan = (Monan) getItem(position);
        viewHolder.txtTenmonan.setText(monan.getTen());
        viewHolder.txtGiamonan.setText(monan.getGiatien() + " Đồng ");
        viewHolder.imgMonan.setImageResource(monan.getHinhanh());



        return convertView;
    }
}
