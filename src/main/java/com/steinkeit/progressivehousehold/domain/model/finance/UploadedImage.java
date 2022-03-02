package com.steinkeit.progressivehousehold.domain.model.finance;

public final class UploadedImage {

    private final String filePath;

    private UploadedImage(String filePath) {
        this.filePath = filePath;
    }

    public static UploadedImage create(String filePath) {
        if(filePath != null && filePath.length() > 0) {
            return new UploadedImage(filePath);
        } else return new UploadedImage("");
    }

    public Boolean isValid() {
        return this.filePath.length() > 0;
    }

    public String valueOf() {
        return (this.filePath != null && this.filePath.length() > 0) ? this.filePath : "no file";
    }
}
