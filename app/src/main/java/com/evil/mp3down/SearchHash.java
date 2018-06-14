package com.evil.mp3down;

import java.util.List;

public class SearchHash {

    /**
     * relate : 1
     * userid : 0
     * token :
     * behavior : download
     * clientver : 8983
     * appid : 1005
     * area_code : 1
     * resource : [{"id":0,"type":"audio","hash":"5c5058a06a632b65f1a3347bd4cd9a99","name":"TFBOYS - 大梦想家","album_id":""}]
     * vip : 0
     */

    private int relate = 1;
    private int userid;
    private String token;
    private String behavior = "download";
    private int clientver = Constant.VERSION;
    private int appid = Constant.APPID;
    private String area_code = "";
    private int vip;
    private List<ResourceBean> resource;

    public int getRelate() { return relate;}

    public void setRelate(int relate) { this.relate = relate;}

    public int getUserid() { return userid;}

    public void setUserid(int userid) { this.userid = userid;}

    public String getToken() { return token;}

    public void setToken(String token) { this.token = token;}

    public String getBehavior() { return behavior;}

    public void setBehavior(String behavior) { this.behavior = behavior;}

    public int getClientver() { return clientver;}

    public void setClientver(int clientver) { this.clientver = clientver;}

    public int getAppid() { return appid;}

    public void setAppid(int appid) { this.appid = appid;}

    public String getArea_code() { return area_code;}

    public void setArea_code(String area_code) { this.area_code = area_code;}

    public int getVip() { return vip;}

    public void setVip(int vip) { this.vip = vip;}

    public List<ResourceBean> getResource() { return resource;}

    public void setResource(List<ResourceBean> resource) { this.resource = resource;}

    public static class ResourceBean {
        /**
         * id : 0
         * type : audio
         * hash : 5c5058a06a632b65f1a3347bd4cd9a99
         * name : TFBOYS - 大梦想家
         * album_id :
         */

        private int id;
        private String type = "audio";
        private String hash;
        private String name;
        private String album_id;

        public int getId() { return id;}

        public void setId(int id) { this.id = id;}

        public String getType() { return type;}

        public void setType(String type) { this.type = type;}

        public String getHash() { return hash;}

        public void setHash(String hash) { this.hash = hash;}

        public String getName() { return name;}

        public void setName(String name) { this.name = name;}

        public String getAlbum_id() { return album_id;}

        public void setAlbum_id(String album_id) { this.album_id = album_id;}
    }
}
