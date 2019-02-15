package studio.rollinrock.maven.archetypes.response;

import studio.rollinrock.maven.archetypes.exception.BizException;

import javax.annotation.Nullable;
import java.util.MissingResourceException;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-04 14:58
 * @description
 **/
public class HttpResp<E> extends BaseResp<E>{

    private static final long serialVersionUID = -7081429330756926667L;

    public HttpResp() {
        super();
    }

    public HttpResp(String code, String desc, E result) {
        super(code, desc, result);
    }

    public static <T> HttpResp<T> of(Exception e){
        HttpResp<T> resp = new HttpResp<>();
        try {
            resp.setCode(getResourceBundle().getString(e.getClass().getCanonicalName().concat(CODE_SUFFIX)));
        } catch (MissingResourceException mre) {
            resp.setCode(getResourceBundle().getString(Exception.class.getCanonicalName().concat(CODE_SUFFIX)));
        }
        resp.setDesc(String.format(getResourceBundle().getString(resp.getCode()), e.getMessage()));

        return resp;
    }

    public static <T> HttpResp<T> succeed(@Nullable T result){
        HttpResp<T> resp = new HttpResp<>();
        resp.setCode(SUCCEED_CODE);
        resp.setDesc(getResourceBundle().getString(resp.getCode()));
        resp.setResult(result);
        return resp;
    }

    public static <T> HttpResp<T> fail(String reason){
        HttpResp<T> resp = new HttpResp<>();
        resp.setCode(BIZ_FAIL_CODE);
        resp.setDesc(reason);

        return resp;
    }


}
