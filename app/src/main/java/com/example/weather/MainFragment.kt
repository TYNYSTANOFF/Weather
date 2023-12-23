package com.example.weather

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import com.example.weather.databinding.ActivityMainBinding
import com.example.weather.databinding.FragmentMainBinding
import com.example.weather.model.WeatherModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment(), WeatherView{
private lateinit var binding: FragmentMainBinding

@Inject
lateinit var  presenter: WeatherPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMainBinding.inflate(layoutInflater)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.getWeather()
        presenter.attachView(this)

    }

    override fun showWeather(weatherModel: WeatherModel) {
        Log.e("ololo", "showWeather: $weatherModel")
        binding.infiTV.text = weatherModel.main.temp.toString()
    }

    override fun showError(error: String) {
        Toast.makeText(requireContext(), error, Toast.LENGTH_SHORT).show()
        binding.infiTV.text = error
    }


}