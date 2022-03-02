package com.steinkeit.progressivehousehold.domain.model.finance;

final class UploadedImage {

    private final String filePath;

    UploadedImage(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return (this.filePath != null && this.filePath.length() > 0) ? this.filePath : "no file";
    }
}
