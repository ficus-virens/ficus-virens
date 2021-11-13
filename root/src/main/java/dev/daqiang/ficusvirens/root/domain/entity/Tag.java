package dev.daqiang.ficusvirens.root.domain.entity;

import lombok.Data;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2019/12/19
 * Package dev.daqiang.ficusvirens.root.domain.entity in ficus-virens
 */
@Data
public class Tag {
    private Long id;

    private String name;

    private String slug_name;

    private String slug;

    private String thumbnail;
}
