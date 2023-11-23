import account.Account;
import account.AccountService;
import account.AccountServiceImpl;
import handler.AbstractHandler;
import handler.AfterHandlerImpl;
import handler.BeforeHandlerImpl;
import handler.ProxyFactory;

import java.util.ArrayList;
import java.util.List;

public class AspectOrientedProgrammingInJdkExample {
    public static void main(String[] args) {

        List<AbstractHandler> handlers = new ArrayList<>();
        handlers.add(new BeforeHandlerImpl());
        handlers.add(new AfterHandlerImpl());

        AccountService proxy = (AccountService) ProxyFactory.getProxy(new AccountServiceImpl(), handlers);
        Account account = new Account("gpcoder", "USD", 100);
        proxy.addAccount(account);
        proxy.getSize();
        proxy.removeAccount(account);
        proxy.getSize();
    }
}
