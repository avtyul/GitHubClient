package mail.ru.githubclient.proto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHub {
    @GET("/search/users?q={query}")
    Call<List<User>> users(@Path("query") String query);
}
