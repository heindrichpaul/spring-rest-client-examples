package guru.springframework.api.domiain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Billing{

	@JsonProperty("card")
	private Card card;
}