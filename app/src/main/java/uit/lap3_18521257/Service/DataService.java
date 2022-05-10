package uit.lap3_18521257.Service;

import retrofit2.Call;
import retrofit2.http.GET;
import uit.lap3_18521257.Model.News;

public interface DataService {

    @GET("/v2/everything?q=apple&from=2022-04-29&to=2022-04-29&sortBy=popularity&apiKey=d0e5ccf29f8d4b20bd428183b1a5d0ec")
    Call<News> GetDataNews();

}
