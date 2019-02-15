package studio.rollinrock.maven.archetypes.retrofit;

import retrofit2.CallAdapter;
import retrofit2.Retrofit;

import javax.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-17 14:24
 * @description
 **/
public class WdaiCallAdaptorFactory extends CallAdapter.Factory {

    public static WdaiCallAdaptorFactory create() {
        return new WdaiCallAdaptorFactory();
    }

    @Nullable
    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        return null;
    }
}
