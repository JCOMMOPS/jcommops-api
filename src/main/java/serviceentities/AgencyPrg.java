package serviceentities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType(propOrder={ "name", "nameShort","description"})

public class AgencyPrg {
	@XmlAttribute
	private long Id;
	
	private String NameShort;
	private String Name;
	private String description;
	
	public AgencyPrg (){	
	}

	public AgencyPrg ( long id, String nameshort, String name, String description ){	
		this.setId(id);
		this.setNameShort(nameshort);
		this.setName(name);
		this.setDescription(description);
	}

//	public long getId() {
//		return Id;
//	}

	public void setId(long id) {
		Id = id;
	}

	public String getNameShort() {
		return NameShort;
	}

	public void setNameShort(String nameShort) {
		NameShort = nameShort;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
