package com.qdcz.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
//XML文件中的根标识
@XmlRootElement(name = "graphs")
class Graphs{
    private List<Graph> graph;

    public List<Graph> getGraph() {
        return graph;
    }

    public void setGraphs(List<Graph> graphs) {
        this.graph = graphs;
    }
}
//
//@XmlAccessorType(XmlAccessType.FIELD)
////XML文件中的根标识
//@XmlRootElement(name = "graph")
//public class Graph {
//    private String name;
//    private Value value;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}


@XmlAccessorType(XmlAccessType.FIELD)
//XML文件中的根标识
@XmlRootElement(name = "graph")
public class Graph{
    private String name;
    private String title;
    private String label;
    private String relationship;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}