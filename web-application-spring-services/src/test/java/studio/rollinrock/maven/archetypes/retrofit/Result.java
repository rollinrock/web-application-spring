package studio.rollinrock.maven.archetypes.retrofit;

import lombok.Data;

import java.io.Serializable;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-16 17:03
 * @description
 **/

@Data
public class Result<T> implements Serializable {

    /** 错误码 **/
    private int code;
    /** 提示信息 **/
    private String message;
    /** 数据 **/
    private T data;
    /** 总条数 **/
    private Integer total;
}
