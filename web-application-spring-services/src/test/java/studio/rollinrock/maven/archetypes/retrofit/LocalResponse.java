package studio.rollinrock.maven.archetypes.retrofit;

import lombok.Data;

import java.io.Serializable;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-16 15:21
 * @description
 **/
@Data
public class LocalResponse<E> implements Serializable {
    private static final long serialVersionUID = -3964820767859793377L;

    private int code;
    private E data;
    private String message;
}
