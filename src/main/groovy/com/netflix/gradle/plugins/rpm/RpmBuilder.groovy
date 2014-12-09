package com.netflix.gradle.plugins.rpm

import org.freecompany.redline.Builder

class RpmBuilder extends Builder {

    private static final String DEFAULTSCRIPTPROG = "/bin/sh";

    /**
     * Declares a script to be run as part of the RPM verification. The
     * script will be run using the interpretter declared with the
     * {@link #setVerifyProgram(String)} method.
     *
     * @param script Script contents to run (i.e. shell commands)
     */
    public void setVerifyScript( final String script) {
        setVerifyProgram(readProgram(script));
        if ( script != null) format.getHeader().createEntry( RpmTag.VERIFYSCRIPT, script);
    }

    /**
     * Declares a script file to be run as part of the RPM verification. The
     * script will be run using the interpretter declared with the
     * {@link #setVerifyProgram(String)} method.
     *
     * @param file Script to run (i.e. shell commands)
     */
    public void setVerifyScript( final File file) throws IOException {
        setVerifyScript(readScript(file));
    }

    /**
     * Declares the interpretter to be used when invoking the RPM
     * verification script that can be set with the
     * {@link #setVerifyScript(String)} method.
     *
     * @param program Path to the interpretter
     */
    public void setVerifyProgram( final String program) {
        if ( null == program) {
            format.getHeader().createEntry( RpmTag.VERIFYPROG, DEFAULTSCRIPTPROG);
        } else if ( 0 == program.length()){
            format.getHeader().createEntry( RpmTag.VERIFYPROG, DEFAULTSCRIPTPROG);
        } else {
            format.getHeader().createEntry( RpmTag.VERIFYPROG, program);
        }
    }

}
