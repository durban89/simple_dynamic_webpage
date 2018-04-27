package com.walkerfree;

/**
 * Playing
 */
public class Playing {
    private final long autokid;
    private final String content;

    public Playing(long autokid, String content) {
        this.autokid = autokid;
        this.content = content;
    }

    /**
     * @return the autokid
     */
    public long getAutokid() {
        return autokid;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

}