package com.netflix.gradle.plugins.rpm

import org.freecompany.redline.header.AbstractHeader

enum RpmTag implements AbstractHeader.Tag {

    VERIFYSCRIPT(1079, 6, 'verifyscript'),
    VERIFYPROG(1091, 6, 'verifyscriptprog')

    private int code;
    private int type;
    private String name;

    private RpmTag( final int code, final int type, final String name) {
        this.code = code;
        this.type = type;
        this.name = name;
    }

    public int getCode() { return code; }
    public int getType() { return type; }
    public String getName() { return name; }
}
