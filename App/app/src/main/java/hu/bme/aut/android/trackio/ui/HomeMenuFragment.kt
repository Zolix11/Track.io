package hu.bme.aut.android.trackio.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import hu.bme.aut.android.trackio.R
import hu.bme.aut.android.trackio.databinding.FragmentHomeMenuBinding
import hu.bme.aut.android.trackio.databinding.FragmentLoginBinding

class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        /*super.onViewCreated(view, savedInstanceState)

        binding.btnHomeToDaily.setOnClickListener {
            findNavController().navigate(R.id.action_homeMenuFragment_to_dailyActivitiesFragment)
        }
        binding.btnHomeToProfile.setOnClickListener {
            findNavController().navigate(R.id.action_homeMenuFragment_to_profileMenuFragment)
        }
        binding.btnHomeToDetailedMeasurements.setOnClickListener {
            )
        }
        binding.btnHomeToWorkoutMenu.setOnClickListener {
            findNavController().navigate(R.id.action_homeMenuFragment_to_workoutMenuFragment)
        }
        binding.btnHomeToWorkoutHistory.setOnClickListener {
            findNavController().navigate()
        }*/
        binding.imageView4.setOnClickListener {
            findNavController().navigate(R.id.action_homeMenuFragment_to_detailedMeasurementsFragment)
        }

        binding.btnHomeToDaily.setOnClickListener {
            findNavController().navigate(R.id.action_homeMenuFragment_to_dailyActivitiesFragment)
        }

        binding.imageView7.setOnClickListener{
            findNavController().navigate(R.id.action_homeMenuFragment_to_workoutHistoryFragment)
        }

        binding.imageView6.setOnClickListener{
            findNavController().navigate(R.id.action_homeMenuFragment_to_workoutHistoryFragment)
        }

        binding.imageView5.setOnClickListener{
            findNavController().navigate(R.id.action_homeMenuFragment_to_workoutHistoryFragment)
        }
    }


}