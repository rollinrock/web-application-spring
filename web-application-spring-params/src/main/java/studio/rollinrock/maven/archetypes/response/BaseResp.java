package studio.rollinrock.maven.archetypes.response;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-04 11:04
 * @description
 **/
public abstract class BaseResp<E> implements Serializable{

    private static ResourceBundle defaultResourceBundle = ResourceBundle.getBundle("resp", Locale.US);
    private static ResourceBundle localResourceBundle = ResourceBundle.getBundle("resp", Locale.getDefault());

    protected static final String CODE_SUFFIX = ".code";
    protected static final String SUCCEED_CODE = "0";
    protected static final String BIZ_FAIL_CODE = "1";
//    protected static final String DESC_SUFFIX = ".desc";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public E getResult() {
        return result;
    }

    public void setResult(E result) {
        this.result = result;
    }

    private String code;
    private String desc;
    private E result;

    protected BaseResp(String code, String desc, E result) {
        this.code = code;
        this.desc = desc;
        this.result = result;
    }

    protected BaseResp() {
    }


    public boolean succeededOrNot(){
        return this.code.equalsIgnoreCase("0");
    }


    protected static ResourceBundle getResourceBundle(){
        return null == localResourceBundle ? defaultResourceBundle: localResourceBundle;
    }



}
