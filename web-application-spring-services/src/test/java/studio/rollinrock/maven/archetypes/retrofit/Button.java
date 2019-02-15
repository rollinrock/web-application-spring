package studio.rollinrock.maven.archetypes.retrofit;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2019-01-16 15:22
 * @description
 **/

@Data
public class Button implements Serializable{

    private String name;
    private String type;
    private String content;

    private Object extra;
    private String appid;
    private String pagepath;
    @JSONField(
            name = "sub_button"
    )
    private List<Button> sub_button;
}
