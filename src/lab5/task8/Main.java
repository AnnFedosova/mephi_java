package lab5.task8;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Разработайте вспомогательный метод, чтобы воспользоваться классом ReentrantLock
 * в операторе try с ресурсами.
 * Вызовите метод 1оск() и возвратите объект класса,
 * который реализует интерфейс AutoCloseable и в методе которого close()
 * вызывается метод unlock(), но не генерируется никаких исключений.

 */
 public class Main {

    public static void main(String[] args) {
        try (AutoCloseableReentrantLock someLock = lock()) {
        }
    }

    public static AutoCloseableReentrantLock lock() {
        AutoCloseableReentrantLock reentrantLock = new AutoCloseableReentrantLock();
        reentrantLock.lock();
        return reentrantLock;
    }

    public static class AutoCloseableReentrantLock extends ReentrantLock implements AutoCloseable {
        @Override
        public void close() {
            this.unlock();
        }
    }
}
