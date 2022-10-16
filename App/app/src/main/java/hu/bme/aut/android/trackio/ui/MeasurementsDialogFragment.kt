package hu.bme.aut.android.trackio.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hu.bme.aut.android.trackio.R
import hu.bme.aut.android.trackio.databinding.FragmentDailyActivitiesBinding
import hu.bme.aut.android.trackio.databinding.FragmentMeasurementsDialogBinding

class MeasurementsDialogFragment : Fragment() {
    private lateinit var binding : FragmentMeasurementsDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMeasurementsDialogBinding.inflate(inflater, container, false)
        return binding.root
    }
}