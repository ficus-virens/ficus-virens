package dev.daqiang.ficusvirens.root.domain.entity;

import lombok.Data;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2021-11-09
 * Package dev.daqiang.ficusvirens.root.domain.entity in root
 */
@Data
public class Comment {
    private Long id;

    private Long userId;

    private String content;

    // TODO 使用枚举类型
    private int status;

    private boolean allowNotification;

    private Long postId;

    private Long parentId;

    private int topPriority;
}
