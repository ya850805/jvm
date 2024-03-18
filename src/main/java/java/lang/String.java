package java.lang;

/**
 * @author jason
 * @description
 * @create 2024/3/18 17:37
 **/
public class String {
    static {
        System.out.println("我是自定義的String類靜態代碼塊");
    }

    /**
     *
     * 執行會報錯，因為會向上找到核心類的那個String，而那個String是沒有main方法的：
     *
     * 錯誤: 在類別 java.lang.String 中找不到主要方法，請定義主要方法為:
     *    public static void main(String[] args)
     * 或者 JavaFX 應用程式類別必須擴充 javafx.application.Application
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("hello String");
    }
}
