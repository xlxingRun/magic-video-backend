package cn.xiaolin.core.utils;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Optional;

/**
 * @author xingxiaolin xlxing@bupt.edu.cn
 * @Description
 * @create 2023/7/30
 */
public class ContextUtil {
    private ContextUtil() {
        throw new NotImplementedException();
    }
    private static final ThreadLocal<Long> THREAD_LOCAL = new ThreadLocal<>();

    public static void setUserId(Long id) {
        THREAD_LOCAL.set(id);
    }

    public static Long getUserId() {
        return Optional.ofNullable(THREAD_LOCAL.get()).orElse(0L);
    }
}
