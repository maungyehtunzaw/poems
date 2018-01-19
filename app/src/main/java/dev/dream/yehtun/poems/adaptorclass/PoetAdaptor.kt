package dev.dream.yehtun.poems.adaptorclass

import android.content.Context
import android.media.Image
import android.support.annotation.IdRes
import android.support.annotation.LayoutRes
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import dev.dream.yehtun.poems.R
import dev.dream.yehtun.poems.dataclass.Poet

import org.w3c.dom.Text

import java.util.ArrayList


/**
 * Created by Ye Htun on 2017-10-04.
 */

class PoetAdaptor(context: Context, poets: ArrayList<Poet>) : ArrayAdapter<Poet>(context, 0, poets) {
    internal var context: Context? = null

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val currentPoet = getItem(position)

        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.poet_list_view, parent, false)
        }


        val poetImage = listItemView!!.findViewById<ImageView>(R.id.poet_image)
        val poetName = listItemView.findViewById<TextView>(R.id.poet_name)
        val poemCount = listItemView.findViewById<TextView>(R.id.poet_en_name)
        Log.d("TAG", "SHIT HERE")
        poetImage.setImageResource(currentPoet!!.image)
        poetName.setText(currentPoet!!.name)
        poemCount.setText(currentPoet!!.en_name)

        return listItemView
    }
}
