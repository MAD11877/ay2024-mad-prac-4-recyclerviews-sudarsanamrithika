package sg.edu.np.mad.madpractical4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView smallImage;
    TextView name;
    TextView desc;

    public UserViewHolder(View itemView){
        super(itemView);
        smallImage = itemView.findViewById(R.id.imBg);
        name = itemView.findViewById(R.id.tvName);
        desc = itemView.findViewById(R.id.tvDesc);
    }
}
