package id.co.technomotion.booklogger;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Thoriq on 5/21/2015.
 */
public class ListBookAdapter extends BaseAdapter{

    Context context;
    protected ArrayList<DataBuku> listBook;
    LayoutInflater inflater;


    public ListBookAdapter(Context context, ArrayList<DataBuku> listBook)
    {
        this.listBook = listBook;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public int getCount() {
        return listBook.size();
    }

    @Override
    public Object getItem(int position) {
        return listBook.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {

            holder = new ViewHolder();
            convertView = this.inflater.inflate(R.layout.list_item,
                    parent, false);

            holder.txtTitle = (TextView) convertView
                    .findViewById(R.id.bookTitle);
            holder.txtAuthor = (TextView) convertView
                    .findViewById(R.id.bookAuthor);
            holder.txtPage = (TextView) convertView
                    .findViewById(R.id.bookPage);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        DataBuku car = listBook.get(position);
        holder.txtTitle.setText(car.getTitle());
        holder.txtAuthor.setText(car.getAuthor());
        holder.txtPage.setText(car.getPage());

        return convertView;
    }

    private class ViewHolder
    {
        TextView txtTitle;
        TextView txtAuthor;
        TextView txtPage;
    }
}
