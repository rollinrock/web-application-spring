package studio.rollinrock.maven.archetypes.response;

import studio.rollinrock.maven.archetypes.exception.BizException;

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

    private static <T> HttpResp<T> ofException(String exceptionCanonicalName, Exception e){
        HttpResp<T> resp = new HttpResp<>();
        resp.setCode(getResourceBundle().getString(exceptionCanonicalName.concat(CODE_SUFFIX)));
        resp.setDesc(String.format(getResourceBundle().getString(resp.getCode()), e.getMessage()));

        return resp;
    }
    public static <T> HttpResp<T> of(Exception e){
        if (e instanceof IllegalArgumentException)
            return ofException(IllegalArgumentException.class.getCanonicalName(), e);
        else if (e instanceof BizException)
            return ofException(BizException.class.getCanonicalName(), e);
        return ofException(Exception.class.getCanonicalName(), e);
    }

    public static <T> HttpResp<T> succeed(T result){
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
