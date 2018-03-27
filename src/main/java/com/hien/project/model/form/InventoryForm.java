package com.hien.project.model.form;

import lombok.Data;

@Data
public class InventoryForm {

    private String name;
    private String tags;
    private int vendor;
    private int typeId;
    private int uomId;
    private int stock;
    private String description;
    private double costPrice;
    private Double wholeSalePrice;
    private Double retailPrice;
}
