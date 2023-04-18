package com.example.utspember

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.utspember.databinding.FragmentGridBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GridFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GridFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentGridBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGridBinding.inflate(inflater, container, false)
        val list = ArrayList<Data>()

        list.addAll(
            arrayOf(
                Data("Surya Insomnia", "35 Tahun", R.drawable.surya),
                Data("Sule Sutisna", "47 Tahun", R.drawable.sule),
                Data("Andre Taulany", "49 Tahun", R.drawable.andre),
                Data("Desta", "46 Tahun", R.drawable.desta),
                Data("Vincent Rompies", "43 Tahun", R.drawable.vincent),
                Data("Tora Sudiro", "51 Tahun", R.drawable.tora),
                Data("Wendy Cagur", "38 Tahun", R.drawable.wendy),
                Data("Denny Cagur", "47 Tahun", R.drawable.denny),
                Data("Arafah", "30 Tahun", R.drawable.arafah),
                Data("Babe Cabita", "32 Tahun", R.drawable.babe),
                Data("Boris Bokir", "32 Tahun", R.drawable.boris),
                Data("Coki Pardede", "33 Tahun", R.drawable.coki),
                Data("Dzawin Nur", "34 Tahun", R.drawable.dzawin),
                Data("Indra Frimawan", "31 Tahun", R.drawable.frimawan),
                Data("Indra Jegel", "32 Tahun", R.drawable.jegel),
                Data("Kiky Saputri", "33 Tahun", R.drawable.kiky),
                Data("Marshel Widianto", "29 Tahun", R.drawable.marshel),
                Data("Tretan Muslim", "36 Tahun", R.drawable.muslim),
                Data("Raditya Dika", "38 Tahun", R.drawable.raditya),
                Data("Rigen", "35 Tahun", R.drawable.rigen),
                Data("Imam Darto", "36 Tahun", R.drawable.darto)
            )
        )

        val myAdapter = GridAdapter(list)

        binding.recycleGridView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recycleGridView.setHasFixedSize(true)
        binding.recycleGridView.adapter = myAdapter

        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GridFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GridFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}