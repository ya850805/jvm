package java.lang;

/**
 * @author jason
 * @description
 * @create 2024/3/18 17:59
 **/
public class Start {
    /**
     *
     * 啟動報錯，Bootstrap ClassLoader加載java.lang包時會報錯
     *
     * Exception in thread "main" java.lang.SecurityException: Prohibited package name: java.lang
     * 	at java.lang.ClassLoader.preDefineClass(ClassLoader.java:655)
     * 	at java.lang.ClassLoader.defineClass(ClassLoader.java:754)
     * 	at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
     * 	at java.net.URLClassLoader.defineClass(URLClassLoader.java:473)
     * 	at java.net.URLClassLoader.access$100(URLClassLoader.java:74)
     * 	at java.net.URLClassLoader$1.run(URLClassLoader.java:369)
     * 	at java.net.URLClassLoader$1.run(URLClassLoader.java:363)
     * 	at java.security.AccessController.doPrivileged(Native Method)
     * 	at java.net.URLClassLoader.findClass(URLClassLoader.java:362)
     * 	at java.lang.ClassLoader.loadClass(ClassLoader.java:418)
     * 	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:355)
     * 	at java.lang.ClassLoader.loadClass(ClassLoader.java:351)
     * 	at sun.launcher.LauncherHelper.checkAndLoadMain(LauncherHelper.java:601)
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("start");
    }
}
