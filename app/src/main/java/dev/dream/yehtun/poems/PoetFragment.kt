package dev.dream.yehtun.poems

import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.app.FragmentManager
import android.support.design.widget.TabLayout
import dev.dream.yehtun.poems.adaptorclass.PoetFragmentPagerAdaptor

import android.support.v7.app.AppCompatActivity
import android.support.v4.view.PagerAdapter




/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [PoetFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [PoetFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PoetFragment : Fragment() {

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null

    private var mListener: OnFragmentInteractionListener? = null
    private var mPoetFragPagerAdaptor: PoetFragmentPagerAdaptor? = null
    private var mViewPager: ViewPager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments.getString(ARG_PARAM1)
            mParam2 = arguments.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val result=inflater!!.inflate(R.layout.fragment_poet, container, false)
        val viewPager = result!!.findViewById<ViewPager>(R.id.PoetViewPager) as ViewPager
        viewPager.adapter
        mPoetFragPagerAdaptor= PoetFragmentPagerAdaptor(fragmentManager)
       // val tabLayout=result!!.findViewById<TabLayout>(R.id.tabLayoutPoet) as TabLayout
        viewPager.adapter= buildAdapter()
       // tabLayout.setupWithViewPager(viewPager)

        return result



    }
    private fun buildAdapter(): PagerAdapter {
        return PoetFragmentPagerAdaptor(childFragmentManager)
    }


 /*   override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager =view?.findViewById<ViewPager>(R.id.PoetViewPager) as ViewPager
        mPoetFragPagerAdaptor= PoetFragmentPagerAdaptor(fragmentManager)
        val tabLayout=view!!.findViewById<TabLayout>(R.id.tabLayoutPoet) as TabLayout
        viewPager.adapter= mPoetFragPagerAdaptor
        tabLayout.setupWithViewPager(viewPager)
    }
*/




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

    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        internal val ARG_PARAM1 = "param1"
        internal val ARG_PARAM2 = "param2"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PoetFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String, param2: String): PoetFragment {
            val fragment = PoetFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }
}// Required empty public constructor
