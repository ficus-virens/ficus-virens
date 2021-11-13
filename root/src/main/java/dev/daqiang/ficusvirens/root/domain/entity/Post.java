package dev.daqiang.ficusvirens.root.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2019/12/19
 * Package dev.daqiang.ficusvirens.root.domain.entity in ficus-virens
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Post extends BaseEntity {

    public Post(String name, String title, String context) {
        this.title = title;
    }

    private Long id;

    private String title;

    // TODO 使用枚举类型
    private int status;

    private String url;

    private String slug;

    // TODO 使用枚举类型
    private int editorType;

    private String summary;

    private String originalContext;

    private String thumbnail;

    private boolean allowComment;

    private String postPassword;

    private String metaKeywords;

    private Date editTime;

    private int priority;

    private int wordCount;

    private int visits;

    private int likes;
}
