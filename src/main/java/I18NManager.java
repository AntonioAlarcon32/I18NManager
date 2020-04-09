import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;
    private ResourceBundle esp, cat, eng;

    private I18NManager(){
        this.esp = ResourceBundle.getBundle("esp");
        this.eng = ResourceBundle.getBundle("eng");
        this.cat = ResourceBundle.getBundle("cat");
    }

    public static I18NManager getInstance() {
        if (instance == null)
            instance = new I18NManager();
        return instance;
    }

    public String getText(String lang, String key) {
        ResourceBundle rs = esp;
        if (lang.equals("eng")) {
            rs = eng;
        }
        else if (lang.equals("cat")){
            rs = cat;
        }
        return rs.getString(key);
    }

    public static void main(String[] args) {
        String value = null;
        System.out.println(I18NManager.getInstance().getText("cat", "l1"));
        System.out.println(I18NManager.getInstance().getText("esp", "l1"));
        System.out.println(I18NManager.getInstance().getText("eng", "l1"));
        System.out.println("=====================================");
        System.out.println(I18NManager.getInstance().getText("cat", "l2"));
        System.out.println(I18NManager.getInstance().getText("esp", "l2"));
        System.out.println(I18NManager.getInstance().getText("eng", "l2"));
        System.out.println("=====================================");
        System.out.println(I18NManager.getInstance().getText("cat", "l3"));
        System.out.println(I18NManager.getInstance().getText("esp", "l3"));
        System.out.println(I18NManager.getInstance().getText("eng", "l3"));
    }
}

