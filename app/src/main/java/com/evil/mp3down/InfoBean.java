package com.evil.mp3down;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class InfoBean {
    /**
     * othername_original :
     * pay_type_320 : 3
     * m4afilesize : 705401
     * price_sq : 200
     * isoriginal : 1
     * filesize : 2753687
     * source :
     * bitrate : 128
     * topic :
     * trans_param : {"cid":69124630,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0}
     * price : 200
     * Accompany : 1
     * old_cpy : 1
     * songname_original : 你笑起来真好看
     * singername : 李昕融、樊桐舟、李凯稠
     * pay_type : 3
     * sourceid : 0
     * topic_url :
     * fail_process_320 : 4
     * pkg_price : 1
     * feetype : 0
     * filename : 李昕融、樊桐舟、李凯稠 - 你笑起来真好看
     * price_320 : 200
     * songname : 你笑起来真好看
     * group : []
     * hash : 07a55d0f8ff088bdca36b836f7fe115f
     * mvhash : 40372fa4165384bccc0dcc45584d64ce
     * rp_type : audio
     * privilege : 8
     * album_audio_id : 147312065
     * rp_publish : 1
     * album_id : 19428374
     * ownercount : 505975
     * fold_type : 0
     * audio_id : 54107534
     * pkg_price_sq : 1
     * 320filesize : 6883959
     * isnew : 0
     * duration : 172
     * pkg_price_320 : 1
     * srctype : 1
     * fail_process_sq : 4
     * sqfilesize : 19091860
     * fail_process : 4
     * 320hash : f8538982306946651aac48f29c9d647d
     * extname : mp3
     * sqhash : 8970a266d79a335ec81a88786478d046
     * pay_type_sq : 3
     * 320privilege : 10
     * sqprivilege : 10
     * album_name : 你笑起来真好看
     * othername :
     */

    private long filesize;
    private String source;
    private String songname_original;
    private String singername;
    private String filename;
    private String songname;
    private String hash;
    private String mvhash;
    private long duration;
    private String extname;
    private String sqhash;
    private String album_name;
    private String othername;

    public long getFilesize() {
        return filesize;
    }

    public void setFilesize(long filesize) {
        this.filesize = filesize;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSongname_original() {
        return songname_original;
    }

    public void setSongname_original(String songname_original) {
        this.songname_original = songname_original;
    }

    public String getSingername() {
        return singername;
    }

    public void setSingername(String singername) {
        this.singername = singername;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getMvhash() {
        return mvhash;
    }

    public void setMvhash(String mvhash) {
        this.mvhash = mvhash;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getExtname() {
        return extname;
    }

    public void setExtname(String extname) {
        this.extname = extname;
    }

    public String getSqhash() {
        return sqhash;
    }

    public void setSqhash(String sqhash) {
        this.sqhash = sqhash;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }
}
