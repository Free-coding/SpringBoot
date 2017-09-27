package app.feign;

import app.entity.User;
import com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator;
import com.sun.javafx.collections.MappingChange;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by 吴文韬 on 2017/9/26.
 */
@FeignClient(name = "microservice-provider-user-multiple-params")
public interface UserFeignClient {
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);

    @RequestMapping(value = "/user/get1",method = RequestMethod.GET)
    public User get1(@RequestParam("id") Long id,@RequestParam("username") String username);

    @RequestMapping(value = "/user/get2",method = RequestMethod.GET)
    public User get2(@RequestParam Map<String,Object> map);

    @RequestMapping(value = "/user/post",method = RequestMethod.POST)
    public User post(@RequestBody User user);
}
