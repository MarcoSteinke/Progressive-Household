package com.steinkeit.progressivehousehold.infrastructure.filehandler;

import com.steinkeit.progressivehousehold.domain.model.finance.Receipt;

public class ImagePathValidator {

    public static String getPhotosImagePath(Receipt receipt) {
        if (receipt.getUploadedImage() == null|| receipt.getId() == null) return null;

        return "/finance-photos/" + receipt.getId() + "/" + receipt.getUploadedImage();
    }
}
