package com.pavneet.android.boost.bean;

/**
 * Created by Pavneet_Singh on 12/20/17.
 */

public class TextAndImageBean {
        String text;
        int imageId;

        public TextAndImageBean(String text, int imageId) {
            this.text = text;
            this.imageId = imageId;
        }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TextAndImageBean)) return false;

        TextAndImageBean that = (TextAndImageBean) o;

        if (imageId != that.imageId) return false;
        return text.equals(that.text);
    }

    @Override
    public int hashCode() {
        int result = text.hashCode();
        result = 31 * result + imageId;
        return result;
    }

    @Override
    public String toString() {
        return "TextAndImageBean{" +
                "text='" + text + '\'' +
                ", imageId=" + imageId +
                '}';
    }
}
