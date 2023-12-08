package ${groupId}.security.component;

import com.alibaba.ttl.TransmittableThreadLocal;
import ${groupId}.service.auth.model.AuthUserDetails;

/**
 * 当前会话用户信息保存
 *
 * @author Alex Meng
 * @createDate 2023-11-21 01:04
 */
public class AuthContextHolder {

    private AuthContextHolder() {
    }

    private static final TransmittableThreadLocal<AuthUserDetails> THREAD_LOCAL = new TransmittableThreadLocal<>();

    public static void setContext(AuthUserDetails t) {
        THREAD_LOCAL.set(t);
    }

    public static AuthUserDetails getContext() {
        return THREAD_LOCAL.get();
    }

    public static void clear() {
        THREAD_LOCAL.remove();
    }
}