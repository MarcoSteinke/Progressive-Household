package com.steinkeit.progressivehousehold.domain.model.finance;

public final class Title {

    private static final Integer MINLENGTH = 2;
    private static final Integer MAXLENGTH = 100;

    private final String title;

    private Title(String title) {
        this.title = title;
    }

    public static Title create(String title) {
        if(title != null && title.length() <= Title.MAXLENGTH && title.length() >= Title.MINLENGTH) {
            return new Title(title);
        } else {
            return new Title("");
        }
    }

    public Boolean isValid() {
        assert this.title != null;
        return this.title.length() > Title.MINLENGTH;
    }

    public String valueOf() {
        return title;
    }
}
