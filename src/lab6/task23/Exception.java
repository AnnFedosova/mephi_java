package lab6.task23;

import java.util.concurrent.Callable;

class Exceptions {
    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwAs(Throwable e) throws T {
        throw (T) e;
    // Приведение обобщенного типа
        // стирается в тип (Throwable) е
    }

    public static <V> V doWork(Callable<V> c) {
        try {
            return c.call();

        } catch (Throwable ex) {
            throw (RuntimeException) ex;
            //Exceptions.<RuntimeException>throwAs(ex);
            //return null;
        }
    }
}
