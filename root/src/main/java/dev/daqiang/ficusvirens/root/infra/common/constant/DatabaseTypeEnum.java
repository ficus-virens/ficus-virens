package dev.daqiang.ficusvirens.root.infra.common.constant;

/**
 * @author Vista-Yih
 * @version 0.1.0
 * <p>
 * Created on 2019/12/19
 * Package dev.daqiang.ficusvirens.root.infra.common.constant in ficus-virens
 */
public enum DatabaseTypeEnum {
    /**
     * MySQL
     */
    MYSQL("MySQL","mysql"),
    /**
     * PostgreSQL
     */
    POSTPRESQL("PostgreSQL", "postgresql"),
    H2("H2", "h2");

    private final String type;

    private final String alias;

    DatabaseTypeEnum(String type, String alias) {
        this.type = type;
        this.alias = alias;
    }

    public String getType() {
        return type;
    }

    public String getAlias() {
        return alias;
    }
}
