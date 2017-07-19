package kit.edu.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class DescribedByWorkflow {
	
	@XmlAttribute(name="resource",namespace="http://www.w3.org/1999/02/22-rdf-syntax-ns#")
	private String resource;

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

}
