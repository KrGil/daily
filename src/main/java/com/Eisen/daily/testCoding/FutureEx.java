package com.Eisen.daily.testCoding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.concurrent.*;

public class FutureEx {
    private final static Logger log = LoggerFactory.getLogger(FutureEx.class);

    interface SuccessCallback {
        void onSuccess(String result);
    }
    interface  ExceptionalCallback{
        void onError(Throwable t);
    }
    public static class CallbackFutureTask extends FutureTask<String> {
        SuccessCallback sc;
        ExceptionalCallback ec;
        public CallbackFutureTask(Callable<String> callable, SuccessCallback sc, ExceptionalCallback ec) {
            super(callable);
            this.sc = Objects.requireNonNull(sc); //Tip. Null이 들어오면 안될 때 사용하는 메서드
            this.ec = Objects.requireNonNull(ec);
        }

        @Override
        protected void done() {
            try {
                sc.onSuccess(get());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                ec.onError(e.getCause());
            }
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();

        CallbackFutureTask f = new CallbackFutureTask(() -> {
            Thread.sleep(2000);
//            if (1 == 1) throw new RuntimeException("Async ERROR!!!");
            log.info("Async");
            return "Hello";
        },
            s -> System.out.println(s),
            e -> System.out.println("Error: "+e.getMessage()));

        es.execute(f);
        es.shutdown(); //이 메서드를 쓰더라도 하던 작업이 중단되지는 않음
    }
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService es = Executors.newCachedThreadPool();
//        Future<String> f = es.submit(() -> {
//            Thread.sleep(2000); //interrupt 발생시 exception 던질 수 있도록
//            log.info("Async");
//            return "Hello";
//        });
//        System.out.println(f.isDone()); //즉시 리턴(작업이 완료되었는지)
//        Thread.sleep(1900);
//        log.info("Exit");
//        System.out.println(f.isDone());
//        System.out.println(f.get());
//
//    }
}
