package fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pricey.R
import kotlinx.android.synthetic.main.fragment_card.*


@Suppress("UNREACHABLE_CODE")
class CardFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {


        


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cash, container, false)





        }

}



