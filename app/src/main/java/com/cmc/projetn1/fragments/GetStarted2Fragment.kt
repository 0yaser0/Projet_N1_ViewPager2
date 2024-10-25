
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cmc.projetn1.ProjetN1Fragments
import com.cmc.projetn1.R
import com.cmc.projetn1.adapters.RecipesAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cmc.projetn1.adapters.Recipe
import com.munchbot.munchbot.Utils.StatusBarUtils
import com.cmc.projetn1.databinding.GetStarted2Binding
import com.cmc.projetn1.main_view.GetStarted
import kotlin.random.Random

class GetStarted2Fragment : ProjetN1Fragments() {
    private var _binding: GetStarted2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = GetStarted2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        StatusBarUtils.setStatusBarColor(requireActivity().window, R.color.secondColor)

        binding.next.setOnClickListener {
            (activity as? GetStarted)?.binding?.viewPager?.currentItem = 2
        }

        binding.back.setOnClickListener {
            (activity as? GetStarted)?.binding?.viewPager?.currentItem = 0
        }



        val recipes = listOf(
            Recipe("Pizza ittaly", R.drawable.food1, "${Random.nextInt(50, 900)} DH"),
            Recipe("Pizza", R.drawable.food2, "${Random.nextInt(50, 900)} DH"),
            Recipe("Harira", R.drawable.food3, "${Random.nextInt(50, 900)} DH"),
            Recipe("Soup", R.drawable.food4, "${Random.nextInt(50, 900)} DH"),
            Recipe("Steak", R.drawable.food5, "${Random.nextInt(50, 900)} DH"),
            Recipe("L7am bar9ou9", R.drawable.food6, "${Random.nextInt(50, 900)} DH"),
            Recipe("Fkhad djaj", R.drawable.food7, "${Random.nextInt(50, 900)} DH"),
            Recipe("1/2 Chicken", R.drawable.food8, "${Random.nextInt(50, 900)} DH"),
            Recipe("rooz Djaj", R.drawable.food9, "${Random.nextInt(50, 900)} DH"),
            Recipe("Pastisho", R.drawable.food10, "${Random.nextInt(50, 900)} DH"),
            Recipe("plat 7out", R.drawable.food11, "${Random.nextInt(50, 900)} DH"),
            Recipe("Rooz dlhnod", R.drawable.food12, "${Random.nextInt(50, 900)} DH"),
            Recipe("Salad djaj", R.drawable.food13, "${Random.nextInt(50, 900)} DH"),
            Recipe("Salad", R.drawable.food14, "${Random.nextInt(50, 900)} DH"),
            Recipe("Tajin", R.drawable.food15, "${Random.nextInt(50, 900)} DH")
        )

        val recyclerView: RecyclerView = view.findViewById(R.id.vetRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = RecipesAdapter(recipes)

    }
}
