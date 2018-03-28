package com.hien.project.jaxb.adapter;


import com.hien.project.model.data.Uom;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class ListUomAdapter {

    private List<Uom> uomList = new ArrayList<>();

    public List<Uom> getUomList() {
        return uomList;
    }

    public void setUomList(List<Uom> uomList) {
        this.uomList = uomList;
    }



}