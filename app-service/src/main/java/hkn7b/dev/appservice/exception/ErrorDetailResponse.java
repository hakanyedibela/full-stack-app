package hkn7b.dev.appservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorDetailResponse {

    private Date timestamp;
    private String message;
    private String details;
}
