package jsontojava;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="parentNode")
class Employee {
	@XmlElement(name="key1")
  private String code;
	@XmlElement(name="key2")
  private String name;

 

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

 
}
