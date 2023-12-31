package cn.xiaolin.gateway.dubbo;

import cn.xiaolin.api.dubbo.service.UserPermService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xingxiaolin xlxing@bupt.edu.cn
 * @Description
 * @create 2023/9/9
 */
@Service
public class DubboUserPermClient {

    @DubboReference
    public UserPermService userPermService;

    public List<String> getPermissions(Long userId) {
        return userPermService.getPermByUserId(userId);
    }

    public List<String> getRoles(Long userId) {
        return userPermService.getRoleByUserId(userId);
    }

}
