package guru.springframework.api.domiain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Name{

	@JsonProperty("last")
	private String last;

	@JsonProperty("title")
	private String title;

	@JsonProperty("first")
	private String first;
}