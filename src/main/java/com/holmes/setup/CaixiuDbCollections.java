package com.holmes.setup;

public enum CaixiuDbCollections {
    VOCABULARY("Vocabulary");

    private String collectionName;

    CaixiuDbCollections(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getCollectionName() {
        return collectionName;
    }
}
