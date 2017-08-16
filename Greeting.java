package com.tsys.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "greeting")
@XmlAccessorType(XmlAccessType.FIELD)
public class Greeting {
	@XmlElement
    private long id;
	@XmlElement
	private String content;

	public Greeting(){
		
	}
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
