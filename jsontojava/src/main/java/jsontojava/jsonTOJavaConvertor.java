package jsontojava;

//import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class jsonTOJavaConvertor {
	//implements Serializable{
	//public static final long serialVersionUID = -7687687687L;
	@JsonProperty(value="key1")
	private String key1;
	@JsonProperty(value="key2")
	private String key2;
	
	public String getKey1() {
		return key1;
	}
	
		public String getKey2() {
			return key2;
		}
		public void setKey1(String key1) {
			this.key1 = key1;
		}public void setKey2(String key2) {
			this.key2 = key2;
		}
		
		/*
		@Override
		public String toString(){
			return "jsontojava.jsonTOJavaConvertor [key1="+key1 +", key2="+key2+"]";
		}
		*/
}
