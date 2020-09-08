package guru.springframework.api.domiain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location{

	@JsonProperty("city")
	private String city;

	@JsonProperty("street")
	private String street;

	@JsonProperty("postcode")
	private String postcode;

	@JsonProperty("state")
	private String state;
}