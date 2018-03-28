package com.hien.project.jaxb.adapter;


import com.hien.project.model.data.Catalog;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ListCatalogAdapter {

    // list of catalogs
    private List<Catalog> catList = new ArrayList<>();

    public List<Catalog> getCatList() {
        return catList;
    }

    public void setCatList(List<Catalog> catList) {
        this.catList = catList;
    }


}
