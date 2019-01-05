package studio.rollinrock.maven.archetypes.exception;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-04 16:45
 * @description
 **/
public class BizException extends RuntimeException {

    private static final long serialVersionUID = -3975313454455940763L;
    private String code;
    private String desc;
    private boolean overt = false;

    public BizException(String code, String desc, boolean overt) {
        super(desc);
        this.code = code;
        this.desc = desc;
        this.overt = overt;
    }

    public BizException(Throwable cause, String code, String desc, boolean overt) {
        super(desc, cause);
        this.code = code;
        this.desc = desc;
        this.overt = overt;
    }

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

    public boolean isOvert() {
        return overt;
    }

    public void setOvert(boolean overt) {
        this.overt = overt;
    }
}
