package learn.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-05-07 14:01
 */
public class JsonObjectTest {
    public static void main(String[] args) {
        String str ="[{\"actionCount\":1,\"actionName\":\"杜01\",\"id\":100306},{\"actionCount\":1,\"actionName\":\"杜02\",\"id\":100307},{\"actionCount\":1,\"actionName\":\"杜03\",\"id\":100308}]";

        String strNew = str.replaceAll("],\\[",",");
        JSONArray jsonArray = JSONObject.parseArray(strNew);
        JSONObject jSONObject = (JSONObject) jsonArray.get(0);
        System.out.println(jSONObject.get("actionCount"));
        System.out.println(jSONObject.toJSONString());

		}

}