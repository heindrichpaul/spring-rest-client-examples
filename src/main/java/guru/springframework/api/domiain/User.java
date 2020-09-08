package guru.springframework.api.domiain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("name")
	private Name name;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("language")
	private String language;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("login")
	private Login login;

	@JsonProperty("job")
	private Job job;

	@JsonProperty("email")
	private String email;

	@JsonProperty("billing")
	private Billing billing;
}