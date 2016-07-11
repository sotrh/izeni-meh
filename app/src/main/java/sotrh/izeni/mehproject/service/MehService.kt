package sotrh.izeni.mehproject.service

import retrofit2.Call
import retrofit2.http.GET
import sotrh.izeni.mehproject.data.Deal

/**
 * Created by izeni on 7/11/16.
 */

interface MehService {
    @GET
    fun getCurrentDeal(): Call<Deal>
}