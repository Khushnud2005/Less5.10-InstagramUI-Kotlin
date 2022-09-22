package uz.exemple.less510_instagramui_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less510_instagramui_kotlin.R

class SlideAdapter(var context: Context,var items:IntArray):RecyclerView.Adapter<SlideAdapter.ViewHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_post_3x_photo, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val photo = items[position]
        holder.image.setImageResource(photo)
        val item_position = (position + 1).toString() + "/" + items.size
        holder.position.text = item_position
    }

    override fun getItemCount(): Int {
        return items.size
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var position: TextView
        init {
            image = itemView.findViewById(R.id.iv_photo3_2x)
            position = itemView.findViewById(R.id.tv_count_photos)
        }
    }
}