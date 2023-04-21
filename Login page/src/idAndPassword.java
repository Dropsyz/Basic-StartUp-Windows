import java.util.LinkedHashMap;
import java.util.Map;

public class idAndPassword {

    Map<String, String> loginInfo = new LinkedHashMap<>();

    idAndPassword(){
        loginInfo.put("bro", "pizza");
        loginInfo.put("Inna", "bubu");
        loginInfo.put("Nasko", "bebe");
    }

    protected Map getLoginInfo(){
        return loginInfo;
    }
}
