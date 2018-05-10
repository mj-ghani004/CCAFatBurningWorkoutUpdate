package Data;

import android.graphics.drawable.Drawable;

public class FoodProvider {


    public FoodProvider(Drawable img_src, String title, String des) {
        this.drawable = img_src;
        this.title = title;
        this.des = des;
    }

    private Drawable drawable;
    private String title;
    private String des;

    public Drawable getImg_src() {
        return drawable;
    }

    public void setImg_src(Drawable img_src) {
        this.drawable = img_src;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


}
