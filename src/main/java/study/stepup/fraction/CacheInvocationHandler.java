package study.stepup.fraction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CacheInvocationHandler implements InvocationHandler {

    private Object object;
    private Object cacheObject;

    public CacheInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(Cache.class)) {
            if (cacheObject != null) {
                return cacheObject;
            } else {
                cacheObject = method.invoke(object, args);
                return cacheObject;
            }
        }
        if (method.isAnnotationPresent(Mutator.class)) {
            cacheObject = null;
        }
        return method.invoke(object, args);
    }
}