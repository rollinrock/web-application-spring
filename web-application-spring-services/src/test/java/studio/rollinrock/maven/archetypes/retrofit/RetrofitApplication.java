package studio.rollinrock.maven.archetypes.retrofit;

import com.alibaba.fastjson.JSON;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import okhttp3.OkHttpClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.guava.GuavaCallAdapterFactory;
import retrofit2.adapter.java8.Java8CallAdapterFactory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-16 15:24
 * @description
 **/
public class RetrofitApplication {

    private Retrofit retrofit;

    private BorwechatAPI api;

    private OkHttpClient client;

    @Before
    public void initialize() {
        client = new OkHttpClient.Builder()
                .connectTimeout(Duration.ofSeconds(1))
                .readTimeout(Duration.ofSeconds(1))
                .writeTimeout(Duration.ofSeconds(1))
                .callTimeout(Duration.ofSeconds(10))
                .build();


        if (null == retrofit)
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://borwechat.wdai.com")
                    .addConverterFactory(JacksonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addCallAdapterFactory(Java8CallAdapterFactory.create())
                    .addCallAdapterFactory(GuavaCallAdapterFactory.create())
                    .client(client)
                    .build();


        if (null == api)
            api = retrofit.create(BorwechatAPI.class);


    }


    @Test
    public void synchronizeGet() throws IOException {
        Response<LocalResponse<List<Button>>> result = api.glance().execute();

        System.out.println(result);
        System.out.println(result.body());
        Assert.assertTrue(result.isSuccessful());
    }

    @Test
    public void synchronizeGuavaGet() throws IOException, InterruptedException {
        ListenableFuture<LocalResponse<List<Button>>> future = api.guavaGlance();
        Futures.addCallback(future, new FutureCallback<LocalResponse<List<Button>>>() {
            @Override
            public void onSuccess(@Nullable LocalResponse<List<Button>> result) {
                System.out.println("guava 监听模式下数据已返回：");
                System.out.println(result);
            }

            public void onFailure(Throwable thrown) {
                System.out.println("guava 监听模式下发生异常");
            }
        });

        Thread.currentThread().sleep(3000);

    }

    @Test
    public void synchronizeRxJavaGet() throws IOException, InterruptedException {
        Observable<LocalResponse<List<Button>>> observable = api.rxJavaGlance();

        observable.subscribe(new Consumer<LocalResponse<List<Button>>>() {
            @Override
            public void accept(LocalResponse<List<Button>> result) throws Exception {
                System.out.println("观察者模式下数据已返回：");
                System.out.println(result);
            }
        });
        Thread.currentThread().sleep(3000);
    }

    @Test
    public void asynchronizeGet() throws IOException, InterruptedException {
        System.out.println("调用异步获取方法");

        api.glance().enqueue(new Callback<LocalResponse<List<Button>>>() {
            @Override
            public void onResponse(Call<LocalResponse<List<Button>>> call, Response<LocalResponse<List<Button>>> response) {
                System.out.println("调用异步获取方法 成功返回");

                System.out.println(response);
                System.out.println(response.body());
                Assert.assertTrue(response.isSuccessful());
            }

            @Override
            public void onFailure(Call<LocalResponse<List<Button>>> call, Throwable t) {
                System.out.println("调用异步获取方法 返回失败");
                System.out.println("异常信息：" + t.getMessage());
            }
        });


        Thread.currentThread().sleep(3000);

    }

    @Test
    public void synchronizePost() throws IOException {
        String json = "[\n" +
                "        {\n" +
                "            \"name\": \"借款服务\",\n" +
                "            \"sub_button\": [\n" +
                "                {\n" +
                "                    \"content\": \"http://static2.wdai.com/static/fed/wechat/fed.borwechat/#/products/list\",\n" +
                "                    \"name\": \"产品介绍\",\n" +
                "                    \"sub_button\": [],\n" +
                "                    \"type\": \"view\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"content\": \"http://static2.wdai.com/static/fed/wechat/fed.borwechat/#/apply\",\n" +
                "                    \"name\": \"快速借款\",\n" +
                "                    \"sub_button\": [],\n" +
                "                    \"type\": \"view\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"content\": \"http://static2.wdai.com/static/fed/wechat/fed.borwechat/#/searchShop\",\n" +
                "                    \"name\": \"门店查找\",\n" +
                "                    \"sub_button\": [],\n" +
                "                    \"type\": \"view\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"content\": \"http://static2.wdai.com/static/fed/wechat/fed.borwechat/#/feedback\",\n" +
                "                    \"name\": \"意见反馈\",\n" +
                "                    \"sub_button\": [],\n" +
                "                    \"type\": \"view\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"活动\",\n" +
                "            \"sub_button\": [\n" +
                "                {\n" +
                "                    \"content\": \"http://static1.wdai.com/static/h5.borwechatExtra/#/creditCard\",\n" +
                "                    \"name\": \"信用卡\",\n" +
                "                    \"sub_button\": [],\n" +
                "                    \"type\": \"view\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"content\": \"subscribe\",\n" +
                "                    \"name\": \"9月活动\",\n" +
                "                    \"sub_button\": [],\n" +
                "                    \"type\": \"click\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"content\": \"http://partnerhub.wdai.com/api/wechat/auth/entry?url=http://smaller.wdai.com/ZvmC\",\n" +
                "                    \"name\": \"10月活动测试\",\n" +
                "                    \"sub_button\": [],\n" +
                "                    \"type\": \"view\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"我的\",\n" +
                "            \"sub_button\": [\n" +
                "                {\n" +
                "                    \"content\": \"http://static2.wdai.com/static/fed/wechat/fed.borwechat/#/myBorrow\",\n" +
                "                    \"name\": \"我的借款\",\n" +
                "                    \"sub_button\": [],\n" +
                "                    \"type\": \"view\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"content\": \"http://static2.wdai.com/static/fed/wechat/fed.borwechat/?t=20180628#/refundBill\",\n" +
                "                    \"name\": \"还款账单\",\n" +
                "                    \"sub_button\": [],\n" +
                "                    \"type\": \"view\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"content\": \"http://static2.wdai.com/static/fed/wechat/fed.borwechat.activity/playHead/\",\n" +
                "                    \"name\": \"车主服务\",\n" +
                "                    \"sub_button\": [],\n" +
                "                    \"type\": \"view\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"content\": \"http://static2.wdai.com/static/fed/wechat/fed.borwechat/points-mall/\",\n" +
                "                    \"name\": \"积分商城111\",\n" +
                "                    \"sub_button\": [],\n" +
                "                    \"type\": \"view\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]";
        Response<LocalResponse<Void>> result = api.update(JSON.parseArray(json, Button.class)).execute();
        System.out.println(result);
        System.out.println(result.body());
        Assert.assertTrue(result.isSuccessful());
    }
}
