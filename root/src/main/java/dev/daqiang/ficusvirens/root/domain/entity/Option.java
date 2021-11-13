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
public class Option extends BaseEntity {
    private Long id;

    private int type;

    private String key;

    private String value;
}
