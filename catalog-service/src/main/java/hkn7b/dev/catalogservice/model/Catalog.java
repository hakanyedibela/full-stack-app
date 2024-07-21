package hkn7b.dev.catalogservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("catalogs")
public class Catalog {

    private String catalogName;
    private String catalogLink;

    public String getCatalogLink() {
        return catalogLink;
    }

    public void setCatalogLink(String catalogLink) {
        this.catalogLink = catalogLink;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
}
