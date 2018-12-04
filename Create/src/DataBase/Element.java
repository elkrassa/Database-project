/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

/**
 *
 * @author User
 */
public class Element {
    
    private String name;
	private String content;

	public Element(String name, String content) {

		this.name = name;
		this.content = content;

	}

	public String getName() {

		return name;

	}

	public String getContent() {

		return content;

	}

	public void setName(String name) {

		this.name = name;

	}

	public void setContent(String content) {

		this.content = content;

	}

}


