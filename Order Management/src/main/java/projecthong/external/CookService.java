package projecthong.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "Kitchen", url = "${api.url.Kitchen}")
public interface CookService {
    @RequestMapping(method= RequestMethod.POST, path="/cooks")
    public void cook(@RequestBody Cook cook);
}

