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
public class Category {
    private Long id;

    private String name;

    private String slugName;

    private String slug;

    private String description;

    private String thumbnail;

    private Long parentId;

}
