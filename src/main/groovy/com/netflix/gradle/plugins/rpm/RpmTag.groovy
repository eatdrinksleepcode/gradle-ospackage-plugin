package com.netflix.gradle.plugins.rpm

import org.freecompany.redline.header.AbstractHeader

class RpmTag implements AbstractHeader.Tag {

    public static final RpmTag VERIFYSCRIPT = new RpmTag(1079, 6, 'verifyscript')
    public static final RpmTag VERIFYPROG = new RpmTag(1091, 6, 'verifyscriptprog')

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
