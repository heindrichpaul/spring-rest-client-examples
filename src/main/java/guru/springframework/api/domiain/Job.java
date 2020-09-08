package guru.springframework.api.domiain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Job{

	@JsonProperty("company")
	private String company;

	@JsonProperty("title")
	private String title;
}