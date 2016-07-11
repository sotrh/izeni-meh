package sotrh.izeni.mehproject.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sotrh.izeni.mehproject.R

/**
 * Created by izeni on 7/11/16.
 */
class DealFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.frag_deal, container, false)
    }
}