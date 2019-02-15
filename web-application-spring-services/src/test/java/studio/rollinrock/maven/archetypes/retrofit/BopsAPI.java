package studio.rollinrock.maven.archetypes.retrofit;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-16 16:59
 * @description
 **/
public interface BopsAPI {

    @Multipart
    @POST("/api/base/file_upload")
    Call<Result<UploadResp>> upload(@Part("filename")RequestBody requestBody);
}
