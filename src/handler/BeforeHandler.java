package handler;

import java.lang.reflect.Method;

public abstract class BeforeHandler extends AbstractHandler {
    public abstract void handleBefore(Object proxy, Method method, Object[] args);

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
