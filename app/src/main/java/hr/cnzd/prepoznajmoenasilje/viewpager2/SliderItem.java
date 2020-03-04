package hr.cnzd.prepoznajmoenasilje.viewpager2;

public class SliderItem {

    public void setImage(int image) {
        this.image = image;
    }

    private int image;

    public SliderItem(int image){
        this.image = image;
    }

    public int getImage() {
        return image;
    }
}
