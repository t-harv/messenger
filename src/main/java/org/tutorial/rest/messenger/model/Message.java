package org.tutorial.rest.messenger.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * 
 * @author root
 * 
 * [
    {
        "author": "Toyan",
        "created": "2019-02-02T14:50:43.115",
        "id": 1,
        "message": "Hello World",
        "subMessageObj": {
            "secretMessage": "What It Is!"
        }
    },
    {
        "author": "Toyan Yolo",
        "created": "2019-02-02T14:50:43.115",
        "id": 2,
        "message": "Hello Jersey"
    }
    
    
    
    
    
        {
        "author": "Toyan Yolo",
        "created": "2019-02-02T14:50:43.115",
        "message": "Hello Jersey"
    }
]
 *
 */

@XmlRootElement
@Entity
public class Message {
	
	@Id
	private long id;
	private String message;
	private Date created;
	private String author;
	
	private SubMessage subMessageObj;
	
	public Message(){};
	
	public Message(long id, String message, String author){
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = new Date();
	}
	
	public Message(long id, String message, String author, String subMessage){
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = new Date();
		subMessageObj = new SubMessage(subMessage);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public SubMessage getSubMessageObj() {
		return subMessageObj;
	}

	public void setSubMessageObj(SubMessage subMessageObj) {
		this.subMessageObj = subMessageObj;
	}

}
