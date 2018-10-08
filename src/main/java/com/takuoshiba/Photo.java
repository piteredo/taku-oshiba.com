package com.takuoshiba;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Photo {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String src;

	public Integer getId() {
		return id;
	}
	
	public String getSrc() {
		return src;
	}
}