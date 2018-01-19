package dev.dream.yehtun.poems

import android.app.LoaderManager
import android.content.Context
import android.content.Loader
import android.net.Uri
import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import dev.dream.yehtun.poems.adaptorclass.PoetAdaptor
import dev.dream.yehtun.poems.dataclass.Poet
import java.util.ArrayList


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [PoetListFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 */
class PoetListFragment : Fragment(), LoaderManager.LoaderCallbacks<ArrayList<Poet>> {

    private var mListener: OnFragmentInteractionListener? = null
    val POETS_LIST_URL:String = "http://localhost/poetapi/poets"


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       var rootView=inflater!!.inflate(R.layout.fragment_poet_list, container, false)
        activity.title = "POETS"
        val poetDatas = ArrayList<Poet>()
        poetDatas.add(Poet(1,"နတ္ခတ္", "Nat Khat",R.raw.no_poet_image,"2012-12-12" ))
        poetDatas.add(Poet(1,"လူငယ္", "lUU NGAL",R.raw.no_poet_image,"2012-12-12" ))
        val poetAdaptor = PoetAdaptor(activity.baseContext, poetDatas)
        val listView = rootView.findViewById<ListView>(R.id.poet_list_view) as ListView
        listView.adapter = poetAdaptor
        return rootView
    }
    override fun onCreateLoader(id: Int, args: Bundle?): Loader<ArrayList<Poet>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLoadFinished(loader: Loader<ArrayList<Poet>>?, data: ArrayList<Poet>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLoaderReset(loader: Loader<ArrayList<Poet>>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        if (mListener != null) {
            mListener!!.onFragmentInteraction(uri)
        }
    }




    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }
}// Required empty public constructor
