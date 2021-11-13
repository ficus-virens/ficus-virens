package dev.daqiang.ficusvirens.root.infra.common.constant;

/**
 * @author Vista-Yih
 * @version 0.1.0
 * <p>
 * Created on 2019/12/19
 * Package dev.daqiang.ficusvirens.root.infra.common.constant in ficus-virens
 */
public enum  PostTypeEnum {
    /**
     * 原创
     */
    ORIGINAL("original"),
    /**
     * 翻译
     */
    TRANSLATION("translation"),
    /**
     * 。。。
     */
    REPRINTED("reprinted");

    private String type;

    PostTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
