package hu.bme.aut.android.trackio.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hu.bme.aut.android.trackio.R
import hu.bme.aut.android.trackio.databinding.FragmentDailyActivitiesBinding
import hu.bme.aut.android.trackio.databinding.FragmentPersonalDialogBinding
import hu.bme.aut.android.trackio.databinding.FragmentProfileMenuBinding

class PersonalDialogFragment : Fragment() {
    private lateinit var binding : FragmentPersonalDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPersonalDialogBinding.inflate(inflater, container, false)
        return binding.root
    }
}