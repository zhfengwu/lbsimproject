package com.lmlibrary;

/**
 * Description:只放常量，不做任何逻辑判断
 * User: niexg
 * Date: 2018-07-27
 * Time: 17:38
 */
public interface Constants {
    String version = "1"; //版本号
    boolean Debug = false;
    String Host = "http://47.105.99.173/chat/api";
    String Host_Pic = "http://47.105.99.173/chat";
    String serverareenment = "http://47.105.99.173/chat/tiaoZhuan?id=1";
    String lawareenment = "http://47.105.99.173/chat/tiaoZhuan?id=2";

    String TAG = "";
    String memberId = "memberId";
    String isVerified = "isVerified";
    String uniqueCode = "uniqueCode";
    String nickName = "nickName";
    String headImage = "headImage";
    String phone = "phone";
    String phonepw = "phonepw";
    String TARGET_APP_KEY = "614347d985f8c55150c2e557";
    String WXAppID = "wx18dbe14ee98ecb20";
    String WXKEYID = "WYiDf4lhVCJAHjZGBRQVUWn1MMthmdZD";
    String XFBAppID = "2019012163099246";
    String rsa2PrivateKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDLRWWr1CkuJNWDE5kswj+n35Y+zKnog1UwpxWLSZoAyJHU0bLy7jsx3D1mJ6A6RbzsMlQwhoWb/JV3atpvzwwhLnpxjIq/aq9bWk11dL96l3kWmSRdmMoAh35Avtkhz2rYCiRmuT781qtfaQwJzQFm9qJEx6LOKsq5s4pzflnNwjYqfT5s7+v+rdpqvzkmW/6K8bNHid5FNfpJRf5DfIyPYnKev5pGVsp2X4ay3QaXBRdkAj7vyWCpTIbdOfqhy2p7YwJXBsNnBc52TBKNqNQ/cKbmCW/a2ojepO/FLOcScQOIVL7VTKlvnuJjOSNHG58NmwnPfrMo1t8+obRCBvQjAgMBAAECggEAFEgRU+qwTS1ZrGFpOCENjudtK0jqbwujlV4mdSZb2lYozs45h6mjeF8cNTQg9Y99wSdoZQsXC7BRDYA42U0UTb9AclHuihjP9FJ3Rg/nBwlUCKAxE7Gp/hGG1Fj2ezwh0fp5FVLIaRvWL4fgrp2o1Sgomqo8oUt9vLegSdPCjBf2C0RD+o4jad7bNDROEFzEcTClF6N6kdQ7uQp5VubbyYolz+7wTRBFTP7yI36T7STCPGMGCZf+dnAgUxgs6EfcmT0C0KXTzMBTGzGm1Hx/4YZeOMrHr9cJCBHpj+T5/vzZn5qPpzJ+1ze7dPr1jN/7DtCNuH4Kygih5lsQWA7J8QKBgQDyJRnSqz94Gbh2WSLNQfCKtCfQpaMX24+ez1LSBIMMtQVT5xqni8ptK3WgdDu0GWU5+RnqJlFK0AsCHgWo+0Y2yZkE3DX5Es3Vufz9IbCPGDmYS/kL4HwOe56/fRg4FMHPP9AY8XIKFBEuBeGexjxHaQG60/XPXqPgk0WMLDfsyQKBgQDW5uDs4R81XzZqaJ70p76JLWJmynAusgudtPre1REebtJwG0A+8/9pQxL2UWTbzLgfdR2O5nBK1yhu0H0tLylwkYF7mCcZE1e6RX++70PaljHcK7NuK/uNQLsxMIfdxrll/FNZNIkmg4DCPCBpxUkMmdkP/SYuribIXoKxELbLiwKBgQCv4QbaoAwfvf7f52qB0C1ZcfWhdU37HD07SreLWD+f0TQndytDGyRTG0f63bIn5HJEI40RJ/fP8UCtrwTJconTbaa5gwGpAmGDpe3+JqRJq3zaBATG/azeECiESeZ3hYwobt9F3snITD8WQKtaWf6al8jr3N0kXEeH7TCM2eldEQKBgQCSszUkP2GQi5iX9ydbmA8HkcW0qcj+92falqsS5pwzDC/3e4LV9raKYtFU+KdDLHMcdlRhMonBbTMawpRQ/frp70pW1r0J7xxZ+guEiczmMNWEmQh50uh7uo6Ou7Rj/r6dEizLnoNpmSeScH0n9xcw1O1KbuNbxmKPMYVB3kkKlQKBgHlI2kxMVx5FdN35jg0fN/AAqjoLWK+4C+Oc3GRwp5Kb9Hoc+H7MgGn0xyBppAyzSCZXfCAX5/tzjbzFzDale+7aPECjEr7GT1r8hHj7+SllZQ7+cNyZvX4xeNcfR8CxA8CZQc4Z5OqebHkYpRvg3O5Yq+7kB/59bDKg82rhWn4u";
    String isLogin = "isLogin";

    String igronVersionNum = "igronVersionNum";

    String QQAPPID = "101538596";
    String WXPAYRE = "weixin_pay";

    //分页 每页大小
    int PAGE_SIZE = 10;

    String fileProvider = BuildConfig.APPLICATION_ID + ".fileprovider";
    String CACHE_DIR = "/shangliao/user";
    public static String PICTURE_DIR = "sdcard" + CACHE_DIR + "/pictures/";
    public static String FILE_DIR = "sdcard" + CACHE_DIR + "/recvFiles/";

    //图片缓存路径
    String IMAGE_CACHE_DIR = CACHE_DIR + "/image/";
    //语音
    String VOICE_CACHE_DIR = CACHE_DIR + "/voice/";

}
