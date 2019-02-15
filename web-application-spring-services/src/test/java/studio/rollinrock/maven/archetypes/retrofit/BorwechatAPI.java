package studio.rollinrock.maven.archetypes.retrofit;

import com.google.common.util.concurrent.ListenableFuture;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-16 15:15
 * @description
 **/
public interface BorwechatAPI {


    @GET("/wechat/menu")
    Call<LocalResponse<List<Button>>> glance();

    @GET("/wechat/menu")
    ListenableFuture<LocalResponse<List<Button>>> guavaGlance();

    @GET("/wechat/menu")
    Observable<LocalResponse<List<Button>>> rxJavaGlance();

    @POST("/wechat/menu")
    Call<LocalResponse<Void>> update(@Body List<Button> buttons);

}
