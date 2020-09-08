package guru.springframework.api.domiain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpirationDate{

	@JsonProperty("date")
	private String date;

	@JsonProperty("timezone")
	private String timezone;

	@JsonProperty("timezone_type")
	private int timezoneType;
}