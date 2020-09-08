package guru.springframework.api.domiain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login{

	@JsonProperty("sha1")
	private String sha1;

	@JsonProperty("password")
	private String password;

	@JsonProperty("sha256")
	private String sha256;

	@JsonProperty("username")
	private String username;

	@JsonProperty("md5")
	private String md5;
}