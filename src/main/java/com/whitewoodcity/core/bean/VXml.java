package com.whitewoodcity.core.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "vxml")
public class VXml {

    @XmlElement(name = "css")
    private List<CSS> csses;

    @XmlElement(name = "script")
    private List<Script> scripts;

    @XmlElement(name = "fxml")
    private FXml fXml;

//    @XmlElement(name = "json")
//    private Json json;

    public List<CSS> getCsses() {
        return csses==null?new ArrayList<>():csses;
    }

    public void setCsses(List<CSS> csses) {
        this.csses = csses;
    }

    public List<Script> getScripts() {
        return scripts;
    }

    public void setScripts(List<Script> scripts) {
        this.scripts = scripts;
    }

    public FXml getfXml() {
        return fXml;
    }

    public void setfXml(FXml fXml) {
        this.fXml = fXml;
    }

//    public Json getJson() {
//        return json;
//    }
//
//    public void setJson(Json json) {
//        this.json = json;
//    }
}
