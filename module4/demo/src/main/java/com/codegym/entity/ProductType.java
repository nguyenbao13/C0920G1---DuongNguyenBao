package com.codegym.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProductType {
    @Id
    @Column(name = "product_type_id")
    private Integer productTypeID;

    @Column(name = "product_type_name")
    private String productTypeName;

    @OneToMany(mappedBy = "productType", cascade = CascadeType.ALL)
    private List<Product> productList;

    public ProductType() {
    }

    public Integer getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(Integer productTypeID) {
        this.productTypeID = productTypeID;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
