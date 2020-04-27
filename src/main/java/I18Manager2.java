import java.util.HashMap;
import java.util.ResourceBundle;

public class I18Manager2 {

    private static I18Manager2 instance;
    private HashMap<String, ResourceBundle> data;

    public I18Manager2() {
        this.data = new HashMap<String, ResourceBundle>();
    }

    public static I18Manager2 getInstance() {
        if (instance == null)
            instance = new I18Manager2();
        return instance;
    }

    public String getText(String lang, String key) {
        ResourceBundle rs = this.data.get(lang);

        if (rs == null) {
            rs = ResourceBundle.getBundle(lang);
            this.data.put(lang,rs);
        }

        return rs.getString(key);
    }

    public static void main(String[] args) {
        String value = null;
        System.out.println(I18Manager2.getInstance().getText("cat", "l1"));
        System.out.println(I18Manager2.getInstance().getText("esp", "l1"));
        System.out.println(I18Manager2.getInstance().getText("eng", "l1"));
        System.out.println("=====================================");
        System.out.println(I18Manager2.getInstance().getText("cat", "l2"));
        System.out.println(I18Manager2.getInstance().getText("esp", "l2"));
        System.out.println(I18Manager2.getInstance().getText("eng", "l2"));
        System.out.println("=====================================");
        System.out.println(I18Manager2.getInstance().getText("cat", "l3"));
        System.out.println(I18Manager2.getInstance().getText("esp", "l3"));
        System.out.println(I18Manager2.getInstance().getText("eng", "l3"));
    }
}
