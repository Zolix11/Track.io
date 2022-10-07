package hu.bme.aut.retrofit_test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import hu.bme.aut.retrofit_test2.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val BASE_URL = "http://23.97.188.188:80/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name: String = "KisJano"
        val pw: String = "123456asd"


        binding.getbtn.setOnClickListener{
            getMyData()
        }
        binding.postbtn.setOnClickListener{
            postData(name, pw)
        }

    }

    private fun getMyData(){
        val retrofitBuilder = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
                .create(ApiInterface::class.java)
        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<MyDataItem>?> {
            override fun onResponse(
                call: Call<List<MyDataItem>?>,
                response: Response<List<MyDataItem>?>
            ) {
                val responseBody = response.body()!!

                val myStringBuilder = StringBuilder()
                for(myData in responseBody){
                    myStringBuilder.append(myData.body)
                    myStringBuilder.append("\n")
                }

                binding.txtID.text = myStringBuilder

            }

            override fun onFailure(call: Call<List<MyDataItem>?>, t: Throwable) {
                Log.d("gethiba", "fetch fail: " + t.message)
            }
        })
    }

    private fun postData(name: String, passw: String){
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)
        val retrofitData = retrofitBuilder.SendAndGetPost(name, passw)

        retrofitData?.enqueue(object : Callback<MyDataItem?> {
            override fun onResponse(call: Call<MyDataItem?>, response: Response<MyDataItem?>) {
                val responseBody = response.body()
                Log.d("response", responseBody.toString())
                val myStringBuilder = StringBuilder()
                myStringBuilder.append(responseBody?.body)
                myStringBuilder.append("\n")

                binding.txtID.text = myStringBuilder
            }

            override fun onFailure(call: Call<MyDataItem?>, t: Throwable) {
                Log.d("posthiba", "fetch fail: " + t.message)
            }
        })
    }
}