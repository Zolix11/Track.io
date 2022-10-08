package hu.bme.aut.android.trackio.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import hu.bme.aut.android.trackio.R
import hu.bme.aut.android.trackio.databinding.FragmentProfileMenuBinding

class ProfileMenuFragment : Fragment() {
    private lateinit var binding : FragmentProfileMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnProfileToHelp.setOnClickListener {
            findNavController().navigate(R.id.action_profileMenuFragment_to_helpFragment)
        }
        binding.btnProfileToPersonal.setOnClickListener {
            findNavController().navigate(R.id.action_profileMenuFragment_to_personalDialogFragment)
        }
        binding.btnProfileToMeasurementsDialog.setOnClickListener {
            findNavController().navigate(R.id.action_profileMenuFragment_to_measurementsDialogFragment)
        }
        binding.btnProfileToWorkout.setOnClickListener {
            findNavController().navigate(R.id.action_profileMenuFragment_to_workoutMenuFragment3)
        }
        binding.btnProfileToHome.setOnClickListener {
            findNavController().navigate(R.id.action_profileMenuFragment_to_homeMenuFragment)
        }
    }
}