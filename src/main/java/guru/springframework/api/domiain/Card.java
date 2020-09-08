package guru.springframework.api.domiain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card{

	@JsonProperty("number")
	private String number;

	@JsonProperty("iban")
	private String iban;

	@JsonProperty("type")
	private String type;

	@JsonProperty("expiration_date")
	private ExpirationDate expirationDate;

	@JsonProperty("swift")
	private String swift;
}