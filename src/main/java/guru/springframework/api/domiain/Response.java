package guru.springframework.api.domiain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {

	@JsonProperty("data")
	private List<User> data;
}